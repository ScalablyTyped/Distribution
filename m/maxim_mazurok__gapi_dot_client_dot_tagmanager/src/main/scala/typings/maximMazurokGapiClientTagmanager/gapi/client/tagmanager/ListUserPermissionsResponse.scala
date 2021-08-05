package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserPermissionsResponse extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** All GTM UserPermissions of a GTM Account. */
  var userPermission: js.UndefOr[js.Array[UserPermission]] = js.undefined
}
object ListUserPermissionsResponse {
  
  inline def apply(): ListUserPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserPermissionsResponse]
  }
  
  extension [Self <: ListUserPermissionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserPermission(value: js.Array[UserPermission]): Self = StObject.set(x, "userPermission", value.asInstanceOf[js.Any])
    
    inline def setUserPermissionUndefined: Self = StObject.set(x, "userPermission", js.undefined)
    
    inline def setUserPermissionVarargs(value: UserPermission*): Self = StObject.set(x, "userPermission", js.Array(value :_*))
  }
}
