package typings.preact

import typings.preact.srcMod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenValue[T] extends js.Object {
  def children(value: T): ComponentChildren
}

object Anon_ChildrenValue {
  @scala.inline
  def apply[T](children: T => ComponentChildren): Anon_ChildrenValue[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon_ChildrenValue[T]]
  }
}

