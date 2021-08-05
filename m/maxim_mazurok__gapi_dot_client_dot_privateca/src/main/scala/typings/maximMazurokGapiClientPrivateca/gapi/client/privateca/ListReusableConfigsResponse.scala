package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReusableConfigsResponse extends StObject {
  
  /** A token to retrieve next page of results. Pass this value in ListReusableConfigsRequest.next_page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of ReusableConfigs. */
  var reusableConfigs: js.UndefOr[js.Array[ReusableConfig]] = js.undefined
  
  /** A list of locations (e.g. "us-west1") that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListReusableConfigsResponse {
  
  inline def apply(): ListReusableConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReusableConfigsResponse]
  }
  
  extension [Self <: ListReusableConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReusableConfigs(value: js.Array[ReusableConfig]): Self = StObject.set(x, "reusableConfigs", value.asInstanceOf[js.Any])
    
    inline def setReusableConfigsUndefined: Self = StObject.set(x, "reusableConfigs", js.undefined)
    
    inline def setReusableConfigsVarargs(value: ReusableConfig*): Self = StObject.set(x, "reusableConfigs", js.Array(value :_*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
