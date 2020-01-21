package typings.momentBusinessTime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleSpecification extends js.Object {
  var holidays: js.UndefOr[js.Array[String]] = js.undefined
  var workinghours: js.UndefOr[WorkingHoursMap] = js.undefined
}

object LocaleSpecification {
  @scala.inline
  def apply(holidays: js.Array[String] = null, workinghours: WorkingHoursMap = null): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    if (holidays != null) __obj.updateDynamic("holidays")(holidays.asInstanceOf[js.Any])
    if (workinghours != null) __obj.updateDynamic("workinghours")(workinghours.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleSpecification]
  }
}

