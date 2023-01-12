package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.compact
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.expanded
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ForwardedRef
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateInputSrcDateRangeInputMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/DateRangeInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/DateRangeInput", "DateRangeInput")
  @js.native
  val DateRangeInput: OrbitComponent[HTMLElement, InnerDateRangeInputProps] = js.native
  
  inline def InnerDateRangeInput(props: InnerDateRangeInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateRangeInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type DateRangeInputProps = ComponentProps[OrbitComponent[HTMLElement, InnerDateRangeInputProps]]
  
  trait DateRangePreset extends StObject {
    
    var endDate: js.Date
    
    var startDate: js.Date
    
    var text: String
  }
  object DateRangePreset {
    
    inline def apply(endDate: js.Date, startDate: js.Date, text: String): DateRangePreset = {
      val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateRangePreset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateRangePreset] (val x: Self) extends AnyVal {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait InnerDateRangeInputProps
    extends StObject
       with InteractionStatesProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the input should autofocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * The initial value of end date.
      */
    var defaultEndDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The initial value of start date.
      */
    var defaultStartDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * A controlled end date value.
      */
    var endDate: js.UndefOr[js.Date | Null] = js.undefined
    
    /**
      * Whether or not the input take up the width of its container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The maximum (inclusive) date.
      */
    var max: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The minimum (inclusive) date.
      */
    var min: js.UndefOr[js.Date] = js.undefined
    
    /**
      * @ignore
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * @ignore
      */
    var onBlur: js.UndefOr[FocusEventHandler[typings.std.Element]] = js.undefined
    
    /**
      * Called when the date(s) are / is applied.
      * @param {SyntheticEvent} event - React's original event.
      * @param {Object} startDate - Selected start date.
      * @param {Object} endDate - Selected end date.
      * @returns {void}
      */
    var onDatesChange: js.UndefOr[
        js.Function3[
          /* event */ SyntheticEvent[typings.std.Element, Event], 
          /* startDate */ js.Date, 
          /* endDate */ js.Date, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @ignore
      */
    var onFocus: js.UndefOr[FocusEventHandler[typings.std.Element]] = js.undefined
    
    /**
      * Temporary text that occupies both date inputs when they are empty.
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Array of pre-determined dates range.
      */
    var presets: js.UndefOr[js.Array[DateRangePreset]] = js.undefined
    
    /**
      * The presets style to use.
      */
    var presetsVariant: js.UndefOr[compact | expanded] = js.undefined
    
    /**
      * Whether or not the input is readonly.
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not a user input is required before form submission.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A controlled start date value.
      */
    var startDate: js.UndefOr[js.Date | Null] = js.undefined
    
    /**
      * Whether or not the input should display as "valid" or "invalid".
      */
    var validationState: js.UndefOr[valid | invalid] = js.undefined
  }
  object InnerDateRangeInputProps {
    
    inline def apply(): InnerDateRangeInputProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerDateRangeInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InnerDateRangeInputProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDefaultEndDate(value: js.Date): Self = StObject.set(x, "defaultEndDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultEndDateUndefined: Self = StObject.set(x, "defaultEndDate", js.undefined)
      
      inline def setDefaultStartDate(value: js.Date): Self = StObject.set(x, "defaultStartDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultStartDateUndefined: Self = StObject.set(x, "defaultStartDate", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[typings.std.Element, typings.std.Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnDatesChange(
        value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* startDate */ js.Date, /* endDate */ js.Date) => Unit
      ): Self = StObject.set(x, "onDatesChange", js.Any.fromFunction3(value))
      
      inline def setOnDatesChangeUndefined: Self = StObject.set(x, "onDatesChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[typings.std.Element, typings.std.Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPresets(value: js.Array[DateRangePreset]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(value: DateRangePreset*): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setPresetsVariant(value: compact | expanded): Self = StObject.set(x, "presetsVariant", value.asInstanceOf[js.Any])
      
      inline def setPresetsVariantUndefined: Self = StObject.set(x, "presetsVariant", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
