package typings
package meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadLocaleParams extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var fresh: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var pathOnHost: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object LoadLocaleParams {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    fresh: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    pathOnHost: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): LoadLocaleParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(fresh)) __obj.updateDynamic("fresh")(fresh)
    if (host != null) __obj.updateDynamic("host")(host)
    if (pathOnHost != null) __obj.updateDynamic("pathOnHost")(pathOnHost)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[LoadLocaleParams]
  }
}

