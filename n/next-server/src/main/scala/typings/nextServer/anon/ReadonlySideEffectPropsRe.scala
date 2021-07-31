package typings.nextServer.anon

import typings.nextServer.sideEffectMod.State
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<next-server.next-server/dist/lib/side-effect.SideEffectProps> & std.Readonly<{  children :react.react.ReactNode | undefined}> */
trait ReadonlySideEffectPropsRe extends StObject {
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
  
  val inAmpMode: js.UndefOr[Boolean] = js.undefined
  
  val reduceComponentsToState: js.Function2[/* components */ js.Array[ReactElement], /* props */ js.Any, State]
}
object ReadonlySideEffectPropsRe {
  
  @scala.inline
  def apply(reduceComponentsToState: (/* components */ js.Array[ReactElement], /* props */ js.Any) => State): ReadonlySideEffectPropsRe = {
    val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
    __obj.asInstanceOf[ReadonlySideEffectPropsRe]
  }
  
  @scala.inline
  implicit class ReadonlySideEffectPropsReMutableBuilder[Self <: ReadonlySideEffectPropsRe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
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
