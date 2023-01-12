package typings.orientjs.mod

import typings.orientjs.orientjsStrings.Javascript
import typings.orientjs.orientjsStrings.SQL
import typings.orientjs.orientjsStrings.a
import typings.orientjs.orientjsStrings.l
import typings.orientjs.orientjsStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions extends StObject {
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var fetchPlan: js.UndefOr[Any] = js.undefined
  
  var language: js.UndefOr[SQL | Javascript] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[s | a | l] = js.undefined
  
  var params: js.UndefOr[Any] = js.undefined
  
  var token: js.UndefOr[Any] = js.undefined
}
object QueryOptions {
  
  inline def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setFetchPlan(value: Any): Self = StObject.set(x, "fetchPlan", value.asInstanceOf[js.Any])
    
    inline def setFetchPlanUndefined: Self = StObject.set(x, "fetchPlan", js.undefined)
    
    inline def setLanguage(value: SQL | Javascript): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMode(value: s | a | l): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setToken(value: Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
