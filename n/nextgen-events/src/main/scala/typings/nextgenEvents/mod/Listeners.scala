package typings.nextgenEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listeners extends js.Object {
  var error: js.Array[Func] = js.native
  var interrupt: js.Array[Func] = js.native
  var newListener: js.Array[Func] = js.native
  var removeListener: js.Array[Func] = js.native
}

object Listeners {
  @scala.inline
  def apply(
    error: js.Array[Func],
    interrupt: js.Array[Func],
    newListener: js.Array[Func],
    removeListener: js.Array[Func]
  ): Listeners = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listeners]
  }
  @scala.inline
  implicit class ListenersOps[Self <: Listeners] (val x: Self) extends AnyVal {
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
    def setErrorVarargs(value: Func*): Self = this.set("error", js.Array(value :_*))
    @scala.inline
    def setError(value: js.Array[Func]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterruptVarargs(value: Func*): Self = this.set("interrupt", js.Array(value :_*))
    @scala.inline
    def setInterrupt(value: js.Array[Func]): Self = this.set("interrupt", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewListenerVarargs(value: Func*): Self = this.set("newListener", js.Array(value :_*))
    @scala.inline
    def setNewListener(value: js.Array[Func]): Self = this.set("newListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveListenerVarargs(value: Func*): Self = this.set("removeListener", js.Array(value :_*))
    @scala.inline
    def setRemoveListener(value: js.Array[Func]): Self = this.set("removeListener", value.asInstanceOf[js.Any])
  }
  
}

