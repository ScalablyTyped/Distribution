package typings.nodeForge

import typings.nodeForge.mod.tls.ConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var current: ConnectionState
  var pending: ConnectionState | Null
}

object AnonCurrent {
  @scala.inline
  def apply(current: ConnectionState, pending: ConnectionState = null): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent]
  }
}

