package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceAccountsResponse extends StObject {
  
  /** The list of matching service accounts. */
  var accounts: js.UndefOr[js.Array[ServiceAccount]] = js.undefined
  
  /** To retrieve the next page of results, set ListServiceAccountsRequest.page_token to this value. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListServiceAccountsResponse {
  
  inline def apply(): ListServiceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceAccountsResponse]
  }
  
  extension [Self <: ListServiceAccountsResponse](x: Self) {
    
    inline def setAccounts(value: js.Array[ServiceAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: ServiceAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
