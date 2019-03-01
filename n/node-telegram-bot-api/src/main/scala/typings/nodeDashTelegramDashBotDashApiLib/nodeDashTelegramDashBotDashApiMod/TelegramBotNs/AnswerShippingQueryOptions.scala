package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnswerShippingQueryOptions extends js.Object {
  var error_message: js.UndefOr[java.lang.String] = js.undefined
  var shipping_options: js.UndefOr[js.Array[ShippingOption]] = js.undefined
}

object AnswerShippingQueryOptions {
  @scala.inline
  def apply(error_message: java.lang.String = null, shipping_options: js.Array[ShippingOption] = null): AnswerShippingQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    if (shipping_options != null) __obj.updateDynamic("shipping_options")(shipping_options)
    __obj.asInstanceOf[AnswerShippingQueryOptions]
  }
}

