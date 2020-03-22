package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartHCEOption extends js.Object {
  /** 需要注册到系统的 AID 列表 */
  var aid_list: Array[String]
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartHCECompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartHCEFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartHCESuccessCallback] = js.undefined
}

object StartHCEOption {
  @scala.inline
  def apply(
    aid_list: Array[String],
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): StartHCEOption = {
    val __obj = js.Dynamic.literal(aid_list = aid_list.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StartHCEOption]
  }
}

