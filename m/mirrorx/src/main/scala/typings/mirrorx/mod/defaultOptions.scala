package typings.mirrorx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait defaultOptions extends StObject {
  
  def addEffect(name: String, handler: js.Function0[_]): js.Any = js.native
  
  var historyMode: js.UndefOr[String] = js.native
  
  var initialState: js.UndefOr[js.Object] = js.native
  
  var middlewares: js.Array[_] = js.native
}
object defaultOptions {
  
  @scala.inline
  def apply(addEffect: (String, js.Function0[_]) => js.Any, middlewares: js.Array[_]): defaultOptions = {
    val __obj = js.Dynamic.literal(addEffect = js.Any.fromFunction2(addEffect), middlewares = middlewares.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultOptions]
  }
  
  @scala.inline
  implicit class defaultOptionsMutableBuilder[Self <: defaultOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEffect(value: (String, js.Function0[_]) => js.Any): Self = StObject.set(x, "addEffect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHistoryMode(value: String): Self = StObject.set(x, "historyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryModeUndefined: Self = StObject.set(x, "historyMode", js.undefined)
    
    @scala.inline
    def setInitialState(value: js.Object): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setMiddlewares(value: js.Array[_]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddlewaresVarargs(value: js.Any*): Self = StObject.set(x, "middlewares", js.Array(value :_*))
  }
}
