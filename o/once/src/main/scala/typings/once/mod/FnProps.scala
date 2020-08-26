package typings.once.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnProps[R] extends js.Object {
  var called: Boolean = js.native
  var value: js.UndefOr[R] = js.native
}

object FnProps {
  @scala.inline
  def apply[R](called: Boolean): FnProps[R] = {
    val __obj = js.Dynamic.literal(called = called.asInstanceOf[js.Any])
    __obj.asInstanceOf[FnProps[R]]
  }
  @scala.inline
  implicit class FnPropsOps[Self <: FnProps[_], R] (val x: Self with FnProps[R]) extends AnyVal {
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
    def setCalled(value: Boolean): Self = this.set("called", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: R): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

