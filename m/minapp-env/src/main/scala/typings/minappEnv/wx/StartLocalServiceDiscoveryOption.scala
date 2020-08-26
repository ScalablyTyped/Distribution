package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartLocalServiceDiscoveryOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartLocalServiceDiscoveryCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartLocalServiceDiscoveryFailCallback] = js.native
  /** 要搜索的服务类型 */
  var serviceType: String = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartLocalServiceDiscoverySuccessCallback] = js.native
}

object StartLocalServiceDiscoveryOption {
  @scala.inline
  def apply(serviceType: String): StartLocalServiceDiscoveryOption = {
    val __obj = js.Dynamic.literal(serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLocalServiceDiscoveryOption]
  }
  @scala.inline
  implicit class StartLocalServiceDiscoveryOptionOps[Self <: StartLocalServiceDiscoveryOption] (val x: Self) extends AnyVal {
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
    def setServiceType(value: String): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* result */ StartLocalServiceDiscoveryFailCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

