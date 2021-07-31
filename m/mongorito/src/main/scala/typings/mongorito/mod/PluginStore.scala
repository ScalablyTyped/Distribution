package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginStore extends StObject {
  
  def dispatch(arg: js.Any): js.Any
  
  def getState(): State
  
  var model: js.UndefOr[Model] = js.undefined
  
  var modelClass: ModelClass
}
object PluginStore {
  
  @scala.inline
  def apply(dispatch: js.Any => js.Any, getState: () => State, modelClass: ModelClass): PluginStore = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), modelClass = modelClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginStore]
  }
  
  @scala.inline
  implicit class PluginStoreMutableBuilder[Self <: PluginStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispatch(value: js.Any => js.Any): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => State): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelClass(value: ModelClass): Self = StObject.set(x, "modelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
