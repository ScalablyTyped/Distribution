package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasGetImageDataSuccessCallbackResult extends js.Object {
  /** 图像数据矩形的高度 */
  var height: Double = js.native
  /** 图像数据矩形的宽度 */
  var width: Double = js.native
}

object CanvasGetImageDataSuccessCallbackResult {
  @scala.inline
  def apply(height: Double, width: Double): CanvasGetImageDataSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataSuccessCallbackResult]
  }
  @scala.inline
  implicit class CanvasGetImageDataSuccessCallbackResultOps[Self <: CanvasGetImageDataSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

