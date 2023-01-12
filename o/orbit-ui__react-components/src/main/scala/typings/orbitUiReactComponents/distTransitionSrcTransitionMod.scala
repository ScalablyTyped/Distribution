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

object distTransitionSrcTransitionMod {
  
  @JSImport("@orbit-ui/react-components/dist/transition/src/Transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTransition(param0: InnerTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTransition")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/transition/src/Transition", "Transition")
  @js.native
  val Transition: OrbitComponent[HTMLElement, InnerTransitionProps] = js.native
  
  trait InnerTransitionProps extends StObject {
    
    /**
      * 	Whether the transition should run on initial mount.
      */
    var animateFirstRender: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * @ignore
      */
    var children: ReactNode
    
    /**
      * CSS classes to add to the transitioning element during the enter phase.
      */
    var enter: js.UndefOr[String] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * CSS classes to add to the transitioning element during the leave phase.
      */
    var leave: js.UndefOr[String] = js.undefined
    
    /**
      * A controlled show value that determined whether or not the component is displayed.
      */
    var show: Boolean
  }
  object InnerTransitionProps {
    
    inline def apply(show: Boolean): InnerTransitionProps = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerTransitionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InnerTransitionProps] (val x: Self) extends AnyVal {
      
      inline def setAnimateFirstRender(value: Boolean): Self = StObject.set(x, "animateFirstRender", value.asInstanceOf[js.Any])
      
      inline def setAnimateFirstRenderUndefined: Self = StObject.set(x, "animateFirstRender", js.undefined)
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setLeave(value: String): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
  
  type TransitionProps = ComponentProps[OrbitComponent[HTMLElement, InnerTransitionProps]]
}
