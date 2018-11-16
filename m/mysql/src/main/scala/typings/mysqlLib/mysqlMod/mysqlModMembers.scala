package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mysql", JSImport.Namespace)
@js.native
object mysqlModMembers extends js.Object {
  def createConnection(connectionUri: java.lang.String): Connection = js.native
  def createConnection(connectionUri: ConnectionConfig): Connection = js.native
  def createPool(config: java.lang.String): Pool = js.native
  def createPool(config: PoolConfig): Pool = js.native
  def createPoolCluster(): PoolCluster = js.native
  def createPoolCluster(config: PoolClusterConfig): PoolCluster = js.native
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

