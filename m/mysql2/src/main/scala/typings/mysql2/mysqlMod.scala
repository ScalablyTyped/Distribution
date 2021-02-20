package typings.mysql2

import typings.mysql2.connectionMod.ConnectionOptions
import typings.mysql2.connectionMod.^
import typings.mysql2.poolClusterMod.PoolClusterOptions
import typings.mysql2.poolMod.PoolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mysqlMod {
  
  @JSImport("mysql2/typings/mysql", "createConnection")
  @js.native
  def createConnection(config: ConnectionOptions): Connection = js.native
  @JSImport("mysql2/typings/mysql", "createConnection")
  @js.native
  def createConnection(connectionUri: String): Connection = js.native
  
  @JSImport("mysql2/typings/mysql", "createPool")
  @js.native
  def createPool(config: PoolOptions): Pool = js.native
  
  @JSImport("mysql2/typings/mysql", "createPoolCluster")
  @js.native
  def createPoolCluster(): PoolCluster = js.native
  @JSImport("mysql2/typings/mysql", "createPoolCluster")
  @js.native
  def createPoolCluster(config: PoolClusterOptions): PoolCluster = js.native
  
  @JSImport("mysql2/typings/mysql", "escape")
  @js.native
  def escape(value: js.Any): String = js.native
  
  @JSImport("mysql2/typings/mysql", "format")
  @js.native
  def format(sql: String): String = js.native
  @JSImport("mysql2/typings/mysql", "format")
  @js.native
  def format(sql: String, values: js.Any): String = js.native
  @JSImport("mysql2/typings/mysql", "format")
  @js.native
  def format(sql: String, values: js.Array[_]): String = js.native
  
  type Connection = ^
  
  type Pool = typings.mysql2.poolMod.^
  
  type PoolCluster = typings.mysql2.poolClusterMod.^
  
  type PoolConnection = typings.mysql2.poolConnectionMod.^
  
  type Query = typings.mysql2.queryMod.^
}
