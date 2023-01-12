package typings.mysql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolClusterConfig extends StObject {
  
  /**
    * If true, PoolCluster will attempt to reconnect when connection fails. (Default: true)
    */
  var canRetry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default selector. (Default: RR)
    * RR: Select one alternately. (Round-Robin)
    * RANDOM: Select the node by random function.
    * ORDER: Select the first node available unconditionally.
    */
  var defaultSelector: js.UndefOr[String] = js.undefined
  
  /**
    * If connection fails, node's errorCount increases. When errorCount is greater than removeNodeErrorCount,
    * remove a node in the PoolCluster. (Default: 5)
    */
  var removeNodeErrorCount: js.UndefOr[Double] = js.undefined
  
  /**
    * If connection fails, specifies the number of milliseconds before another connection attempt will be made.
    * If set to 0, then node will be removed instead and never re-used. (Default: 0)
    */
  var restoreNodeTimeout: js.UndefOr[Double] = js.undefined
}
object PoolClusterConfig {
  
  inline def apply(): PoolClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolClusterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PoolClusterConfig] (val x: Self) extends AnyVal {
    
    inline def setCanRetry(value: Boolean): Self = StObject.set(x, "canRetry", value.asInstanceOf[js.Any])
    
    inline def setCanRetryUndefined: Self = StObject.set(x, "canRetry", js.undefined)
    
    inline def setDefaultSelector(value: String): Self = StObject.set(x, "defaultSelector", value.asInstanceOf[js.Any])
    
    inline def setDefaultSelectorUndefined: Self = StObject.set(x, "defaultSelector", js.undefined)
    
    inline def setRemoveNodeErrorCount(value: Double): Self = StObject.set(x, "removeNodeErrorCount", value.asInstanceOf[js.Any])
    
    inline def setRemoveNodeErrorCountUndefined: Self = StObject.set(x, "removeNodeErrorCount", js.undefined)
    
    inline def setRestoreNodeTimeout(value: Double): Self = StObject.set(x, "restoreNodeTimeout", value.asInstanceOf[js.Any])
    
    inline def setRestoreNodeTimeoutUndefined: Self = StObject.set(x, "restoreNodeTimeout", js.undefined)
  }
}
