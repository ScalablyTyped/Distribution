package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultDocument
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var document_url: java.lang.String
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var mime_type: java.lang.String
  var thumb_height: js.UndefOr[scala.Double] = js.undefined
  var thumb_url: js.UndefOr[java.lang.String] = js.undefined
  var thumb_width: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.document
}

object InlineQueryResultDocument {
  @scala.inline
  def apply(
    document_url: java.lang.String,
    id: java.lang.String,
    mime_type: java.lang.String,
    title: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.document,
    caption: java.lang.String = null,
    description: java.lang.String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: scala.Int | scala.Double = null,
    thumb_url: java.lang.String = null,
    thumb_width: scala.Int | scala.Double = null
  ): InlineQueryResultDocument = {
    val __obj = js.Dynamic.literal(document_url = document_url, id = id, mime_type = mime_type, title = title)
    __obj.updateDynamic("type")(`type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (description != null) __obj.updateDynamic("description")(description)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url)
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultDocument]
  }
}

