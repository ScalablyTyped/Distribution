package typings.navigo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericHooks extends js.Object {
  var after: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.undefined
  var before: js.UndefOr[
    js.Function2[
      /* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], 
      /* params */ js.UndefOr[Params], 
      Unit
    ]
  ] = js.undefined
}

object GenericHooks {
  @scala.inline
  def apply(
    after: /* params */ js.UndefOr[Params] => Unit = null,
    before: (/* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], /* params */ js.UndefOr[Params]) => Unit = null
  ): GenericHooks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    __obj.asInstanceOf[GenericHooks]
  }
}

