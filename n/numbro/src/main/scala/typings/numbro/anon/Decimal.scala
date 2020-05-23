package typings.numbro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decimal extends js.Object {
  var decimal: String
  var thousands: String
  var thousandsSize: Double
}

object Decimal {
  @scala.inline
  def apply(decimal: String, thousands: String, thousandsSize: Double): Decimal = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any], thousandsSize = thousandsSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimal]
  }
}

