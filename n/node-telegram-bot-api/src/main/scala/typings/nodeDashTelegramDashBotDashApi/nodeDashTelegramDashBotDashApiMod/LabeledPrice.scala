package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledPrice extends js.Object {
  var amount: Double
  var label: String
}

object LabeledPrice {
  @scala.inline
  def apply(amount: Double, label: String): LabeledPrice = {
    val __obj = js.Dynamic.literal(amount = amount, label = label)
  
    __obj.asInstanceOf[LabeledPrice]
  }
}

