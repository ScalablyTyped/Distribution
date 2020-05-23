package typings.nodeForge.anon

import typings.nodeForge.mod.tls.ConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current extends js.Object {
  var current: ConnectionState
  var pending: ConnectionState | Null
}

object Current {
  @scala.inline
  def apply(current: ConnectionState, pending: ConnectionState = null): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
}

