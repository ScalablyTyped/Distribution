package typings.minappEnv.wx

import typings.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeaconUpdateCallbackResult extends StObject {
  
  /** 当前搜寻到的所有 iBeacon 设备列表 */
  var beacons: Array[IBeaconInfo]
}
object OnBeaconUpdateCallbackResult {
  
  inline def apply(beacons: Array[IBeaconInfo]): OnBeaconUpdateCallbackResult = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeaconUpdateCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnBeaconUpdateCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setBeacons(value: Array[IBeaconInfo]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
  }
}
