package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingOption extends js.Object {
  var id: java.lang.String
  var prices: js.Array[LabeledPrice]
  var title: java.lang.String
}

object ShippingOption {
  @scala.inline
  def apply(id: java.lang.String, prices: js.Array[LabeledPrice], title: java.lang.String): ShippingOption = {
    val __obj = js.Dynamic.literal(id = id, prices = prices, title = title)
  
    __obj.asInstanceOf[ShippingOption]
  }
}

