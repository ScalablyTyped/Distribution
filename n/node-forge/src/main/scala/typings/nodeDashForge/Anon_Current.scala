package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.tls.ConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: ConnectionState
  var pending: ConnectionState | Null
}

object Anon_Current {
  @scala.inline
  def apply(current: ConnectionState, pending: ConnectionState = null): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current)
    if (pending != null) __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[Anon_Current]
  }
}

