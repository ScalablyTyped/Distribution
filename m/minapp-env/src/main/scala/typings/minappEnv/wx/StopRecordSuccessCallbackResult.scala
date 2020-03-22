package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRecordSuccessCallbackResult extends js.Object {
  /** 封面图片文件的临时路径 */
  var tempThumbPath: String
  /** 视频的文件的临时路径 */
  var tempVideoPath: String
}

object StopRecordSuccessCallbackResult {
  @scala.inline
  def apply(tempThumbPath: String, tempVideoPath: String): StopRecordSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath.asInstanceOf[js.Any], tempVideoPath = tempVideoPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopRecordSuccessCallbackResult]
  }
}

