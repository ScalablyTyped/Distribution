package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnifiedTopologyOptions extends js.Object {
  /**
    * **Only applies to the unified topology**
    * The frequency with which topology updates are scheduled
    * @default 10000
    */
  var heartbeatFrequencyMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * **Only applies to the unified topology**
    * The size of the latency window for selecting among multiple suitable servers
    * @default 15
    */
  var localThresholdMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * **Only applies to the unified topology**
    * The maximum amount of time a connection should remain idle in the connection pool before being marked idle.
    * @default Infinity
    */
  var maxIdleTimeMS: js.UndefOr[scala.Double] = js.undefined
  /**
    *  **Only applies to the unified topology**
    * The maximum number of connections that may be associated with a pool at a given time.
    * This includes in use and available connections
    * @default 10
    */
  var maxPoolSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * **Only applies to the unified topology**
    * The minimum number of connections that MUST exist at any moment in a single connection pool.
    * @default 0
    */
  var minPoolSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * With `useUnifiedTopology`, the MongoDB driver will try to find a server to send any given operation to
    * and keep retrying for `serverSelectionTimeoutMS` milliseconds.
    * Default: 30000
    */
  var serverSelectionTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enables the new unified topology layer
    */
  var useUnifiedTopology: js.UndefOr[Boolean] = js.undefined
  /**
    * **Only applies to the unified topology**
    * The maximum amount of time operation execution should wait for a connection to become available.
    * The default is 0 which means there is no limit.
    * @default 0
    */
  var waitQueueTimeoutMS: js.UndefOr[scala.Double] = js.undefined
}

object UnifiedTopologyOptions {
  @scala.inline
  def apply(
    heartbeatFrequencyMS: js.UndefOr[scala.Double] = js.undefined,
    localThresholdMS: js.UndefOr[scala.Double] = js.undefined,
    maxIdleTimeMS: js.UndefOr[scala.Double] = js.undefined,
    maxPoolSize: js.UndefOr[scala.Double] = js.undefined,
    minPoolSize: js.UndefOr[scala.Double] = js.undefined,
    serverSelectionTimeoutMS: js.UndefOr[scala.Double] = js.undefined,
    useUnifiedTopology: js.UndefOr[Boolean] = js.undefined,
    waitQueueTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  ): UnifiedTopologyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(heartbeatFrequencyMS)) __obj.updateDynamic("heartbeatFrequencyMS")(heartbeatFrequencyMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(localThresholdMS)) __obj.updateDynamic("localThresholdMS")(localThresholdMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIdleTimeMS)) __obj.updateDynamic("maxIdleTimeMS")(maxIdleTimeMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPoolSize)) __obj.updateDynamic("maxPoolSize")(maxPoolSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPoolSize)) __obj.updateDynamic("minPoolSize")(minPoolSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverSelectionTimeoutMS)) __obj.updateDynamic("serverSelectionTimeoutMS")(serverSelectionTimeoutMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useUnifiedTopology)) __obj.updateDynamic("useUnifiedTopology")(useUnifiedTopology.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitQueueTimeoutMS)) __obj.updateDynamic("waitQueueTimeoutMS")(waitQueueTimeoutMS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedTopologyOptions]
  }
}

