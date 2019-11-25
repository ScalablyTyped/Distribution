package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiStrings.contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultContact
  extends InlineQueryResultBase
     with InlineQueryResult {
  var first_name: String
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var last_name: js.UndefOr[String] = js.undefined
  var phone_number: String
  var thumb_height: js.UndefOr[Double] = js.undefined
  var thumb_url: js.UndefOr[String] = js.undefined
  var thumb_width: js.UndefOr[Double] = js.undefined
  var `type`: contact
}

object InlineQueryResultContact {
  @scala.inline
  def apply(
    first_name: String,
    id: String,
    phone_number: String,
    `type`: contact,
    input_message_content: InputMessageContent = null,
    last_name: String = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: Int | Double = null,
    thumb_url: String = null,
    thumb_width: Int | Double = null
  ): InlineQueryResultContact = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultContact]
  }
}

