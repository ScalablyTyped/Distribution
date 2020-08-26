package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactiveVar[T] extends js.Object {
  def get(): T = js.native
  def set(newValue: T): Unit = js.native
}

object ReactiveVar {
  @scala.inline
  def apply[T](get: () => T, set: T => Unit): ReactiveVar[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[ReactiveVar[T]]
  }
  @scala.inline
  implicit class ReactiveVarOps[Self <: ReactiveVar[_], T] (val x: Self with ReactiveVar[T]) extends AnyVal {
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
    def setGet(value: () => T): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: T => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

