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

object distFieldSrcValidMessageMod {
  
  @JSImport("@orbit-ui/react-components/dist/field/src/ValidMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerValidMessage(props: InnerValidMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerValidMessage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/field/src/ValidMessage", "ValidMessage")
  @js.native
  val ValidMessage: OrbitComponent[HTMLElement, InnerValidMessageProps] = js.native
  
  trait InnerValidMessageProps extends StObject {
    
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
  }
  object InnerValidMessageProps {
    
    inline def apply(): InnerValidMessageProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerValidMessageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InnerValidMessageProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    }
  }
  
  type ValidMessageProps = ComponentProps[OrbitComponent[HTMLElement, InnerValidMessageProps]]
}
