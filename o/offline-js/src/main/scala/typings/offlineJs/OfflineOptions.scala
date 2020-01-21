package typings.offlineJs

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
  var reconnect: AnonDelay
  var requests: js.UndefOr[Boolean] = js.undefined
}

object OfflineOptions {
  @scala.inline
  def apply(
    reconnect: AnonDelay,
    checkOnLoad: js.UndefOr[Boolean] = js.undefined,
    checks: OfflineChecks = null,
    game: js.UndefOr[Boolean] = js.undefined,
    interceptRequests: js.UndefOr[Boolean] = js.undefined,
    requests: js.UndefOr[Boolean] = js.undefined
  ): OfflineOptions = {
    val __obj = js.Dynamic.literal(reconnect = reconnect.asInstanceOf[js.Any])
    if (!js.isUndefined(checkOnLoad)) __obj.updateDynamic("checkOnLoad")(checkOnLoad.asInstanceOf[js.Any])
    if (checks != null) __obj.updateDynamic("checks")(checks.asInstanceOf[js.Any])
    if (!js.isUndefined(game)) __obj.updateDynamic("game")(game.asInstanceOf[js.Any])
    if (!js.isUndefined(interceptRequests)) __obj.updateDynamic("interceptRequests")(interceptRequests.asInstanceOf[js.Any])
    if (!js.isUndefined(requests)) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineOptions]
  }
}

