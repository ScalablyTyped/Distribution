package typings.payment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthYear extends js.Object {
  var month: Double = js.native
  var year: Double = js.native
}

object MonthYear {
  @scala.inline
  def apply(month: Double, year: Double): MonthYear = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthYear]
  }
  @scala.inline
  implicit class MonthYearOps[Self <: MonthYear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
  }
  
}

