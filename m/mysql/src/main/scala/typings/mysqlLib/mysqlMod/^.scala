package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mysql", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createConnection(connectionUri: java.lang.String): mysqlLib.mysqlMod.Connection = js.native
  def createConnection(connectionUri: mysqlLib.mysqlMod.ConnectionConfig): mysqlLib.mysqlMod.Connection = js.native
  def createPool(config: java.lang.String): mysqlLib.mysqlMod.Pool = js.native
  def createPool(config: mysqlLib.mysqlMod.PoolConfig): mysqlLib.mysqlMod.Pool = js.native
  def createPoolCluster(): mysqlLib.mysqlMod.PoolCluster = js.native
  def createPoolCluster(config: mysqlLib.mysqlMod.PoolClusterConfig): mysqlLib.mysqlMod.PoolCluster = js.native
  def escape(value: js.Any): java.lang.String = js.native
  def escape(value: js.Any, stringifyObjects: scala.Boolean): java.lang.String = js.native
  def escape(value: js.Any, stringifyObjects: scala.Boolean, timeZone: java.lang.String): java.lang.String = js.native
  def escapeId(value: java.lang.String): java.lang.String = js.native
  def escapeId(value: java.lang.String, forbidQualified: scala.Boolean): java.lang.String = js.native
  def format(sql: java.lang.String, values: js.Array[_]): java.lang.String = js.native
  def format(sql: java.lang.String, values: js.Array[_], stringifyObjects: scala.Boolean): java.lang.String = js.native
  def format(
    sql: java.lang.String,
    values: js.Array[_],
    stringifyObjects: scala.Boolean,
    timeZone: java.lang.String
  ): java.lang.String = js.native
  def raw(sql: java.lang.String): js.Function0[java.lang.String] = js.native
}

