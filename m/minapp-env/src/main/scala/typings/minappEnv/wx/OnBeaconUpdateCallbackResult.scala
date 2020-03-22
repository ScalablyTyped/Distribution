package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeaconUpdateCallbackResult extends js.Object {
  /** 当前搜寻到的所有 iBeacon 设备列表 */
  var beacons: Array[IBeaconInfo]
}

object OnBeaconUpdateCallbackResult {
  @scala.inline
  def apply(beacons: Array[IBeaconInfo]): OnBeaconUpdateCallbackResult = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnBeaconUpdateCallbackResult]
  }
}

