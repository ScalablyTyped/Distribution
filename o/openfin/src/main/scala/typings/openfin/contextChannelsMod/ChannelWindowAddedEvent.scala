package typings.openfin.contextChannelsMod

import typings.openfin.identityMod.Identity
import typings.openfin.openfinStrings.`window-added`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelWindowAddedEvent extends js.Object {
  /**
    * The channel that window now belongs to. Will always be the channel object that {@link ChannelBase.addEventListener} was
    * called on.
    */
  var channel: Channel
  /**
    * The window that has just been added to the channel.
    */
  var identity: Identity
  /**
    * The channel that the window belonged to previously.
    *
    * Will be `null` if this event is being fired on a newly-created window.
    */
  var previousChannel: Channel | Null
  var `type`: `window-added`
}

object ChannelWindowAddedEvent {
  @scala.inline
  def apply(channel: Channel, identity: Identity, `type`: `window-added`, previousChannel: Channel = null): ChannelWindowAddedEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], previousChannel = previousChannel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelWindowAddedEvent]
  }
}

