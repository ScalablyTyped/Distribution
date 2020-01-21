package typings.preact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefObject[T] extends js.Object {
  var current: js.UndefOr[T | Null] = js.undefined
}

object RefObject {
  @scala.inline
  def apply[T](current: T = null): RefObject[T] = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefObject[T]]
  }
}

