package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultDocument
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var document_url: String
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var mime_type: String
  var thumb_height: js.UndefOr[Double] = js.undefined
  var thumb_url: js.UndefOr[String] = js.undefined
  var thumb_width: js.UndefOr[Double] = js.undefined
  var title: String
  var `type`: document
}

object InlineQueryResultDocument {
  @scala.inline
  def apply(
    document_url: String,
    id: String,
    mime_type: String,
    title: String,
    `type`: document,
    caption: String = null,
    description: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: js.UndefOr[Double] = js.undefined,
    thumb_url: String = null,
    thumb_width: js.UndefOr[Double] = js.undefined
  ): InlineQueryResultDocument = {
    val __obj = js.Dynamic.literal(document_url = document_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (!js.isUndefined(thumb_height)) __obj.updateDynamic("thumb_height")(thumb_height.get.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (!js.isUndefined(thumb_width)) __obj.updateDynamic("thumb_width")(thumb_width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultDocument]
  }
}

