package typings
package memDashCacheLib.memDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  var doesNotRenewTimeout: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var timeoutDisabled: js.UndefOr[scala.Boolean] = js.undefined
}

object CacheOptions {
  @scala.inline
  def apply(
    doesNotRenewTimeout: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    timeoutDisabled: js.UndefOr[scala.Boolean] = js.undefined
  ): CacheOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doesNotRenewTimeout)) __obj.updateDynamic("doesNotRenewTimeout")(doesNotRenewTimeout)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutDisabled)) __obj.updateDynamic("timeoutDisabled")(timeoutDisabled)
    __obj.asInstanceOf[CacheOptions]
  }
}

