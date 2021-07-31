package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQuery extends StObject {
  
  var queryString: js.UndefOr[String] = js.undefined
}
object SearchQuery {
  
  @scala.inline
  def apply(): SearchQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchQuery]
  }
  
  @scala.inline
  implicit class SearchQueryMutableBuilder[Self <: SearchQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
  }
}
