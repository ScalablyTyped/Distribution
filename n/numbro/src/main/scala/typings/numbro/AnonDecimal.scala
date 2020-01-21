package typings.numbro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecimal extends js.Object {
  var decimal: String
  var thousands: String
}

object AnonDecimal {
  @scala.inline
  def apply(decimal: String, thousands: String): AnonDecimal = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDecimal]
  }
}

