package typings.mysql2

import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.anon.Command
import typings.mysql2.connectionMod.^
import typings.mysql2.fieldPacketMod.FieldPacket
import typings.mysql2.mysql2Strings.acquire
import typings.mysql2.mysql2Strings.connection
import typings.mysql2.mysql2Strings.enqueue
import typings.mysql2.mysql2Strings.release
import typings.mysql2.mysqlMod.PoolCluster
import typings.mysql2.mysqlMod.Query
import typings.mysql2.okPacketMod.OkPacket
import typings.mysql2.poolClusterMod.PoolClusterOptions
import typings.mysql2.queryMod.QueryError
import typings.mysql2.queryMod.QueryOptions
import typings.mysql2.resultSetHeaderMod.ResultSetHeader
import typings.mysql2.rowDataPacketMod.RowDataPacket
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mysql2", "createConnection")
  @js.native
  def createConnection(config: ConnectionOptions): Connection = js.native
  @JSImport("mysql2", "createConnection")
  @js.native
  def createConnection(connectionUri: String): Connection = js.native
  
  @JSImport("mysql2", "createPool")
  @js.native
  def createPool(config: PoolOptions): Pool = js.native
  
  @JSImport("mysql2", "createPoolCluster")
  @js.native
  def createPoolCluster(): PoolCluster = js.native
  @JSImport("mysql2", "createPoolCluster")
  @js.native
  def createPoolCluster(config: PoolClusterOptions): PoolCluster = js.native
  
  @JSImport("mysql2", "escape")
  @js.native
  def escape(value: js.Any): String = js.native
  
  @JSImport("mysql2", "format")
  @js.native
  def format(sql: String): String = js.native
  @JSImport("mysql2", "format")
  @js.native
  def format(sql: String, values: js.Any): String = js.native
  @JSImport("mysql2", "format")
  @js.native
  def format(sql: String, values: js.Array[_]): String = js.native
  
  @js.native
  trait Connection extends ^ {
    
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      callback: js.Function3[
          /* err */ QueryError | Null, 
          /* result */ T, 
          /* fields */ js.UndefOr[js.Array[FieldPacket]], 
          _
        ]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Any): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[_]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Array[_],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[js.Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: StringDictionary[js.Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Array[_],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: StringDictionary[js.Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    
    def ping(): Unit = js.native
    def ping(callback: js.Function1[/* err */ QueryError | Null, _]): Unit = js.native
    
    def promise(): typings.mysql2.promiseMod.Connection = js.native
    def promise(promiseImpl: PromiseConstructor): typings.mysql2.promiseMod.Connection = js.native
  }
  
  @js.native
  trait ConnectionOptions
    extends typings.mysql2.connectionMod.ConnectionOptions {
    
    var Promise: js.UndefOr[js.Any] = js.native
    
    var authPlugins: js.UndefOr[StringDictionary[typings.mysql2.mod.authPlugins]] = js.native
    
    var authSwitchHandler: js.UndefOr[js.Function2[/* data */ js.Any, /* callback */ js.Function0[Unit], _]] = js.native
    
    var charsetNumber: js.UndefOr[Double] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var connectAttributes: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var connectionLimit: js.UndefOr[Double] = js.native
    
    var decimalNumbers: js.UndefOr[Boolean] = js.native
    
    var isServer: js.UndefOr[Boolean] = js.native
    
    var maxPreparedStatements: js.UndefOr[Double] = js.native
    
    var namedPlaceholders: js.UndefOr[Boolean] = js.native
    
    var nestTables: js.UndefOr[Boolean | String] = js.native
    
    var passwordSha1: js.UndefOr[String] = js.native
    
    var pool: js.UndefOr[js.Any] = js.native
    
    var queueLimit: js.UndefOr[Double] = js.native
    
    var rowsAsArray: js.UndefOr[Boolean] = js.native
    
    var stream: js.UndefOr[js.Any] = js.native
    
    var uri: js.UndefOr[String] = js.native
    
    var waitForConnections: js.UndefOr[Boolean] = js.native
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthPlugins(value: StringDictionary[authPlugins]): Self = StObject.set(x, "authPlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthPluginsUndefined: Self = StObject.set(x, "authPlugins", js.undefined)
      
      @scala.inline
      def setAuthSwitchHandler(value: (/* data */ js.Any, /* callback */ js.Function0[Unit]) => _): Self = StObject.set(x, "authSwitchHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuthSwitchHandlerUndefined: Self = StObject.set(x, "authSwitchHandler", js.undefined)
      
      @scala.inline
      def setCharsetNumber(value: Double): Self = StObject.set(x, "charsetNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetNumberUndefined: Self = StObject.set(x, "charsetNumber", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setConnectAttributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "connectAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectAttributesUndefined: Self = StObject.set(x, "connectAttributes", js.undefined)
      
      @scala.inline
      def setConnectionLimit(value: Double): Self = StObject.set(x, "connectionLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionLimitUndefined: Self = StObject.set(x, "connectionLimit", js.undefined)
      
      @scala.inline
      def setDecimalNumbers(value: Boolean): Self = StObject.set(x, "decimalNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalNumbersUndefined: Self = StObject.set(x, "decimalNumbers", js.undefined)
      
      @scala.inline
      def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsServerUndefined: Self = StObject.set(x, "isServer", js.undefined)
      
      @scala.inline
      def setMaxPreparedStatements(value: Double): Self = StObject.set(x, "maxPreparedStatements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPreparedStatementsUndefined: Self = StObject.set(x, "maxPreparedStatements", js.undefined)
      
      @scala.inline
      def setNamedPlaceholders(value: Boolean): Self = StObject.set(x, "namedPlaceholders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedPlaceholdersUndefined: Self = StObject.set(x, "namedPlaceholders", js.undefined)
      
      @scala.inline
      def setNestTables(value: Boolean | String): Self = StObject.set(x, "nestTables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestTablesUndefined: Self = StObject.set(x, "nestTables", js.undefined)
      
      @scala.inline
      def setPasswordSha1(value: String): Self = StObject.set(x, "passwordSha1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordSha1Undefined: Self = StObject.set(x, "passwordSha1", js.undefined)
      
      @scala.inline
      def setPool(value: js.Any): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setPromise(value: js.Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      @scala.inline
      def setQueueLimit(value: Double): Self = StObject.set(x, "queueLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueLimitUndefined: Self = StObject.set(x, "queueLimit", js.undefined)
      
      @scala.inline
      def setRowsAsArray(value: Boolean): Self = StObject.set(x, "rowsAsArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsAsArrayUndefined: Self = StObject.set(x, "rowsAsArray", js.undefined)
      
      @scala.inline
      def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def setWaitForConnections(value: Boolean): Self = StObject.set(x, "waitForConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForConnectionsUndefined: Self = StObject.set(x, "waitForConnections", js.undefined)
    }
  }
  
  @js.native
  trait Pool extends ^ {
    
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      callback: js.Function3[
          /* err */ QueryError | Null, 
          /* result */ T, 
          /* fields */ js.UndefOr[js.Array[FieldPacket]], 
          _
        ]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Any): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[_]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Array[_],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[js.Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: StringDictionary[js.Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Array[_],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: StringDictionary[js.Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    
    def getConnection(callback: js.Function2[/* err */ ErrnoException, /* connection */ PoolConnection, _]): Unit = js.native
    
    @JSName("on")
    def on_acquire(event: acquire, listener: js.Function1[/* connection */ PoolConnection, _]): this.type = js.native
    @JSName("on")
    def on_connection(event: connection, listener: js.Function1[/* connection */ PoolConnection, _]): this.type = js.native
    @JSName("on")
    def on_enqueue(event: enqueue, listener: js.Function0[_]): this.type = js.native
    @JSName("on")
    def on_release(event: release, listener: js.Function1[/* connection */ PoolConnection, _]): this.type = js.native
    
    def promise(): typings.mysql2.promiseMod.Pool = js.native
    def promise(promiseImpl: PromiseConstructor): typings.mysql2.promiseMod.Pool = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
  - typings.node.eventsMod.EventEmitter because Already inherited
  - typings.mysql2.connectionMod.Connection because Already inherited
  - typings.mysql2.connectionMod.^ because Already inherited
  - typings.mysql2.mod.Connection because var conflicts: config, threadId. Inlined execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, execute, ping, ping, promise, promise */ @js.native
  trait PoolConnection
    extends typings.mysql2.poolConnectionMod.^ {
    
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      callback: js.Function3[
          /* err */ QueryError | Null, 
          /* result */ T, 
          /* fields */ js.UndefOr[js.Array[FieldPacket]], 
          _
        ]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Any): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[_]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Array[_],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[js.Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: StringDictionary[js.Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Array[_],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): Query = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: StringDictionary[js.Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): Query = js.native
    
    def ping(): Unit = js.native
    def ping(callback: js.Function1[/* err */ QueryError | Null, _]): Unit = js.native
    
    def promise(): typings.mysql2.promiseMod.Connection = js.native
    def promise(promiseImpl: PromiseConstructor): typings.mysql2.promiseMod.Connection = js.native
    @JSName("promise")
    def promise_PoolConnection(): typings.mysql2.promiseMod.PoolConnection = js.native
    @JSName("promise")
    def promise_PoolConnection(promiseImpl: PromiseConstructor): typings.mysql2.promiseMod.PoolConnection = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mysql2.connectionMod.ConnectionOptions because Already inherited
  - typings.mysql2.mod.ConnectionOptions because var conflicts: bigNumberStrings, charset, connectTimeout, connectionLimit, database, dateStrings, debug, flags, host, insecureAuth, localAddress, multipleStatements, password, port, queryFormat, queueLimit, socketPath, ssl, stringifyObjects, supportBigNumbers, timezone, trace, typeCast, user, waitForConnections. Inlined charsetNumber, compress, authSwitchHandler, connectAttributes, decimalNumbers, isServer, maxPreparedStatements, namedPlaceholders, nestTables, passwordSha1, pool, rowsAsArray, stream, uri, Promise, authPlugins */ @js.native
  trait PoolOptions
    extends typings.mysql2.poolMod.PoolOptions {
    
    var Promise: js.UndefOr[js.Any] = js.native
    
    var authPlugins: js.UndefOr[StringDictionary[typings.mysql2.mod.authPlugins]] = js.native
    
    var authSwitchHandler: js.UndefOr[js.Function2[/* data */ js.Any, /* callback */ js.Function0[Unit], _]] = js.native
    
    var charsetNumber: js.UndefOr[Double] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var connectAttributes: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var decimalNumbers: js.UndefOr[Boolean] = js.native
    
    var isServer: js.UndefOr[Boolean] = js.native
    
    var maxPreparedStatements: js.UndefOr[Double] = js.native
    
    var namedPlaceholders: js.UndefOr[Boolean] = js.native
    
    var nestTables: js.UndefOr[Boolean | String] = js.native
    
    var passwordSha1: js.UndefOr[String] = js.native
    
    var pool: js.UndefOr[js.Any] = js.native
    
    var rowsAsArray: js.UndefOr[Boolean] = js.native
    
    var stream: js.UndefOr[js.Any] = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  object PoolOptions {
    
    @scala.inline
    def apply(): PoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoolOptions]
    }
    
    @scala.inline
    implicit class PoolOptionsMutableBuilder[Self <: PoolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthPlugins(value: StringDictionary[authPlugins]): Self = StObject.set(x, "authPlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthPluginsUndefined: Self = StObject.set(x, "authPlugins", js.undefined)
      
      @scala.inline
      def setAuthSwitchHandler(value: (/* data */ js.Any, /* callback */ js.Function0[Unit]) => _): Self = StObject.set(x, "authSwitchHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuthSwitchHandlerUndefined: Self = StObject.set(x, "authSwitchHandler", js.undefined)
      
      @scala.inline
      def setCharsetNumber(value: Double): Self = StObject.set(x, "charsetNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetNumberUndefined: Self = StObject.set(x, "charsetNumber", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setConnectAttributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "connectAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectAttributesUndefined: Self = StObject.set(x, "connectAttributes", js.undefined)
      
      @scala.inline
      def setDecimalNumbers(value: Boolean): Self = StObject.set(x, "decimalNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalNumbersUndefined: Self = StObject.set(x, "decimalNumbers", js.undefined)
      
      @scala.inline
      def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsServerUndefined: Self = StObject.set(x, "isServer", js.undefined)
      
      @scala.inline
      def setMaxPreparedStatements(value: Double): Self = StObject.set(x, "maxPreparedStatements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPreparedStatementsUndefined: Self = StObject.set(x, "maxPreparedStatements", js.undefined)
      
      @scala.inline
      def setNamedPlaceholders(value: Boolean): Self = StObject.set(x, "namedPlaceholders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedPlaceholdersUndefined: Self = StObject.set(x, "namedPlaceholders", js.undefined)
      
      @scala.inline
      def setNestTables(value: Boolean | String): Self = StObject.set(x, "nestTables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestTablesUndefined: Self = StObject.set(x, "nestTables", js.undefined)
      
      @scala.inline
      def setPasswordSha1(value: String): Self = StObject.set(x, "passwordSha1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordSha1Undefined: Self = StObject.set(x, "passwordSha1", js.undefined)
      
      @scala.inline
      def setPool(value: js.Any): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setPromise(value: js.Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      @scala.inline
      def setRowsAsArray(value: Boolean): Self = StObject.set(x, "rowsAsArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsAsArrayUndefined: Self = StObject.set(x, "rowsAsArray", js.undefined)
      
      @scala.inline
      def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  type authPlugins = js.Function1[
    /* pluginMetadata */ Command, 
    js.Function1[/* pluginData */ Buffer, js.Promise[String]]
  ]
}
