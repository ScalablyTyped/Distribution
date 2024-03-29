package typings.nextServer.anon

import typings.nextServer.distLibSideEffectMod.State
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<next-server.next-server/dist/lib/side-effect.SideEffectProps> */
trait ReadonlySideEffectProps extends StObject {
  
  val handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
  
  val inAmpMode: js.UndefOr[Boolean] = js.undefined
  
  val reduceComponentsToState: js.Function2[/* components */ js.Array[ReactElement], /* props */ Any, State]
}
object ReadonlySideEffectProps {
  
  inline def apply(reduceComponentsToState: (/* components */ js.Array[ReactElement], /* props */ Any) => State): ReadonlySideEffectProps = {
    val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
    __obj.asInstanceOf[ReadonlySideEffectProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlySideEffectProps] (val x: Self) extends AnyVal {
    
    inline def setHandleStateChange(value: /* state */ State => Unit): Self = StObject.set(x, "handleStateChange", js.Any.fromFunction1(value))
    
    inline def setHandleStateChangeUndefined: Self = StObject.set(x, "handleStateChange", js.undefined)
    
    inline def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
    
    inline def setInAmpModeUndefined: Self = StObject.set(x, "inAmpMode", js.undefined)
    
    inline def setReduceComponentsToState(value: (/* components */ js.Array[ReactElement], /* props */ Any) => State): Self = StObject.set(x, "reduceComponentsToState", js.Any.fromFunction2(value))
  }
}
