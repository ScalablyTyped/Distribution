package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

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
  var update_id: scala.Double
}

