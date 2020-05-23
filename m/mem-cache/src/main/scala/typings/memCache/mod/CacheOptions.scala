package typings.memCache.mod

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
    timeout: js.UndefOr[Double] = js.undefined,
    timeoutDisabled: js.UndefOr[Boolean] = js.undefined
  ): CacheOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doesNotRenewTimeout)) __obj.updateDynamic("doesNotRenewTimeout")(doesNotRenewTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutDisabled)) __obj.updateDynamic("timeoutDisabled")(timeoutDisabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions]
  }
}

