package typings.maximMazurokGapiClientIap.gapi.client.iap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentityAwareProxyClientsResponse extends js.Object {
  
  /** Clients existing in the brand. */
  var identityAwareProxyClients: js.UndefOr[js.Array[IdentityAwareProxyClient]] = js.native
  
  /** A token, which can be send as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListIdentityAwareProxyClientsResponse {
  
  @scala.inline
  def apply(): ListIdentityAwareProxyClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityAwareProxyClientsResponse]
  }
  
  @scala.inline
  implicit class ListIdentityAwareProxyClientsResponseOps[Self <: ListIdentityAwareProxyClientsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentityAwareProxyClientsVarargs(value: IdentityAwareProxyClient*): Self = this.set("identityAwareProxyClients", js.Array(value :_*))
    
    @scala.inline
    def setIdentityAwareProxyClients(value: js.Array[IdentityAwareProxyClient]): Self = this.set("identityAwareProxyClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityAwareProxyClients: Self = this.set("identityAwareProxyClients", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
