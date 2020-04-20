package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadFileSuccessCallbackResult extends js.Object {
  /** 文件内容 */
  var data: String | ArrayBuffer
}

object ReadFileSuccessCallbackResult {
  @scala.inline
  def apply(data: String | ArrayBuffer): ReadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileSuccessCallbackResult]
  }
}

