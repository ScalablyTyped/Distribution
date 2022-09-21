package typings.officeUiFabricReact

import typings.officeUiFabricReact.datePickerTypesMod.IDatePicker
import typings.officeUiFabricReact.datePickerTypesMod.IDatePickerProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DatePicker/DatePicker.base", "DatePickerBase")
  @js.native
  open class DatePickerBase protected ()
    extends Component[IDatePickerProps, IDatePickerState, Any]
       with IDatePicker {
    def this(props: IDatePickerProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDatePickerBase(nextProps: IDatePickerProps): Unit = js.native
    
    /* private */ var _calendar: Any = js.native
    
    /**
      * Callback for closing the calendar callout
      */
    /* private */ var _calendarDismissed: Any = js.native
    
    /* private */ var _datePickerDiv: Any = js.native
    
    /* private */ var _dismissDatePickerPopup: Any = js.native
    
    /* private */ var _getDefaultState: Any = js.native
    
    /* private */ var _getErrorMessage: Any = js.native
    
    /* private */ var _handleEscKey: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _isDateOutOfBounds: Any = js.native
    
    /* private */ var _onCalloutPositioned: Any = js.native
    
    /* private */ var _onIconClick: Any = js.native
    
    /* private */ var _onSelectDate: Any = js.native
    
    /* private */ var _onTextFieldBlur: Any = js.native
    
    /* private */ var _onTextFieldChanged: Any = js.native
    
    /* private */ var _onTextFieldClick: Any = js.native
    
    /* private */ var _onTextFieldFocus: Any = js.native
    
    /* private */ var _onTextFieldKeyDown: Any = js.native
    
    /* private */ var _preventFocusOpeningPicker: Any = js.native
    
    /* private */ var _renderReadOnlyInput: Any = js.native
    
    /* private */ var _setErrorMessage: Any = js.native
    
    /* private */ var _showDatePickerPopup: Any = js.native
    
    /* private */ var _textField: Any = js.native
    
    /* private */ var _validateTextInput: Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDatePickerBase(prevProps: IDatePickerProps, prevState: IDatePickerState): Unit = js.native
    
    /** Sets focus to the text field */
    /* CompleteClass */
    override def focus(): Unit = js.native
    
    /** Reset the state of the picker to the default */
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  /* static members */
  object DatePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DatePicker/DatePicker.base", "DatePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DatePicker/DatePicker.base", "DatePickerBase.defaultProps")
    @js.native
    def defaultProps: IDatePickerProps = js.native
    inline def defaultProps_=(x: IDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IDatePickerState extends StObject {
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var formattedDate: js.UndefOr[String] = js.undefined
    
    var isDatePickerShown: js.UndefOr[Boolean] = js.undefined
    
    var selectedDate: js.UndefOr[js.Date] = js.undefined
  }
  object IDatePickerState {
    
    inline def apply(): IDatePickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatePickerState]
    }
    
    extension [Self <: IDatePickerState](x: Self) {
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setFormattedDate(value: String): Self = StObject.set(x, "formattedDate", value.asInstanceOf[js.Any])
      
      inline def setFormattedDateUndefined: Self = StObject.set(x, "formattedDate", js.undefined)
      
      inline def setIsDatePickerShown(value: Boolean): Self = StObject.set(x, "isDatePickerShown", value.asInstanceOf[js.Any])
      
      inline def setIsDatePickerShownUndefined: Self = StObject.set(x, "isDatePickerShown", js.undefined)
      
      inline def setSelectedDate(value: js.Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      inline def setSelectedDateUndefined: Self = StObject.set(x, "selectedDate", js.undefined)
    }
  }
}
