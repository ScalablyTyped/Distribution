package typings.popperjsCore.typesMod

import typings.popperjsCore.anon.PartialOptionsGenericany
import typings.popperjsCore.anon.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  def destroy(): Unit
  
  def forceUpdate(): Unit
  
  def setOptions(setOptionsAction: SetAction[PartialOptionsGenericany]): js.Promise[PartialState]
  
  var state: State
  
  def update(): js.Promise[PartialState]
}
object Instance {
  
  inline def apply(
    destroy: () => Unit,
    forceUpdate: () => Unit,
    setOptions: SetAction[PartialOptionsGenericany] => js.Promise[PartialState],
    state: State,
    update: () => js.Promise[PartialState]
  ): Instance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), forceUpdate = js.Any.fromFunction0(forceUpdate), setOptions = js.Any.fromFunction1(setOptions), state = state.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setForceUpdate(value: () => Unit): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
    
    inline def setSetOptions(value: SetAction[PartialOptionsGenericany] => js.Promise[PartialState]): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: () => js.Promise[PartialState]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
