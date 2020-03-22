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
    clientRetrySecs: Int | Double = null,
    errorPropagationMode: js.UndefOr[Boolean] = js.undefined,
    logStatsOnReq: `false` = null,
    logging: Boolean | String | (js.Function1[/* msg */ String, Unit]) = null,
    maxEventLoopDelay: Int | Double = null,
    maxHeapUsedBytes: Int | Double = null,
    maxRssBytes: Int | Double = null,
    production: js.UndefOr[Boolean] = js.undefined,
    sampleInterval: Int | Double = null
  ): ProtectionConfig = {
    val __obj = js.Dynamic.literal()
    if (clientRetrySecs != null) __obj.updateDynamic("clientRetrySecs")(clientRetrySecs.asInstanceOf[js.Any])
    if (!js.isUndefined(errorPropagationMode)) __obj.updateDynamic("errorPropagationMode")(errorPropagationMode.asInstanceOf[js.Any])
    if (logStatsOnReq != null) __obj.updateDynamic("logStatsOnReq")(logStatsOnReq.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (maxEventLoopDelay != null) __obj.updateDynamic("maxEventLoopDelay")(maxEventLoopDelay.asInstanceOf[js.Any])
    if (maxHeapUsedBytes != null) __obj.updateDynamic("maxHeapUsedBytes")(maxHeapUsedBytes.asInstanceOf[js.Any])
    if (maxRssBytes != null) __obj.updateDynamic("maxRssBytes")(maxRssBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production.asInstanceOf[js.Any])
    if (sampleInterval != null) __obj.updateDynamic("sampleInterval")(sampleInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionConfig]
  }
}

