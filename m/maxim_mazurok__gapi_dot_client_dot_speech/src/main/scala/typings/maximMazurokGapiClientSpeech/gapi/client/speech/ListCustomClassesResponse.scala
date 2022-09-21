package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomClassesResponse extends StObject {
  
  /** The custom classes. */
  var customClasses: js.UndefOr[js.Array[CustomClass]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCustomClassesResponse {
  
  inline def apply(): ListCustomClassesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomClassesResponse]
  }
  
  extension [Self <: ListCustomClassesResponse](x: Self) {
    
    inline def setCustomClasses(value: js.Array[CustomClass]): Self = StObject.set(x, "customClasses", value.asInstanceOf[js.Any])
    
    inline def setCustomClassesUndefined: Self = StObject.set(x, "customClasses", js.undefined)
    
    inline def setCustomClassesVarargs(value: CustomClass*): Self = StObject.set(x, "customClasses", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
