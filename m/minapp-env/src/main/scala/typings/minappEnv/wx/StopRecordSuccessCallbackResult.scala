package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRecordSuccessCallbackResult extends js.Object {
  /** 封面图片文件的临时路径 */
  var tempThumbPath: String = js.native
  /** 视频的文件的临时路径 */
  var tempVideoPath: String = js.native
}

object StopRecordSuccessCallbackResult {
  @scala.inline
  def apply(tempThumbPath: String, tempVideoPath: String): StopRecordSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath.asInstanceOf[js.Any], tempVideoPath = tempVideoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRecordSuccessCallbackResult]
  }
  @scala.inline
  implicit class StopRecordSuccessCallbackResultOps[Self <: StopRecordSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setTempThumbPath(value: String): Self = this.set("tempThumbPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempVideoPath(value: String): Self = this.set("tempVideoPath", value.asInstanceOf[js.Any])
  }
  
}

