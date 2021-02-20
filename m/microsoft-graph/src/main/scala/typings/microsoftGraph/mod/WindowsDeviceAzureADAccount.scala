package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsDeviceAzureADAccount extends WindowsDeviceAccount {
  
  // Not yet documented
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
}
object WindowsDeviceAzureADAccount {
  
  @scala.inline
  def apply(): WindowsDeviceAzureADAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDeviceAzureADAccount]
  }
  
  @scala.inline
  implicit class WindowsDeviceAzureADAccountMutableBuilder[Self <: WindowsDeviceAzureADAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
