package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics 
  */
trait Statistics extends StObject {
  
  var averageTimeInQueue: Double
  
  var connectionRequests: Double
  
  var connectionsInUse: Double
  
  var connectionsOpen: Double
  
  var currentQueueLength: Double
  
  var failedRequests: Double
  
  var gatheredDate: js.Date
  
  var maximumQueueLength: Double
  
  var maximumTimeInQueue: Double
  
  var minimumTimeInQueue: Double
  
  var poolAlias: String
  
  var poolIncrement: Double
  
  var poolMax: Double
  
  var poolMaxPerShard: Double
  
  var poolMin: Double
  
  var poolPingInterval: Double
  
  var poolTimeout: Double
  
  var queueMax: Double
  
  var queueTimeout: Double
  
  var rejectedRequests: Double
  
  var requestTimeouts: Double
  
  var requestsDequeued: Double
  
  var requestsEnqueued: Double
  
  var sodaMetaDataCache: Boolean
  
  var stmtCacheSize: Double
  
  var threadPoolSize: Double
  
  var timeInQueue: Double
  
  var upTime: js.Date
  
  var upTimeSinceReset: js.Date
}
object Statistics {
  
  inline def apply(
    averageTimeInQueue: Double,
    connectionRequests: Double,
    connectionsInUse: Double,
    connectionsOpen: Double,
    currentQueueLength: Double,
    failedRequests: Double,
    gatheredDate: js.Date,
    maximumQueueLength: Double,
    maximumTimeInQueue: Double,
    minimumTimeInQueue: Double,
    poolAlias: String,
    poolIncrement: Double,
    poolMax: Double,
    poolMaxPerShard: Double,
    poolMin: Double,
    poolPingInterval: Double,
    poolTimeout: Double,
    queueMax: Double,
    queueTimeout: Double,
    rejectedRequests: Double,
    requestTimeouts: Double,
    requestsDequeued: Double,
    requestsEnqueued: Double,
    sodaMetaDataCache: Boolean,
    stmtCacheSize: Double,
    threadPoolSize: Double,
    timeInQueue: Double,
    upTime: js.Date,
    upTimeSinceReset: js.Date
  ): Statistics = {
    val __obj = js.Dynamic.literal(averageTimeInQueue = averageTimeInQueue.asInstanceOf[js.Any], connectionRequests = connectionRequests.asInstanceOf[js.Any], connectionsInUse = connectionsInUse.asInstanceOf[js.Any], connectionsOpen = connectionsOpen.asInstanceOf[js.Any], currentQueueLength = currentQueueLength.asInstanceOf[js.Any], failedRequests = failedRequests.asInstanceOf[js.Any], gatheredDate = gatheredDate.asInstanceOf[js.Any], maximumQueueLength = maximumQueueLength.asInstanceOf[js.Any], maximumTimeInQueue = maximumTimeInQueue.asInstanceOf[js.Any], minimumTimeInQueue = minimumTimeInQueue.asInstanceOf[js.Any], poolAlias = poolAlias.asInstanceOf[js.Any], poolIncrement = poolIncrement.asInstanceOf[js.Any], poolMax = poolMax.asInstanceOf[js.Any], poolMaxPerShard = poolMaxPerShard.asInstanceOf[js.Any], poolMin = poolMin.asInstanceOf[js.Any], poolPingInterval = poolPingInterval.asInstanceOf[js.Any], poolTimeout = poolTimeout.asInstanceOf[js.Any], queueMax = queueMax.asInstanceOf[js.Any], queueTimeout = queueTimeout.asInstanceOf[js.Any], rejectedRequests = rejectedRequests.asInstanceOf[js.Any], requestTimeouts = requestTimeouts.asInstanceOf[js.Any], requestsDequeued = requestsDequeued.asInstanceOf[js.Any], requestsEnqueued = requestsEnqueued.asInstanceOf[js.Any], sodaMetaDataCache = sodaMetaDataCache.asInstanceOf[js.Any], stmtCacheSize = stmtCacheSize.asInstanceOf[js.Any], threadPoolSize = threadPoolSize.asInstanceOf[js.Any], timeInQueue = timeInQueue.asInstanceOf[js.Any], upTime = upTime.asInstanceOf[js.Any], upTimeSinceReset = upTimeSinceReset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistics]
  }
  
