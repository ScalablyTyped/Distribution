package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsDeviceADAccount
  extends StObject
     with WindowsDeviceAccount {
  
  // Not yet documented
  var domainName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Not yet documented
  var userName: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsDeviceADAccount {
  
  inline def apply(): WindowsDeviceADAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDeviceADAccount]
  }
  
  extension [Self <: WindowsDeviceADAccount](x: Self) {
    
    inline def setDomainName(value: NullableOption[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setUserName(value: NullableOption[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
