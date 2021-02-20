package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUserFromSharedAppleDeviceActionResult extends DeviceActionResult {
  
  // User principal name of the user to be deleted
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
}
object DeleteUserFromSharedAppleDeviceActionResult {
  
  @scala.inline
  def apply(): DeleteUserFromSharedAppleDeviceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteUserFromSharedAppleDeviceActionResult]
  }
  
  @scala.inline
  implicit class DeleteUserFromSharedAppleDeviceActionResultMutableBuilder[Self <: DeleteUserFromSharedAppleDeviceActionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
