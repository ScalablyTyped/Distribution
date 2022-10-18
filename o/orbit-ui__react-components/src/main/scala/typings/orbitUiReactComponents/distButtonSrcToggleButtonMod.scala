package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.button
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.circular
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.outline
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.pill
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.primary
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.rounded
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.secondary
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.solid
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distButtonSrcToggleButtonMod {
  
  @JSImport("@orbit-ui/react-components/dist/button/src/ToggleButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerToggleButton(props: InnerToggleButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToggleButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/button/src/ToggleButton", "ToggleButton")
  @js.native
  val ToggleButton: OrbitComponent[button, InnerToggleButtonProps] = js.native
  
  trait InnerToggleButtonProps
    extends StObject
       with InteractionStatesProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the toggle button should autoFocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * A controlled checked value.
      */
    var checked: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * The toggle button color accent.
      */
    var color: js.UndefOr[primary | secondary] = js.undefined
    
    /**
      * The initial value of `checked` when uncontrolled.
      */
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the toggle button is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when the toggle button checked state change.
      * @param {SyntheticEvent} event - React's original event.
      * @param {bool} isChecked - Whether the button is checked or not.
      * @returns {void}
      */
    var onChange: js.UndefOr[
        js.Function2[
          /* event */ SyntheticEvent[typings.std.Element, Event], 
          /* isChecked */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The toggle button shape.
      */
    var shape: js.UndefOr[pill | rounded | circular] = js.undefined
    
    /**
      * A toggle button can vary in size.
      */
    var size: js.UndefOr[sm | md] = js.undefined
    
    /**
      * The value to associate with when in a group.
      */
    var value: js.UndefOr[String] = js.undefined
    
    /**
      * The style to use.
      */
    var variant: js.UndefOr[solid | outline] = js.undefined
  }
  object InnerToggleButtonProps {
    
    inline def apply(): InnerToggleButtonProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerToggleButtonProps]
    }
    
    extension [Self <: InnerToggleButtonProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedNull: Self = StObject.set(x, "checked", null)
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: primary | secondary): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnChange(value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* isChecked */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setShape(value: pill | rounded | circular): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVariant(value: solid | outline): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type ToggleButtonProps = ComponentProps[OrbitComponent[button, InnerToggleButtonProps]]
}
