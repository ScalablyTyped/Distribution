package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalTestPermissionsResponse extends StObject {
  
  /** A set of permissions that the caller is allowed. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object SasPortalTestPermissionsResponse {
  
  inline def apply(): SasPortalTestPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalTestPermissionsResponse]
  }
  
  extension [Self <: SasPortalTestPermissionsResponse](x: Self) {
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
