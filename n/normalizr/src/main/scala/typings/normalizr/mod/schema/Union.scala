package typings.normalizr.mod.schema

import typings.normalizr.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Union[T] extends Schema_[T] {
  def define(definition: Schema_[_]): Unit
}

object Union {
  @scala.inline
  def apply[T](define: Schema_[_] => Unit): Union[T] = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
  
    __obj.asInstanceOf[Union[T]]
  }
}

