package typings
package officeDashUiDashFabricDashReactLib.libComponentsSpinButtonSpinButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyboardSpinDirection extends js.Object

@JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "KeyboardSpinDirection")
@js.native
object KeyboardSpinDirection extends js.Object {
  @js.native
  sealed trait down
    extends officeDashUiDashFabricDashReactLib.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection
  
  @js.native
  sealed trait notSpinning
    extends officeDashUiDashFabricDashReactLib.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection
  
  @js.native
  sealed trait up
    extends officeDashUiDashFabricDashReactLib.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection
  
  /* -1 */ val down: down with scala.Double = js.native
  /* 0 */ val notSpinning: notSpinning with scala.Double = js.native
  /* 1 */ val up: up with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection with scala.Double
  ] = js.native
}

