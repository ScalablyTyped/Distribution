package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultGif
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var gif_duration: js.UndefOr[scala.Double] = js.undefined
  var gif_height: js.UndefOr[scala.Double] = js.undefined
  var gif_url: java.lang.String
  var gif_width: js.UndefOr[scala.Double] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var thumb_url: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.gif
}

object InlineQueryResultGif {
  @scala.inline
  def apply(
    gif_url: java.lang.String,
    id: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.gif,
    caption: java.lang.String = null,
    gif_duration: scala.Int | scala.Double = null,
    gif_height: scala.Int | scala.Double = null,
    gif_width: scala.Int | scala.Double = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_url: java.lang.String = null,
    title: java.lang.String = null
  ): InlineQueryResultGif = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("gif_url")(gif_url)
    __obj.updateDynamic("id")(id)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (gif_duration != null) __obj.updateDynamic("gif_duration")(gif_duration.asInstanceOf[js.Any])
    if (gif_height != null) __obj.updateDynamic("gif_height")(gif_height.asInstanceOf[js.Any])
    if (gif_width != null) __obj.updateDynamic("gif_width")(gif_width.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[InlineQueryResultGif]
  }
}

