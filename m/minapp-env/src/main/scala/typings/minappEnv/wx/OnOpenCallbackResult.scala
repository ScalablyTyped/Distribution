package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnOpenCallbackResult extends js.Object {
  /** 连接成功的 HTTP 响应 Header
    *
    * 最低基础库： `2.0.0` */
  var header: js.Object = js.native
}

object OnOpenCallbackResult {
  @scala.inline
  def apply(header: js.Object): OnOpenCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOpenCallbackResult]
  }
  @scala.inline
  implicit class OnOpenCallbackResultOps[Self <: OnOpenCallbackResult] (val x: Self) extends AnyVal {
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
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
  }
  
}

