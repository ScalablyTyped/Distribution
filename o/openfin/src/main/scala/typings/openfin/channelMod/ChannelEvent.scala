package typings.openfin.channelMod

import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.openfinStrings.channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelEvent[Type] extends ApplicationEvent[channel, Type] {
  var channelId: String
  var channelName: String
  var name: js.UndefOr[String] = js.undefined
}

object ChannelEvent {
  @scala.inline
  def apply[Type](
    channelId: String,
    channelName: String,
    topic: channel,
    `type`: Type,
    uuid: String,
    name: String = null
  ): ChannelEvent[Type] = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelName = channelName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelEvent[Type]]
  }
}

