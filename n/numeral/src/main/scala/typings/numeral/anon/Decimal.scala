package typings.numeral.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decimal extends js.Object {
  var decimal: String
  var thousands: String
}

object Decimal {
  @scala.inline
  def apply(decimal: String, thousands: String): Decimal = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimal]
  }
}

