package typings.mysql2

import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.mysql2Strings.DATE
import typings.mysql2.mysql2Strings.DATETIME
import typings.mysql2.mysql2Strings.TIMESTAMP
import typings.mysql2.mysql2Strings.local
import typings.mysql2.typingsMysqlLibProtocolPacketsFieldPacketMod.FieldPacket
import typings.mysql2.typingsMysqlLibProtocolPacketsOkPacketMod.OkPacket
import typings.mysql2.typingsMysqlLibProtocolPacketsResultSetHeaderMod.ResultSetHeader
import typings.mysql2.typingsMysqlLibProtocolPacketsRowDataPacketMod.RowDataPacket
import typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.QueryError
import typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.QueryOptions
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMysqlLibConnectionMod {
  
  @JSImport("mysql2/typings/mysql/lib/Connection", JSImport.Namespace)
  @js.native
  open class ^ () extends Connection
  @JSImport("mysql2/typings/mysql/lib/Connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createQuery")(sql.asInstanceOf[js.Any]).asInstanceOf[typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^]
  inline def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
  ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createQuery")(sql.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^]
  inline def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createQuery")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^]
  inline def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: js.Array[Any],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
  ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createQuery")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^]
  inline def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createQuery")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^]
  inline def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: StringDictionary[Any],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
  ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createQuery")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^]
  /* static member */
  inline def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: Any): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createQuery")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^]
  inline def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: Any,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
  ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createQuery")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^]
  
  @js.native
  trait Connection extends EventEmitter {
    
    var authorized: Boolean = js.native
    
    def beginTransaction(callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
    
    def changeUser(options: ConnectionOptions): Unit = js.native
    def changeUser(options: ConnectionOptions, callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
    
    def commit(): Unit = js.native
    def commit(callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
    
    var config: ConnectionOptions = js.native
    
    def connect(): Unit = js.native
    def connect(callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def end(): Unit = js.native
    def end(callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
    def end(options: Any): Unit = js.native
    def end(options: Any, callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
    
    def escape(value: Any): String = js.native
    
    def escapeId(value: String): String = js.native
    def escapeId(values: js.Array[String]): String = js.native
    
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      callback: js.Function3[
          /* err */ QueryError | Null, 
          /* result */ T, 
          /* fields */ js.UndefOr[js.Array[FieldPacket]], 
          Any
        ]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Array[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: StringDictionary[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: Any): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Array[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: StringDictionary[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: Any): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def execute[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    
    def format(sql: String): String = js.native
    def format(sql: String, values: js.Array[Any]): String = js.native
    def format(sql: String, values: StringDictionary[Any]): String = js.native
    def format(sql: String, values: Any): String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    
    def pause(): Unit = js.native
    
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      callback: js.Function3[
          /* err */ QueryError | Null, 
          /* result */ T, 
          /* fields */ js.UndefOr[js.Array[FieldPacket]], 
          Any
        ]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Array[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: StringDictionary[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: Any): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Array[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[Any]): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: StringDictionary[Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: Any): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], Any]
    ): typings.mysql2.typingsMysqlLibProtocolSequencesQueryMod.^ = js.native
    
    def resume(): Unit = js.native
    
    def rollback(callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
    
    def serverHandshake(args: Any): Any = js.native
    
    var threadId: Double = js.native
    
    def unprepare(sql: String): Any = js.native
  }
  
  trait ConnectionOptions extends StObject {
    
    /**
      * Enabling both supportBigNumbers and bigNumberStrings forces big numbers (BIGINT and DECIMAL columns) to be
      * always returned as JavaScript String objects (Default: false). Enabling supportBigNumbers but leaving
      * bigNumberStrings disabled will return big numbers as String objects only when they cannot be accurately
      * represented with [JavaScript Number objects](https://262.ecma-international.org/5.1/#sec-8.5)
      * (which happens when they exceed the [-2^53, +2^53] range), otherwise they will be returned as Number objects.
      * This option is ignored if supportBigNumbers is disabled.
      */
    var bigNumberStrings: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The charset for the connection. This is called 'collation' in the SQL-level of MySQL (like utf8_general_ci).
      * If a SQL-level charset is specified (like utf8mb4) then the default collation for that charset is used.
      * (Default: 'UTF8_GENERAL_CI')
      */
    var charset: js.UndefOr[String] = js.undefined
    
    /**
      * The milliseconds before a timeout occurs during the initial connection to the MySQL server. (Default: 10 seconds)
      */
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Name of the database to use for this connection
      */
    var database: js.UndefOr[String] = js.undefined
    
    /**
      * Force date types (TIMESTAMP, DATETIME, DATE) to be returned as strings rather then inflated into JavaScript Date
      * objects. Can be true/false or an array of type names to keep as strings.
      *
      * (Default: false)
      */
    var dateStrings: js.UndefOr[Boolean | (js.Array[TIMESTAMP | DATETIME | DATE])] = js.undefined
    
    /**
      * This will print all incoming and outgoing packets on stdout.
      * You can also restrict debugging to packet types by passing an array of types (strings) to debug;
      *
      * (Default: false)
      */
    var debug: js.UndefOr[Any] = js.undefined
    
    /**
      * DECIMAL and NEWDECIMAL types will be returned as numbers if this option is set to `true` ( default: `false`).
      */
    var decimalNumbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * List of connection flags to use other than the default ones. It is also possible to blacklist default ones
      */
    var flags: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The hostname of the database you are connecting to. (Default: localhost)
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Allow connecting to MySQL instances that ask for the old (insecure) authentication method. (Default: false)
      */
    var insecureAuth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The source IP address to use for TCP connection
      */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /**
      * Allow multiple mysql statements per query. Be careful with this, it exposes you to SQL injection attacks. (Default: false)
      */
    var multipleStatements: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The password of that MySQL user
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * Alias for the MySQL user password. Makes a bit more sense in a multifactor authentication setup (see
      * "password2" and "password3")
      */
    var password1: js.UndefOr[String] = js.undefined
    
    /**
      * 2nd factor authentication password. Mandatory when the authentication policy for the MySQL user account
      * requires an additional authentication method that needs a password.
      * https://dev.mysql.com/doc/refman/8.0/en/multifactor-authentication.html
      */
    var password2: js.UndefOr[String] = js.undefined
    
    /**
      * 3rd factor authentication password. Mandatory when the authentication policy for the MySQL user account
      * requires two additional authentication methods and the last one needs a password.
      * https://dev.mysql.com/doc/refman/8.0/en/multifactor-authentication.html
      */
    var password3: js.UndefOr[String] = js.undefined
    
    /**
      * The port number to connect to. (Default: 3306)
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * A custom query format function
      */
    var queryFormat: js.UndefOr[js.Function2[/* query */ String, /* values */ Any, Unit]] = js.undefined
    
    /**
      * Return each row as an array, not as an object.
      * This is useful when you have duplicate column names.
      * This can also be set in the `QueryOption` object to be applied per-query.
      */
    var rowsAsArray: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The path to a unix domain socket to connect to. When used host and port are ignored
      */
    var socketPath: js.UndefOr[String] = js.undefined
    
    /**
      * object with ssl parameters or a string containing name of ssl profile
      */
    var ssl: js.UndefOr[String | SslOptions] = js.undefined
    
    /**
      * Stringify objects instead of converting to values. (Default: 'false')
      */
    var stringifyObjects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When dealing with big numbers (BIGINT and DECIMAL columns) in the database, you should enable this option
      * (Default: false)
      */
    var supportBigNumbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The timezone used to store local dates. (Default: 'local')
      */
    var timezone: js.UndefOr[String | local] = js.undefined
    
    /**
      * Generates stack traces on Error to include call site of library entrance ('long stack traces'). Slight
      * performance penalty for most calls. (Default: true)
      */
    var trace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines if column values should be converted to native JavaScript types. It is not recommended (and may go away / change in the future)
      * to disable type casting, but you can currently do so on either the connection or query level. (Default: true)
      *
      * You can also specify a function (field: any, next: () => void) => {} to do the type casting yourself.
      *
      * WARNING: YOU MUST INVOKE the parser using one of these three field functions in your custom typeCast callback. They can only be called once.
      *
      * field.string()
      * field.buffer()
      * field.geometry()
      *
      * are aliases for
      *
      * parser.parseLengthCodedString()
      * parser.parseLengthCodedBuffer()
      * parser.parseGeometryValue()
      *
      * You can find which field function you need to use by looking at: RowDataPacket.prototype._typeCast
      */
    var typeCast: js.UndefOr[Boolean | (js.Function2[/* field */ Any, /* next */ js.Function0[Unit], Any])] = js.undefined
    
    /**
      * The MySQL user to authenticate as
      */
    var user: js.UndefOr[String] = js.undefined
  }
  object ConnectionOptions {
    
    inline def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      inline def setBigNumberStrings(value: Boolean): Self = StObject.set(x, "bigNumberStrings", value.asInstanceOf[js.Any])
      
      inline def setBigNumberStringsUndefined: Self = StObject.set(x, "bigNumberStrings", js.undefined)
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setDateStrings(value: Boolean | (js.Array[TIMESTAMP | DATETIME | DATE])): Self = StObject.set(x, "dateStrings", value.asInstanceOf[js.Any])
      
      inline def setDateStringsUndefined: Self = StObject.set(x, "dateStrings", js.undefined)
      
      inline def setDateStringsVarargs(value: (TIMESTAMP | DATETIME | DATE)*): Self = StObject.set(x, "dateStrings", js.Array(value*))
      
      inline def setDebug(value: Any): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDecimalNumbers(value: Boolean): Self = StObject.set(x, "decimalNumbers", value.asInstanceOf[js.Any])
      
      inline def setDecimalNumbersUndefined: Self = StObject.set(x, "decimalNumbers", js.undefined)
      
      inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setInsecureAuth(value: Boolean): Self = StObject.set(x, "insecureAuth", value.asInstanceOf[js.Any])
      
      inline def setInsecureAuthUndefined: Self = StObject.set(x, "insecureAuth", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setMultipleStatements(value: Boolean): Self = StObject.set(x, "multipleStatements", value.asInstanceOf[js.Any])
      
      inline def setMultipleStatementsUndefined: Self = StObject.set(x, "multipleStatements", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPassword1(value: String): Self = StObject.set(x, "password1", value.asInstanceOf[js.Any])
      
      inline def setPassword1Undefined: Self = StObject.set(x, "password1", js.undefined)
      
      inline def setPassword2(value: String): Self = StObject.set(x, "password2", value.asInstanceOf[js.Any])
      
      inline def setPassword2Undefined: Self = StObject.set(x, "password2", js.undefined)
      
      inline def setPassword3(value: String): Self = StObject.set(x, "password3", value.asInstanceOf[js.Any])
      
      inline def setPassword3Undefined: Self = StObject.set(x, "password3", js.undefined)
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQueryFormat(value: (/* query */ String, /* values */ Any) => Unit): Self = StObject.set(x, "queryFormat", js.Any.fromFunction2(value))
      
      inline def setQueryFormatUndefined: Self = StObject.set(x, "queryFormat", js.undefined)
      
      inline def setRowsAsArray(value: Boolean): Self = StObject.set(x, "rowsAsArray", value.asInstanceOf[js.Any])
      
      inline def setRowsAsArrayUndefined: Self = StObject.set(x, "rowsAsArray", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setSsl(value: String | SslOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setStringifyObjects(value: Boolean): Self = StObject.set(x, "stringifyObjects", value.asInstanceOf[js.Any])
      
      inline def setStringifyObjectsUndefined: Self = StObject.set(x, "stringifyObjects", js.undefined)
      
      inline def setSupportBigNumbers(value: Boolean): Self = StObject.set(x, "supportBigNumbers", value.asInstanceOf[js.Any])
      
      inline def setSupportBigNumbersUndefined: Self = StObject.set(x, "supportBigNumbers", js.undefined)
      
      inline def setTimezone(value: String | local): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      inline def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setTypeCast(value: Boolean | (js.Function2[/* field */ Any, /* next */ js.Function0[Unit], Any])): Self = StObject.set(x, "typeCast", value.asInstanceOf[js.Any])
      
      inline def setTypeCastFunction2(value: (/* field */ Any, /* next */ js.Function0[Unit]) => Any): Self = StObject.set(x, "typeCast", js.Any.fromFunction2(value))
      
      inline def setTypeCastUndefined: Self = StObject.set(x, "typeCast", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait SslOptions extends StObject {
    
    /**
      * Either a string/Buffer or list of strings/Buffers of PEM encoded CA certificates to trust.
      */
    var ca: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    /**
      * A string/buffer or list of strings/Buffers holding the PEM encoded certificate(s)
      */
    var cert: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    /**
      * A string describing the ciphers to use or exclude
      */
    var ciphers: js.UndefOr[String] = js.undefined
    
    /**
      * Either a string or list of strings of PEM encoded CRLs (Certificate Revocation List)
      */
    var crl: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Either a string/buffer or list of strings/Buffers holding the PEM encoded private key(s) to use
      */
    var key: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    /**
    	 * Configure the maximum supported version of SSL, the default is TLSv1.3.
      */
    var maxVersion: js.UndefOr[String] = js.undefined
    
    /**
      * Configure the minimum supported version of SSL, the default is TLSv1.2.
      */
    var minVersion: js.UndefOr[String] = js.undefined
    
    /**
      * A string of passphrase for the private key or pfx
      */
    var passphrase: js.UndefOr[String] = js.undefined
    
    /**
      * A string or buffer holding the PFX or PKCS12 encoded private key, certificate and CA certificates
      */
    var pfx: js.UndefOr[String] = js.undefined
    
    /**
      * You can also connect to a MySQL server without properly providing the appropriate CA to trust. You should not do this.
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You can verify the server name identity presented on the server certificate when connecting to a MySQL server.
      * You should enable this but it is disabled by default right now for backwards compatibility.
      */
    var verifyIdentity: js.UndefOr[Boolean] = js.undefined
  }
  object SslOptions {
    
    inline def apply(): SslOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SslOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SslOptions] (val x: Self) extends AnyVal {
      
      inline def setCa(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (Buffer | String)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setCrl(value: String | js.Array[String]): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      inline def setCrlVarargs(value: String*): Self = StObject.set(x, "crl", js.Array(value*))
      
      inline def setKey(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (Buffer | String)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setMaxVersion(value: String): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      inline def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      inline def setMinVersion(value: String): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setVerifyIdentity(value: Boolean): Self = StObject.set(x, "verifyIdentity", value.asInstanceOf[js.Any])
      
      inline def setVerifyIdentityUndefined: Self = StObject.set(x, "verifyIdentity", js.undefined)
    }
  }
}
