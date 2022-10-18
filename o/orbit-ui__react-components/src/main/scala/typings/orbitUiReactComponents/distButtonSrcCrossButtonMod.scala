package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.button
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distButtonSrcCrossButtonMod {
  
  @JSImport("@orbit-ui/react-components/dist/button/src/CrossButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button/src/CrossButton", "CrossButton")
  @js.native
  val CrossButton: OrbitComponent[button, InnerCrossButtonProps] = js.native
  
  inline def InnerCrossButton(hasForwardedRefRest: InnerCrossButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCrossButton")(hasForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type CrossButtonProps = ComponentProps[OrbitComponent[button, InnerCrossButtonProps]]
  
  trait InnerCrossButtonProps
    extends StObject
       with AriaLabelingProps {
    
    /**
      * A label providing an accessible name to the button. See [WCAG](https://www.w3.org/TR/WCAG20-TECHS/ARIA14.html).
      */
    @JSName("aria-label")
    var `aria-label_InnerCrossButtonProps`: String
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the button should autoFocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Whether or not the button content should takes additional space.
      */
    var condensed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the cross button is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * @ignore
      */
    var onClick: js.UndefOr[MouseEventHandler[typings.std.Element]] = js.undefined
    
    /**
      * A cross button can vary in size.
      */
    var size: js.UndefOr[`2xs` | xs | sm | md] = js.undefined
    
    /**
      * Default slot override.
      */
    var slot: js.UndefOr[String] = js.undefined
  }
  object InnerCrossButtonProps {
    
    inline def apply(`aria-label`: String): InnerCrossButtonProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerCrossButtonProps]
    }
    
    extension [Self <: InnerCrossButtonProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCondensed(value: Boolean): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
      
      inline def setCondensedUndefined: Self = StObject.set(x, "condensed", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnClick(value: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSize(value: `2xs` | xs | sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    }
  }
}
