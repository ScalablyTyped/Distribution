package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WxSaveFileSuccessCallbackResult extends js.Object {
  /** 存储后的文件路径 */
  var savedFilePath: Double
}

object WxSaveFileSuccessCallbackResult {
  @scala.inline
  def apply(savedFilePath: Double): WxSaveFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WxSaveFileSuccessCallbackResult]
  }
}

