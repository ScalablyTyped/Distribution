package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WxGetFileInfoSuccessCallbackResult extends js.Object {
  /** 按照传入的 digestAlgorithm 计算得出的的文件摘要 */
  var digest: String = js.native
  /** 文件大小，以字节为单位 */
  var size: Double = js.native
}

object WxGetFileInfoSuccessCallbackResult {
  @scala.inline
  def apply(digest: String, size: Double): WxGetFileInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxGetFileInfoSuccessCallbackResult]
  }
  @scala.inline
  implicit class WxGetFileInfoSuccessCallbackResultOps[Self <: WxGetFileInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

