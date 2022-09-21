package typings.mysql.mod

import typings.mysql.mysqlBooleans.`false`
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolCluster extends EventEmitter {
  
  def add(config: PoolConfig): Unit = js.native
  def add(id: String, config: PoolConfig): Unit = js.native
  
  var config: PoolClusterConfig = js.native
  
  /**
    * Close the connection. Any queued data (eg queries) will be sent first. If
    * there are any fatal errors, the connection will be immediately closed.
    * @param callback Handler for any fatal error
    */
  def end(): Unit = js.native
  def end(callback: js.Function1[/* err */ MysqlError, Unit]): Unit = js.native
  
  def getConnection(callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, Unit]): Unit = js.native
  def getConnection(
    pattern: String,
    callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, Unit]
  ): Unit = js.native
  def getConnection(
    pattern: String,
    selector: String,
    callback: js.Function2[/* err */ MysqlError, /* connection */ PoolConnection, Unit]
  ): Unit = js.native
  
  def of(pattern: String): Pool = js.native
  def of(pattern: String, selector: String): Pool = js.native
  def of(pattern: Null, selector: String): Pool = js.native
  def of(pattern: Unit, selector: String): Pool = js.native
  @JSName("of")
  def of_false(pattern: `false`, selector: String): Pool = js.native
  
  /**
    * remove all pools which match pattern
    */
  def remove(pattern: String): Unit = js.native
}
