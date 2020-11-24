package typings.officeUiFabricReact

import typings.officeUiFabricReact.textFieldTypesMod.IMaskedTextFieldProps
import typings.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/TextField", JSImport.Namespace)
@js.native
object textFieldMod extends js.Object {
  
  val DEFAULT_MASK_CHAR: /* "_" */ String = js.native
  
  val TextField: FunctionComponent[ITextFieldProps] = js.native
  
  @js.native
  class MaskedTextField protected ()
    extends typings.officeUiFabricReact.maskedTextFieldMod.MaskedTextField {
    def this(props: IMaskedTextFieldProps) = this()
  }
  /* static members */
  @js.native
  object MaskedTextField extends js.Object {
    
    var defaultProps: IMaskedTextFieldProps = js.native
  }
  
  @js.native
  class TextFieldBase protected ()
    extends typings.officeUiFabricReact.textFieldBaseMod.TextFieldBase {
    def this(props: ITextFieldProps) = this()
  }
  /* static members */
  @js.native
  object TextFieldBase extends js.Object {
    
    var defaultProps: ITextFieldProps = js.native
  }
}
