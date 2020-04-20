package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScaleSuccessCallbackResult extends js.Object {
  /** 缩放值 */
  var scale: Double
}

object GetScaleSuccessCallbackResult {
  @scala.inline
  def apply(scale: Double): GetScaleSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScaleSuccessCallbackResult]
  }
}

