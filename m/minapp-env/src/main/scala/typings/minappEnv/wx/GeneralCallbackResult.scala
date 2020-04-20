package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralCallbackResult extends js.Object {
  var errMsg: String
}

object GeneralCallbackResult {
  @scala.inline
  def apply(errMsg: String): GeneralCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralCallbackResult]
  }
}

