package typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarYearState extends js.Object {
  var fromYear: Double
  var navigatedYear: js.UndefOr[Double] = js.undefined
  var selectedYear: js.UndefOr[Double] = js.undefined
}

object ICalendarYearState {
  @scala.inline
  def apply(fromYear: Double, navigatedYear: Int | Double = null, selectedYear: Int | Double = null): ICalendarYearState = {
    val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any])
    if (navigatedYear != null) __obj.updateDynamic("navigatedYear")(navigatedYear.asInstanceOf[js.Any])
    if (selectedYear != null) __obj.updateDynamic("selectedYear")(selectedYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearState]
  }
}

