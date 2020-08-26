package typings.oja.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var pending: js.Array[String] = js.native
  var queue: js.Array[String] = js.native
}

object State {
  @scala.inline
  def apply(pending: js.Array[String], queue: js.Array[String]): State = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setPendingVarargs(value: String*): Self = this.set("pending", js.Array(value :_*))
    @scala.inline
    def setPending(value: js.Array[String]): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueVarargs(value: String*): Self = this.set("queue", js.Array(value :_*))
    @scala.inline
    def setQueue(value: js.Array[String]): Self = this.set("queue", value.asInstanceOf[js.Any])
  }
  
}

