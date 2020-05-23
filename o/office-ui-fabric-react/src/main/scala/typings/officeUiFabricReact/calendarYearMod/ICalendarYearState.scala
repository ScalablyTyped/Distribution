package typings.officeUiFabricReact.calendarYearMod

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
  def apply(
    fromYear: Double,
    navigatedYear: js.UndefOr[Double] = js.undefined,
    selectedYear: js.UndefOr[Double] = js.undefined
  ): ICalendarYearState = {
    val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatedYear)) __obj.updateDynamic("navigatedYear")(navigatedYear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedYear)) __obj.updateDynamic("selectedYear")(selectedYear.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearState]
  }
}

