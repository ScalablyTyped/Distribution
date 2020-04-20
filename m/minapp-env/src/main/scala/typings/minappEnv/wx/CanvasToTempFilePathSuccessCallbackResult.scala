package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasToTempFilePathSuccessCallbackResult extends js.Object {
  /** 生成文件的临时路径 */
  var tempFilePath: String
}

object CanvasToTempFilePathSuccessCallbackResult {
  @scala.inline
  def apply(tempFilePath: String): CanvasToTempFilePathSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathSuccessCallbackResult]
  }
}

