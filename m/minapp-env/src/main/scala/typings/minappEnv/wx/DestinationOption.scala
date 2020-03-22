package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 指定 marker 移动到的目标点 */
trait DestinationOption extends js.Object {
  /** 纬度 */
  var latitude: Double
  /** 经度 */
  var longitude: Double
}

object DestinationOption {
  @scala.inline
  def apply(latitude: Double, longitude: Double): DestinationOption = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DestinationOption]
  }
}

