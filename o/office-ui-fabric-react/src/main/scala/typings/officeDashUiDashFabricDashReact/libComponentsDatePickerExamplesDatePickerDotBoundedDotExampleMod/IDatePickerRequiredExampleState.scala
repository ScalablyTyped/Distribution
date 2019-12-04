package typings.officeDashUiDashFabricDashReact.libComponentsDatePickerExamplesDatePickerDotBoundedDotExampleMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerRequiredExampleState extends js.Object {
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
}

object IDatePickerRequiredExampleState {
  @scala.inline
  def apply(firstDayOfWeek: DayOfWeek = null): IDatePickerRequiredExampleState = {
    val __obj = js.Dynamic.literal()
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerRequiredExampleState]
  }
}

