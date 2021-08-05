package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserFromSharedAppleDeviceActionResult
  extends StObject
     with DeviceActionResult {
  
  // User principal name of the user to be deleted
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object DeleteUserFromSharedAppleDeviceActionResult {
  
  inline def apply(): DeleteUserFromSharedAppleDeviceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteUserFromSharedAppleDeviceActionResult]
  }
  
  extension [Self <: DeleteUserFromSharedAppleDeviceActionResult](x: Self) {
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
