package typings.orientjs.mod

import typings.orientjs.orientjsStrings.Javascript
import typings.orientjs.orientjsStrings.SQL
import typings.orientjs.orientjsStrings.a
import typings.orientjs.orientjsStrings.l
import typings.orientjs.orientjsStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryOptions extends StObject {
  
  var `class`: js.UndefOr[String] = js.native
  
  var fetchPlan: js.UndefOr[js.Any] = js.native
  
  var language: js.UndefOr[SQL | Javascript] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[s | a | l] = js.native
  
  var params: js.UndefOr[js.Any] = js.native
  
  var token: js.UndefOr[js.Any] = js.native
}
object QueryOptions {
  
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit class QueryOptionsMutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setFetchPlan(value: js.Any): Self = StObject.set(x, "fetchPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchPlanUndefined: Self = StObject.set(x, "fetchPlan", js.undefined)
    
    @scala.inline
    def setLanguage(value: SQL | Javascript): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMode(value: s | a | l): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
