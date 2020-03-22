package typings.preact

import typings.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[T] extends js.Object {
  def children(value: T): ComponentChildren
}

object Anon0 {
  @scala.inline
  def apply[T](children: T => ComponentChildren): Anon0[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon0[T]]
  }
}

