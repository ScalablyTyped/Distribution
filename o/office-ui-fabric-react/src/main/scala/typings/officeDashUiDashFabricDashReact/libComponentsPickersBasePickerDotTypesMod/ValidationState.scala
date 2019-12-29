package typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValidationState with Double] = js.native
  /* 2 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 0 */ @js.native
  object valid extends TopLevel[valid with Double]
  
  /* 1 */ @js.native
  object warning extends TopLevel[warning with Double]
  
}

