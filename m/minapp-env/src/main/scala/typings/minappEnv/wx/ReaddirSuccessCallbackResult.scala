package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirSuccessCallbackResult extends js.Object {
  /** 指定目录下的文件名数组。 */
  var files: Array[String]
}

object ReaddirSuccessCallbackResult {
  @scala.inline
  def apply(files: Array[String]): ReaddirSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirSuccessCallbackResult]
  }
}

