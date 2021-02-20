package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserPermissionsResponse extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** All GTM UserPermissions of a GTM Account. */
  var userPermission: js.UndefOr[js.Array[UserPermission]] = js.native
}
object ListUserPermissionsResponse {
  
  @scala.inline
  def apply(): ListUserPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserPermissionsResponse]
  }
  
  @scala.inline
  implicit class ListUserPermissionsResponseMutableBuilder[Self <: ListUserPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUserPermission(value: js.Array[UserPermission]): Self = StObject.set(x, "userPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPermissionUndefined: Self = StObject.set(x, "userPermission", js.undefined)
    
    @scala.inline
    def setUserPermissionVarargs(value: UserPermission*): Self = StObject.set(x, "userPermission", js.Array(value :_*))
  }
}
