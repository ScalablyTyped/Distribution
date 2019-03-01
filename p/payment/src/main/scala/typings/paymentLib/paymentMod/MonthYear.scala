package typings
package paymentLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthYear extends js.Object {
  var month: scala.Double
  var year: scala.Double
}

object MonthYear {
  @scala.inline
  def apply(month: scala.Double, year: scala.Double): MonthYear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[MonthYear]
  }
}

