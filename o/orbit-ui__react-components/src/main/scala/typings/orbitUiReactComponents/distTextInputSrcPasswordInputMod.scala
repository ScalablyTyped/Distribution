package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTextInputSrcPasswordInputMod {
  
  @JSImport("@orbit-ui/react-components/dist/text-input/src/PasswordInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerPasswordInput(props: InnerPasswordInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPasswordInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/text-input/src/PasswordInput", "PasswordInput")
  @js.native
  val PasswordInput: OrbitComponent[input, InnerPasswordInputProps] = js.native
  
  type BoxProps = typings.orbitUiReactComponents.distBoxSrcBoxMod.BoxProps
  
  trait InnerPasswordInputProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the input should autofocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * The default value of `value` when uncontrolled.
      */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /**
      * @ignore
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the input take up the width of its container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * [Icon](/?path=/docs/icon--default-story) component rendered before the value.
      */
    var icon: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Label identifying the input.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not to render a loader.
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var onChange: js.UndefOr[ChangeEventHandler[typings.std.Element]] = js.undefined
    
    /**
      * Called when the input value change.
      * @param {SyntheticEvent} event - React's original event.
      * @param {string} value - The new input value.
      * @returns {void}
      */
    var onValueChange: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLInputElement], /* value */ String, Unit]
      ] = js.undefined
    
    /**
      * Temporary text that occupies the input when it is empty.
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * @ignore
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not a user input is required before form submission.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the input should display as "valid" or "invalid".
      */
    var validationState: js.UndefOr[valid | invalid] = js.undefined
    
    /**
      * A controlled value.
      */
    var value: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Additional props to render on the wrapper element.
      */
    var wrapperProps: js.UndefOr[Partial[BoxProps]] = js.undefined
  }
  object InnerPasswordInputProps {
    
    inline def apply(): InnerPasswordInputProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerPasswordInputProps]
    }
    
    extension [Self <: InnerPasswordInputProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[typings.std.Element] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnValueChange(value: (/* event */ ChangeEvent[HTMLInputElement], /* value */ String) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWrapperProps(value: Partial[BoxProps]): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
      
      inline def setWrapperPropsUndefined: Self = StObject.set(x, "wrapperProps", js.undefined)
    }
  }
  
  type PasswordInputProps = ComponentProps[OrbitComponent[input, InnerPasswordInputProps]]
}
