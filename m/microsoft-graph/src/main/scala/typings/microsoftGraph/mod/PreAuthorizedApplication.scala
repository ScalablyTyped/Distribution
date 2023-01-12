package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreAuthorizedApplication extends StObject {
  
  // The unique identifier for the client application.
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier for the oauth2PermissionScopes the application requires.
  var delegatedPermissionIds: js.UndefOr[js.Array[String]] = js.undefined
}
object PreAuthorizedApplication {
  
  inline def apply(): PreAuthorizedApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreAuthorizedApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreAuthorizedApplication] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setDelegatedPermissionIds(value: js.Array[String]): Self = StObject.set(x, "delegatedPermissionIds", value.asInstanceOf[js.Any])
    
    inline def setDelegatedPermissionIdsUndefined: Self = StObject.set(x, "delegatedPermissionIds", js.undefined)
    
    inline def setDelegatedPermissionIdsVarargs(value: String*): Self = StObject.set(x, "delegatedPermissionIds", js.Array(value*))
  }
}
