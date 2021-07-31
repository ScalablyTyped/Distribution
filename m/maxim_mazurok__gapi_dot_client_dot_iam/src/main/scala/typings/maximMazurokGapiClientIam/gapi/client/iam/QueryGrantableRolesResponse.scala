package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryGrantableRolesResponse extends StObject {
  
  /** To retrieve the next page of results, set `QueryGrantableRolesRequest.page_token` to this value. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of matching roles. */
  var roles: js.UndefOr[js.Array[Role]] = js.undefined
}
object QueryGrantableRolesResponse {
  
  @scala.inline
  def apply(): QueryGrantableRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryGrantableRolesResponse]
  }
  
  @scala.inline
  implicit class QueryGrantableRolesResponseMutableBuilder[Self <: QueryGrantableRolesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRoles(value: js.Array[Role]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: Role*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
