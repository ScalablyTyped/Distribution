package typings.normalizr.mod.schema

import typings.normalizr.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object[T] extends Schema_[T] {
  def define(definition: Schema_[_]): Unit
}

object Object {
  @scala.inline
  def apply[T](define: Schema_[_] => Unit): Object[T] = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
  
    __obj.asInstanceOf[Object[T]]
  }
}

