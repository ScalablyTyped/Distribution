package typings.preact

import typings.preact.srcMod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenValueComponentChildren[T] extends js.Object {
  var children: ComponentChildren
  var value: T
}

object Anon_ChildrenValueComponentChildren {
  @scala.inline
  def apply[T](children: ComponentChildren, value: T): Anon_ChildrenValueComponentChildren[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChildrenValueComponentChildren[T]]
  }
}

