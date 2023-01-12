package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MicrosoftAuthenticatorAuthenticationMethod
  extends StObject
     with Entity {
  
  /**
    * The date and time that this app was registered. This property is null if the device is not registered for passwordless
    * Phone Sign-In.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The registered device on which Microsoft Authenticator resides. This property is null if the device is not registered
    * for passwordless Phone Sign-In.
    */
  var device: js.UndefOr[NullableOption[Device]] = js.undefined
  
  // Tags containing app metadata.
  var deviceTag: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the device on which this app is registered.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Numerical version of this instance of the Authenticator app.
  var phoneAppVersion: js.UndefOr[NullableOption[String]] = js.undefined
}
object MicrosoftAuthenticatorAuthenticationMethod {
  
  inline def apply(): MicrosoftAuthenticatorAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftAuthenticatorAuthenticationMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MicrosoftAuthenticatorAuthenticationMethod] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDevice(value: NullableOption[Device]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceNull: Self = StObject.set(x, "device", null)
    
    inline def setDeviceTag(value: NullableOption[String]): Self = StObject.set(x, "deviceTag", value.asInstanceOf[js.Any])
    
    inline def setDeviceTagNull: Self = StObject.set(x, "deviceTag", null)
    
    inline def setDeviceTagUndefined: Self = StObject.set(x, "deviceTag", js.undefined)
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPhoneAppVersion(value: NullableOption[String]): Self = StObject.set(x, "phoneAppVersion", value.asInstanceOf[js.Any])
    
    inline def setPhoneAppVersionNull: Self = StObject.set(x, "phoneAppVersion", null)
    
    inline def setPhoneAppVersionUndefined: Self = StObject.set(x, "phoneAppVersion", js.undefined)
  }
}
