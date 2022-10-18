package typings.next

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibSideEffectMod {
  
  @JSImport("next/dist/shared/lib/side-effect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SideEffectProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  trait SideEffectProps extends StObject {
    
    var children: ReactNode
    
    var handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
    
    var headManager: Any
    
    var inAmpMode: js.UndefOr[Boolean] = js.undefined
    
    def reduceComponentsToState[T /* <: js.Object */](components: js.Array[ReactElement], props: T): State
  }
  object SideEffectProps {
    
    inline def apply(headManager: Any, reduceComponentsToState: (js.Array[ReactElement], Any) => State): SideEffectProps = {
      val __obj = js.Dynamic.literal(headManager = headManager.asInstanceOf[js.Any], reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
      __obj.asInstanceOf[SideEffectProps]
    }
    
    extension [Self <: SideEffectProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHandleStateChange(value: /* state */ State => Unit): Self = StObject.set(x, "handleStateChange", js.Any.fromFunction1(value))
      
      inline def setHandleStateChangeUndefined: Self = StObject.set(x, "handleStateChange", js.undefined)
      
      inline def setHeadManager(value: Any): Self = StObject.set(x, "headManager", value.asInstanceOf[js.Any])
      
      inline def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
      
      inline def setInAmpModeUndefined: Self = StObject.set(x, "inAmpMode", js.undefined)
      
      inline def setReduceComponentsToState(value: (js.Array[ReactElement], Any) => State): Self = StObject.set(x, "reduceComponentsToState", js.Any.fromFunction2(value))
    }
  }
  
  type State = js.UndefOr[js.Array[Element]]
}
