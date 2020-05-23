package typings.preact.anon

import typings.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[T] extends js.Object {
  def children(value: T): ComponentChildren
}

object `0` {
  @scala.inline
  def apply[T](children: T => ComponentChildren): `0`[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[`0`[T]]
  }
}

