package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcOverlayArrowMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/OverlayArrow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerOverlayArrow(param0: InnerOverlayArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOverlayArrow")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/OverlayArrow", "OverlayArrow")
  @js.native
  val OverlayArrow: OrbitComponent[HTMLElement, InnerOverlayArrowProps] = js.native
  
  trait InnerOverlayArrowProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
  }
  object InnerOverlayArrowProps {
    
    inline def apply(): InnerOverlayArrowProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerOverlayArrowProps]
    }
    
    extension [Self <: InnerOverlayArrowProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    }
  }
  
  type OverlayArrowProps = ComponentProps[OrbitComponent[HTMLElement, InnerOverlayArrowProps]]
}
