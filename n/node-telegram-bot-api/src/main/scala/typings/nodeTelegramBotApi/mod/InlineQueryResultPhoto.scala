package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultPhoto
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var photo_height: js.UndefOr[Double] = js.undefined
  var photo_url: String
  var photo_width: js.UndefOr[Double] = js.undefined
  var thumb_url: String
  var title: js.UndefOr[String] = js.undefined
  var `type`: photo
}

object InlineQueryResultPhoto {
  @scala.inline
  def apply(
    id: String,
    photo_url: String,
    thumb_url: String,
    `type`: photo,
    caption: String = null,
    description: String = null,
    input_message_content: InputMessageContent = null,
    photo_height: js.UndefOr[Double] = js.undefined,
    photo_width: js.UndefOr[Double] = js.undefined,
    reply_markup: InlineKeyboardMarkup = null,
    title: String = null
  ): InlineQueryResultPhoto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_url = photo_url.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (!js.isUndefined(photo_height)) __obj.updateDynamic("photo_height")(photo_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(photo_width)) __obj.updateDynamic("photo_width")(photo_width.get.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultPhoto]
  }
}

