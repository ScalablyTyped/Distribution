package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResponse extends StObject {
  
  // A collection of search results.
  var hitsContainers: js.UndefOr[NullableOption[js.Array[SearchHitsContainer]]] = js.undefined
  
  // Provides information related to spelling corrections in the alteration response.
  var queryAlterationResponse: js.UndefOr[NullableOption[AlterationResponse]] = js.undefined
  
  /**
    * A dictionary of resultTemplateIds and associated values, which include the name and JSON schema of the result
    * templates.
    */
  var resultTemplates: js.UndefOr[NullableOption[ResultTemplateDictionary]] = js.undefined
  
  // Contains the search terms sent in the initial search query.
  var searchTerms: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object SearchResponse {
  
  inline def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
    inline def setHitsContainers(value: NullableOption[js.Array[SearchHitsContainer]]): Self = StObject.set(x, "hitsContainers", value.asInstanceOf[js.Any])
    
    inline def setHitsContainersNull: Self = StObject.set(x, "hitsContainers", null)
    
    inline def setHitsContainersUndefined: Self = StObject.set(x, "hitsContainers", js.undefined)
    
    inline def setHitsContainersVarargs(value: SearchHitsContainer*): Self = StObject.set(x, "hitsContainers", js.Array(value*))
    
    inline def setQueryAlterationResponse(value: NullableOption[AlterationResponse]): Self = StObject.set(x, "queryAlterationResponse", value.asInstanceOf[js.Any])
    
    inline def setQueryAlterationResponseNull: Self = StObject.set(x, "queryAlterationResponse", null)
    
    inline def setQueryAlterationResponseUndefined: Self = StObject.set(x, "queryAlterationResponse", js.undefined)
    
    inline def setResultTemplates(value: NullableOption[ResultTemplateDictionary]): Self = StObject.set(x, "resultTemplates", value.asInstanceOf[js.Any])
    
    inline def setResultTemplatesNull: Self = StObject.set(x, "resultTemplates", null)
    
    inline def setResultTemplatesUndefined: Self = StObject.set(x, "resultTemplates", js.undefined)
    
    inline def setSearchTerms(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "searchTerms", value.asInstanceOf[js.Any])
    
    inline def setSearchTermsNull: Self = StObject.set(x, "searchTerms", null)
    
    inline def setSearchTermsUndefined: Self = StObject.set(x, "searchTerms", js.undefined)
    
    inline def setSearchTermsVarargs(value: String*): Self = StObject.set(x, "searchTerms", js.Array(value*))
  }
}
