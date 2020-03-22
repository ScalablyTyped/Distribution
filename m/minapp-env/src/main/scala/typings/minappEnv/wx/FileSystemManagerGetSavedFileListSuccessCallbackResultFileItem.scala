package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 文件数组 */
trait FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem extends js.Object {
  /** 文件保存时的时间戳，从1970/01/01 08:00:00 到当前时间的秒数 */
  var createTime: Double
  /** 本地路径 */
  var filePath: String
  /** 本地文件大小，以字节为单位 */
  var size: Double
}

object FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem {
  @scala.inline
  def apply(createTime: Double, filePath: String, size: Double): FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileSystemManagerGetSavedFileListSuccessCallbackResultFileItem]
  }
}

