package typings.offlineDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfflineOptions extends js.Object {
  // TODO Should these types be `boolean|Function`?
  // The project documentation is not clear here.
  var checkOnLoad: js.UndefOr[Boolean] = js.undefined
  var checks: js.UndefOr[OfflineChecks] = js.undefined
  var game: js.UndefOr[Boolean] = js.undefined
  var interceptRequests: js.UndefOr[Boolean] = js.undefined
  var reconnect: Anon_Delay
  var requests: js.UndefOr[Boolean] = js.undefined
}

object OfflineOptions {
  @scala.inline
  def apply(
    reconnect: Anon_Delay,
    checkOnLoad: js.UndefOr[Boolean] = js.undefined,
    checks: OfflineChecks = null,
    game: js.UndefOr[Boolean] = js.undefined,
    interceptRequests: js.UndefOr[Boolean] = js.undefined,
    requests: js.UndefOr[Boolean] = js.undefined
  ): OfflineOptions = {
    val __obj = js.Dynamic.literal(reconnect = reconnect)
    if (!js.isUndefined(checkOnLoad)) __obj.updateDynamic("checkOnLoad")(checkOnLoad)
    if (checks != null) __obj.updateDynamic("checks")(checks)
    if (!js.isUndefined(game)) __obj.updateDynamic("game")(game)
    if (!js.isUndefined(interceptRequests)) __obj.updateDynamic("interceptRequests")(interceptRequests)
    if (!js.isUndefined(requests)) __obj.updateDynamic("requests")(requests)
    __obj.asInstanceOf[OfflineOptions]
  }
}

