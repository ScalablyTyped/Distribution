package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserDataMappingsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The returned User data mappings. The maximum number of User data mappings returned is determined by the value of page_size in the ListUserDataMappingsRequest. */
  var userDataMappings: js.UndefOr[js.Array[UserDataMapping]] = js.undefined
}
object ListUserDataMappingsResponse {
  
  inline def apply(): ListUserDataMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserDataMappingsResponse]
  }
  
  extension [Self <: ListUserDataMappingsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserDataMappings(value: js.Array[UserDataMapping]): Self = StObject.set(x, "userDataMappings", value.asInstanceOf[js.Any])
    
    inline def setUserDataMappingsUndefined: Self = StObject.set(x, "userDataMappings", js.undefined)
    
    inline def setUserDataMappingsVarargs(value: UserDataMapping*): Self = StObject.set(x, "userDataMappings", js.Array(value*))
  }
}
