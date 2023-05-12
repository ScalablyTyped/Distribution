package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQuery extends StObject {
  
  // The search query containing the search terms. Required.
  var queryString: js.UndefOr[String] = js.undefined
  
  // Provides a way to decorate the query string. Supports both KQL and query variables. Optional.
  var queryTemplate: js.UndefOr[NullableOption[String]] = js.undefined
}
object SearchQuery {
  
  inline def apply(): SearchQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchQuery] (val x: Self) extends AnyVal {
    
    inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    inline def setQueryTemplate(value: NullableOption[String]): Self = StObject.set(x, "queryTemplate", value.asInstanceOf[js.Any])
    
    inline def setQueryTemplateNull: Self = StObject.set(x, "queryTemplate", null)
    
    inline def setQueryTemplateUndefined: Self = StObject.set(x, "queryTemplate", js.undefined)
  }
}
