package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.OnTransitionEnd
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSlidingTransitionMod {
  
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/useSlidingTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait SlidingDirection extends StObject
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/useSlidingTransition", "SlidingDirection")
  @js.native
  object SlidingDirection extends StObject {
    
    @js.native
    sealed trait down
      extends StObject
         with SlidingDirection
    
    @js.native
    sealed trait up
      extends StObject
         with SlidingDirection
  }
  
  @js.native
  sealed trait TransitionState extends StObject
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/useSlidingTransition", "TransitionState")
  @js.native
  object TransitionState extends StObject {
    
    @js.native
    sealed trait completed
      extends StObject
         with TransitionState
    
    @js.native
    sealed trait transitioning
      extends StObject
         with TransitionState
  }
  
  inline def useSlidingTransition(isOpen: Boolean, ref: RefObject[Any]): SlidingTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlidingTransition")(isOpen.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[SlidingTransition]
  
  trait SlidingTransition extends StObject {
    
    var transitionClasses: String
    
    var transitionProps: OnTransitionEnd
  }
  object SlidingTransition {
    
    inline def apply(transitionClasses: String, transitionProps: OnTransitionEnd): SlidingTransition = {
      val __obj = js.Dynamic.literal(transitionClasses = transitionClasses.asInstanceOf[js.Any], transitionProps = transitionProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlidingTransition]
    }
    
    extension [Self <: SlidingTransition](x: Self) {
      
      inline def setTransitionClasses(value: String): Self = StObject.set(x, "transitionClasses", value.asInstanceOf[js.Any])
      
      inline def setTransitionProps(value: OnTransitionEnd): Self = StObject.set(x, "transitionProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait SlidingTransitionState extends StObject {
    
    var direction: SlidingDirection
    
    var transitionState: TransitionState
  }
  object SlidingTransitionState {
    
    inline def apply(direction: SlidingDirection, transitionState: TransitionState): SlidingTransitionState = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], transitionState = transitionState.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlidingTransitionState]
    }
    
    extension [Self <: SlidingTransitionState](x: Self) {
      
      inline def setDirection(value: SlidingDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setTransitionState(value: TransitionState): Self = StObject.set(x, "transitionState", value.asInstanceOf[js.Any])
    }
  }
}
