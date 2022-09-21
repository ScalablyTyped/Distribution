package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRequestBodyResponses extends StObject {
  
  /**
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. You must also provide a valid OAuth `access_token` as an input parameter and the grant for the token's owner will be deleted.
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  var delete: RequestBodyResponses
}
object DeleteRequestBodyResponses {
  
  inline def apply(delete: RequestBodyResponses): DeleteRequestBodyResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequestBodyResponses]
  }
  
  extension [Self <: DeleteRequestBodyResponses](x: Self) {
    
    inline def setDelete(value: RequestBodyResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
