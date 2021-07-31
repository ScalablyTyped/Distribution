package typings.officeUiFabricReact

import typings.officeUiFabricReact.autofillAutofillMod.Autofill
import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLInputElement
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.keyCodesMod.KeyCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autofillTypesMod {
  
  trait IAutofill extends StObject {
    
    /**
      * Clear all text in the input. Sets value to '';
      */
    def clear(): Unit
    
    /**
      * The current index of the cursor in the input area. Returns -1 if the input element
      * is not ready.
      */
    var cursorLocation: Double | Null
    
    /**
      * Focus the input element.
      */
    def focus(): Unit
    
    /**
      * The current input element.
      */
    var inputElement: HTMLInputElement | Null
    
    /**
      * A boolean for whether or not there is a value selected in the input area.
      */
    var isValueSelected: Boolean
    
    /**
      * the current index of where the selection ends. Returns -1 if the input element
      * is not ready.
      */
    var selectionEnd: Double | Null
    
    /**
      * The current index of where the selection starts. Returns -1 if the input element
      * is not ready.
      */
    var selectionStart: Double | Null
    
    /**
      * The current text value that the user has entered.
      */
    var value: String
  }
  object IAutofill {
    
    @scala.inline
    def apply(clear: () => Unit, focus: () => Unit, isValueSelected: Boolean, value: String): IAutofill = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), focus = js.Any.fromFunction0(focus), isValueSelected = isValueSelected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], cursorLocation = null, inputElement = null, selectionEnd = null, selectionStart = null)
      __obj.asInstanceOf[IAutofill]
    }
    
    @scala.inline
    implicit class IAutofillMutableBuilder[Self <: IAutofill] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCursorLocation(value: Double): Self = StObject.set(x, "cursorLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorLocationNull: Self = StObject.set(x, "cursorLocation", null)
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInputElement(value: HTMLInputElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputElementNull: Self = StObject.set(x, "inputElement", null)
      
      @scala.inline
      def setIsValueSelected(value: Boolean): Self = StObject.set(x, "isValueSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionEndNull: Self = StObject.set(x, "selectionEnd", null)
      
      @scala.inline
      def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStartNull: Self = StObject.set(x, "selectionStart", null)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IAutofillProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement | Autofill] {
    
    /**
      * Gets the compoonent ref.
      */
    var componentRef: js.UndefOr[IRefObject[IAutofill]] = js.undefined
    
    /**
      * The default value to be visible. This is different from placeholder
      * because it actually sets the current value of the picker
      * Note: This will only be set upon component creation
      * and will not update with subsequent prop updates.
      */
    var defaultVisibleValue: js.UndefOr[String] = js.undefined
    
    /**
      * When the user uses left arrow, right arrow, clicks, or deletes text autofill is disabled
      * Since the user has taken control. It is automatically reenabled when the user enters text and the
      * cursor is at the end of the text in the input box. This specifies other key presses that will reenabled
      * autofill.
      * @defaultvalue [KeyCodes.down, KeyCodes.up]
      */
    var enableAutofillOnKeyPress: js.UndefOr[js.Array[KeyCodes]] = js.undefined
    
    /**
      * A callback used to modify the input string.
      *
      * @param composing - true if the change event was triggered while the
      * inner input was in the middle of a multi-character composition.
      * (for example, jp-hiragana IME input)
      */
    var onInputChange: js.UndefOr[js.Function2[/* value */ String, /* composing */ Boolean, String]] = js.undefined
    
    /**
      * A callback for when the current input value changes.
      *
      * @param composing - true if the change event was triggered while the
      * inner input was in the middle of a multi-character composition.
      * (for example, jp-hiragana IME input)
      */
    var onInputValueChange: js.UndefOr[
        js.Function2[/* newValue */ js.UndefOr[String], /* composing */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /**
      * Should the value of the input be selected? True if we're focused on our input, false otherwise.
      * We need to explicitly not select the text in the autofill if we are no longer focused.
      * In IE11, selecting a input will also focus the input, causing other element's focus to be stolen.
      */
    var preventValueSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Handler for checking if the full value of the input should
      * be seleced in componentDidUpdate
      *
      * @returns - should the full value of the input be selected?
      */
    var shouldSelectFullInputValueInComponentDidUpdate: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /**
      * The suggested autofill value that will display.
      */
    var suggestedDisplayValue: js.UndefOr[String] = js.undefined
    
    /**
      * Handler for checking and updating the value if needed
      * in componentWillReceiveProps
      *
      * @returns - the updated value to set, if needed
      */
    var updateValueInWillReceiveProps: js.UndefOr[js.Function0[String | Null]] = js.undefined
  }
  object IAutofillProps {
    
    @scala.inline
    def apply(): IAutofillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAutofillProps]
    }
    
    @scala.inline
    implicit class IAutofillPropsMutableBuilder[Self <: IAutofillProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentRef(value: IRefObject[IAutofill]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IAutofill | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDefaultVisibleValue(value: String): Self = StObject.set(x, "defaultVisibleValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVisibleValueUndefined: Self = StObject.set(x, "defaultVisibleValue", js.undefined)
      
      @scala.inline
      def setEnableAutofillOnKeyPress(value: js.Array[KeyCodes]): Self = StObject.set(x, "enableAutofillOnKeyPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAutofillOnKeyPressUndefined: Self = StObject.set(x, "enableAutofillOnKeyPress", js.undefined)
      
      @scala.inline
      def setEnableAutofillOnKeyPressVarargs(value: KeyCodes*): Self = StObject.set(x, "enableAutofillOnKeyPress", js.Array(value :_*))
      
      @scala.inline
      def setOnInputChange(value: (/* value */ String, /* composing */ Boolean) => String): Self = StObject.set(x, "onInputChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      @scala.inline
      def setOnInputValueChange(value: (/* newValue */ js.UndefOr[String], /* composing */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onInputValueChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInputValueChangeUndefined: Self = StObject.set(x, "onInputValueChange", js.undefined)
      
      @scala.inline
      def setPreventValueSelection(value: Boolean): Self = StObject.set(x, "preventValueSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventValueSelectionUndefined: Self = StObject.set(x, "preventValueSelection", js.undefined)
      
      @scala.inline
      def setShouldSelectFullInputValueInComponentDidUpdate(value: () => Boolean): Self = StObject.set(x, "shouldSelectFullInputValueInComponentDidUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldSelectFullInputValueInComponentDidUpdateUndefined: Self = StObject.set(x, "shouldSelectFullInputValueInComponentDidUpdate", js.undefined)
      
      @scala.inline
      def setSuggestedDisplayValue(value: String): Self = StObject.set(x, "suggestedDisplayValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestedDisplayValueUndefined: Self = StObject.set(x, "suggestedDisplayValue", js.undefined)
      
      @scala.inline
      def setUpdateValueInWillReceiveProps(value: () => String | Null): Self = StObject.set(x, "updateValueInWillReceiveProps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateValueInWillReceivePropsUndefined: Self = StObject.set(x, "updateValueInWillReceiveProps", js.undefined)
    }
  }
  
  type IBaseAutoFill = IAutofill
  
  type IBaseAutoFillProps = IAutofillProps
}
