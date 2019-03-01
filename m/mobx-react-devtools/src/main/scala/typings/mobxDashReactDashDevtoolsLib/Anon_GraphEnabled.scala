package typings
package mobxDashReactDashDevtoolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GraphEnabled extends js.Object {
  var graphEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var logEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var logFilter: js.UndefOr[js.Function1[/* p */ js.Any, scala.Boolean]] = js.undefined
  var updatesEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_GraphEnabled {
  @scala.inline
  def apply(
    graphEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    logEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    logFilter: js.Function1[/* p */ js.Any, scala.Boolean] = null,
    updatesEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_GraphEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(graphEnabled)) __obj.updateDynamic("graphEnabled")(graphEnabled)
    if (!js.isUndefined(logEnabled)) __obj.updateDynamic("logEnabled")(logEnabled)
    if (logFilter != null) __obj.updateDynamic("logFilter")(logFilter)
    if (!js.isUndefined(updatesEnabled)) __obj.updateDynamic("updatesEnabled")(updatesEnabled)
    __obj.asInstanceOf[Anon_GraphEnabled]
  }
}

