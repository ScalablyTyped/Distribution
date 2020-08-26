package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.MD5
import typings.minappEnv.minappEnvStrings.`HMAC-SHA256`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPaymentOption extends js.Object {
  /** 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=*** */
  @JSName("package")
  var _package: String = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestPaymentCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestPaymentFailCallback] = js.native
  /** 随机字符串，长度为32个字符以下 */
  var nonceStr: String = js.native
  /** 签名，具体签名方案参见 [小程序支付接口文档](https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=7_7&index=3) */
  var paySign: String = js.native
  /** 签名算法
    *
    * 可选值：
    * - 'MD5': MD5;
    * - 'HMAC-SHA256': HMAC-SHA256; */
  var signType: js.UndefOr[MD5 | `HMAC-SHA256`] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestPaymentSuccessCallback] = js.native
  /** 时间戳，从 1970 年 1 月 1 日 00:00:00 至今的秒数，即当前的时间 */
  var timeStamp: String = js.native
}

object RequestPaymentOption {
  @scala.inline
  def apply(_package: String, nonceStr: String, paySign: String, timeStamp: String): RequestPaymentOption = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentOption]
  }
  @scala.inline
  implicit class RequestPaymentOptionOps[Self <: RequestPaymentOption] (val x: Self) extends AnyVal {
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
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonceStr(value: String): Self = this.set("nonceStr", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaySign(value: String): Self = this.set("paySign", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: String): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSignType(value: MD5 | `HMAC-SHA256`): Self = this.set("signType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignType: Self = this.set("signType", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

