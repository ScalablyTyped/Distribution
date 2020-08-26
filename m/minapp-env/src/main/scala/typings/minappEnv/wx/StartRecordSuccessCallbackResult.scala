package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRecordSuccessCallbackResult extends js.Object {
  /** 录音文件的临时路径 */
  var tempFilePath: String = js.native
}

object StartRecordSuccessCallbackResult {
  @scala.inline
  def apply(tempFilePath: String): StartRecordSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecordSuccessCallbackResult]
  }
  @scala.inline
  implicit class StartRecordSuccessCallbackResultOps[Self <: StartRecordSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setTempFilePath(value: String): Self = this.set("tempFilePath", value.asInstanceOf[js.Any])
  }
  
}

