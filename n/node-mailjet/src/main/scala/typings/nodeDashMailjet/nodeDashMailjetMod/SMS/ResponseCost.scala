package typings.nodeDashMailjet.nodeDashMailjetMod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseCost extends js.Object {
  val Currency: String
  val Value: Double
}

object ResponseCost {
  @scala.inline
  def apply(Currency: String, Value: Double): ResponseCost = {
    val __obj = js.Dynamic.literal(Currency = Currency, Value = Value)
  
    __obj.asInstanceOf[ResponseCost]
  }
}

