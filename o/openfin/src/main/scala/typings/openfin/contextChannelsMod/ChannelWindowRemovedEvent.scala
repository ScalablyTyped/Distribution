package typings.openfin.contextChannelsMod

import typings.openfin.identityMod.Identity
import typings.openfin.openfinStrings.`window-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelWindowRemovedEvent extends js.Object {
  /**
    * The channel that the window now belongs to.
    *
    * Will be `null` if the window is leaving the channel due to it being closed.
    */
  var channel: Channel | Null = js.native
  /**
    * The window that has just been removed from the channel.
    */
  var identity: Identity = js.native
  /**
    * The channel that the window belonged to previously. Will always be the channel object that {@link ChannelBase.addEventListener} was
    * called on.
    */
  var previousChannel: Channel = js.native
  var `type`: `window-removed` = js.native
}

object ChannelWindowRemovedEvent {
  @scala.inline
  def apply(identity: Identity, previousChannel: Channel, `type`: `window-removed`): ChannelWindowRemovedEvent = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], previousChannel = previousChannel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelWindowRemovedEvent]
  }
  @scala.inline
  implicit class ChannelWindowRemovedEventOps[Self <: ChannelWindowRemovedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentity(value: Identity): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousChannel(value: Channel): Self = this.set("previousChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `window-removed`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelNull: Self = this.set("channel", null)
  }
  
}

