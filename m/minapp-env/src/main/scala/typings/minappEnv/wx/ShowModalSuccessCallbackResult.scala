package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowModalSuccessCallbackResult extends js.Object {
  /** 为 true 时，表示用户点击了取消（用于 Android 系统区分点击蒙层关闭还是点击取消按钮关闭）
    *
    * 最低基础库： `1.1.0` */
  var cancel: Boolean
  /** 为 true 时，表示用户点击了确定按钮 */
  var confirm: Boolean
}

object ShowModalSuccessCallbackResult {
  @scala.inline
  def apply(cancel: Boolean, confirm: Boolean): ShowModalSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShowModalSuccessCallbackResult]
  }
}

