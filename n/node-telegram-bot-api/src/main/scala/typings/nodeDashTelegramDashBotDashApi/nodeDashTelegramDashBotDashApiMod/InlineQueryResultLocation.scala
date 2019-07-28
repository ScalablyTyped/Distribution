package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiStrings.location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultLocation
  extends InlineQueryResultLocationBase
     with InlineQueryResult {
  var `type`: location
}

object InlineQueryResultLocation {
  @scala.inline
  def apply(
    id: String,
    latitude: Double,
    longitude: Double,
    title: String,
    `type`: location,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: Int | Double = null,
    thumb_url: String = null,
    thumb_width: Int | Double = null
  ): InlineQueryResultLocation = {
    val __obj = js.Dynamic.literal(id = id, latitude = latitude, longitude = longitude, title = title)
    __obj.updateDynamic("type")(`type`)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url)
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultLocation]
  }
}

