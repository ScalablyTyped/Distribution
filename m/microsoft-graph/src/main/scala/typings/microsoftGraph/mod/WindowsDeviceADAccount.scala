package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsDeviceADAccount extends WindowsDeviceAccount {
  
  // Not yet documented
  var domainName: js.UndefOr[NullableOption[String]] = js.native
  
  // Not yet documented
  var userName: js.UndefOr[NullableOption[String]] = js.native
}
object WindowsDeviceADAccount {
  
  @scala.inline
  def apply(): WindowsDeviceADAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDeviceADAccount]
  }
  
  @scala.inline
  implicit class WindowsDeviceADAccountMutableBuilder[Self <: WindowsDeviceADAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: NullableOption[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setUserName(value: NullableOption[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
