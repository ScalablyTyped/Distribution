package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXMLSearchResult extends StObject {
  
  val MoreResults: Boolean
  
  val SearchResult: String
}
object IXMLSearchResult {
  
  inline def apply(MoreResults: Boolean, SearchResult: String): IXMLSearchResult = {
    val __obj = js.Dynamic.literal(MoreResults = MoreResults.asInstanceOf[js.Any], SearchResult = SearchResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLSearchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IXMLSearchResult] (val x: Self) extends AnyVal {
    
    inline def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
    
    inline def setSearchResult(value: String): Self = StObject.set(x, "SearchResult", value.asInstanceOf[js.Any])
  }
}
