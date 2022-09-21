package typings.officeUiFabricReact

import typings.officeUiFabricReact.spinButtonSpinButtonMod.DefaultProps
import typings.officeUiFabricReact.spinButtonTypesMod.ISpinButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpinButtonMod {
  
  @JSImport("office-ui-fabric-react/lib/SpinButton", "KeyboardSpinDirection")
  @js.native
  object KeyboardSpinDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection & Double
      ] = js.native
    
    /* -1 */ val down: typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.down & Double = js.native
    
    /* 0 */ val notSpinning: typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning & Double = js.native
    
    /* 1 */ val up: typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.up & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/SpinButton", "SpinButton")
  @js.native
  open class SpinButton protected ()
    extends typings.officeUiFabricReact.spinButtonMod.SpinButton {
    def this(props: ISpinButtonProps) = this()
  }
  /* static members */
  object SpinButton {
    
    @JSImport("office-ui-fabric-react/lib/SpinButton", "SpinButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/SpinButton", "SpinButton.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
