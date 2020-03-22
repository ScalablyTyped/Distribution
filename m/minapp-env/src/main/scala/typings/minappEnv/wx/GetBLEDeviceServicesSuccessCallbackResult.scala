package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceServicesSuccessCallbackResult extends js.Object {
  /** 设备服务列表 */
  var services: BLEService
}

object GetBLEDeviceServicesSuccessCallbackResult {
  @scala.inline
  def apply(services: BLEService): GetBLEDeviceServicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBLEDeviceServicesSuccessCallbackResult]
  }
}

