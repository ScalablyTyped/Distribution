package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.textFieldTypesMod.IMaskedTextFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "MaskedTextField")
@js.native
class MaskedTextField protected ()
  extends typings.officeUiFabricReact.libTextFieldMod.MaskedTextField {
  def this(props: IMaskedTextFieldProps) = this()
}
/* static members */
object MaskedTextField {
  
  @JSImport("office-ui-fabric-react", "MaskedTextField")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "MaskedTextField.defaultProps")
  @js.native
  def defaultProps: IMaskedTextFieldProps = js.native
  @scala.inline
  def defaultProps_=(x: IMaskedTextFieldProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
