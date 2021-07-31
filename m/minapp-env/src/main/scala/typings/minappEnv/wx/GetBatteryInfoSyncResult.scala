package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBatteryInfoSyncResult extends StObject {
  
  /** 是否正在充电中 */
  var isCharging: Boolean
  
  /** 设备电量，范围 1 - 100 */
  var level: String
}
object GetBatteryInfoSyncResult {
  
  @scala.inline
  def apply(isCharging: Boolean, level: String): GetBatteryInfoSyncResult = {
    val __obj = js.Dynamic.literal(isCharging = isCharging.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatteryInfoSyncResult]
  }
  
  @scala.inline
  implicit class GetBatteryInfoSyncResultMutableBuilder[Self <: GetBatteryInfoSyncResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCharging(value: Boolean): Self = StObject.set(x, "isCharging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
