package typings.mysql.mod

import typings.mysql.anon.ToSqlString
import typings.mysql.anon.UntypedFieldInfotypestrin
import typings.mysql.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createConnection(connectionUri: String): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[Connection]
inline def createConnection(connectionUri: ConnectionConfig): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[Connection]

inline def createPool(config: String): Pool = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(config.asInstanceOf[js.Any]).asInstanceOf[Pool]
inline def createPool(config: PoolConfig): Pool = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(config.asInstanceOf[js.Any]).asInstanceOf[Pool]

inline def createPoolCluster(): PoolCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")().asInstanceOf[PoolCluster]
inline def createPoolCluster(config: PoolClusterConfig): PoolCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")(config.asInstanceOf[js.Any]).asInstanceOf[PoolCluster]

inline def escape(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
inline def escape(value: Any, stringifyObjects: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[String]
inline def escape(value: Any, stringifyObjects: Boolean, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
inline def escape(value: Any, stringifyObjects: Unit, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]

inline def escapeId(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeId")(value.asInstanceOf[js.Any]).asInstanceOf[String]
inline def escapeId(value: String, forbidQualified: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escapeId")(value.asInstanceOf[js.Any], forbidQualified.asInstanceOf[js.Any])).asInstanceOf[String]

inline def format(sql: String, values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
inline def format(sql: String, values: js.Array[Any], stringifyObjects: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[String]
inline def format(sql: String, values: js.Array[Any], stringifyObjects: Boolean, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
inline def format(sql: String, values: js.Array[Any], stringifyObjects: Unit, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]

inline def raw(sql: String): ToSqlString = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(sql.asInstanceOf[js.Any]).asInstanceOf[ToSqlString]

type TypeCast = Boolean | (js.Function2[/* field */ UntypedFieldInfotypestrin, /* next */ js.Function0[Unit], Any])

type packetCallback = js.Function1[/* packet */ Any, Unit]

type queryCallback = js.Function3[
/* err */ MysqlError | Null, 
/* results */ js.UndefOr[Any], 
/* fields */ js.UndefOr[js.Array[FieldInfo]], 
Unit]
