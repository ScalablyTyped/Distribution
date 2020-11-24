package typings.officeUiFabricReact

import typings.officeUiFabricReact.spinButtonSpinButtonMod.DefaultProps
import typings.officeUiFabricReact.spinButtonTypesMod.ISpinButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/SpinButton", JSImport.Namespace)
@js.native
object spinButtonMod extends js.Object {
  
  @js.native
  object KeyboardSpinDirection extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection with Double
      ] = js.native
    
    /* -1 */ val down: typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.down with Double = js.native
    
    /* 0 */ val notSpinning: typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning with Double = js.native
    
    /* 1 */ val up: typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.up with Double = js.native
  }
  
  @js.native
  class SpinButton protected ()
    extends typings.officeUiFabricReact.spinButtonSpinButtonMod.SpinButton {
    def this(props: ISpinButtonProps) = this()
  }
  /* static members */
  @js.native
  object SpinButton extends js.Object {
    
    var defaultProps: DefaultProps = js.native
  }
}
