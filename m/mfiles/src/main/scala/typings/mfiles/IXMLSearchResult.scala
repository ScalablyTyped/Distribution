package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXMLSearchResult extends StObject {
  
  val MoreResults: Boolean = js.native
  
  val SearchResult: String = js.native
}
object IXMLSearchResult {
  
  @scala.inline
  def apply(MoreResults: Boolean, SearchResult: String): IXMLSearchResult = {
    val __obj = js.Dynamic.literal(MoreResults = MoreResults.asInstanceOf[js.Any], SearchResult = SearchResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLSearchResult]
  }
  
  @scala.inline
  implicit class IXMLSearchResultMutableBuilder[Self <: IXMLSearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchResult(value: String): Self = StObject.set(x, "SearchResult", value.asInstanceOf[js.Any])
  }
}
