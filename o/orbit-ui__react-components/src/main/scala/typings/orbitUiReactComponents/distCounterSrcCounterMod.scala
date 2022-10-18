package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xl`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`3xl`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`4xl`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`5xl`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.basic
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.divider
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCounterSrcCounterMod {
  
  @JSImport("@orbit-ui/react-components/dist/counter/src/Counter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/counter/src/Counter", "Counter")
  @js.native
  val Counter: OrbitComponent[HTMLElement, InnerCounterProps] = js.native
  
  inline def InnerCounter(props: InnerCounterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCounter")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type CounterProps = ComponentProps[OrbitComponent[HTMLElement, InnerCounterProps]]
  
  trait InnerCounterProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * The color accent.
      */
    var color: js.UndefOr[inherit] = js.undefined
    
    /**
      * Whether or not the counter is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: js.UndefOr[ForwardedRef[Any]] = js.undefined
    
    /**
      * Whether or not to add emphasis to the counter.
      */
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the counter push itself away from the leading sibling element.
      */
    var pushed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to reverse counter elements order.
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A counter can vary in size.
      */
    var size: js.UndefOr[xs | sm | md | lg | xl | `2xl` | `3xl` | `4xl` | `5xl` | inherit] = js.undefined
    
    /**
      * Default slot override.
      */
    var slot: js.UndefOr[String] = js.undefined
    
    /**
      * The style to use.
      */
    var variant: js.UndefOr[basic | divider] = js.undefined
  }
  object InnerCounterProps {
    
    inline def apply(): InnerCounterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InnerCounterProps]
    }
    
    extension [Self <: InnerCounterProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: inherit): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setPushed(value: Boolean): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
      
      inline def setPushedUndefined: Self = StObject.set(x, "pushed", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSize(value: xs | sm | md | lg | xl | `2xl` | `3xl` | `4xl` | `5xl` | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setVariant(value: basic | divider): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
