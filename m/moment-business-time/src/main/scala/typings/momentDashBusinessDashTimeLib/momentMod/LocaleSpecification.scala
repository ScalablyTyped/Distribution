package typings
package momentDashBusinessDashTimeLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleSpecification extends js.Object {
  var holidays: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var workinghours: js.UndefOr[WorkingHoursMap] = js.undefined
}

object LocaleSpecification {
  @scala.inline
  def apply(holidays: js.Array[java.lang.String] = null, workinghours: WorkingHoursMap = null): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    if (holidays != null) __obj.updateDynamic("holidays")(holidays)
    if (workinghours != null) __obj.updateDynamic("workinghours")(workinghours)
    __obj.asInstanceOf[LocaleSpecification]
  }
}

