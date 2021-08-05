package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceManagementSettings extends StObject {
  
  // The number of days a device is allowed to go without checking in to remain compliant. Valid values 0 to 120
  var deviceComplianceCheckinThresholdDays: js.UndefOr[Double] = js.undefined
  
  // Is feature enabled or not for scheduled action for rule.
  var isScheduledActionEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Device should be noncompliant when there is no compliance policy targeted when this is true
  var secureByDefault: js.UndefOr[Boolean] = js.undefined
}
object DeviceManagementSettings {
  
  inline def apply(): DeviceManagementSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementSettings]
  }
  
  extension [Self <: DeviceManagementSettings](x: Self) {
    
    inline def setDeviceComplianceCheckinThresholdDays(value: Double): Self = StObject.set(x, "deviceComplianceCheckinThresholdDays", value.asInstanceOf[js.Any])
    
    inline def setDeviceComplianceCheckinThresholdDaysUndefined: Self = StObject.set(x, "deviceComplianceCheckinThresholdDays", js.undefined)
    
    inline def setIsScheduledActionEnabled(value: Boolean): Self = StObject.set(x, "isScheduledActionEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsScheduledActionEnabledUndefined: Self = StObject.set(x, "isScheduledActionEnabled", js.undefined)
    
    inline def setSecureByDefault(value: Boolean): Self = StObject.set(x, "secureByDefault", value.asInstanceOf[js.Any])
    
    inline def setSecureByDefaultUndefined: Self = StObject.set(x, "secureByDefault", js.undefined)
  }
}
