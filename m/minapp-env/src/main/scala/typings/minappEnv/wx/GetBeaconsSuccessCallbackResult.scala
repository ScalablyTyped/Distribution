package typings.minappEnv.wx

import typings.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBeaconsSuccessCallbackResult extends StObject {
  
  /** iBeacon 设备列表 */
  var beacons: Array[IBeaconInfo]
}
object GetBeaconsSuccessCallbackResult {
  
  inline def apply(beacons: Array[IBeaconInfo]): GetBeaconsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBeaconsSuccessCallbackResult]
  }
  
  extension [Self <: GetBeaconsSuccessCallbackResult](x: Self) {
    
    inline def setBeacons(value: Array[IBeaconInfo]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
  }
}
