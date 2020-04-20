package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasGetImageDataSuccessCallbackResult extends js.Object {
  /** 图像数据矩形的高度 */
  var height: Double
  /** 图像数据矩形的宽度 */
  var width: Double
}

object CanvasGetImageDataSuccessCallbackResult {
  @scala.inline
  def apply(height: Double, width: Double): CanvasGetImageDataSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataSuccessCallbackResult]
  }
}

