package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsDeviceAccount extends StObject {
  
  // Not yet documented
  var password: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsDeviceAccount {
  
  inline def apply(): WindowsDeviceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDeviceAccount]
  }
  
  extension [Self <: WindowsDeviceAccount](x: Self) {
    
    inline def setPassword(value: NullableOption[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}
