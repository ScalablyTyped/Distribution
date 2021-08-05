package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResponse extends StObject {
  
  var hitsContainers: js.UndefOr[NullableOption[js.Array[SearchHitsContainer]]] = js.undefined
  
  var searchTerms: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object SearchResponse {
  
  inline def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  
  extension [Self <: SearchResponse](x: Self) {
    
    inline def setHitsContainers(value: NullableOption[js.Array[SearchHitsContainer]]): Self = StObject.set(x, "hitsContainers", value.asInstanceOf[js.Any])
    
    inline def setHitsContainersNull: Self = StObject.set(x, "hitsContainers", null)
    
    inline def setHitsContainersUndefined: Self = StObject.set(x, "hitsContainers", js.undefined)
    
    inline def setHitsContainersVarargs(value: SearchHitsContainer*): Self = StObject.set(x, "hitsContainers", js.Array(value :_*))
    
    inline def setSearchTerms(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "searchTerms", value.asInstanceOf[js.Any])
    
    inline def setSearchTermsNull: Self = StObject.set(x, "searchTerms", null)
    
    inline def setSearchTermsUndefined: Self = StObject.set(x, "searchTerms", js.undefined)
    
    inline def setSearchTermsVarargs(value: String*): Self = StObject.set(x, "searchTerms", js.Array(value :_*))
  }
}
