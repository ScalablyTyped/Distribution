package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVisuallyHiddenSrcVisuallyHiddenMod {
  
  @JSImport("@orbit-ui/react-components/dist/visually-hidden/src/VisuallyHidden", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerVisuallyHidden(param0: InnerVisuallyHiddenProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerVisuallyHidden")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/visually-hidden/src/VisuallyHidden", "VisuallyHidden")
  @js.native
  val VisuallyHidden: OrbitComponent[HTMLElement, InnerVisuallyHiddenProps] = js.native
  
  trait InnerVisuallyHiddenProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * @ignore
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
  }
  object InnerVisuallyHiddenProps {
    
    inline def apply(): InnerVisuallyHiddenProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerVisuallyHiddenProps]
    }
    
    extension [Self <: InnerVisuallyHiddenProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    }
  }
  
  type VisuallyHiddenProps = ComponentProps[OrbitComponent[HTMLElement, InnerVisuallyHiddenProps]]
}
