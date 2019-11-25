package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// TELEGRAM TYPES ///
trait Update extends js.Object {
  var callback_query: js.UndefOr[CallbackQuery] = js.undefined
  var channel_post: js.UndefOr[Message] = js.undefined
  var chosen_inline_result: js.UndefOr[ChosenInlineResult] = js.undefined
  var edited_channel_post: js.UndefOr[Message] = js.undefined
  var edited_message: js.UndefOr[Message] = js.undefined
  var inline_query: js.UndefOr[InlineQuery] = js.undefined
  var message: js.UndefOr[Message] = js.undefined
  var pre_checkout_query: js.UndefOr[PreCheckoutQuery] = js.undefined
  var shipping_query: js.UndefOr[ShippingQuery] = js.undefined
  var update_id: Double
}

object Update {
  @scala.inline
  def apply(
    update_id: Double,
    callback_query: CallbackQuery = null,
    channel_post: Message = null,
    chosen_inline_result: ChosenInlineResult = null,
    edited_channel_post: Message = null,
    edited_message: Message = null,
    inline_query: InlineQuery = null,
    message: Message = null,
    pre_checkout_query: PreCheckoutQuery = null,
    shipping_query: ShippingQuery = null
  ): Update = {
    val __obj = js.Dynamic.literal(update_id = update_id.asInstanceOf[js.Any])
    if (callback_query != null) __obj.updateDynamic("callback_query")(callback_query.asInstanceOf[js.Any])
    if (channel_post != null) __obj.updateDynamic("channel_post")(channel_post.asInstanceOf[js.Any])
    if (chosen_inline_result != null) __obj.updateDynamic("chosen_inline_result")(chosen_inline_result.asInstanceOf[js.Any])
    if (edited_channel_post != null) __obj.updateDynamic("edited_channel_post")(edited_channel_post.asInstanceOf[js.Any])
    if (edited_message != null) __obj.updateDynamic("edited_message")(edited_message.asInstanceOf[js.Any])
    if (inline_query != null) __obj.updateDynamic("inline_query")(inline_query.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (pre_checkout_query != null) __obj.updateDynamic("pre_checkout_query")(pre_checkout_query.asInstanceOf[js.Any])
    if (shipping_query != null) __obj.updateDynamic("shipping_query")(shipping_query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
}

