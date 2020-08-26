package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDownloadFileSuccessResult extends CommonAPIResult {
  var statusCode: Double = js.native
  var tempFilePath: String = js.native
}

object IDownloadFileSuccessResult {
  @scala.inline
  def apply(errMsg: String, statusCode: Double, tempFilePath: String): IDownloadFileSuccessResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDownloadFileSuccessResult]
  }
  @scala.inline
  implicit class IDownloadFileSuccessResultOps[Self <: IDownloadFileSuccessResult] (val x: Self) extends AnyVal {
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
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempFilePath(value: String): Self = this.set("tempFilePath", value.asInstanceOf[js.Any])
  }
  
}

