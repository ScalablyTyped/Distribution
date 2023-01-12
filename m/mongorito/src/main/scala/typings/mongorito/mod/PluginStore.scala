package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginStore extends StObject {
  
  def dispatch(arg: Any): Any
  
  def getState(): State
  
  var model: js.UndefOr[Model] = js.undefined
  
  var modelClass: ModelClass
}
object PluginStore {
  
  inline def apply(dispatch: Any => Any, getState: () => State, modelClass: ModelClass): PluginStore = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), modelClass = modelClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginStore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginStore] (val x: Self) extends AnyVal {
    
    inline def setDispatch(value: Any => Any): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => State): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelClass(value: ModelClass): Self = StObject.set(x, "modelClass", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
