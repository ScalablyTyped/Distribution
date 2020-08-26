package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnifiedTopologyOptions extends js.Object {
  /**
    * **Only applies to the unified topology**
    * The frequency with which topology updates are scheduled
    * @default 10000
    */
  var heartbeatFrequencyMS: js.UndefOr[scala.Double] = js.native
  /**
    * **Only applies to the unified topology**
    * The size of the latency window for selecting among multiple suitable servers
    * @default 15
    */
  var localThresholdMS: js.UndefOr[scala.Double] = js.native
  /**
    * **Only applies to the unified topology**
    * The maximum amount of time a connection should remain idle in the connection pool before being marked idle.
    * @default Infinity
    */
  var maxIdleTimeMS: js.UndefOr[scala.Double] = js.native
  /**
    *  **Only applies to the unified topology**
    * The maximum number of connections that may be associated with a pool at a given time.
    * This includes in use and available connections
    * @default 10
    */
  var maxPoolSize: js.UndefOr[scala.Double] = js.native
  /**
    * **Only applies to the unified topology**
    * The minimum number of connections that MUST exist at any moment in a single connection pool.
    * @default 0
    */
  var minPoolSize: js.UndefOr[scala.Double] = js.native
  /**
    * With `useUnifiedTopology`, the MongoDB driver will try to find a server to send any given operation to
    * and keep retrying for `serverSelectionTimeoutMS` milliseconds.
    * Default: 30000
    */
  var serverSelectionTimeoutMS: js.UndefOr[scala.Double] = js.native
  /**
    * Enables the new unified topology layer
    */
  var useUnifiedTopology: js.UndefOr[Boolean] = js.native
  /**
    * **Only applies to the unified topology**
    * The maximum amount of time operation execution should wait for a connection to become available.
    * The default is 0 which means there is no limit.
    * @default 0
    */
  var waitQueueTimeoutMS: js.UndefOr[scala.Double] = js.native
}

object UnifiedTopologyOptions {
  @scala.inline
  def apply(): UnifiedTopologyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedTopologyOptions]
  }
  @scala.inline
  implicit class UnifiedTopologyOptionsOps[Self <: UnifiedTopologyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeartbeatFrequencyMS(value: scala.Double): Self = this.set("heartbeatFrequencyMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeartbeatFrequencyMS: Self = this.set("heartbeatFrequencyMS", js.undefined)
    @scala.inline
    def setLocalThresholdMS(value: scala.Double): Self = this.set("localThresholdMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalThresholdMS: Self = this.set("localThresholdMS", js.undefined)
    @scala.inline
    def setMaxIdleTimeMS(value: scala.Double): Self = this.set("maxIdleTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxIdleTimeMS: Self = this.set("maxIdleTimeMS", js.undefined)
    @scala.inline
    def setMaxPoolSize(value: scala.Double): Self = this.set("maxPoolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPoolSize: Self = this.set("maxPoolSize", js.undefined)
    @scala.inline
    def setMinPoolSize(value: scala.Double): Self = this.set("minPoolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPoolSize: Self = this.set("minPoolSize", js.undefined)
    @scala.inline
    def setServerSelectionTimeoutMS(value: scala.Double): Self = this.set("serverSelectionTimeoutMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSelectionTimeoutMS: Self = this.set("serverSelectionTimeoutMS", js.undefined)
    @scala.inline
    def setUseUnifiedTopology(value: Boolean): Self = this.set("useUnifiedTopology", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseUnifiedTopology: Self = this.set("useUnifiedTopology", js.undefined)
    @scala.inline
    def setWaitQueueTimeoutMS(value: scala.Double): Self = this.set("waitQueueTimeoutMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitQueueTimeoutMS: Self = this.set("waitQueueTimeoutMS", js.undefined)
  }
  
}

