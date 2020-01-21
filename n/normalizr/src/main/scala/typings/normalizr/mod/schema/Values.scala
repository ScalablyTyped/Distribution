package typings.normalizr.mod.schema

import typings.normalizr.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Values[T] extends Schema_[T] {
  def define(definition: Schema_[_]): Unit
}

object Values {
  @scala.inline
  def apply[T](define: Schema_[_] => Unit): Values[T] = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
  
    __obj.asInstanceOf[Values[T]]
  }
}

