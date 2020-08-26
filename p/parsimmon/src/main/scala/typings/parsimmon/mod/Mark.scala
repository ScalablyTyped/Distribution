package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mark[T] extends js.Object {
  var end: Index_ = js.native
  var start: Index_ = js.native
  var value: T = js.native
}

object Mark {
  @scala.inline
  def apply[T](end: Index_, start: Index_, value: T): Mark[T] = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark[T]]
  }
  @scala.inline
  implicit class MarkOps[Self <: Mark[_], T] (val x: Self with Mark[T]) extends AnyVal {
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
    def setEnd(value: Index_): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Index_): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

