package typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod

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
  sealed trait invalid extends ValidationState
  
  /** User input is valid. */
  @js.native
  sealed trait valid extends ValidationState
  
  /** User input could be valid or invalid, its state is not known yet. */
  @js.native
  sealed trait warning extends ValidationState
  
  /* 2 */ val invalid: typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState.invalid with Double = js.native
  /* 0 */ val valid: typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState.valid with Double = js.native
  /* 1 */ val warning: typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState.warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValidationState with Double] = js.native
}

