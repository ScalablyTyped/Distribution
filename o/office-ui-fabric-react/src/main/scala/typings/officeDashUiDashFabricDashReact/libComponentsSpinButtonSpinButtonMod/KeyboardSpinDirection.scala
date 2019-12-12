package typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.down
import typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning
import typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyboardSpinDirection extends js.Object

@JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "KeyboardSpinDirection")
@js.native
object KeyboardSpinDirection extends js.Object {
  @js.native
  sealed trait down extends KeyboardSpinDirection
  
  @js.native
  sealed trait notSpinning extends KeyboardSpinDirection
  
  @js.native
  sealed trait up extends KeyboardSpinDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyboardSpinDirection with Double] = js.native
  /* -1 */ @js.native
  object down extends TopLevel[down with Double]
  
  /* 0 */ @js.native
  object notSpinning extends TopLevel[notSpinning with Double]
  
  /* 1 */ @js.native
  object up extends TopLevel[up with Double]
  
}

