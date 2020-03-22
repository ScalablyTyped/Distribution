package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClipboardDataSuccessCallbackOption extends js.Object {
  /** 剪贴板的内容 */
  var data: String
}

object GetClipboardDataSuccessCallbackOption {
  @scala.inline
  def apply(data: String): GetClipboardDataSuccessCallbackOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetClipboardDataSuccessCallbackOption]
  }
}

