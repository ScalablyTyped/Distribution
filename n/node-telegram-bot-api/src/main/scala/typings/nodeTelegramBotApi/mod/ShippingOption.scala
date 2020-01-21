package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingOption extends js.Object {
  var id: String
  var prices: js.Array[LabeledPrice]
  var title: String
}

object ShippingOption {
  @scala.inline
  def apply(id: String, prices: js.Array[LabeledPrice], title: String): ShippingOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], prices = prices.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShippingOption]
  }
}

