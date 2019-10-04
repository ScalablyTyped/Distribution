package typings.preact.hooksSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ref[T] extends js.Object {
  var current: T
}

object Ref {
  @scala.inline
  def apply[T](current: T): Ref[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Ref[T]]
  }
}

