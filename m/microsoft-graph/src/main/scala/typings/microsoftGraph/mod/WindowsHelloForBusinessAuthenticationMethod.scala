package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsHelloForBusinessAuthenticationMethod
  extends StObject
     with Entity {
  
  // The date and time that this Windows Hello for Business key was registered.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The registered device on which this Windows Hello for Business key resides. Supports $expand. When you get a user's
    * Windows Hello for Business registration information, this property is returned only on a single GET and when you
    * specify ?$expand. For example, GET
    * /users/admin@contoso.com/authentication/windowsHelloForBusinessMethods/_jpuR-TGZtk6aQCLF3BQjA2?$expand=device.
    */
  var device: js.UndefOr[NullableOption[Device]] = js.undefined
  
  // The name of the device on which Windows Hello for Business is registered
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Key strength of this Windows Hello for Business key. Possible values are: normal, weak, unknown.
  var keyStrength: js.UndefOr[NullableOption[AuthenticationMethodKeyStrength]] = js.undefined
}
object WindowsHelloForBusinessAuthenticationMethod {
  
  inline def apply(): WindowsHelloForBusinessAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsHelloForBusinessAuthenticationMethod]
  }
  
  extension [Self <: WindowsHelloForBusinessAuthenticationMethod](x: Self) {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDevice(value: NullableOption[Device]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceNull: Self = StObject.set(x, "device", null)
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setKeyStrength(value: NullableOption[AuthenticationMethodKeyStrength]): Self = StObject.set(x, "keyStrength", value.asInstanceOf[js.Any])
    
    inline def setKeyStrengthNull: Self = StObject.set(x, "keyStrength", null)
    
    inline def setKeyStrengthUndefined: Self = StObject.set(x, "keyStrength", js.undefined)
  }
}
