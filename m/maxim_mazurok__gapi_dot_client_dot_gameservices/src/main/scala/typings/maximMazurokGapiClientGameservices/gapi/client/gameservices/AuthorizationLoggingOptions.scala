package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationLoggingOptions extends StObject {
  
  /** The type of the permission that was checked. */
  var permissionType: js.UndefOr[String] = js.undefined
}
object AuthorizationLoggingOptions {
  
  inline def apply(): AuthorizationLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationLoggingOptions]
  }
  
  extension [Self <: AuthorizationLoggingOptions](x: Self) {
    
    inline def setPermissionType(value: String): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
  }
}
