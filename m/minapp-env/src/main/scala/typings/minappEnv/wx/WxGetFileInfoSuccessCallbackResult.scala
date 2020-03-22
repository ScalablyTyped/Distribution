package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WxGetFileInfoSuccessCallbackResult extends js.Object {
  /** 按照传入的 digestAlgorithm 计算得出的的文件摘要 */
  var digest: String
  /** 文件大小，以字节为单位 */
  var size: Double
}

object WxGetFileInfoSuccessCallbackResult {
  @scala.inline
  def apply(digest: String, size: Double): WxGetFileInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WxGetFileInfoSuccessCallbackResult]
  }
}

