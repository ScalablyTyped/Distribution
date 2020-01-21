package typings.officeUiFabricReact.datePickerDisabledExampleMod

import typings.officeUiFabricReact.dateValuesMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerDisabledExampleState extends js.Object {
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
}

object IDatePickerDisabledExampleState {
  @scala.inline
  def apply(firstDayOfWeek: DayOfWeek = null): IDatePickerDisabledExampleState = {
    val __obj = js.Dynamic.literal()
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerDisabledExampleState]
  }
}

