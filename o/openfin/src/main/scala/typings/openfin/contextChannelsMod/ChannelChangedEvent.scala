package typings.openfin.contextChannelsMod

import typings.openfin.identityMod.Identity
import typings.openfin.openfinStrings.`channel-changed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelChangedEvent extends js.Object {
  /**
    * The channel that the window now belongs to.
    *
    * Will be `null` if the window has just been closed, and so is being removed from a channel without being added to
    * another.
    */
  var channel: Channel | Null
  /**
    * The window that has switched channel.
    */
  var identity: Identity
  /**
    * The previous channel that the window belonged to.
    *
    * Will be `null` if the window has just been created, and so doesn't have a previous channel.
    */
  var previousChannel: Channel | Null
  var `type`: `channel-changed`
}

object ChannelChangedEvent {
  @scala.inline
  def apply(
    identity: Identity,
    `type`: `channel-changed`,
    channel: Channel = null,
    previousChannel: Channel = null
  ): ChannelChangedEvent = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], previousChannel = previousChannel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelChangedEvent]
  }
}

