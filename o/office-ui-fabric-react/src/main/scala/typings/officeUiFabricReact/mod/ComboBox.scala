package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "ComboBox")
@js.native
open class ComboBox protected ()
  extends typings.officeUiFabricReact.libComboBoxMod.ComboBox {
  def this(props: IComboBoxProps) = this()
}
/* static members */
object ComboBox {
  
  @JSImport("office-ui-fabric-react", "ComboBox")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "ComboBox.defaultProps")
  @js.native
  def defaultProps: IComboBoxProps = js.native
  inline def defaultProps_=(x: IComboBoxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
