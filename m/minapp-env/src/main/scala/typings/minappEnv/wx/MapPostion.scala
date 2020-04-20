package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 要显示在可视区域内的坐标点列表 */
trait MapPostion extends js.Object {
  /** 纬度 */
  var latitude: Double
  /** 经度 */
  var longitude: Double
}

object MapPostion {
  @scala.inline
  def apply(latitude: Double, longitude: Double): MapPostion = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPostion]
  }
}

