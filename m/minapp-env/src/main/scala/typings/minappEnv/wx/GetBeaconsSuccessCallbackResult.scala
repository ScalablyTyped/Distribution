package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBeaconsSuccessCallbackResult extends js.Object {
  /** iBeacon 设备列表 */
  var beacons: Array[IBeaconInfo]
}

object GetBeaconsSuccessCallbackResult {
  @scala.inline
  def apply(beacons: Array[IBeaconInfo]): GetBeaconsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBeaconsSuccessCallbackResult]
  }
}

