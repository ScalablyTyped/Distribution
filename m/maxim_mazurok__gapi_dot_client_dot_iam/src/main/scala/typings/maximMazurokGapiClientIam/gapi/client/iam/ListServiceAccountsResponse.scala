package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceAccountsResponse extends StObject {
  
  /** The list of matching service accounts. */
  var accounts: js.UndefOr[js.Array[ServiceAccount]] = js.native
  
  /** To retrieve the next page of results, set ListServiceAccountsRequest.page_token to this value. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListServiceAccountsResponse {
  
  @scala.inline
  def apply(): ListServiceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceAccountsResponse]
  }
  
  @scala.inline
  implicit class ListServiceAccountsResponseMutableBuilder[Self <: ListServiceAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[ServiceAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: ServiceAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
