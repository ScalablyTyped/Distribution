package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceTypeTargetingOptionDetails extends StObject {
  
  /** Output only. The device type that is used to be targeted. */
  var deviceType: js.UndefOr[String] = js.undefined
}
object DeviceTypeTargetingOptionDetails {
  
  inline def apply(): DeviceTypeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTypeTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceTypeTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
  }
}
