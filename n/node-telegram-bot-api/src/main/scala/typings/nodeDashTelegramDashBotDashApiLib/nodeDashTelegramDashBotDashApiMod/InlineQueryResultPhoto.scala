package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultPhoto
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var photo_height: js.UndefOr[scala.Double] = js.undefined
  var photo_url: java.lang.String
  var photo_width: js.UndefOr[scala.Double] = js.undefined
  var thumb_url: java.lang.String
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.photo
}

object InlineQueryResultPhoto {
  @scala.inline
  def apply(
    id: java.lang.String,
    photo_url: java.lang.String,
    thumb_url: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.photo,
    caption: java.lang.String = null,
    description: java.lang.String = null,
    input_message_content: InputMessageContent = null,
    photo_height: scala.Int | scala.Double = null,
    photo_width: scala.Int | scala.Double = null,
    reply_markup: InlineKeyboardMarkup = null,
    title: java.lang.String = null
  ): InlineQueryResultPhoto = {
    val __obj = js.Dynamic.literal(id = id, photo_url = photo_url, thumb_url = thumb_url)
    __obj.updateDynamic("type")(`type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (description != null) __obj.updateDynamic("description")(description)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (photo_height != null) __obj.updateDynamic("photo_height")(photo_height.asInstanceOf[js.Any])
    if (photo_width != null) __obj.updateDynamic("photo_width")(photo_width.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[InlineQueryResultPhoto]
  }
}

