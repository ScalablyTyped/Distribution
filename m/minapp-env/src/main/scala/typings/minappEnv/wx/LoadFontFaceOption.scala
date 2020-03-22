package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadFontFaceOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[LoadFontFaceCompleteCallback] = js.undefined
  /** 可选的字体描述符 */
  var desc: js.UndefOr[DescOption] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[LoadFontFaceFailCallback] = js.undefined
  /** 定义的字体名称 */
  var family: String
  /** 字体资源的地址。建议格式为 TTF 和 WOFF，WOFF2 在低版本的iOS上会不兼容。 */
  var source: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[LoadFontFaceSuccessCallback] = js.undefined
}

object LoadFontFaceOption {
  @scala.inline
  def apply(
    family: String,
    source: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    desc: DescOption = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): LoadFontFaceOption = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[LoadFontFaceOption]
  }
}

