package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.libComponentsSpinButtonSpinButtonDottypesMod.ISpinButtonProps
import typings.officeUiFabricReact.libComponentsSpinButtonSpinButtonMod.DefaultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "SpinButton")
@js.native
open class SpinButton protected ()
  extends typings.officeUiFabricReact.libSpinButtonMod.SpinButton {
  def this(props: ISpinButtonProps) = this()
}
/* static members */
object SpinButton {
  
  @JSImport("office-ui-fabric-react", "SpinButton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "SpinButton.defaultProps")
  @js.native
  def defaultProps: DefaultProps = js.native
  inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
