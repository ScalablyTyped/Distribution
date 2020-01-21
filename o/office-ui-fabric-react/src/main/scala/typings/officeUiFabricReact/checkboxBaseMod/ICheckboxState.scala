package typings.officeUiFabricReact.checkboxBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxState extends js.Object {
  /** Is true when Uncontrolled control is checked. */
  var isChecked: js.UndefOr[Boolean] = js.undefined
  var isIndeterminate: js.UndefOr[Boolean] = js.undefined
}

object ICheckboxState {
  @scala.inline
  def apply(isChecked: js.UndefOr[Boolean] = js.undefined, isIndeterminate: js.UndefOr[Boolean] = js.undefined): ICheckboxState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndeterminate)) __obj.updateDynamic("isIndeterminate")(isIndeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxState]
  }
}

