package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNegativeKeywordsResponse extends StObject {
  
  /** The list of negative keywords. This list will be absent if empty. */
  var negativeKeywords: js.UndefOr[js.Array[NegativeKeyword]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListNegativeKeywords` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListNegativeKeywordsResponse {
  
  inline def apply(): ListNegativeKeywordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNegativeKeywordsResponse]
  }
  
  extension [Self <: ListNegativeKeywordsResponse](x: Self) {
    
    inline def setNegativeKeywords(value: js.Array[NegativeKeyword]): Self = StObject.set(x, "negativeKeywords", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordsUndefined: Self = StObject.set(x, "negativeKeywords", js.undefined)
    
    inline def setNegativeKeywordsVarargs(value: NegativeKeyword*): Self = StObject.set(x, "negativeKeywords", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
