package typings.mysql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TypeCast = scala.Boolean | (js.Function2[
    /* field */ typings.mysql.anon.UntypedFieldInfotypestrin, 
    /* next */ js.Function0[scala.Unit], 
    js.Any
  ])
  
  @scala.inline
  def createConnection(connectionUri: java.lang.String): typings.mysql.mod.Connection = typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[typings.mysql.mod.Connection]
  @scala.inline
  def createConnection(connectionUri: typings.mysql.mod.ConnectionConfig): typings.mysql.mod.Connection = typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[typings.mysql.mod.Connection]
  
  @scala.inline
  def createPool(config: java.lang.String): typings.mysql.mod.Pool = typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(config.asInstanceOf[js.Any]).asInstanceOf[typings.mysql.mod.Pool]
  @scala.inline
  def createPool(config: typings.mysql.mod.PoolConfig): typings.mysql.mod.Pool = typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(config.asInstanceOf[js.Any]).asInstanceOf[typings.mysql.mod.Pool]
  
  @scala.inline
  def createPoolCluster(): typings.mysql.mod.PoolCluster = typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")().asInstanceOf[typings.mysql.mod.PoolCluster]
  @scala.inline
  def createPoolCluster(config: typings.mysql.mod.PoolClusterConfig): typings.mysql.mod.PoolCluster = typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")(config.asInstanceOf[js.Any]).asInstanceOf[typings.mysql.mod.PoolCluster]
  
  @scala.inline
  def escape(value: js.Any): java.lang.String = typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def escape(value: js.Any, stringifyObjects: js.UndefOr[scala.Nothing], timeZone: java.lang.String): java.lang.String = (typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def escape(value: js.Any, stringifyObjects: scala.Boolean): java.lang.String = (typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def escape(value: js.Any, stringifyObjects: scala.Boolean, timeZone: java.lang.String): java.lang.String = (typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def escapeId(value: java.lang.String): java.lang.String = typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escapeId")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def escapeId(value: java.lang.String, forbidQualified: scala.Boolean): java.lang.String = (typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escapeId")(value.asInstanceOf[js.Any], forbidQualified.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def format(sql: java.lang.String, values: js.Array[_]): java.lang.String = (typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(
    sql: java.lang.String,
    values: js.Array[_],
    stringifyObjects: js.UndefOr[scala.Nothing],
    timeZone: java.lang.String
  ): java.lang.String = (typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(sql: java.lang.String, values: js.Array[_], stringifyObjects: scala.Boolean): java.lang.String = (typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(
    sql: java.lang.String,
    values: js.Array[_],
    stringifyObjects: scala.Boolean,
    timeZone: java.lang.String
  ): java.lang.String = (typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  type packetCallback = js.Function1[/* packet */ js.Any, scala.Unit]
  
  type queryCallback = js.Function3[
    /* err */ typings.mysql.mod.MysqlError | scala.Null, 
    /* results */ js.UndefOr[js.Any], 
    /* fields */ js.UndefOr[js.Array[typings.mysql.mod.FieldInfo]], 
    scala.Unit
  ]
  
  @scala.inline
  def raw(sql: java.lang.String): typings.mysql.anon.ToSqlString = typings.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("raw")(sql.asInstanceOf[js.Any]).asInstanceOf[typings.mysql.anon.ToSqlString]
}
