package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceDetail extends StObject {
  
  // Indicates the browser information of the used for signing in.
  var browser: js.UndefOr[NullableOption[String]] = js.native
  
  // Refers to the UniqueID of the device used for signing in.
  var deviceId: js.UndefOr[NullableOption[String]] = js.native
  
  // Refers to the name of the device used for signing in.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether the device is compliant.
  var isCompliant: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether the device is managed.
  var isManaged: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates the operating system name and version used for signing in.
  var operatingSystem: js.UndefOr[NullableOption[String]] = js.native
  
  // Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
  var trustType: js.UndefOr[NullableOption[String]] = js.native
}
object DeviceDetail {
  
  @scala.inline
  def apply(): DeviceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDetail]
  }
  
  @scala.inline
  implicit class DeviceDetailMutableBuilder[Self <: DeviceDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser(value: NullableOption[String]): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserNull: Self = StObject.set(x, "browser", null)
    
    @scala.inline
    def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    @scala.inline
    def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIsCompliant(value: NullableOption[Boolean]): Self = StObject.set(x, "isCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCompliantNull: Self = StObject.set(x, "isCompliant", null)
    
    @scala.inline
    def setIsCompliantUndefined: Self = StObject.set(x, "isCompliant", js.undefined)
    
    @scala.inline
    def setIsManaged(value: NullableOption[Boolean]): Self = StObject.set(x, "isManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsManagedNull: Self = StObject.set(x, "isManaged", null)
    
    @scala.inline
    def setIsManagedUndefined: Self = StObject.set(x, "isManaged", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: NullableOption[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemNull: Self = StObject.set(x, "operatingSystem", null)
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    @scala.inline
    def setTrustType(value: NullableOption[String]): Self = StObject.set(x, "trustType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustTypeNull: Self = StObject.set(x, "trustType", null)
    
    @scala.inline
    def setTrustTypeUndefined: Self = StObject.set(x, "trustType", js.undefined)
  }
}
