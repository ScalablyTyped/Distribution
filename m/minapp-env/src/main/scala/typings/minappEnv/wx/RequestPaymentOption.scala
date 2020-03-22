package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.MD5
import typings.minappEnv.minappEnvStrings.`HMAC-SHA256`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPaymentOption extends js.Object {
  /** 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=*** */
  @JSName("package")
  var _package: String
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestPaymentCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestPaymentFailCallback] = js.undefined
  /** 随机字符串，长度为32个字符以下 */
  var nonceStr: String
  /** 签名，具体签名方案参见 [小程序支付接口文档](https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=7_7&index=3) */
  var paySign: String
  /** 签名算法
    *
    * 可选值：
    * - 'MD5': MD5;
    * - 'HMAC-SHA256': HMAC-SHA256; */
  var signType: js.UndefOr[MD5 | `HMAC-SHA256`] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestPaymentSuccessCallback] = js.undefined
  /** 时间戳，从 1970 年 1 月 1 日 00:00:00 至今的秒数，即当前的时间 */
  var timeStamp: String
}

object RequestPaymentOption {
  @scala.inline
  def apply(
    _package: String,
    nonceStr: String,
    paySign: String,
    timeStamp: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    signType: MD5 | `HMAC-SHA256` = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): RequestPaymentOption = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (signType != null) __obj.updateDynamic("signType")(signType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RequestPaymentOption]
  }
}

