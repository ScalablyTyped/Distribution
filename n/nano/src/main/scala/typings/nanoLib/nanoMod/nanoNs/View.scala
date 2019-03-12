package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// View
// -------------------------------------
trait View[D] extends js.Object {
  var map: js.UndefOr[js.Function1[/* doc */ D with Document, scala.Unit]] = js.undefined
  var reduce: js.UndefOr[js.Function1[/* doc */ D with Document, scala.Unit]] = js.undefined
}

object View {
  @scala.inline
  def apply[D](
    map: /* doc */ D with Document => scala.Unit = null,
    reduce: /* doc */ D with Document => scala.Unit = null
  ): View[D] = {
    val __obj = js.Dynamic.literal()
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (reduce != null) __obj.updateDynamic("reduce")(js.Any.fromFunction1(reduce))
    __obj.asInstanceOf[View[D]]
  }
}

