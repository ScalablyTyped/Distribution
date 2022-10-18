package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsTextFieldTextFieldDottypesMod.IMaskedTextFieldProps
import typings.officeUiFabricReact.libComponentsTextFieldTextFieldDottypesMod.ITextField
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTextFieldMaskedTextFieldMaskedTextFieldMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "DEFAULT_MASK_CHAR")
  @js.native
  val DEFAULT_MASK_CHAR: /* "_" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField/MaskedTextField/MaskedTextField", "MaskedTextField")
  @js.native
  open class MaskedTextField protected ()
    extends Component[IMaskedTextFieldProps, IMaskedTextFieldState, Any]
       with ITextField {
    def this(props: IMaskedTextFieldProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MMaskedTextField(newProps: IMaskedTextFieldProps): Unit = js.native
    
    /** The stored selection data prior to input change events. */
    /* private */ var _changeSelectionData: Any = js.native
    
    /** True if the TextField is focused */
    /* private */ var _isFocused: Any = js.native
    
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
    /* private */ var _maskCharData: Any = js.native
    
    /** True if the TextField was not focused and it was clicked into */
    /* private */ var _moveCursorOnMouseUp: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onFocus: Any = js.native
    
    /* private */ var _onInputChange: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onMouseDown: Any = js.native
    
    /* private */ var _onMouseUp: Any = js.native
    
    /* private */ var _onPaste: Any = js.native
    
    /* private */ var _textField: Any = js.native
    
    /** Blurs the input */
    /* CompleteClass */
    override def blur(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMaskedTextField(): Unit = js.native
    
    /** Sets focus to the input. */
    /* CompleteClass */
    override def focus(): Unit = js.native
    
    /** Select the value of the text field. */
    /* CompleteClass */
    override def select(): Unit = js.native
    
    /** Gets the selection end of the text field. Returns -1 if there is no selection. */
    /* CompleteClass */
    var selectionEnd: Double | Null = js.native
    
    /** Gets the selection start of the text field. Returns -1 if there is no selection. */
    /* CompleteClass */
    var selectionStart: Double | Null = js.native
    
    /** Sets the selection end of the text field to a specified value. */
    /* CompleteClass */
    override def setSelectionEnd(value: Double): Unit = js.native
    
    /**
      * Sets the start and end positions of a selection in a text field.
      * Call with start and end set to the same value to set the cursor position.
      * @param start - Index of the start of the selection.
      * @param end - Index of the end of the selection.
      */
    /* CompleteClass */
    override def setSelectionRange(start: Double, end: Double): Unit = js.native
    
    /** Sets the selection start of the text field to a specified value. */
    /* CompleteClass */
    override def setSelectionStart(value: Double): Unit = js.native
    
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
    inline def defaultProps_=(x: IMaskedTextFieldProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IMaskedTextFieldState extends StObject {
    
    /**
      * The mask string formatted with the input value.
      * This is what is displayed inside the TextField
      * @example
      *  `Phone Number: 12_ - 4___`
      */
    var displayValue: String
    
    /** The index into the rendered value of the first unfilled format character */
    var maskCursorPosition: js.UndefOr[Double] = js.undefined
  }
  object IMaskedTextFieldState {
    
    inline def apply(displayValue: String): IMaskedTextFieldState = {
      val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMaskedTextFieldState]
    }
    
    extension [Self <: IMaskedTextFieldState](x: Self) {
      
      inline def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setMaskCursorPosition(value: Double): Self = StObject.set(x, "maskCursorPosition", value.asInstanceOf[js.Any])
      
      inline def setMaskCursorPositionUndefined: Self = StObject.set(x, "maskCursorPosition", js.undefined)
    }
  }
}
