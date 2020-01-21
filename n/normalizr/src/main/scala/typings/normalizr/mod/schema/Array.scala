package typings.normalizr.mod.schema

import typings.normalizr.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  def define(definition: Schema_[_]): Unit
}

object Array {
  @scala.inline
  def apply[T](define: Schema_[_] => Unit): Array[T] = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
  
    __obj.asInstanceOf[Array[T]]
  }
}

