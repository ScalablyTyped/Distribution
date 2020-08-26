package typings.momentBusinessTime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleSpecification extends js.Object {
  var holidays: js.UndefOr[js.Array[String]] = js.native
  var workinghours: js.UndefOr[WorkingHoursMap] = js.native
}

object LocaleSpecification {
  @scala.inline
  def apply(): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleSpecification]
  }
  @scala.inline
  implicit class LocaleSpecificationOps[Self <: LocaleSpecification] (val x: Self) extends AnyVal {
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
    def setHolidaysVarargs(value: String*): Self = this.set("holidays", js.Array(value :_*))
    @scala.inline
    def setHolidays(value: js.Array[String]): Self = this.set("holidays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHolidays: Self = this.set("holidays", js.undefined)
    @scala.inline
    def setWorkinghours(value: WorkingHoursMap): Self = this.set("workinghours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkinghours: Self = this.set("workinghours", js.undefined)
  }
  
}

