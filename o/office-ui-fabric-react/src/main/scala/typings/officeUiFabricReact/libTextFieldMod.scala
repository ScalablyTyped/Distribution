package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsTextFieldTextFieldDottypesMod.IMaskedTextFieldProps
import typings.officeUiFabricReact.libComponentsTextFieldTextFieldDottypesMod.ITextFieldProps
import typings.officeUiFabricReact.libComponentsTextFieldTextFieldDottypesMod.ITextFieldStyleProps
import typings.officeUiFabricReact.libComponentsTextFieldTextFieldDottypesMod.ITextFieldStyles
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTextFieldMod {
  
  @JSImport("office-ui-fabric-react/lib/TextField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/TextField", "DEFAULT_MASK_CHAR")
  @js.native
  val DEFAULT_MASK_CHAR: /* "_" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/TextField", "MaskedTextField")
  @js.native
  open class MaskedTextField protected ()
    extends typings.officeUiFabricReact.libComponentsTextFieldMod.MaskedTextField {
    def this(props: IMaskedTextFieldProps) = this()
  }
  /* static members */
  object MaskedTextField {
    
    @JSImport("office-ui-fabric-react/lib/TextField", "MaskedTextField")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/TextField", "MaskedTextField.defaultProps")
    @js.native
    def defaultProps: IMaskedTextFieldProps = js.native
    inline def defaultProps_=(x: IMaskedTextFieldProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/TextField", "TextField")
  @js.native
  val TextField: FunctionComponent[ITextFieldProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/TextField", "TextFieldBase")
  @js.native
  open class TextFieldBase protected ()
    extends typings.officeUiFabricReact.libComponentsTextFieldMod.TextFieldBase {
    def this(props: ITextFieldProps) = this()
  }
  /* static members */
  object TextFieldBase {
    
    @JSImport("office-ui-fabric-react/lib/TextField", "TextFieldBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/TextField", "TextFieldBase.defaultProps")
    @js.native
    def defaultProps: ITextFieldProps = js.native
    inline def defaultProps_=(x: ITextFieldProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def getTextFieldStyles(props: ITextFieldStyleProps): ITextFieldStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextFieldStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ITextFieldStyles]
}
