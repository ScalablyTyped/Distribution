package typings
package numbroLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decimal extends js.Object {
  var decimal: java.lang.String
  var thousands: java.lang.String
}

object Anon_Decimal {
  @scala.inline
  def apply(decimal: java.lang.String, thousands: java.lang.String): Anon_Decimal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decimal")(decimal)
    __obj.updateDynamic("thousands")(thousands)
    __obj.asInstanceOf[Anon_Decimal]
  }
}

