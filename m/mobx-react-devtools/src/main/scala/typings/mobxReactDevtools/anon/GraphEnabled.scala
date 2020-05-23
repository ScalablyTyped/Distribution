package typings.mobxReactDevtools.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphEnabled extends js.Object {
  var graphEnabled: js.UndefOr[Boolean] = js.undefined
  var logEnabled: js.UndefOr[Boolean] = js.undefined
  var logFilter: js.UndefOr[js.Function1[/* p */ js.Any, Boolean]] = js.undefined
  var updatesEnabled: js.UndefOr[Boolean] = js.undefined
}

object GraphEnabled {
  @scala.inline
  def apply(
    graphEnabled: js.UndefOr[Boolean] = js.undefined,
    logEnabled: js.UndefOr[Boolean] = js.undefined,
    logFilter: /* p */ js.Any => Boolean = null,
    updatesEnabled: js.UndefOr[Boolean] = js.undefined
  ): GraphEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(graphEnabled)) __obj.updateDynamic("graphEnabled")(graphEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logEnabled)) __obj.updateDynamic("logEnabled")(logEnabled.get.asInstanceOf[js.Any])
    if (logFilter != null) __obj.updateDynamic("logFilter")(js.Any.fromFunction1(logFilter))
    if (!js.isUndefined(updatesEnabled)) __obj.updateDynamic("updatesEnabled")(updatesEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphEnabled]
  }
}

