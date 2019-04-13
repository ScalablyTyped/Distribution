package typings
package onceLib.onceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FnProps[R] extends js.Object {
  var called: scala.Boolean
  var value: js.UndefOr[R]
}

object FnProps {
  @scala.inline
  def apply[R](called: scala.Boolean, value: R = null): FnProps[R] = {
    val __obj = js.Dynamic.literal(called = called)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FnProps[R]]
  }
}

