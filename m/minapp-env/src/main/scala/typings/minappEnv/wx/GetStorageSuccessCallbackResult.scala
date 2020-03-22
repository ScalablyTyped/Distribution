package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageSuccessCallbackResult extends js.Object {
  /** key对应的内容 */
  var data: js.Any
}

object GetStorageSuccessCallbackResult {
  @scala.inline
  def apply(data: js.Any): GetStorageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetStorageSuccessCallbackResult]
  }
}

