package typings.pathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPathHistory extends js.Object {
  var initial: js.Any = js.native
  def listen(fallback: js.Any): Unit = js.native
  def popState(event: js.Any): Unit = js.native
  def pushState(state: js.Any, title: String, path: String): Unit = js.native
}

object IPathHistory {
  @scala.inline
  def apply(
    initial: js.Any,
    listen: js.Any => Unit,
    popState: js.Any => Unit,
    pushState: (js.Any, String, String) => Unit
  ): IPathHistory = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], listen = js.Any.fromFunction1(listen), popState = js.Any.fromFunction1(popState), pushState = js.Any.fromFunction3(pushState))
    __obj.asInstanceOf[IPathHistory]
  }
  @scala.inline
  implicit class IPathHistoryOps[Self <: IPathHistory] (val x: Self) extends AnyVal {
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
    def setInitial(value: js.Any): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def setListen(value: js.Any => Unit): Self = this.set("listen", js.Any.fromFunction1(value))
    @scala.inline
    def setPopState(value: js.Any => Unit): Self = this.set("popState", js.Any.fromFunction1(value))
    @scala.inline
    def setPushState(value: (js.Any, String, String) => Unit): Self = this.set("pushState", js.Any.fromFunction3(value))
  }
  
}

