package typings.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decimal extends js.Object {
  var decimal: String
  var thousands: String
}

object Anon_Decimal {
  @scala.inline
  def apply(decimal: String, thousands: String): Anon_Decimal = {
    val __obj = js.Dynamic.literal(decimal = decimal, thousands = thousands)
  
    __obj.asInstanceOf[Anon_Decimal]
  }
}

