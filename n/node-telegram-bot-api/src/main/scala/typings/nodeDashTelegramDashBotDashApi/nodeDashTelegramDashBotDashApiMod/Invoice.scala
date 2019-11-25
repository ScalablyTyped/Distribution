package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invoice extends js.Object {
  var currency: String
  var description: String
  var start_parameter: String
  var title: String
  var total_amount: Double
}

object Invoice {
  @scala.inline
  def apply(
    currency: String,
    description: String,
    start_parameter: String,
    title: String,
    total_amount: Double
  ): Invoice = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], start_parameter = start_parameter.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], total_amount = total_amount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Invoice]
  }
}

