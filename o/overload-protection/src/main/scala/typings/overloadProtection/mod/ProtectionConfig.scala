package typings.overloadProtection.mod

import typings.overloadProtection.overloadProtectionBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectionConfig extends js.Object {
  var clientRetrySecs: js.UndefOr[Double] = js.undefined
  var errorPropagationMode: js.UndefOr[Boolean] = js.undefined
  var logStatsOnReq: js.UndefOr[`false`] = js.undefined
  var logging: js.UndefOr[Boolean | String | (js.Function1[/* msg */ String, Unit])] = js.undefined
  var maxEventLoopDelay: js.UndefOr[Double] = js.undefined
  var maxHeapUsedBytes: js.UndefOr[Double] = js.undefined
  var maxRssBytes: js.UndefOr[Double] = js.undefined
  var production: js.UndefOr[Boolean] = js.undefined
  var sampleInterval: js.UndefOr[Double] = js.undefined
}

object ProtectionConfig {
  @scala.inline
  def apply(
    clientRetrySecs: js.UndefOr[Double] = js.undefined,
    errorPropagationMode: js.UndefOr[Boolean] = js.undefined,
    logStatsOnReq: `false` = null,
    logging: Boolean | String | (js.Function1[/* msg */ String, Unit]) = null,
    maxEventLoopDelay: js.UndefOr[Double] = js.undefined,
    maxHeapUsedBytes: js.UndefOr[Double] = js.undefined,
    maxRssBytes: js.UndefOr[Double] = js.undefined,
    production: js.UndefOr[Boolean] = js.undefined,
    sampleInterval: js.UndefOr[Double] = js.undefined
  ): ProtectionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clientRetrySecs)) __obj.updateDynamic("clientRetrySecs")(clientRetrySecs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(errorPropagationMode)) __obj.updateDynamic("errorPropagationMode")(errorPropagationMode.get.asInstanceOf[js.Any])
    if (logStatsOnReq != null) __obj.updateDynamic("logStatsOnReq")(logStatsOnReq.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(maxEventLoopDelay)) __obj.updateDynamic("maxEventLoopDelay")(maxEventLoopDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeapUsedBytes)) __obj.updateDynamic("maxHeapUsedBytes")(maxHeapUsedBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRssBytes)) __obj.updateDynamic("maxRssBytes")(maxRssBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleInterval)) __obj.updateDynamic("sampleInterval")(sampleInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionConfig]
  }
}

