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
  @js.native
  sealed trait invalid
    extends officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.ValidationState
  
  @js.native
  sealed trait valid
    extends officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.ValidationState
  
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

