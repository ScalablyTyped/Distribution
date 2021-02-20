package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountsResponse extends StObject {
  
  /** List of GTM Accounts that a user has access to. */
  var account: js.UndefOr[js.Array[Account]] = js.native
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAccountsResponse {
  
  @scala.inline
  def apply(): ListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountsResponse]
  }
  
  @scala.inline
  implicit class ListAccountsResponseMutableBuilder[Self <: ListAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: js.Array[Account]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setAccountVarargs(value: Account*): Self = StObject.set(x, "account", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
