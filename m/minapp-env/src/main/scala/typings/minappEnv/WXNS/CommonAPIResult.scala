package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonAPIResult extends js.Object {
  var errMsg: String
}

object CommonAPIResult {
  @scala.inline
  def apply(errMsg: String): CommonAPIResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommonAPIResult]
  }
}

