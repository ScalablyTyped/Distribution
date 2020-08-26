package typings.normalizr.mod.schema

import typings.normalizr.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object[T] extends Schema_[T] {
  def define(definition: Schema_[_]): Unit = js.native
}

object Object {
  @scala.inline
  def apply[T](define: Schema_[_] => Unit): Object[T] = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
    __obj.asInstanceOf[Object[T]]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object[_], T] (val x: Self with Object[T]) extends AnyVal {
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
    def setDefine(value: Schema_[_] => Unit): Self = this.set("define", js.Any.fromFunction1(value))
  }
  
}

