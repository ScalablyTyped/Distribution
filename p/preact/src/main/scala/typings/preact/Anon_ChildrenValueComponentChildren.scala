package typings.preact

import typings.preact.preactMod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenValueComponentChildren[T] extends js.Object {
  var children: ComponentChildren
  var value: T
}

object Anon_ChildrenValueComponentChildren {
  @scala.inline
  def apply[T](value: T, children: ComponentChildren = null): Anon_ChildrenValueComponentChildren[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenValueComponentChildren[T]]
  }
}

