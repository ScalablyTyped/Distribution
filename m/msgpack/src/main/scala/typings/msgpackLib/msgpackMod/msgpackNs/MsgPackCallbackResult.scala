package typings
package msgpackLib.msgpackMod.msgpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgPackCallbackResult extends js.Object {
  var ok: scala.Boolean
  var status: scala.Double
}

object MsgPackCallbackResult {
  @scala.inline
  def apply(ok: scala.Boolean, status: scala.Double): MsgPackCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[MsgPackCallbackResult]
  }
}

