package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath238 extends StObject {
  
  /**
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. You must also provide a valid OAuth `access_token` as an input parameter and the grant for the token's owner will be deleted.
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  var delete: ParametersPath238
}
object DeleteParametersPath238 {
  
  inline def apply(delete: ParametersPath238): DeleteParametersPath238 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath238]
  }
  
  extension [Self <: DeleteParametersPath238](x: Self) {
    
    inline def setDelete(value: ParametersPath238): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
