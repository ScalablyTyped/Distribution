package typings.normalizr.normalizrMod.schema

import typings.normalizr.normalizrMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Values[T] extends Schema[T] {
  def define(definition: Schema[_]): Unit
}

object Values {
  @scala.inline
  def apply[T](define: Schema[_] => Unit): Values[T] = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
  
    __obj.asInstanceOf[Values[T]]
  }
}

