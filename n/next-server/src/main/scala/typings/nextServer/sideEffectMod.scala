package typings.nextServer

import typings.nextServer.anon.Instantiable
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideEffectMod {
  
  @JSImport("next-server/dist/lib/side-effect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Instantiable]
  
  trait SideEffectProps extends StObject {
    
    var handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
    
    var inAmpMode: js.UndefOr[Boolean] = js.undefined
    
    def reduceComponentsToState[T](components: js.Array[ReactElement], props: T): State
  }
  object SideEffectProps {
    
    inline def apply(reduceComponentsToState: (js.Array[ReactElement], Any) => State): SideEffectProps = {
      val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
      __obj.asInstanceOf[SideEffectProps]
    }
    
    extension [Self <: SideEffectProps](x: Self) {
      
      inline def setHandleStateChange(value: /* state */ State => Unit): Self = StObject.set(x, "handleStateChange", js.Any.fromFunction1(value))
      
      inline def setHandleStateChangeUndefined: Self = StObject.set(x, "handleStateChange", js.undefined)
      
      inline def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
      
      inline def setInAmpModeUndefined: Self = StObject.set(x, "inAmpMode", js.undefined)
      
      inline def setReduceComponentsToState(value: (js.Array[ReactElement], Any) => State): Self = StObject.set(x, "reduceComponentsToState", js.Any.fromFunction2(value))
    }
  }
  
  type State = js.UndefOr[js.Array[ReactElement]]
}
