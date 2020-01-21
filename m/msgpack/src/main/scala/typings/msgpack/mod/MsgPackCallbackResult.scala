package typings.msgpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgPackCallbackResult extends js.Object {
  var ok: Boolean
  var status: Double
}

object MsgPackCallbackResult {
  @scala.inline
  def apply(ok: Boolean, status: Double): MsgPackCallbackResult = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MsgPackCallbackResult]
  }
}

