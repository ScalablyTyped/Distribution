package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResponse extends StObject {
  
  var hitsContainers: js.UndefOr[NullableOption[js.Array[SearchHitsContainer]]] = js.native
  
  var searchTerms: js.UndefOr[NullableOption[js.Array[String]]] = js.native
}
object SearchResponse {
  
  @scala.inline
  def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  
  @scala.inline
  implicit class SearchResponseMutableBuilder[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHitsContainers(value: NullableOption[js.Array[SearchHitsContainer]]): Self = StObject.set(x, "hitsContainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsContainersNull: Self = StObject.set(x, "hitsContainers", null)
    
    @scala.inline
    def setHitsContainersUndefined: Self = StObject.set(x, "hitsContainers", js.undefined)
    
    @scala.inline
    def setHitsContainersVarargs(value: SearchHitsContainer*): Self = StObject.set(x, "hitsContainers", js.Array(value :_*))
    
    @scala.inline
    def setSearchTerms(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "searchTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTermsNull: Self = StObject.set(x, "searchTerms", null)
    
    @scala.inline
    def setSearchTermsUndefined: Self = StObject.set(x, "searchTerms", js.undefined)
    
    @scala.inline
    def setSearchTermsVarargs(value: String*): Self = StObject.set(x, "searchTerms", js.Array(value :_*))
  }
}
