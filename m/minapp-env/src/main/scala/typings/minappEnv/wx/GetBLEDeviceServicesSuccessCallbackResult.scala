package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceServicesSuccessCallbackResult extends js.Object {
  
  /** 设备服务列表 */
  var services: BLEService = js.native
}
object GetBLEDeviceServicesSuccessCallbackResult {
  
  @scala.inline
  def apply(services: BLEService): GetBLEDeviceServicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceServicesSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBLEDeviceServicesSuccessCallbackResultOps[Self <: GetBLEDeviceServicesSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setServices(value: BLEService): Self = this.set("services", value.asInstanceOf[js.Any])
  }
}
