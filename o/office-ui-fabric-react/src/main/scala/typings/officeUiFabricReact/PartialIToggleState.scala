package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Toggle/Toggle.base.IToggleState> */
trait PartialIToggleState extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
}

object PartialIToggleState {
  @scala.inline
  def apply(checked: js.UndefOr[Boolean] = js.undefined): PartialIToggleState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIToggleState]
  }
}

