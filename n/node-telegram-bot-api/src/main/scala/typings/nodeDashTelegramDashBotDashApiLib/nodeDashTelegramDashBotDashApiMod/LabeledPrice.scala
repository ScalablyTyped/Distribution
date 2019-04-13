package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledPrice extends js.Object {
  var amount: scala.Double
  var label: java.lang.String
}

object LabeledPrice {
  @scala.inline
  def apply(amount: scala.Double, label: java.lang.String): LabeledPrice = {
    val __obj = js.Dynamic.literal(amount = amount, label = label)
  
    __obj.asInstanceOf[LabeledPrice]
  }
}

