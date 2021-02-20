package typings.nextServer.anon

import typings.nextServer.sideEffectMod.State
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<next-server.next-server/dist/lib/side-effect.SideEffectProps> */
@js.native
trait ReadonlySideEffectProps extends StObject {
  
  val handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.native
  
  val inAmpMode: js.UndefOr[Boolean] = js.native
  
  val reduceComponentsToState: js.Function2[/* components */ js.Array[ReactElement], /* props */ js.Any, State] = js.native
}
object ReadonlySideEffectProps {
  
  @scala.inline
  def apply(reduceComponentsToState: (/* components */ js.Array[ReactElement], /* props */ js.Any) => State): ReadonlySideEffectProps = {
    val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
    __obj.asInstanceOf[ReadonlySideEffectProps]
  }
  
  @scala.inline
  implicit class ReadonlySideEffectPropsMutableBuilder[Self <: ReadonlySideEffectProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleStateChange(value: /* state */ State => Unit): Self = StObject.set(x, "handleStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleStateChangeUndefined: Self = StObject.set(x, "handleStateChange", js.undefined)
    
    @scala.inline
    def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAmpModeUndefined: Self = StObject.set(x, "inAmpMode", js.undefined)
    
    @scala.inline
    def setReduceComponentsToState(value: (/* components */ js.Array[ReactElement], /* props */ js.Any) => State): Self = StObject.set(x, "reduceComponentsToState", js.Any.fromFunction2(value))
  }
}
