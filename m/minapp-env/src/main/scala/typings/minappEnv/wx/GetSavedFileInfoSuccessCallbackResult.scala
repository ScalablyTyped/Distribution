package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSavedFileInfoSuccessCallbackResult extends js.Object {
  /** 文件保存时的时间戳，从1970/01/01 08:00:00 到该时刻的秒数 */
  var createTime: Double
  /** 文件大小，单位 B */
  var size: Double
}

object GetSavedFileInfoSuccessCallbackResult {
  @scala.inline
  def apply(createTime: Double, size: Double): GetSavedFileInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileInfoSuccessCallbackResult]
  }
}

