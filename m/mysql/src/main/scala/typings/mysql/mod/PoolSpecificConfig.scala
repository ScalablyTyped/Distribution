package typings.mysql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolSpecificConfig extends StObject {
  
  /**
    * The milliseconds before a timeout occurs during the connection acquisition. This is slightly different from connectTimeout,
    * because acquiring a pool connection does not always involve making a connection. (Default: 10 seconds)
    */
  var acquireTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of connections to create at once. (Default: 10)
    */
  var connectionLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of connection requests the pool will queue before returning an error from getConnection. If set to 0, there
    * is no limit to the number of queued connection requests. (Default: 0)
    */
  var queueLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines the pool's action when no connections are available and the limit has been reached. If true, the pool will queue
    * the connection request and call it when one becomes available. If false, the pool will immediately call back with an error.
    * (Default: true)
    */
  var waitForConnections: js.UndefOr[Boolean] = js.undefined
}
object PoolSpecificConfig {
  
  inline def apply(): PoolSpecificConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolSpecificConfig]
  }
  
  extension [Self <: PoolSpecificConfig](x: Self) {
    
    inline def setAcquireTimeout(value: Double): Self = StObject.set(x, "acquireTimeout", value.asInstanceOf[js.Any])
    
    inline def setAcquireTimeoutUndefined: Self = StObject.set(x, "acquireTimeout", js.undefined)
    
    inline def setConnectionLimit(value: Double): Self = StObject.set(x, "connectionLimit", value.asInstanceOf[js.Any])
    
    inline def setConnectionLimitUndefined: Self = StObject.set(x, "connectionLimit", js.undefined)
    
    inline def setQueueLimit(value: Double): Self = StObject.set(x, "queueLimit", value.asInstanceOf[js.Any])
    
    inline def setQueueLimitUndefined: Self = StObject.set(x, "queueLimit", js.undefined)
    
    inline def setWaitForConnections(value: Boolean): Self = StObject.set(x, "waitForConnections", value.asInstanceOf[js.Any])
    
    inline def setWaitForConnectionsUndefined: Self = StObject.set(x, "waitForConnections", js.undefined)
  }
}
