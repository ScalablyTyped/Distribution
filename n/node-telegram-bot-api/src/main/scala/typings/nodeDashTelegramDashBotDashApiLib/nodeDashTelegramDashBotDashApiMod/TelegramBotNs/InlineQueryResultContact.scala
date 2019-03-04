package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultContact
  extends InlineQueryResultBase
     with InlineQueryResult {
  var first_name: java.lang.String
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var last_name: js.UndefOr[java.lang.String] = js.undefined
  var phone_number: java.lang.String
  var thumb_height: js.UndefOr[scala.Double] = js.undefined
  var thumb_url: js.UndefOr[java.lang.String] = js.undefined
  var thumb_width: js.UndefOr[scala.Double] = js.undefined
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.contact
}

object InlineQueryResultContact {
  @scala.inline
  def apply(
    first_name: java.lang.String,
    id: java.lang.String,
    phone_number: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.contact,
    input_message_content: InputMessageContent = null,
    last_name: java.lang.String = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_height: scala.Int | scala.Double = null,
    thumb_url: java.lang.String = null,
    thumb_width: scala.Int | scala.Double = null
  ): InlineQueryResultContact = {
    val __obj = js.Dynamic.literal(first_name = first_name, id = id, phone_number = phone_number)
    __obj.updateDynamic("type")(`type`)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (thumb_height != null) __obj.updateDynamic("thumb_height")(thumb_height.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url)
    if (thumb_width != null) __obj.updateDynamic("thumb_width")(thumb_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultContact]
  }
}

