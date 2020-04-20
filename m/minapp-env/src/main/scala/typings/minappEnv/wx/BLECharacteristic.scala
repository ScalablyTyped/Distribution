package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 设备服务列表 */
trait BLECharacteristic extends js.Object {
  /** 该特征值支持的操作类型 */
  var properties: Properties
  /** 蓝牙设备特征值的 uuid */
  var uuid: String
}

object BLECharacteristic {
  @scala.inline
  def apply(properties: Properties, uuid: String): BLECharacteristic = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLECharacteristic]
  }
}

