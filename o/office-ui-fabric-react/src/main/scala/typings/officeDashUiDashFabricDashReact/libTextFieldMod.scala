package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsTextFieldTextFieldDotTypesMod.ITextFieldProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.Underscore
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/TextField", JSImport.Namespace)
@js.native
object libTextFieldMod extends js.Object {
  @js.native
  class MaskedTextField protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsTextFieldMod.MaskedTextField {
    def this(props: ITextFieldProps) = this()
  }
  
  @js.native
  class TextFieldBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsTextFieldMod.TextFieldBase {
    def this(props: ITextFieldProps) = this()
  }
  
  val DEFAULT_MASK_CHAR: Underscore = js.native
  val TextField: StatelessComponent[ITextFieldProps] = js.native
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

