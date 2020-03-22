package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchTabOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SwitchTabCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SwitchTabFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SwitchTabSuccessCallback] = js.undefined
  /** 需要跳转的 tabBar 页面的路径（需在 app.json 的 [tabBar]((config#tabbar)) 字段定义的页面），路径后不能带参数。 */
  var url: String
}

object SwitchTabOption {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SwitchTabOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SwitchTabOption]
  }
}

