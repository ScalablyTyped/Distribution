package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationState extends js.Object

@JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker.types", "ValidationState")
@js.native
object ValidationState extends js.Object {
  /** User input is invalid. */
  @js.native
  sealed trait invalid
    extends officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.ValidationState
  
  /** User input is valid. */
  @js.native
  sealed trait valid
    extends officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.ValidationState
  
  /** User input could be valid or invalid, its state is not known yet. */
  @js.native
  sealed trait warning
    extends officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.ValidationState
  
  /* 2 */ val invalid: invalid with scala.Double = js.native
  /* 0 */ val valid: valid with scala.Double = js.native
  /* 1 */ val warning: warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.ValidationState with scala.Double
  ] = js.native
}

