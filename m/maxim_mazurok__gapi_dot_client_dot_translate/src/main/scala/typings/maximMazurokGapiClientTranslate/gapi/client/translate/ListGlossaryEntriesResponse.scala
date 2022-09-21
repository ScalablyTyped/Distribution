package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGlossaryEntriesResponse extends StObject {
  
  /** Optional. The Glossary Entries */
  var glossaryEntries: js.UndefOr[js.Array[GlossaryEntry]] = js.undefined
  
  /** Optional. A token to retrieve a page of results. Pass this value in the [ListGLossaryEntriesRequest.page_token] field in the subsequent calls. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListGlossaryEntriesResponse {
  
  inline def apply(): ListGlossaryEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGlossaryEntriesResponse]
  }
  
  extension [Self <: ListGlossaryEntriesResponse](x: Self) {
    
    inline def setGlossaryEntries(value: js.Array[GlossaryEntry]): Self = StObject.set(x, "glossaryEntries", value.asInstanceOf[js.Any])
    
    inline def setGlossaryEntriesUndefined: Self = StObject.set(x, "glossaryEntries", js.undefined)
    
    inline def setGlossaryEntriesVarargs(value: GlossaryEntry*): Self = StObject.set(x, "glossaryEntries", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
