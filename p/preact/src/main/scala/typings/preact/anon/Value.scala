package typings.preact.anon

import typings.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[T] extends js.Object {
  var children: ComponentChildren
  var value: T
}

object Value {
  @scala.inline
  def apply[T](value: T, children: js.UndefOr[Null | ComponentChildren] = js.undefined): Value[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[T]]
  }
}

