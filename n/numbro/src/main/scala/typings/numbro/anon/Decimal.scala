package typings.numbro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decimal extends js.Object {
  var decimal: String
  var thousands: String
  var thousandsSize: js.UndefOr[Double] = js.undefined
}

object Decimal {
  @scala.inline
  def apply(decimal: String, thousands: String, thousandsSize: js.UndefOr[Double] = js.undefined): Decimal = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
    if (!js.isUndefined(thousandsSize)) __obj.updateDynamic("thousandsSize")(thousandsSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimal]
  }
}

