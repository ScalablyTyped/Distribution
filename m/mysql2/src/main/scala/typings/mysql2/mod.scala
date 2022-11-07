package typings.mysql2

import typings.mysql2.anon.ToSqlString
import typings.mysql2.typingsMysqlLibConnectionMod.ConnectionOptions
import typings.mysql2.typingsMysqlLibPoolClusterMod.PoolClusterOptions
import typings.mysql2.typingsMysqlLibPoolMod.PoolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mysql2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mysql2", "PrepareStatementInfo")
  @js.native
  open class PrepareStatementInfo ()
    extends typings.mysql2.typingsMysqlLibProtocolSequencesPrepareMod.PrepareStatementInfo
  
  inline def createConnection(config: ConnectionOptions): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(config.asInstanceOf[js.Any]).asInstanceOf[Connection]
  inline def createConnection(connectionUri: String): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  inline def createPool(config: PoolOptions): typings.mysql2.typingsMysqlLibPoolMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(config.asInstanceOf[js.Any]).asInstanceOf[typings.mysql2.typingsMysqlLibPoolMod.^]
  
  inline def createPoolCluster(): PoolCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")().asInstanceOf[PoolCluster]
  inline def createPoolCluster(config: PoolClusterOptions): PoolCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")(config.asInstanceOf[js.Any]).asInstanceOf[PoolCluster]
  
  inline def createServer(handler: js.Function1[/* conn */ typings.mysql2.typingsMysqlLibConnectionMod.^, Any]): typings.mysql2.typingsMysqlLibServerMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(handler.asInstanceOf[js.Any]).asInstanceOf[typings.mysql2.typingsMysqlLibServerMod.^]
  
  inline def escape(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeId(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeId")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def format(sql: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(sql: String, values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, values: js.Array[Any], stringifyObjects: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, values: js.Array[Any], stringifyObjects: Boolean, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, values: js.Array[Any], stringifyObjects: Unit, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, values: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, values: Any, stringifyObjects: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, values: Any, stringifyObjects: Boolean, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, values: Any, stringifyObjects: Unit, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def raw(sql: String): ToSqlString = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(sql.asInstanceOf[js.Any]).asInstanceOf[ToSqlString]
  
  type Connection = typings.mysql2.typingsMysqlLibConnectionMod.^
  
  type Pool = typings.mysql2.typingsMysqlLibPoolMod.^
  
  type PoolCluster = typings.mysql2.typingsMysqlLibPoolClusterMod.^
  
  type PoolConnection = typings.mysql2.typingsMysqlLibPoolConnectionMod.^
  
  type Prepare = typings.mysql2.typingsMysqlLibProtocolSequencesPrepareMod.^
  
  type Query = typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^
}
