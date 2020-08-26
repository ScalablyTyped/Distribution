package typings.openfin.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message[T] extends js.Object {
  var action: String = js.native
  var correlationId: js.UndefOr[Double] = js.native
  var payload: T = js.native
}

object Message {
  @scala.inline
  def apply[T](action: String, payload: T): Message[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message[T]]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message[_], T] (val x: Self with Message[T]) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: T): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setCorrelationId(value: Double): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrelationId: Self = this.set("correlationId", js.undefined)
  }
  
}

