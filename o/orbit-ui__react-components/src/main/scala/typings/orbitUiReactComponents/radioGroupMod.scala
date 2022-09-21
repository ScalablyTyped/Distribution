package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`0`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`10`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`11`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`12`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`13`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`1`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`2`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`3`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`4`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`5`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`6`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`7`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`8`
import typings.orbitUiReactComponents.orbitUiReactComponentsNumbers.`9`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupMod {
  
  @JSImport("@orbit-ui/react-components/dist/radio/src/RadioGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerRadioGroup(props: InnerRadioGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerRadioGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/radio/src/RadioGroup", "RadioGroup")
  @js.native
  val RadioGroup: OrbitComponent[HTMLElement, InnerRadioGroupProps] = js.native
  
  trait InnerRadioGroupProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the radio group should autoFocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * The initial value of `value`.
      */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the radio group is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The space between the group elements.
      */
    var gap: js.UndefOr[
        `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ] = js.undefined
    
    /**
      * Radio group name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Called when any of the group elements is checked or unchecked.
      * @param {SyntheticEvent} event - React's original event.
      * @param {string} value - The new value.
      * @returns {void}
      */
    var onChange: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[typings.std.Element, Event], /* value */ String, Unit]
      ] = js.undefined
    
    /**
      * The orientation of the group elements.
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * Whether or not a user input is required before form submission.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Invert the order of the radio button and his label.
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the group should display as "valid" or "invalid".
      */
    var validationState: js.UndefOr[valid | invalid] = js.undefined
    
    /**
      * The value of the radio group.
      */
    var value: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether the group elements are forced onto one line or can wrap onto multiple lines
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object InnerRadioGroupProps {
    
    inline def apply(): InnerRadioGroupProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerRadioGroupProps]
    }
    
    extension [Self <: InnerRadioGroupProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setGap(
        value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | String
      ): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* value */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type RadioGroupProps = ComponentProps[OrbitComponent[HTMLElement, InnerRadioGroupProps]]
}
