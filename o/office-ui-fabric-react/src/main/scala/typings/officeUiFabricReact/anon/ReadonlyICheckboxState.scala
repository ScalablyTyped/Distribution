package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Checkbox/Checkbox.base.ICheckboxState> */
trait ReadonlyICheckboxState extends js.Object {
  val isChecked: js.UndefOr[Boolean] = js.undefined
  val isIndeterminate: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyICheckboxState {
  @scala.inline
  def apply(isChecked: js.UndefOr[Boolean] = js.undefined, isIndeterminate: js.UndefOr[Boolean] = js.undefined): ReadonlyICheckboxState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndeterminate)) __obj.updateDynamic("isIndeterminate")(isIndeterminate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyICheckboxState]
  }
}

