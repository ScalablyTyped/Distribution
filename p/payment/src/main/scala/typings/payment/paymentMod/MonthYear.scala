package typings.payment.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthYear extends js.Object {
  var month: Double
  var year: Double
}

object MonthYear {
  @scala.inline
  def apply(month: Double, year: Double): MonthYear = {
    val __obj = js.Dynamic.literal(month = month, year = year)
  
    __obj.asInstanceOf[MonthYear]
  }
}

