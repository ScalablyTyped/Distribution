package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedTopologyOptions extends StObject {
  
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
  
  inline def apply(): UnifiedTopologyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedTopologyOptions]
  }
  
  extension [Self <: UnifiedTopologyOptions](x: Self) {
    
    inline def setHeartbeatFrequencyMS(value: scala.Double): Self = StObject.set(x, "heartbeatFrequencyMS", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatFrequencyMSUndefined: Self = StObject.set(x, "heartbeatFrequencyMS", js.undefined)
    
    inline def setLocalThresholdMS(value: scala.Double): Self = StObject.set(x, "localThresholdMS", value.asInstanceOf[js.Any])
    
    inline def setLocalThresholdMSUndefined: Self = StObject.set(x, "localThresholdMS", js.undefined)
    
    inline def setMaxIdleTimeMS(value: scala.Double): Self = StObject.set(x, "maxIdleTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxIdleTimeMSUndefined: Self = StObject.set(x, "maxIdleTimeMS", js.undefined)
    
    inline def setMaxPoolSize(value: scala.Double): Self = StObject.set(x, "maxPoolSize", value.asInstanceOf[js.Any])
    
    inline def setMaxPoolSizeUndefined: Self = StObject.set(x, "maxPoolSize", js.undefined)
    
    inline def setMinPoolSize(value: scala.Double): Self = StObject.set(x, "minPoolSize", value.asInstanceOf[js.Any])
    
    inline def setMinPoolSizeUndefined: Self = StObject.set(x, "minPoolSize", js.undefined)
    
    inline def setServerSelectionTimeoutMS(value: scala.Double): Self = StObject.set(x, "serverSelectionTimeoutMS", value.asInstanceOf[js.Any])
    
    inline def setServerSelectionTimeoutMSUndefined: Self = StObject.set(x, "serverSelectionTimeoutMS", js.undefined)
    
    inline def setUseUnifiedTopology(value: Boolean): Self = StObject.set(x, "useUnifiedTopology", value.asInstanceOf[js.Any])
    
    inline def setUseUnifiedTopologyUndefined: Self = StObject.set(x, "useUnifiedTopology", js.undefined)
    
    inline def setWaitQueueTimeoutMS(value: scala.Double): Self = StObject.set(x, "waitQueueTimeoutMS", value.asInstanceOf[js.Any])
    
    inline def setWaitQueueTimeoutMSUndefined: Self = StObject.set(x, "waitQueueTimeoutMS", js.undefined)
  }
}
