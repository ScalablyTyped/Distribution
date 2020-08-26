package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseVideoSuccessCallbackResult extends js.Object {
  /** 选定视频的时间长度 */
  var duration: Double = js.native
  /** 返回选定视频的高度 */
  var height: Double = js.native
  /** 选定视频的数据量大小 */
  var size: Double = js.native
  /** 选定视频的临时文件路径 */
  var tempFilePath: String = js.native
  /** 返回选定视频的宽度 */
  var width: Double = js.native
}

object ChooseVideoSuccessCallbackResult {
  @scala.inline
  def apply(duration: Double, height: Double, size: Double, tempFilePath: String, width: Double): ChooseVideoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseVideoSuccessCallbackResult]
  }
  @scala.inline
  implicit class ChooseVideoSuccessCallbackResultOps[Self <: ChooseVideoSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempFilePath(value: String): Self = this.set("tempFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

