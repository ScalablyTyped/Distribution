package typings.nuclearJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMixin extends js.Object {
  def componentDidMount(): Unit = js.native
  def componentWillUnmount(): Unit = js.native
  def getInitialState(): js.Any = js.native
}

object ReactMixin {
  @scala.inline
  def apply(componentDidMount: () => Unit, componentWillUnmount: () => Unit, getInitialState: () => js.Any): ReactMixin = {
    val __obj = js.Dynamic.literal(componentDidMount = js.Any.fromFunction0(componentDidMount), componentWillUnmount = js.Any.fromFunction0(componentWillUnmount), getInitialState = js.Any.fromFunction0(getInitialState))
    __obj.asInstanceOf[ReactMixin]
  }
  @scala.inline
  implicit class ReactMixinOps[Self <: ReactMixin] (val x: Self) extends AnyVal {
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
    def setComponentDidMount(value: () => Unit): Self = this.set("componentDidMount", js.Any.fromFunction0(value))
    @scala.inline
    def setComponentWillUnmount(value: () => Unit): Self = this.set("componentWillUnmount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInitialState(value: () => js.Any): Self = this.set("getInitialState", js.Any.fromFunction0(value))
  }
  
}

