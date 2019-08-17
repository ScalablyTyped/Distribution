package typings.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroup extends js.Object {
  /**
    * Gets the current checked option.
    */
  var checkedOption: js.UndefOr[IChoiceGroupOption] = js.undefined
  /**
    * Sets focus to the checked option or the first enabled option in the ChoiceGroup.
    */
  def focus(): Unit
}

object IChoiceGroup {
  @scala.inline
  def apply(focus: () => Unit, checkedOption: IChoiceGroupOption = null): IChoiceGroup = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    if (checkedOption != null) __obj.updateDynamic("checkedOption")(checkedOption)
    __obj.asInstanceOf[IChoiceGroup]
  }
}

