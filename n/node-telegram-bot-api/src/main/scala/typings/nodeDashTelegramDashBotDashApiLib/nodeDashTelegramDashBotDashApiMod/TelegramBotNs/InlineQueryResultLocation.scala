package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultLocation
  extends InlineQueryResultLocationBase
     with InlineQueryResult {
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.location
}

object InlineQueryResultLocation {
  @scala.inline
  def apply(
    id: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    title: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.location,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: scala.Int | scala.Double = null,
    thumb_url: java.lang.String = null,
    thumb_width: scala.Int | scala.Double = null
  ): InlineQueryResultLocation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("title")(title)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url)
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultLocation]
  }
}

