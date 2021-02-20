package typings.popperjsCore.typesMod

import typings.popperjsCore.anon.PartialOptionsGenericany
import typings.popperjsCore.anon.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends StObject {
  
  def destroy(): Unit = js.native
  
  def forceUpdate(): Unit = js.native
  
  def setOptions(options: PartialOptionsGenericany): js.Promise[PartialState] = js.native
  
  var state: State = js.native
  
  def update(): js.Promise[PartialState] = js.native
}
object Instance {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    forceUpdate: () => Unit,
    setOptions: PartialOptionsGenericany => js.Promise[PartialState],
    state: State,
    update: () => js.Promise[PartialState]
  ): Instance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), forceUpdate = js.Any.fromFunction0(forceUpdate), setOptions = js.Any.fromFunction1(setOptions), state = state.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceUpdate(value: () => Unit): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetOptions(value: PartialOptionsGenericany => js.Promise[PartialState]): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => js.Promise[PartialState]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
