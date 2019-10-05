package typings.normalizr.normalizrMod.schema

import typings.normalizr.normalizrMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Union[T] extends Schema[T] {
  def define(definition: Schema[_]): Unit
}

object Union {
  @scala.inline
  def apply[T](define: Schema[_] => Unit): Union[T] = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
  
    __obj.asInstanceOf[Union[T]]
  }
}

