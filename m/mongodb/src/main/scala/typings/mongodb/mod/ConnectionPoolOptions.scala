package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof mongodb.mongodb.ConnectionOptions, 'id' | 'generation'> ]: mongodb.mongodb.ConnectionOptions[P]} */ trait ConnectionPoolOptions extends StObject {
  
  /** If we are in load balancer mode. */
  var loadBalanced: Boolean
  
  /** The maximum number of connections that may be in the process of being established concurrently by the connection pool. */
  var maxConnecting: scala.Double
  
  /** The maximum amount of time a connection should remain idle in the connection pool before being marked idle. */
  var maxIdleTimeMS: scala.Double
  
  /** The maximum number of connections that may be associated with a pool at a given time. This includes in use and available connections. */
  var maxPoolSize: scala.Double
  
  /** The minimum number of connections that MUST exist at any moment in a single connection pool. */
  var minPoolSize: scala.Double
  
  /** The maximum amount of time operation execution should wait for a connection to become available. The default is 0 which means there is no limit. */
  var waitQueueTimeoutMS: scala.Double
}
object ConnectionPoolOptions {
  
  inline def apply(
    loadBalanced: Boolean,
    maxConnecting: scala.Double,
    maxIdleTimeMS: scala.Double,
    maxPoolSize: scala.Double,
    minPoolSize: scala.Double,
    waitQueueTimeoutMS: scala.Double
  ): ConnectionPoolOptions = {
    val __obj = js.Dynamic.literal(loadBalanced = loadBalanced.asInstanceOf[js.Any], maxConnecting = maxConnecting.asInstanceOf[js.Any], maxIdleTimeMS = maxIdleTimeMS.asInstanceOf[js.Any], maxPoolSize = maxPoolSize.asInstanceOf[js.Any], minPoolSize = minPoolSize.asInstanceOf[js.Any], waitQueueTimeoutMS = waitQueueTimeoutMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionPoolOptions]
  }
  
  extension [Self <: ConnectionPoolOptions](x: Self) {
    
    inline def setLoadBalanced(value: Boolean): Self = StObject.set(x, "loadBalanced", value.asInstanceOf[js.Any])
    
    inline def setMaxConnecting(value: scala.Double): Self = StObject.set(x, "maxConnecting", value.asInstanceOf[js.Any])
    
    inline def setMaxIdleTimeMS(value: scala.Double): Self = StObject.set(x, "maxIdleTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxPoolSize(value: scala.Double): Self = StObject.set(x, "maxPoolSize", value.asInstanceOf[js.Any])
    
    inline def setMinPoolSize(value: scala.Double): Self = StObject.set(x, "minPoolSize", value.asInstanceOf[js.Any])
    
    inline def setWaitQueueTimeoutMS(value: scala.Double): Self = StObject.set(x, "waitQueueTimeoutMS", value.asInstanceOf[js.Any])
  }
}
