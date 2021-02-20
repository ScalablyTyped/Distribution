package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceTypeTargetingOptionDetails extends StObject {
  
  /** Output only. The device type that is used to be targeted. */
  var deviceType: js.UndefOr[String] = js.native
}
object DeviceTypeTargetingOptionDetails {
  
  @scala.inline
  def apply(): DeviceTypeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTypeTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class DeviceTypeTargetingOptionDetailsMutableBuilder[Self <: DeviceTypeTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
  }
}
