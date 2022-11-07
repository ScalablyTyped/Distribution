package typings.mysql2

import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.anon.Command
import typings.mysql2.mysql2Strings.acquire
import typings.mysql2.mysql2Strings.connection
import typings.mysql2.mysql2Strings.enqueue
import typings.mysql2.mysql2Strings.release
import typings.mysql2.typingsMysqlLibPoolClusterMod.PoolClusterOptions
import typings.mysql2.typingsMysqlLibProtocolPacketsFieldPacketMod.FieldPacket
import typings.mysql2.typingsMysqlLibProtocolPacketsOkPacketMod.OkPacket
import typings.mysql2.typingsMysqlLibProtocolPacketsResultSetHeaderMod.ResultSetHeader
import typings.mysql2.typingsMysqlLibProtocolPacketsRowDataPacketMod.RowDataPacket
import typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.QueryError
import typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.QueryOptions
import typings.mysql2.typingsMysqlMod.PoolCluster
import typings.mysql2.typingsMysqlMod.Query
import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mysql2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConnection(config: typings.mysql2.typingsMysqlLibConnectionMod.ConnectionOptions): typings.mysql2.typingsMysqlMod.Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(config.asInstanceOf[js.Any]).asInstanceOf[typings.mysql2.typingsMysqlMod.Connection]
  inline def createConnection(connectionUri: String): typings.mysql2.typingsMysqlMod.Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[typings.mysql2.typingsMysqlMod.Connection]
  
  inline def createPool(config: typings.mysql2.typingsMysqlLibPoolMod.PoolOptions): typings.mysql2.typingsMysqlMod.Pool = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(config.asInstanceOf[js.Any]).asInstanceOf[typings.mysql2.typingsMysqlMod.Pool]
  
  inline def createPoolCluster(): PoolCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")().asInstanceOf[PoolCluster]
  inline def createPoolCluster(config: PoolClusterOptions): PoolCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")(config.asInstanceOf[js.Any]).asInstanceOf[PoolCluster]
  
  inline def escape(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def format(sql: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(sql: String, values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, values: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait Connection
    extends typings.mysql2.typingsMysqlLibConnectionMod.^ {
    
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      callback: js.Function3[
          /* err */ QueryError | Null, 
          /* result */ T, 
          /* fields */ js.UndefOr[js.Array[FieldPacket]], 
          Any
        ]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Array[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: StringDictionary[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: Any): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Array[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: StringDictionary[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: Any): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    
    def ping(): Unit = js.native
    def ping(callback: js.Function1[/* err */ QueryError | Null, Any]): Unit = js.native
    
    def promise(): typings.mysql2.typingsMysqlMod.Connection = js.native
    def promise(promiseImpl: PromiseConstructor): typings.mysql2.typingsMysqlMod.Connection = js.native
  }
  
  trait ConnectionOptions
    extends StObject
       with typings.mysql2.typingsMysqlLibConnectionMod.ConnectionOptions {
    
    var Promise: js.UndefOr[Any] = js.undefined
    
    var authPlugins: js.UndefOr[StringDictionary[typings.mysql2.mod.authPlugins]] = js.undefined
    
    var authSwitchHandler: js.UndefOr[js.Function2[/* data */ Any, /* callback */ js.Function0[Unit], Any]] = js.undefined
    
    var charsetNumber: js.UndefOr[Double] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var connectAttributes: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var connectionLimit: js.UndefOr[Double] = js.undefined
    
    var decimalNumbers: js.UndefOr[Boolean] = js.undefined
    
    var isServer: js.UndefOr[Boolean] = js.undefined
    
    var maxPreparedStatements: js.UndefOr[Double] = js.undefined
    
    var namedPlaceholders: js.UndefOr[Boolean] = js.undefined
    
    var nestTables: js.UndefOr[Boolean | String] = js.undefined
    
    var passwordSha1: js.UndefOr[String] = js.undefined
    
    var pool: js.UndefOr[Any] = js.undefined
    
    var queueLimit: js.UndefOr[Double] = js.undefined
    
    var stream: js.UndefOr[Any] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
    
    var waitForConnections: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectionOptions {
    
    inline def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    extension [Self <: ConnectionOptions](x: Self) {
      
      inline def setAuthPlugins(value: StringDictionary[authPlugins]): Self = StObject.set(x, "authPlugins", value.asInstanceOf[js.Any])
      
      inline def setAuthPluginsUndefined: Self = StObject.set(x, "authPlugins", js.undefined)
      
      inline def setAuthSwitchHandler(value: (/* data */ Any, /* callback */ js.Function0[Unit]) => Any): Self = StObject.set(x, "authSwitchHandler", js.Any.fromFunction2(value))
      
      inline def setAuthSwitchHandlerUndefined: Self = StObject.set(x, "authSwitchHandler", js.undefined)
      
      inline def setCharsetNumber(value: Double): Self = StObject.set(x, "charsetNumber", value.asInstanceOf[js.Any])
      
      inline def setCharsetNumberUndefined: Self = StObject.set(x, "charsetNumber", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setConnectAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "connectAttributes", value.asInstanceOf[js.Any])
      
      inline def setConnectAttributesUndefined: Self = StObject.set(x, "connectAttributes", js.undefined)
      
      inline def setConnectionLimit(value: Double): Self = StObject.set(x, "connectionLimit", value.asInstanceOf[js.Any])
      
      inline def setConnectionLimitUndefined: Self = StObject.set(x, "connectionLimit", js.undefined)
      
      inline def setDecimalNumbers(value: Boolean): Self = StObject.set(x, "decimalNumbers", value.asInstanceOf[js.Any])
      
      inline def setDecimalNumbersUndefined: Self = StObject.set(x, "decimalNumbers", js.undefined)
      
      inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      inline def setIsServerUndefined: Self = StObject.set(x, "isServer", js.undefined)
      
      inline def setMaxPreparedStatements(value: Double): Self = StObject.set(x, "maxPreparedStatements", value.asInstanceOf[js.Any])
      
      inline def setMaxPreparedStatementsUndefined: Self = StObject.set(x, "maxPreparedStatements", js.undefined)
      
      inline def setNamedPlaceholders(value: Boolean): Self = StObject.set(x, "namedPlaceholders", value.asInstanceOf[js.Any])
      
      inline def setNamedPlaceholdersUndefined: Self = StObject.set(x, "namedPlaceholders", js.undefined)
      
      inline def setNestTables(value: Boolean | String): Self = StObject.set(x, "nestTables", value.asInstanceOf[js.Any])
      
      inline def setNestTablesUndefined: Self = StObject.set(x, "nestTables", js.undefined)
      
      inline def setPasswordSha1(value: String): Self = StObject.set(x, "passwordSha1", value.asInstanceOf[js.Any])
      
      inline def setPasswordSha1Undefined: Self = StObject.set(x, "passwordSha1", js.undefined)
      
      inline def setPool(value: Any): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      inline def setPromise(value: Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def setQueueLimit(value: Double): Self = StObject.set(x, "queueLimit", value.asInstanceOf[js.Any])
      
      inline def setQueueLimitUndefined: Self = StObject.set(x, "queueLimit", js.undefined)
      
      inline def setStream(value: Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setWaitForConnections(value: Boolean): Self = StObject.set(x, "waitForConnections", value.asInstanceOf[js.Any])
      
      inline def setWaitForConnectionsUndefined: Self = StObject.set(x, "waitForConnections", js.undefined)
    }
  }
  
  @js.native
  trait Pool
    extends typings.mysql2.typingsMysqlLibConnectionMod.^ {
    
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      callback: js.Function3[
          /* err */ QueryError | Null, 
          /* result */ T, 
          /* fields */ js.UndefOr[js.Array[FieldPacket]], 
          Any
        ]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Array[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: StringDictionary[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: Any): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Array[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: StringDictionary[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: Any): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): Query = js.native
    
    def getConnection(
      callback: js.Function2[
          /* err */ ErrnoException, 
          /* connection */ typings.mysql2.typingsMysqlMod.PoolConnection, 
          Any
        ]
    ): Unit = js.native
    
    @JSName("on")
    def on_acquire(
      event: acquire,
      listener: js.Function1[/* connection */ typings.mysql2.typingsMysqlMod.PoolConnection, Any]
    ): this.type = js.native
    @JSName("on")
    def on_connection(
      event: connection,
      listener: js.Function1[/* connection */ typings.mysql2.typingsMysqlMod.PoolConnection, Any]
    ): this.type = js.native
    @JSName("on")
    def on_enqueue(event: enqueue, listener: js.Function0[Any]): this.type = js.native
    @JSName("on")
    def on_release(
      event: release,
      listener: js.Function1[/* connection */ typings.mysql2.typingsMysqlMod.PoolConnection, Any]
    ): this.type = js.native
    
    def promise(): typings.mysql2.typingsMysqlMod.Pool = js.native
    def promise(promiseImpl: PromiseConstructor): typings.mysql2.typingsMysqlMod.Pool = js.native
  }
  
  @js.native
  trait PoolConnection
    extends typings.mysql2.typingsMysqlLibPoolConnectionMod.^ {
    
    def promise(): typings.mysql2.typingsMysqlMod.PoolConnection = js.native
    def promise(promiseImpl: PromiseConstructor): typings.mysql2.typingsMysqlMod.PoolConnection = js.native
  }
  
  trait PoolOptions
    extends StObject
       with typings.mysql2.typingsMysqlLibPoolMod.PoolOptions
  object PoolOptions {
    
    inline def apply(): PoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoolOptions]
    }
  }
  
  type authPlugins = js.Function1[
    /* pluginMetadata */ Command, 
    js.Function1[/* pluginData */ Buffer, (js.Promise[Buffer | String]) | String | Buffer | Null]
  ]
}
