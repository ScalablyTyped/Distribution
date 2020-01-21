package typings.preact

import typings.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenValueComponentChildren[T] extends js.Object {
  var children: ComponentChildren
  var value: T
}

object AnonChildrenValueComponentChildren {
  @scala.inline
  def apply[T](value: T, children: ComponentChildren = null): AnonChildrenValueComponentChildren[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenValueComponentChildren[T]]
  }
}

