package typings.preact

import typings.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenValue[T] extends js.Object {
  def children(value: T): ComponentChildren
}

object AnonChildrenValue {
  @scala.inline
  def apply[T](children: T => ComponentChildren): AnonChildrenValue[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[AnonChildrenValue[T]]
  }
}

