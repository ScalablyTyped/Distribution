package typings.officeUiFabricReact

import typings.officeUiFabricReact.datePickerTypesMod.IDatePicker
import typings.officeUiFabricReact.datePickerTypesMod.IDatePickerProps
import typings.react.mod.Component
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DatePicker/DatePicker.base", "DatePickerBase")
  @js.native
  class DatePickerBase protected ()
    extends Component[IDatePickerProps, IDatePickerState, js.Any]
       with IDatePicker {
    def this(props: IDatePickerProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDatePickerBase(nextProps: IDatePickerProps): Unit = js.native
    
    var _calendar: js.Any = js.native
    
    /**
      * Callback for closing the calendar callout
      */
    var _calendarDismissed: js.Any = js.native
    
    var _datePickerDiv: js.Any = js.native
    
    var _dismissDatePickerPopup: js.Any = js.native
    
    var _getDefaultState: js.Any = js.native
    
    var _getErrorMessage: js.Any = js.native
    
    var _handleEscKey: js.Any = js.native
    
    var _id: js.Any = js.native
    
    var _isDateOutOfBounds: js.Any = js.native
    
    var _onCalloutPositioned: js.Any = js.native
    
    var _onIconClick: js.Any = js.native
    
    var _onSelectDate: js.Any = js.native
    
    var _onTextFieldBlur: js.Any = js.native
    
    var _onTextFieldChanged: js.Any = js.native
    
    var _onTextFieldClick: js.Any = js.native
    
    var _onTextFieldFocus: js.Any = js.native
    
    var _onTextFieldKeyDown: js.Any = js.native
    
    var _preventFocusOpeningPicker: js.Any = js.native
    
    var _setErrorMessage: js.Any = js.native
    
    var _showDatePickerPopup: js.Any = js.native
    
    var _textField: js.Any = js.native
    
    var _validateTextInput: js.Any = js.native
    
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
    @scala.inline
    def defaultProps_=(x: IDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IDatePickerState extends StObject {
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var formattedDate: js.UndefOr[String] = js.undefined
    
    var isDatePickerShown: js.UndefOr[Boolean] = js.undefined
    
    var selectedDate: js.UndefOr[Date] = js.undefined
  }
  object IDatePickerState {
    
    @scala.inline
    def apply(): IDatePickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatePickerState]
    }
    
    @scala.inline
    implicit class IDatePickerStateMutableBuilder[Self <: IDatePickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setFormattedDate(value: String): Self = StObject.set(x, "formattedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedDateUndefined: Self = StObject.set(x, "formattedDate", js.undefined)
      
      @scala.inline
      def setIsDatePickerShown(value: Boolean): Self = StObject.set(x, "isDatePickerShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDatePickerShownUndefined: Self = StObject.set(x, "isDatePickerShown", js.undefined)
      
      @scala.inline
      def setSelectedDate(value: Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDateUndefined: Self = StObject.set(x, "selectedDate", js.undefined)
    }
  }
}
