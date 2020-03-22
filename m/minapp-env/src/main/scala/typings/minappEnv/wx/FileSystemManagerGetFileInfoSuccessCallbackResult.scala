package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemManagerGetFileInfoSuccessCallbackResult extends js.Object {
  /** 文件大小，以字节为单位 */
  var size: Double
}

object FileSystemManagerGetFileInfoSuccessCallbackResult {
  @scala.inline
  def apply(size: Double): FileSystemManagerGetFileInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileSystemManagerGetFileInfoSuccessCallbackResult]
  }
}

