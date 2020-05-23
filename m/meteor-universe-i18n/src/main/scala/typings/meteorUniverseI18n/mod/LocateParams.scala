package typings.meteorUniverseI18n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocateParams extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var fresh: js.UndefOr[Boolean] = js.undefined
  var noDownload: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object LocateParams {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    fresh: js.UndefOr[Boolean] = js.undefined,
    noDownload: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined
  ): LocateParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fresh)) __obj.updateDynamic("fresh")(fresh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noDownload)) __obj.updateDynamic("noDownload")(noDownload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateParams]
  }
}

