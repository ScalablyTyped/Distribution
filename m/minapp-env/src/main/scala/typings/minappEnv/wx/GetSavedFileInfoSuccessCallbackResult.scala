package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavedFileInfoSuccessCallbackResult extends js.Object {
  /** 文件保存时的时间戳，从1970/01/01 08:00:00 到该时刻的秒数 */
  var createTime: Double = js.native
  /** 文件大小，单位 B */
  var size: Double = js.native
}

object GetSavedFileInfoSuccessCallbackResult {
  @scala.inline
  def apply(createTime: Double, size: Double): GetSavedFileInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileInfoSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetSavedFileInfoSuccessCallbackResultOps[Self <: GetSavedFileInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: Double): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

