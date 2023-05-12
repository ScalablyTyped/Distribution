package typings.mysql2

import typings.mysql2.anon.Command
import typings.mysql2.anon.JoinServerPublicKey
import typings.mysql2.anon.JonServerPublicKey
import typings.mysql2.anon.Password
import typings.mysql2.anon.PasswordSha1
import typings.mysql2.anon.ToSqlString
import typings.mysql2.typingsMysqlLibConnectionMod.ConnectionOptions
import typings.mysql2.typingsMysqlLibPoolClusterMod.PoolClusterOptions
import typings.mysql2.typingsMysqlLibPoolMod.PoolOptions
import typings.node.bufferMod.global.Buffer
import typings.std.PromiseConstructor
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
  
  object authPlugins {
    
    @JSImport("mysql2", "authPlugins")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cachingSha2Password(): AuthPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("caching_sha2_password")().asInstanceOf[AuthPlugin]
    inline def cachingSha2Password(pluginOptions: JonServerPublicKey): AuthPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("caching_sha2_password")(pluginOptions.asInstanceOf[js.Any]).asInstanceOf[AuthPlugin]
    
    @JSImport("mysql2", "authPlugins.caching_sha2_password")
    @js.native
    def cachingSha2Password_FauthPlugins: AuthPluginDefinition[JonServerPublicKey] = js.native
    
    inline def cachingSha2Password_FauthPlugins_=(x: AuthPluginDefinition[JonServerPublicKey]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("caching_sha2_password")(x.asInstanceOf[js.Any])
    
    inline def mysqlClearPassword(): AuthPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("mysql_clear_password")().asInstanceOf[AuthPlugin]
    inline def mysqlClearPassword(pluginOptions: Password): AuthPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("mysql_clear_password")(pluginOptions.asInstanceOf[js.Any]).asInstanceOf[AuthPlugin]
    
    @JSImport("mysql2", "authPlugins.mysql_clear_password")
    @js.native
    def mysqlClearPassword_FauthPlugins: AuthPluginDefinition[Password] = js.native
    
    inline def mysqlClearPassword_FauthPlugins_=(x: AuthPluginDefinition[Password]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mysql_clear_password")(x.asInstanceOf[js.Any])
    
    inline def mysqlNativePassword(): AuthPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("mysql_native_password")().asInstanceOf[AuthPlugin]
    inline def mysqlNativePassword(pluginOptions: PasswordSha1): AuthPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("mysql_native_password")(pluginOptions.asInstanceOf[js.Any]).asInstanceOf[AuthPlugin]
    
    @JSImport("mysql2", "authPlugins.mysql_native_password")
    @js.native
    def mysqlNativePassword_FauthPlugins: AuthPluginDefinition[PasswordSha1] = js.native
    
    inline def mysqlNativePassword_FauthPlugins_=(x: AuthPluginDefinition[PasswordSha1]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mysql_native_password")(x.asInstanceOf[js.Any])
    
    inline def sha256Password(): AuthPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256_password")().asInstanceOf[AuthPlugin]
    inline def sha256Password(pluginOptions: JoinServerPublicKey): AuthPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256_password")(pluginOptions.asInstanceOf[js.Any]).asInstanceOf[AuthPlugin]
    
    @JSImport("mysql2", "authPlugins.sha256_password")
    @js.native
    def sha256Password_FauthPlugins: AuthPluginDefinition[JoinServerPublicKey] = js.native
    
    inline def sha256Password_FauthPlugins_=(x: AuthPluginDefinition[JoinServerPublicKey]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256_password")(x.asInstanceOf[js.Any])
  }
  
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
  
  type AuthPlugin = js.Function1[
    /* pluginMetadata */ Command, 
    js.Function1[/* pluginData */ Buffer, (js.Promise[Buffer | String]) | String | Buffer | Null]
  ]
  
  type AuthPluginDefinition[T] = js.Function1[/* pluginOptions */ js.UndefOr[T], AuthPlugin]
  
  @js.native
  trait Connection
    extends typings.mysql2.typingsMysqlLibConnectionMod.^ {
    
    def promise(): Any = js.native
    def promise(promiseImpl: PromiseConstructor): Any = js.native
  }
  
  type Pool = typings.mysql2.typingsMysqlLibPoolMod.^
  
  type PoolCluster = typings.mysql2.typingsMysqlLibPoolClusterMod.^
  
  type PoolConnection = typings.mysql2.typingsMysqlLibPoolConnectionMod.^
  
  type Prepare = typings.mysql2.typingsMysqlLibProtocolSequencesPrepareMod.^
  
  type Query = typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^
}
