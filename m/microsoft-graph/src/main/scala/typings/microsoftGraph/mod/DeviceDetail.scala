package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDetail extends StObject {
  
  // Indicates the browser information of the used for signing in.
  var browser: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Refers to the UniqueID of the device used for signing in.
  var deviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Refers to the name of the device used for signing in.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether the device is compliant.
  var isCompliant: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether the device is managed.
  var isManaged: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates the operating system name and version used for signing in.
  var operatingSystem: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
  var trustType: js.UndefOr[NullableOption[String]] = js.undefined
}
object DeviceDetail {
  
  inline def apply(): DeviceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDetail] (val x: Self) extends AnyVal {
    
    inline def setBrowser(value: NullableOption[String]): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserNull: Self = StObject.set(x, "browser", null)
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsCompliant(value: NullableOption[Boolean]): Self = StObject.set(x, "isCompliant", value.asInstanceOf[js.Any])
    
    inline def setIsCompliantNull: Self = StObject.set(x, "isCompliant", null)
    
    inline def setIsCompliantUndefined: Self = StObject.set(x, "isCompliant", js.undefined)
    
    inline def setIsManaged(value: NullableOption[Boolean]): Self = StObject.set(x, "isManaged", value.asInstanceOf[js.Any])
    
    inline def setIsManagedNull: Self = StObject.set(x, "isManaged", null)
    
    inline def setIsManagedUndefined: Self = StObject.set(x, "isManaged", js.undefined)
    
    inline def setOperatingSystem(value: NullableOption[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemNull: Self = StObject.set(x, "operatingSystem", null)
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    inline def setTrustType(value: NullableOption[String]): Self = StObject.set(x, "trustType", value.asInstanceOf[js.Any])
    
    inline def setTrustTypeNull: Self = StObject.set(x, "trustType", null)
    
    inline def setTrustTypeUndefined: Self = StObject.set(x, "trustType", js.undefined)
  }
}
