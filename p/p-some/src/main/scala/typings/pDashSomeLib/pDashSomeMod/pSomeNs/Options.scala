package typings
package pDashSomeLib.pDashSomeMod.pSomeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var count: scala.Double
  var filter: js.UndefOr[js.Function1[/* value */ T, scala.Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](count: scala.Double, filter: /* value */ T => scala.Boolean = null): Options[T] = {
    val __obj = js.Dynamic.literal(count = count)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    __obj.asInstanceOf[Options[T]]
  }
}

