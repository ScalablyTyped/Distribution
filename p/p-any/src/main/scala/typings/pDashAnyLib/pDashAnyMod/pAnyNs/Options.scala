package typings
package pDashAnyLib.pDashAnyMod.pAnyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var filter: js.UndefOr[js.Function1[/* value */ T, scala.Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](filter: /* value */ T => scala.Boolean = null): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    __obj.asInstanceOf[Options[T]]
  }
}

