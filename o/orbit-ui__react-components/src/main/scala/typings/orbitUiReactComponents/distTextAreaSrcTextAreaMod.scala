package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
import typings.orbitUiReactComponents.distSharedSrcTypesMod.DomProps
import typings.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.email
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.none
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.password
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.search
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.tel
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.text
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.url
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTextAreaSrcTextAreaMod {
  
  @JSImport("@orbit-ui/react-components/dist/text-area/src/TextArea", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTextArea(props: InnerTextAreaProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextArea")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/text-area/src/TextArea", "TextArea")
  @js.native
  val TextArea: OrbitComponent[HTMLElement, InnerTextAreaProps] = js.native
  
  type BoxProps = typings.orbitUiReactComponents.distBoxSrcBoxMod.BoxProps
  
  trait InnerTextAreaProps
    extends StObject
       with DomProps
       with InteractionStatesProps
       with AriaLabelingProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the input should autofocus on render.
      */
    var autoFocus: js.UndefOr[Double | Boolean] = js.undefined
    
    /**
      * [Button](/?path=/docs/button--default-story) component rendered after the value.
      */
    var button: js.UndefOr[ReactElement] = js.undefined
    
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
      * Whether or not to render a loader.
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum number of visible text lines before displaying a scrollbar.
      */
    var maxRows: js.UndefOr[Double] = js.undefined
    
    /**
      * @ignore
      */
    var onChange: js.UndefOr[ChangeEventHandler[typings.std.Element]] = js.undefined
    
    /**
      * Called when the input value change.
      * @param {ChangeEvent} event - React's original synthetic event.
      * @param {string} value - The input value.
      * @returns {void}
      */
    var onValueChange: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLTextAreaElement], /* value */ String, Unit]
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
      * Whether a user input is required before form submission.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not an element is resizable, and if so, in which directions. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/resize).
      */
    var resize: js.UndefOr[vertical | none] = js.undefined
    
    /**
      * The number of visible text lines.
      */
    var rows: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of the input. See [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input).
      */
    var `type`: js.UndefOr[text | password | search | url | tel | email] = js.undefined
    
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
  object InnerTextAreaProps {
    
    inline def apply(): InnerTextAreaProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerTextAreaProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InnerTextAreaProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Double | Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setButton(value: ReactElement): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[typings.std.Element] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnValueChange(value: (/* event */ ChangeEvent[HTMLTextAreaElement], /* value */ String) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResize(value: vertical | none): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setType(value: text | password | search | url | tel | email): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWrapperProps(value: Partial[BoxProps]): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
      
      inline def setWrapperPropsUndefined: Self = StObject.set(x, "wrapperProps", js.undefined)
    }
  }
  
  type TextAreaProps = ComponentProps[OrbitComponent[HTMLElement, InnerTextAreaProps]]
}
