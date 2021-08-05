package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsDeviceAzureADAccount
  extends StObject
     with WindowsDeviceAccount {
  
  // Not yet documented
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsDeviceAzureADAccount {
  
  inline def apply(): WindowsDeviceAzureADAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDeviceAzureADAccount]
  }
  
  extension [Self <: WindowsDeviceAzureADAccount](x: Self) {
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
