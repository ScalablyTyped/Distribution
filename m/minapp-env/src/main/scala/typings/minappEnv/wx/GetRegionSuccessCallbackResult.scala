package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRegionSuccessCallbackResult extends js.Object {
  /** 东北角经纬度 */
  var northeast: Double
  /** 西南角经纬度 */
  var southwest: Double
}

object GetRegionSuccessCallbackResult {
  @scala.inline
  def apply(northeast: Double, southwest: Double): GetRegionSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegionSuccessCallbackResult]
  }
}

