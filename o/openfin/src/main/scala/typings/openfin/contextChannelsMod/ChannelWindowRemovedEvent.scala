package typings.openfin.contextChannelsMod

import typings.openfin.identityMod.Identity
import typings.openfin.openfinStrings.`window-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelWindowRemovedEvent extends js.Object {
  /**
    * The channel that the window now belongs to.
    *
    * Will be `null` if the window is leaving the channel due to it being closed.
    */
  var channel: Channel | Null
  /**
    * The window that has just been removed from the channel.
    */
  var identity: Identity
  /**
    * The channel that the window belonged to previously. Will always be the channel object that {@link ChannelBase.addEventListener} was
    * called on.
    */
  var previousChannel: Channel
  var `type`: `window-removed`
}

object ChannelWindowRemovedEvent {
  @scala.inline
  def apply(identity: Identity, previousChannel: Channel, `type`: `window-removed`, channel: Channel = null): ChannelWindowRemovedEvent = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], previousChannel = previousChannel.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelWindowRemovedEvent]
  }
}

