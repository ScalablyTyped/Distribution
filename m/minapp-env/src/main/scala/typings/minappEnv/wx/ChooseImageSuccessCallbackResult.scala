package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageSuccessCallbackResult extends js.Object {
  /** 图片的本地临时文件路径列表 */
  var tempFilePaths: Array[String]
  /** 图片的本地临时文件列表
    *
    * 最低基础库： `1.2.0` */
  var tempFiles: Array[ImageFile]
}

object ChooseImageSuccessCallbackResult {
  @scala.inline
  def apply(tempFilePaths: Array[String], tempFiles: Array[ImageFile]): ChooseImageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChooseImageSuccessCallbackResult]
  }
}

