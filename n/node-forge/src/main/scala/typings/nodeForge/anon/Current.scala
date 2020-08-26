package typings.nodeForge.anon

import typings.nodeForge.mod.tls.ConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Current extends js.Object {
  var current: ConnectionState = js.native
  var pending: ConnectionState | Null = js.native
}

object Current {
  @scala.inline
  def apply(current: ConnectionState): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrent(value: ConnectionState): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: ConnectionState): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setPendingNull: Self = this.set("pending", null)
  }
  
}

