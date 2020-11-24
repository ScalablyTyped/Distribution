package typings.mysql2.poolClusterMod

import typings.mysql2.mysql2Strings.connection
import typings.mysql2.mysql2Strings.remove
import typings.node.NodeJS.ErrnoException
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolCluster extends EventEmitter {
  
  def add(config: PoolClusterOptions): Unit = js.native
  def add(group: String, config: PoolClusterOptions): Unit = js.native
  
  var config: PoolClusterOptions = js.native
  
  def end(): Unit = js.native
  
  def getConnection(
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* connection */ typings.mysql2.poolConnectionMod.^, 
      Unit
    ]
  ): Unit = js.native
  def getConnection(
    group: String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* connection */ typings.mysql2.poolConnectionMod.^, 
      Unit
    ]
  ): Unit = js.native
  def getConnection(
    group: String,
    selector: String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* connection */ typings.mysql2.poolConnectionMod.^, 
      Unit
    ]
  ): Unit = js.native
  
  def of(pattern: String): PoolCluster = js.native
  def of(pattern: String, selector: String): PoolCluster = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_connection(
    event: connection,
    listener: js.Function1[/* connection */ typings.mysql2.poolConnectionMod.^, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_remove(event: remove, listener: js.Function1[/* nodeId */ Double, Unit]): this.type = js.native
}
