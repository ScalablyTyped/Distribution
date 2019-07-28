package typings.meteorDashUniverseDashI18n.`meteorUniverse:i18nMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadLocaleParams extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var fresh: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var pathOnHost: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object LoadLocaleParams {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    fresh: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    pathOnHost: String = null,
    silent: js.UndefOr[Boolean] = js.undefined
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

