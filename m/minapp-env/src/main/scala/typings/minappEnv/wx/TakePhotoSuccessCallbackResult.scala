package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakePhotoSuccessCallbackResult extends js.Object {
  /** 照片文件的临时路径 */
  var tempImagePath: String
}

object TakePhotoSuccessCallbackResult {
  @scala.inline
  def apply(tempImagePath: String): TakePhotoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempImagePath = tempImagePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TakePhotoSuccessCallbackResult]
  }
}

