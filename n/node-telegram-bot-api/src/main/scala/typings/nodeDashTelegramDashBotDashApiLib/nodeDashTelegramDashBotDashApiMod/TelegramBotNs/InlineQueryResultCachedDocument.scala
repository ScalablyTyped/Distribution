package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultCachedDocument
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var document_file_id: java.lang.String
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var title: java.lang.String
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.document
}

object InlineQueryResultCachedDocument {
  @scala.inline
  def apply(
    document_file_id: java.lang.String,
    id: java.lang.String,
    title: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.document,
    caption: java.lang.String = null,
    description: java.lang.String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResultCachedDocument = {
    val __obj = js.Dynamic.literal(document_file_id = document_file_id, id = id, title = title)
    __obj.updateDynamic("type")(`type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (description != null) __obj.updateDynamic("description")(description)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    __obj.asInstanceOf[InlineQueryResultCachedDocument]
  }
}

