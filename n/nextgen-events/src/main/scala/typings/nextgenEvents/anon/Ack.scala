package typings.nextgenEvents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ack extends js.Object {
  var ack: Boolean = js.native
  var emit: Boolean = js.native
  var listen: Boolean = js.native
}

object Ack {
  @scala.inline
  def apply(ack: Boolean, emit: Boolean, listen: Boolean): Ack = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ack]
  }
  @scala.inline
  implicit class AckOps[Self <: Ack] (val x: Self) extends AnyVal {
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
    def setAck(value: Boolean): Self = this.set("ack", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmit(value: Boolean): Self = this.set("emit", value.asInstanceOf[js.Any])
    @scala.inline
    def setListen(value: Boolean): Self = this.set("listen", value.asInstanceOf[js.Any])
  }
  
}

