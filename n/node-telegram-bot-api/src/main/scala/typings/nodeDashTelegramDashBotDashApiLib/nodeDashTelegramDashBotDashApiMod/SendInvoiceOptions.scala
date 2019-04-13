package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendInvoiceOptions extends SendBasicOptions {
  var is_flexible: js.UndefOr[scala.Boolean] = js.undefined
  var need_email: js.UndefOr[scala.Boolean] = js.undefined
  var need_name: js.UndefOr[scala.Boolean] = js.undefined
  var need_phone_number: js.UndefOr[scala.Boolean] = js.undefined
  var need_shipping_address: js.UndefOr[scala.Boolean] = js.undefined
  var photo_height: js.UndefOr[scala.Double] = js.undefined
  var photo_size: js.UndefOr[scala.Double] = js.undefined
  var photo_url: js.UndefOr[java.lang.String] = js.undefined
  var photo_width: js.UndefOr[scala.Double] = js.undefined
  var provider_data: js.UndefOr[java.lang.String] = js.undefined
}

object SendInvoiceOptions {
  @scala.inline
  def apply(
    disable_notification: js.UndefOr[scala.Boolean] = js.undefined,
    is_flexible: js.UndefOr[scala.Boolean] = js.undefined,
    need_email: js.UndefOr[scala.Boolean] = js.undefined,
    need_name: js.UndefOr[scala.Boolean] = js.undefined,
    need_phone_number: js.UndefOr[scala.Boolean] = js.undefined,
    need_shipping_address: js.UndefOr[scala.Boolean] = js.undefined,
    photo_height: scala.Int | scala.Double = null,
    photo_size: scala.Int | scala.Double = null,
    photo_url: java.lang.String = null,
    photo_width: scala.Int | scala.Double = null,
    provider_data: java.lang.String = null,
    reply_markup: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply = null,
    reply_to_message_id: scala.Int | scala.Double = null
  ): SendInvoiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification)
    if (!js.isUndefined(is_flexible)) __obj.updateDynamic("is_flexible")(is_flexible)
    if (!js.isUndefined(need_email)) __obj.updateDynamic("need_email")(need_email)
    if (!js.isUndefined(need_name)) __obj.updateDynamic("need_name")(need_name)
    if (!js.isUndefined(need_phone_number)) __obj.updateDynamic("need_phone_number")(need_phone_number)
    if (!js.isUndefined(need_shipping_address)) __obj.updateDynamic("need_shipping_address")(need_shipping_address)
    if (photo_height != null) __obj.updateDynamic("photo_height")(photo_height.asInstanceOf[js.Any])
    if (photo_size != null) __obj.updateDynamic("photo_size")(photo_size.asInstanceOf[js.Any])
    if (photo_url != null) __obj.updateDynamic("photo_url")(photo_url)
    if (photo_width != null) __obj.updateDynamic("photo_width")(photo_width.asInstanceOf[js.Any])
    if (provider_data != null) __obj.updateDynamic("provider_data")(provider_data)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (reply_to_message_id != null) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendInvoiceOptions]
  }
}

