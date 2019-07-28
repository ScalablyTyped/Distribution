package typings.normalizr.normalizrMod.schemaNs

import typings.normalizr.normalizrMod.Schema
import typings.normalizr.normalizrMod._Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends _Schema {
  def define(definition: Schema): Unit
}

object Object {
  @scala.inline
  def apply(define: Schema => Unit): Object = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
  
    __obj.asInstanceOf[Object]
  }
}

