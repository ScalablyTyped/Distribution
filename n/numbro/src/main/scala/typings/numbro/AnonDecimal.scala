package typings.numbro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecimal extends js.Object {
  var decimal: String
  var thousands: String
  var thousandsSize: Double
}

object AnonDecimal {
  @scala.inline
  def apply(decimal: String, thousands: String, thousandsSize: Double): AnonDecimal = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any], thousandsSize = thousandsSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDecimal]
  }
}

