package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCheckForUpdateCallbackResult extends js.Object {
  /** 是否有新版本 */
  var hasUpdate: Boolean
}

object OnCheckForUpdateCallbackResult {
  @scala.inline
  def apply(hasUpdate: Boolean): OnCheckForUpdateCallbackResult = {
    val __obj = js.Dynamic.literal(hasUpdate = hasUpdate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnCheckForUpdateCallbackResult]
  }
}

