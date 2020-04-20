package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCenterLocationSuccessCallbackResult extends js.Object {
  /** 纬度 */
  var latitude: Double
  /** 经度 */
  var longitude: Double
}

object GetCenterLocationSuccessCallbackResult {
  @scala.inline
  def apply(latitude: Double, longitude: Double): GetCenterLocationSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCenterLocationSuccessCallbackResult]
  }
}

