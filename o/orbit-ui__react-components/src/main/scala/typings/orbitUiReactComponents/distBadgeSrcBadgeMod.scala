package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.circle
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.count
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dot
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.icon
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBadgeSrcBadgeMod {
  
  @JSImport("@orbit-ui/react-components/dist/badge/src/Badge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/badge/src/Badge", "Badge")
  @js.native
  val Badge: OrbitComponent[HTMLElement, InnerBadgeProps] = js.native
  
  inline def InnerBadge(hasVariantOverlapAsChildrenForwardedRefRest: InnerBadgeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerBadge")(hasVariantOverlapAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type BadgeProps = ComponentProps[OrbitComponent[HTMLElement, InnerBadgeProps]]
  
  trait InnerBadgeProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The shape of the element being overlap by the badge.
      */
    var overlap: js.UndefOr[circle | icon] = js.undefined
    
    /**
      * The style to use.
      */
    var variant: js.UndefOr[count | dot | icon] = js.undefined
  }
  object InnerBadgeProps {
    
    inline def apply(): InnerBadgeProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerBadgeProps]
    }
    
    extension [Self <: InnerBadgeProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOverlap(value: circle | icon): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
      
      inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
      
      inline def setVariant(value: count | dot | icon): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
