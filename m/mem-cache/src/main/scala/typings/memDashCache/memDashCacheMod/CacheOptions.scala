package typings.memDashCache.memDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  var doesNotRenewTimeout: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var timeoutDisabled: js.UndefOr[Boolean] = js.undefined
}

object CacheOptions {
  @scala.inline
  def apply(
    doesNotRenewTimeout: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    timeoutDisabled: js.UndefOr[Boolean] = js.undefined
  ): CacheOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doesNotRenewTimeout)) __obj.updateDynamic("doesNotRenewTimeout")(doesNotRenewTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutDisabled)) __obj.updateDynamic("timeoutDisabled")(timeoutDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions]
  }
}

