package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
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

object distCardSrcCardMod {
  
  @JSImport("@orbit-ui/react-components/dist/card/src/Card", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/card/src/Card", "Card")
  @js.native
  val Card: OrbitComponent[HTMLElement, InnerCardProps] = js.native
  
  inline def InnerCard(param0: InnerCardProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCard")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type CardProps = ComponentProps[OrbitComponent[HTMLElement, InnerCardProps]]
  
  trait InnerCardProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * Whether or not the card take up the width of its container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The orientation of the card.
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * A card can vary in size.
      */
    var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
    
    /**
      * Default slot override.
      */
    var slot: js.UndefOr[String] = js.undefined
  }
  object InnerCardProps {
    
    inline def apply(): InnerCardProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerCardProps]
    }
    
    extension [Self <: InnerCardProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setSize(value: xs | sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    }
  }
}
