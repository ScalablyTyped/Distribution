package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonDotTypesMod.ISpinButtonProps
import typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.DefaultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SpinButton", JSImport.Namespace)
@js.native
object libComponentsSpinButtonMod extends js.Object {
  @js.native
  class SpinButton protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.SpinButton {
    def this(props: ISpinButtonProps) = this()
  }
  
  @js.native
  object KeyboardSpinDirection extends js.Object {
    /* -1 */ val down: typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.down with Double = js.native
    /* 0 */ val notSpinning: typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning with Double = js.native
    /* 1 */ val up: typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection.up with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonMod.KeyboardSpinDirection with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object SpinButton extends js.Object {
    var defaultProps: DefaultProps = js.native
  }
  
}

