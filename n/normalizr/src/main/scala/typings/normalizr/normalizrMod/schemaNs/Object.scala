package typings.normalizr.normalizrMod.schemaNs

import typings.normalizr.normalizrMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object[T] extends Schema[T] {
  def define(definition: Schema[_]): Unit
}

object Object {
  @scala.inline
  def apply[T](define: Schema[_] => Unit): Object[T] = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
  
    __obj.asInstanceOf[Object[T]]
  }
}

