package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGyroscopeChangeCallbackResult extends js.Object {
  var res: Result
}

object OnGyroscopeChangeCallbackResult {
  @scala.inline
  def apply(res: Result): OnGyroscopeChangeCallbackResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGyroscopeChangeCallbackResult]
  }
}

