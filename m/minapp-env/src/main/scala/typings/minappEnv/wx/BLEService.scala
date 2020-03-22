package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 设备服务列表 */
trait BLEService extends js.Object {
  /** 该服务是否为主服务 */
  var isPrimary: Boolean
  /** 蓝牙设备服务的 uuid */
  var uuid: String
}

object BLEService {
  @scala.inline
  def apply(isPrimary: Boolean, uuid: String): BLEService = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BLEService]
  }
}

