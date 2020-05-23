package typings.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadPolicyConfig extends js.Object {
  var maxEventLoopDelay: js.UndefOr[Double] = js.undefined
  var maxHeapUsedBytes: js.UndefOr[Double] = js.undefined
  var maxRssBytes: js.UndefOr[Double] = js.undefined
}

object LoadPolicyConfig {
  @scala.inline
  def apply(
    maxEventLoopDelay: js.UndefOr[Double] = js.undefined,
    maxHeapUsedBytes: js.UndefOr[Double] = js.undefined,
    maxRssBytes: js.UndefOr[Double] = js.undefined
  ): LoadPolicyConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxEventLoopDelay)) __obj.updateDynamic("maxEventLoopDelay")(maxEventLoopDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeapUsedBytes)) __obj.updateDynamic("maxHeapUsedBytes")(maxHeapUsedBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRssBytes)) __obj.updateDynamic("maxRssBytes")(maxRssBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadPolicyConfig]
  }
}

