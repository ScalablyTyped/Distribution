package typings.openfin.clearCacheOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearCacheOption extends js.Object {
  var appcache: js.UndefOr[Boolean] = js.undefined
  var cache: js.UndefOr[Boolean] = js.undefined
  var cookies: js.UndefOr[Boolean] = js.undefined
  var localStorage: js.UndefOr[Boolean] = js.undefined
}

object ClearCacheOption {
  @scala.inline
  def apply(
    appcache: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    cookies: js.UndefOr[Boolean] = js.undefined,
    localStorage: js.UndefOr[Boolean] = js.undefined
  ): ClearCacheOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appcache)) __obj.updateDynamic("appcache")(appcache.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(cookies)) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearCacheOption]
  }
}

