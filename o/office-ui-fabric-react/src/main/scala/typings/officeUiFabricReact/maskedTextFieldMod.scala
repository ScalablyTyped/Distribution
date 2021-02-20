package typings.officeUiFabricReact

import typings.officeUiFabricReact.textFieldTypesMod.IMaskedTextFieldProps
import typings.officeUiFabricReact.textFieldTypesMod.ITextField
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maskedTextFieldMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "DEFAULT_MASK_CHAR")
  @js.native
  val DEFAULT_MASK_CHAR: /* "_" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "MaskedTextField")
  @js.native
  class MaskedTextField protected ()
    extends Component[IMaskedTextFieldProps, IMaskedTextFieldState, js.Any]
       with ITextField {
    def this(props: IMaskedTextFieldProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MMaskedTextField(newProps: IMaskedTextFieldProps): Unit = js.native
    
    /** The stored selection data prior to input change events. */
    var _changeSelectionData: js.Any = js.native
    
    /** True if the TextField is focused */
    var _isFocused: js.Any = js.native
    
    /**
      *  An array of data containing information regarding the format characters,
      *  their indices inside the display text, and their corresponding values.
      * @example
      * ```
      *  [
      *    { value: '1', displayIndex: 16, format: /[0-9]/ },
      *    { value: '2', displayIndex: 17, format: /[0-9]/ },
      *    { displayIndex: 18, format: /[0-9]/ },
      *    { value: '4', displayIndex: 22, format: /[0-9]/ },
      *    ...
      *  ]
      * ```
      */
    var _maskCharData: js.Any = js.native
    
    /** True if the TextField was not focused and it was clicked into */
    var _moveCursorOnMouseUp: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onFocus: js.Any = js.native
    
    var _onInputChange: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _onMouseDown: js.Any = js.native
    
    var _onMouseUp: js.Any = js.native
    
    var _onPaste: js.Any = js.native
    
    var _textField: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMaskedTextField(): Unit = js.native
    
    def setValue(newValue: String): Unit = js.native
  }
  /* static members */
  object MaskedTextField {
    
    @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "MaskedTextField")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "MaskedTextField.defaultProps")
    @js.native
    def defaultProps: IMaskedTextFieldProps = js.native
    @scala.inline
    def defaultProps_=(x: IMaskedTextFieldProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IMaskedTextFieldState extends StObject {
    
    /**
      * The mask string formatted with the input value.
      * This is what is displayed inside the TextField
      * @example
      *  `Phone Number: 12_ - 4___`
      */
    var displayValue: String = js.native
    
    /** The index into the rendered value of the first unfilled format character */
    var maskCursorPosition: js.UndefOr[Double] = js.native
  }
  object IMaskedTextFieldState {
    
    @scala.inline
    def apply(displayValue: String): IMaskedTextFieldState = {
      val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMaskedTextFieldState]
    }
    
    @scala.inline
    implicit class IMaskedTextFieldStateMutableBuilder[Self <: IMaskedTextFieldState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskCursorPosition(value: Double): Self = StObject.set(x, "maskCursorPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskCursorPositionUndefined: Self = StObject.set(x, "maskCursorPosition", js.undefined)
    }
  }
}
