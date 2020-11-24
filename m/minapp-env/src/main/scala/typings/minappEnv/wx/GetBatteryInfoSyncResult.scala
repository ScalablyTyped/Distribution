package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBatteryInfoSyncResult extends js.Object {
  
  /** 是否正在充电中 */
  var isCharging: Boolean = js.native
  
  /** 设备电量，范围 1 - 100 */
  var level: String = js.native
}
object GetBatteryInfoSyncResult {
  
  @scala.inline
  def apply(isCharging: Boolean, level: String): GetBatteryInfoSyncResult = {
    val __obj = js.Dynamic.literal(isCharging = isCharging.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatteryInfoSyncResult]
  }
  
  @scala.inline
  implicit class GetBatteryInfoSyncResultOps[Self <: GetBatteryInfoSyncResult] (val x: Self) extends AnyVal {
    
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
    def setIsCharging(value: Boolean): Self = this.set("isCharging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
  }
}