  extension [Self <: Statistics](x: Self) {
    
    inline def setAverageTimeInQueue(value: Double): Self = StObject.set(x, "averageTimeInQueue", value.asInstanceOf[js.Any])
    
    inline def setConnectionRequests(value: Double): Self = StObject.set(x, "connectionRequests", value.asInstanceOf[js.Any])
    
    inline def setConnectionsInUse(value: Double): Self = StObject.set(x, "connectionsInUse", value.asInstanceOf[js.Any])
    
    inline def setConnectionsOpen(value: Double): Self = StObject.set(x, "connectionsOpen", value.asInstanceOf[js.Any])
    
    inline def setCurrentQueueLength(value: Double): Self = StObject.set(x, "currentQueueLength", value.asInstanceOf[js.Any])
    
    inline def setFailedRequests(value: Double): Self = StObject.set(x, "failedRequests", value.asInstanceOf[js.Any])
    
    inline def setGatheredDate(value: js.Date): Self = StObject.set(x, "gatheredDate", value.asInstanceOf[js.Any])
    
    inline def setMaximumQueueLength(value: Double): Self = StObject.set(x, "maximumQueueLength", value.asInstanceOf[js.Any])
    
    inline def setMaximumTimeInQueue(value: Double): Self = StObject.set(x, "maximumTimeInQueue", value.asInstanceOf[js.Any])
    
    inline def setMinimumTimeInQueue(value: Double): Self = StObject.set(x, "minimumTimeInQueue", value.asInstanceOf[js.Any])
    
    inline def setPoolAlias(value: String): Self = StObject.set(x, "poolAlias", value.asInstanceOf[js.Any])
    
    inline def setPoolIncrement(value: Double): Self = StObject.set(x, "poolIncrement", value.asInstanceOf[js.Any])
    
    inline def setPoolMax(value: Double): Self = StObject.set(x, "poolMax", value.asInstanceOf[js.Any])
    
    inline def setPoolMaxPerShard(value: Double): Self = StObject.set(x, "poolMaxPerShard", value.asInstanceOf[js.Any])
    
    inline def setPoolMin(value: Double): Self = StObject.set(x, "poolMin", value.asInstanceOf[js.Any])
    
    inline def setPoolPingInterval(value: Double): Self = StObject.set(x, "poolPingInterval", value.asInstanceOf[js.Any])
    
    inline def setPoolTimeout(value: Double): Self = StObject.set(x, "poolTimeout", value.asInstanceOf[js.Any])
    
    inline def setQueueMax(value: Double): Self = StObject.set(x, "queueMax", value.asInstanceOf[js.Any])
    
    inline def setQueueTimeout(value: Double): Self = StObject.set(x, "queueTimeout", value.asInstanceOf[js.Any])
    
    inline def setRejectedRequests(value: Double): Self = StObject.set(x, "rejectedRequests", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeouts(value: Double): Self = StObject.set(x, "requestTimeouts", value.asInstanceOf[js.Any])
    
    inline def setRequestsDequeued(value: Double): Self = StObject.set(x, "requestsDequeued", value.asInstanceOf[js.Any])
    
    inline def setRequestsEnqueued(value: Double): Self = StObject.set(x, "requestsEnqueued", value.asInstanceOf[js.Any])
    
    inline def setSodaMetaDataCache(value: Boolean): Self = StObject.set(x, "sodaMetaDataCache", value.asInstanceOf[js.Any])
    
    inline def setStmtCacheSize(value: Double): Self = StObject.set(x, "stmtCacheSize", value.asInstanceOf[js.Any])
    
    inline def setThreadPoolSize(value: Double): Self = StObject.set(x, "threadPoolSize", value.asInstanceOf[js.Any])
    
    inline def setTimeInQueue(value: Double): Self = StObject.set(x, "timeInQueue", value.asInstanceOf[js.Any])
    
    inline def setUpTime(value: js.Date): Self = StObject.set(x, "upTime", value.asInstanceOf[js.Any])
    
    inline def setUpTimeSinceReset(value: js.Date): Self = StObject.set(x, "upTimeSinceReset", value.asInstanceOf[js.Any])
  }
}
