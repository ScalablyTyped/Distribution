package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsAutopilotDeviceIdentity
  extends StObject
     with Entity {
  
  // Addressable user name.
  var addressableUserName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // AAD Device ID - to be deprecated
  var azureActiveDirectoryDeviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display Name
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Intune enrollment state of the Windows autopilot device. Possible values are: unknown, enrolled, pendingReset, failed,
    * notContacted.
    */
  var enrollmentState: js.UndefOr[EnrollmentState] = js.undefined
  
  // Group Tag of the Windows autopilot device.
  var groupTag: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Intune Last Contacted Date Time of the Windows autopilot device.
  var lastContactedDateTime: js.UndefOr[String] = js.undefined
  
  // Managed Device ID
  var managedDeviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Oem manufacturer of the Windows autopilot device.
  var manufacturer: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Model name of the Windows autopilot device.
  var model: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Product Key of the Windows autopilot device.
  var productKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Purchase Order Identifier of the Windows autopilot device.
  var purchaseOrderIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Resource Name.
  var resourceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Serial number of the Windows autopilot device.
  var serialNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // SKU Number
  var skuNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // System Family
  var systemFamily: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User Principal Name.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsAutopilotDeviceIdentity {
  
  inline def apply(): WindowsAutopilotDeviceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsAutopilotDeviceIdentity]
  }
  
  extension [Self <: WindowsAutopilotDeviceIdentity](x: Self) {
    
    inline def setAddressableUserName(value: NullableOption[String]): Self = StObject.set(x, "addressableUserName", value.asInstanceOf[js.Any])
    
    inline def setAddressableUserNameNull: Self = StObject.set(x, "addressableUserName", null)
    
    inline def setAddressableUserNameUndefined: Self = StObject.set(x, "addressableUserName", js.undefined)
    
    inline def setAzureActiveDirectoryDeviceId(value: NullableOption[String]): Self = StObject.set(x, "azureActiveDirectoryDeviceId", value.asInstanceOf[js.Any])
    
    inline def setAzureActiveDirectoryDeviceIdNull: Self = StObject.set(x, "azureActiveDirectoryDeviceId", null)
    
    inline def setAzureActiveDirectoryDeviceIdUndefined: Self = StObject.set(x, "azureActiveDirectoryDeviceId", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnrollmentState(value: EnrollmentState): Self = StObject.set(x, "enrollmentState", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentStateUndefined: Self = StObject.set(x, "enrollmentState", js.undefined)
    
    inline def setGroupTag(value: NullableOption[String]): Self = StObject.set(x, "groupTag", value.asInstanceOf[js.Any])
    
    inline def setGroupTagNull: Self = StObject.set(x, "groupTag", null)
    
    inline def setGroupTagUndefined: Self = StObject.set(x, "groupTag", js.undefined)
    
    inline def setLastContactedDateTime(value: String): Self = StObject.set(x, "lastContactedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastContactedDateTimeUndefined: Self = StObject.set(x, "lastContactedDateTime", js.undefined)
    
    inline def setManagedDeviceId(value: NullableOption[String]): Self = StObject.set(x, "managedDeviceId", value.asInstanceOf[js.Any])
    
    inline def setManagedDeviceIdNull: Self = StObject.set(x, "managedDeviceId", null)
    
    inline def setManagedDeviceIdUndefined: Self = StObject.set(x, "managedDeviceId", js.undefined)
    
    inline def setManufacturer(value: NullableOption[String]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModel(value: NullableOption[String]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setProductKey(value: NullableOption[String]): Self = StObject.set(x, "productKey", value.asInstanceOf[js.Any])
    
    inline def setProductKeyNull: Self = StObject.set(x, "productKey", null)
    
    inline def setProductKeyUndefined: Self = StObject.set(x, "productKey", js.undefined)
    
    inline def setPurchaseOrderIdentifier(value: NullableOption[String]): Self = StObject.set(x, "purchaseOrderIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPurchaseOrderIdentifierNull: Self = StObject.set(x, "purchaseOrderIdentifier", null)
    
    inline def setPurchaseOrderIdentifierUndefined: Self = StObject.set(x, "purchaseOrderIdentifier", js.undefined)
    
    inline def setResourceName(value: NullableOption[String]): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setSerialNumber(value: NullableOption[String]): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSkuNumber(value: NullableOption[String]): Self = StObject.set(x, "skuNumber", value.asInstanceOf[js.Any])
    
    inline def setSkuNumberNull: Self = StObject.set(x, "skuNumber", null)
    
    inline def setSkuNumberUndefined: Self = StObject.set(x, "skuNumber", js.undefined)
    
    inline def setSystemFamily(value: NullableOption[String]): Self = StObject.set(x, "systemFamily", value.asInstanceOf[js.Any])
    
    inline def setSystemFamilyNull: Self = StObject.set(x, "systemFamily", null)
    
    inline def setSystemFamilyUndefined: Self = StObject.set(x, "systemFamily", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
