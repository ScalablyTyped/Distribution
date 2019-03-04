package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultLocationBase extends InlineQueryResultBase {
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var latitude: scala.Double
  var longitude: scala.Double
  var thumb_height: js.UndefOr[scala.Double] = js.undefined
  var thumb_url: js.UndefOr[java.lang.String] = js.undefined
  var thumb_width: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
}

object InlineQueryResultLocationBase {
  @scala.inline
  def apply(
    id: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    title: java.lang.String,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: scala.Int | scala.Double = null,
    thumb_url: java.lang.String = null,
    thumb_width: scala.Int | scala.Double = null
  ): InlineQueryResultLocationBase = {
    val __obj = js.Dynamic.literal(id = id, latitude = latitude, longitude = longitude, title = title)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url)
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultLocationBase]
  }
}

