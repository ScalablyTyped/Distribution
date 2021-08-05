package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQuery extends StObject {
  
  var queryString: js.UndefOr[String] = js.undefined
}
object SearchQuery {
  
  inline def apply(): SearchQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchQuery]
  }
  
  extension [Self <: SearchQuery](x: Self) {
    
    inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
  }
}
