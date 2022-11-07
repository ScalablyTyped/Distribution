package typings.mysql2

import typings.mysql2.mysql2Strings.connection
import typings.mysql2.mysql2Strings.remove
import typings.mysql2.typingsMysqlLibPoolMod.PoolOptions
import typings.node.NodeJS.ErrnoException
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMysqlLibPoolClusterMod {
  
  @JSImport("mysql2/typings/mysql/lib/PoolCluster", JSImport.Namespace)
  @js.native
  open class ^ () extends PoolCluster
  
  @js.native
  trait PoolCluster extends EventEmitter {
    
    def add(config: PoolOptions): Unit = js.native
    def add(group: String, config: PoolOptions): Unit = js.native
    
    var config: PoolClusterOptions = js.native
    
    def end(): Unit = js.native
    
    def getConnection(
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* connection */ typings.mysql2.typingsMysqlLibPoolConnectionMod.^, 
          Unit
        ]
    ): Unit = js.native
    def getConnection(
      group: String,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* connection */ typings.mysql2.typingsMysqlLibPoolConnectionMod.^, 
          Unit
        ]
    ): Unit = js.native
    def getConnection(
      group: String,
      selector: String,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* connection */ typings.mysql2.typingsMysqlLibPoolConnectionMod.^, 
          Unit
        ]
    ): Unit = js.native
    
    def of(pattern: String): PoolCluster = js.native
    def of(pattern: String, selector: String): PoolCluster = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_connection(
      event: connection,
      listener: js.Function1[/* connection */ typings.mysql2.typingsMysqlLibPoolConnectionMod.^, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_remove(event: remove, listener: js.Function1[/* nodeId */ Double, Unit]): this.type = js.native
  }
  
  trait PoolClusterOptions extends StObject {
    
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
  object PoolClusterOptions {
    
    inline def apply(): PoolClusterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoolClusterOptions]
    }
    
    extension [Self <: PoolClusterOptions](x: Self) {
      
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
}
