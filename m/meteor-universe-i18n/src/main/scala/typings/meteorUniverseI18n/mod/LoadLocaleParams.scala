package typings.meteorUniverseI18n.mod

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
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(fresh)) __obj.updateDynamic("fresh")(fresh.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (pathOnHost != null) __obj.updateDynamic("pathOnHost")(pathOnHost.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadLocaleParams]
  }
}

