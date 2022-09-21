package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGlossariesResponse extends StObject {
  
  /** The list of glossaries for a project. */
  var glossaries: js.UndefOr[js.Array[Glossary]] = js.undefined
  
  /**
    * A token to retrieve a page of results. Pass this value in the [ListGlossariesRequest.page_token] field in the subsequent call to `ListGlossaries` method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListGlossariesResponse {
  
  inline def apply(): ListGlossariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGlossariesResponse]
  }
  
  extension [Self <: ListGlossariesResponse](x: Self) {
    
    inline def setGlossaries(value: js.Array[Glossary]): Self = StObject.set(x, "glossaries", value.asInstanceOf[js.Any])
    
    inline def setGlossariesUndefined: Self = StObject.set(x, "glossaries", js.undefined)
    
    inline def setGlossariesVarargs(value: Glossary*): Self = StObject.set(x, "glossaries", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
