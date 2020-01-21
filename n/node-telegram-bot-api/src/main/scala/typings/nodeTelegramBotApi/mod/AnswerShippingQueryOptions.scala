package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnswerShippingQueryOptions extends js.Object {
  var error_message: js.UndefOr[String] = js.undefined
  var shipping_options: js.UndefOr[js.Array[ShippingOption]] = js.undefined
}

object AnswerShippingQueryOptions {
  @scala.inline
  def apply(error_message: String = null, shipping_options: js.Array[ShippingOption] = null): AnswerShippingQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    if (shipping_options != null) __obj.updateDynamic("shipping_options")(shipping_options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerShippingQueryOptions]
  }
}

