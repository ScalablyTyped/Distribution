package typings.mirrorx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait defaultOptions extends StObject {
  
  def addEffect(name: String, handler: js.Function0[Any]): Any
  
  var historyMode: js.UndefOr[String] = js.undefined
  
  var initialState: js.UndefOr[js.Object] = js.undefined
  
  var middlewares: js.Array[Any]
}
object defaultOptions {
  
  inline def apply(addEffect: (String, js.Function0[Any]) => Any, middlewares: js.Array[Any]): defaultOptions = {
    val __obj = js.Dynamic.literal(addEffect = js.Any.fromFunction2(addEffect), middlewares = middlewares.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: defaultOptions] (val x: Self) extends AnyVal {
    
    inline def setAddEffect(value: (String, js.Function0[Any]) => Any): Self = StObject.set(x, "addEffect", js.Any.fromFunction2(value))
    
    inline def setHistoryMode(value: String): Self = StObject.set(x, "historyMode", value.asInstanceOf[js.Any])
    
    inline def setHistoryModeUndefined: Self = StObject.set(x, "historyMode", js.undefined)
    
    inline def setInitialState(value: js.Object): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setMiddlewares(value: js.Array[Any]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
    
    inline def setMiddlewaresVarargs(value: Any*): Self = StObject.set(x, "middlewares", js.Array(value*))
  }
}
