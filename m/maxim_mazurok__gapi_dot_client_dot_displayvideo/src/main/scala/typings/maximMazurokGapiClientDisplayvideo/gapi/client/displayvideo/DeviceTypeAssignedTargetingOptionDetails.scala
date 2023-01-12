package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceTypeAssignedTargetingOptionDetails extends StObject {
  
  /** The display name of the device type. Output only in v1. Required in v2. */
  var deviceType: js.UndefOr[String] = js.undefined
  
  /** Required. ID of the device type. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object DeviceTypeAssignedTargetingOptionDetails {
  
  inline def apply(): DeviceTypeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTypeAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceTypeAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
