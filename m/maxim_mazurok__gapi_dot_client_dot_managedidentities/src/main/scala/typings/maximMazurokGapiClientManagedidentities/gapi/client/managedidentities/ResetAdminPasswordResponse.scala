package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetAdminPasswordResponse extends StObject {
  
  /** A random password. See admin for more information. */
  var password: js.UndefOr[String] = js.undefined
}
object ResetAdminPasswordResponse {
  
  inline def apply(): ResetAdminPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetAdminPasswordResponse]
  }
  
  extension [Self <: ResetAdminPasswordResponse](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}
