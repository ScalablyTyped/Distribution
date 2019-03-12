package typings
package navigoLib.navigoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigoHooks extends js.Object {
  var after: js.UndefOr[js.Function1[/* params */ js.UndefOr[navigoLib.Params], scala.Unit]] = js.undefined
  var already: js.UndefOr[js.Function1[/* params */ js.UndefOr[navigoLib.Params], scala.Unit]] = js.undefined
  var before: js.UndefOr[
    js.Function2[
      /* done */ js.Function1[/* suppress */ js.UndefOr[scala.Boolean], scala.Unit], 
      /* params */ js.UndefOr[navigoLib.Params], 
      scala.Unit
    ]
  ] = js.undefined
  var leave: js.UndefOr[js.Function1[/* params */ js.UndefOr[navigoLib.Params], scala.Unit]] = js.undefined
}

object NavigoHooks {
  @scala.inline
  def apply(
    after: /* params */ js.UndefOr[navigoLib.Params] => scala.Unit = null,
    already: /* params */ js.UndefOr[navigoLib.Params] => scala.Unit = null,
    before: (/* done */ js.Function1[/* suppress */ js.UndefOr[scala.Boolean], scala.Unit], /* params */ js.UndefOr[navigoLib.Params]) => scala.Unit = null,
    leave: /* params */ js.UndefOr[navigoLib.Params] => scala.Unit = null
  ): NavigoHooks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (already != null) __obj.updateDynamic("already")(js.Any.fromFunction1(already))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction1(leave))
    __obj.asInstanceOf[NavigoHooks]
  }
}

