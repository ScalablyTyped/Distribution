package typings.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroupState extends js.Object {
  /**
    * Current selected option, for **internal use only**.
    * External users should access `IChoiceGroup.checkedOption` instead.
    */
  var keyChecked: js.UndefOr[String | Double] = js.undefined
  /** Is set when the control has focus. */
  var keyFocused: js.UndefOr[String | Double] = js.undefined
}

object IChoiceGroupState {
  @scala.inline
  def apply(keyChecked: String | Double = null, keyFocused: String | Double = null): IChoiceGroupState = {
    val __obj = js.Dynamic.literal()
    if (keyChecked != null) __obj.updateDynamic("keyChecked")(keyChecked.asInstanceOf[js.Any])
    if (keyFocused != null) __obj.updateDynamic("keyFocused")(keyFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupState]
  }
}

