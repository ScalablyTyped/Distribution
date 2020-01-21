package typings.officeUiFabricReact.datePickerWeekNumbersExampleMod

import typings.officeUiFabricReact.dateValuesMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerBasicExampleState extends js.Object {
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
}

object IDatePickerBasicExampleState {
  @scala.inline
  def apply(firstDayOfWeek: DayOfWeek = null): IDatePickerBasicExampleState = {
    val __obj = js.Dynamic.literal()
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerBasicExampleState]
  }
}

