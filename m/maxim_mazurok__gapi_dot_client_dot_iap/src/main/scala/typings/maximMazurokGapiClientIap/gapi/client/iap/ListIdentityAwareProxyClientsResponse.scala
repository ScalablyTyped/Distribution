package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityAwareProxyClientsResponse extends StObject {
  
  /** Clients existing in the brand. */
  var identityAwareProxyClients: js.UndefOr[js.Array[IdentityAwareProxyClient]] = js.undefined
  
  /** A token, which can be send as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListIdentityAwareProxyClientsResponse {
  
  @scala.inline
  def apply(): ListIdentityAwareProxyClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityAwareProxyClientsResponse]
  }
  
  @scala.inline
  implicit class ListIdentityAwareProxyClientsResponseMutableBuilder[Self <: ListIdentityAwareProxyClientsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityAwareProxyClients(value: js.Array[IdentityAwareProxyClient]): Self = StObject.set(x, "identityAwareProxyClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityAwareProxyClientsUndefined: Self = StObject.set(x, "identityAwareProxyClients", js.undefined)
    
    @scala.inline
    def setIdentityAwareProxyClientsVarargs(value: IdentityAwareProxyClient*): Self = StObject.set(x, "identityAwareProxyClients", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
