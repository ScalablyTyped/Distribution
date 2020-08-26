package typings.openfin.contextChannelsMod

import typings.openfin.identityMod.Identity
import typings.openfin.openfinStrings.`window-added`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelWindowAddedEvent extends js.Object {
  /**
    * The channel that window now belongs to. Will always be the channel object that {@link ChannelBase.addEventListener} was
    * called on.
    */
  var channel: Channel = js.native
  /**
    * The window that has just been added to the channel.
    */
  var identity: Identity = js.native
  /**
    * The channel that the window belonged to previously.
    *
    * Will be `null` if this event is being fired on a newly-created window.
    */
  var previousChannel: Channel | Null = js.native
  var `type`: `window-added` = js.native
}

object ChannelWindowAddedEvent {
  @scala.inline
  def apply(channel: Channel, identity: Identity, `type`: `window-added`): ChannelWindowAddedEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelWindowAddedEvent]
  }
  @scala.inline
  implicit class ChannelWindowAddedEventOps[Self <: ChannelWindowAddedEvent] (val x: Self) extends AnyVal {
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
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: Identity): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `window-added`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousChannel(value: Channel): Self = this.set("previousChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousChannelNull: Self = this.set("previousChannel", null)
  }
  
}

