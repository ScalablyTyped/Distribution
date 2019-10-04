package typings.preact.hooksSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropRef[T] extends js.Object {
  val current: js.UndefOr[T] = js.undefined
}

object PropRef {
  @scala.inline
  def apply[T](current: T = null): PropRef[T] = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropRef[T]]
  }
}

