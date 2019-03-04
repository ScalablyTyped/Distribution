package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invoice extends js.Object {
  var currency: java.lang.String
  var description: java.lang.String
  var start_parameter: java.lang.String
  var title: java.lang.String
  var total_amount: scala.Double
}

object Invoice {
  @scala.inline
  def apply(
    currency: java.lang.String,
    description: java.lang.String,
    start_parameter: java.lang.String,
    title: java.lang.String,
    total_amount: scala.Double
  ): Invoice = {
    val __obj = js.Dynamic.literal(currency = currency, description = description, start_parameter = start_parameter, title = title, total_amount = total_amount)
  
    __obj.asInstanceOf[Invoice]
  }
}

