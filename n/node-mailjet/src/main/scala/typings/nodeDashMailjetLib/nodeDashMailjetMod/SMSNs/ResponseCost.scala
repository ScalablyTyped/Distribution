package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseCost extends js.Object {
  val Currency: java.lang.String
  val Value: scala.Double
}

object ResponseCost {
  @scala.inline
  def apply(Currency: java.lang.String, Value: scala.Double): ResponseCost = {
    val __obj = js.Dynamic.literal(Currency = Currency, Value = Value)
  
    __obj.asInstanceOf[ResponseCost]
  }
}

