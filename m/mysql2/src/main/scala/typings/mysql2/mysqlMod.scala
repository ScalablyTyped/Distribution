package typings.mysql2

import typings.mysql2.connectionMod.ConnectionOptions
import typings.mysql2.connectionMod.^
import typings.mysql2.poolClusterMod.PoolClusterOptions
import typings.mysql2.poolMod.PoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mysql2/typings/mysql", JSImport.Namespace)
@js.native
object mysqlMod extends js.Object {
  
  def createConnection(config: ConnectionOptions): Connection = js.native
  def createConnection(connectionUri: String): Connection = js.native
  
  def createPool(config: PoolOptions): Pool = js.native
  
  def createPoolCluster(): PoolCluster = js.native
  def createPoolCluster(config: PoolClusterOptions): PoolCluster = js.native
  
  def escape(value: js.Any): String = js.native
  
  def format(sql: String): String = js.native
  def format(sql: String, values: js.Any): String = js.native
  def format(sql: String, values: js.Array[_]): String = js.native
  
  type Connection = ^
  
  type Pool = typings.mysql2.poolMod.Pool
  
  type PoolCluster = typings.mysql2.poolClusterMod.PoolCluster
  
  type PoolConnection = typings.mysql2.poolConnectionMod.PoolConnection
  
  type Query = typings.mysql2.queryMod.Query
}
