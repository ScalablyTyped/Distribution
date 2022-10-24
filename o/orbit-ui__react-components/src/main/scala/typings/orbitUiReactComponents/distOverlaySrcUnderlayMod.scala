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

object distOverlaySrcUnderlayMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/Underlay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerUnderlay(param0: InnerUnderlayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerUnderlay")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/Underlay", "Underlay")
  @js.native
  val Underlay: OrbitComponent[HTMLElement, InnerUnderlayProps] = js.native
  
  trait InnerUnderlayProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The z-index of the underlay.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object InnerUnderlayProps {
    
    inline def apply(): InnerUnderlayProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerUnderlayProps]
    }
    
    extension [Self <: InnerUnderlayProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type UnderlayProps = ComponentProps[OrbitComponent[HTMLElement, InnerUnderlayProps]]
}
