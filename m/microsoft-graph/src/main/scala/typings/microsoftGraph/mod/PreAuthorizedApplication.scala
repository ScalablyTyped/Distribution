package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreAuthorizedApplication extends StObject {
  
  // The unique identifier for the application.
  var appId: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier for the oauth2PermissionScopes the application requires.
  var delegatedPermissionIds: js.UndefOr[js.Array[String]] = js.native
}
object PreAuthorizedApplication {
  
  @scala.inline
  def apply(): PreAuthorizedApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreAuthorizedApplication]
  }
  
  @scala.inline
  implicit class PreAuthorizedApplicationMutableBuilder[Self <: PreAuthorizedApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setDelegatedPermissionIds(value: js.Array[String]): Self = StObject.set(x, "delegatedPermissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedPermissionIdsUndefined: Self = StObject.set(x, "delegatedPermissionIds", js.undefined)
    
    @scala.inline
    def setDelegatedPermissionIdsVarargs(value: String*): Self = StObject.set(x, "delegatedPermissionIds", js.Array(value :_*))
  }
}
