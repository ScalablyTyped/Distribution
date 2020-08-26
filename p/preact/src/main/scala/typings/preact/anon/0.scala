package typings.preact.anon

import typings.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[T] extends js.Object {
  def children(value: T): ComponentChildren = js.native
}

object `0` {
  @scala.inline
  def apply[T](children: T => ComponentChildren): `0`[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[`0`[T]]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], T] (val x: Self with `0`[T]) extends AnyVal {
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
    def setChildren(value: T => ComponentChildren): Self = this.set("children", js.Any.fromFunction1(value))
  }
  
}

