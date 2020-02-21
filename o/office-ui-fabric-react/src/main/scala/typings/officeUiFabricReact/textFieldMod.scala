package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactStrings._underscore
import typings.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/TextField", JSImport.Namespace)
@js.native
object textFieldMod extends js.Object {
  @js.native
  class MaskedTextField protected ()
    extends typings.officeUiFabricReact.maskedTextFieldMod.MaskedTextField {
    def this(props: ITextFieldProps) = this()
  }
  
  @js.native
  class TextFieldBase protected ()
    extends typings.officeUiFabricReact.textFieldBaseMod.TextFieldBase {
    def this(props: ITextFieldProps) = this()
  }
  
  val DEFAULT_MASK_CHAR: _underscore = js.native
  val TextField: FunctionComponent[ITextFieldProps] = js.native
  /* static members */
  @js.native
  object MaskedTextField extends js.Object {
    var defaultProps: ITextFieldProps = js.native
  }
  
  /* static members */
  @js.native
  object TextFieldBase extends js.Object {
    var defaultProps: ITextFieldProps = js.native
  }
  
}

