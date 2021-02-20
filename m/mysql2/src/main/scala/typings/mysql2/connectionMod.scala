package typings.mysql2

import org.scalablytyped.runtime.StringDictionary
import typings.mysql2.fieldPacketMod.FieldPacket
import typings.mysql2.mysql2Strings.DATE
import typings.mysql2.mysql2Strings.DATETIME
import typings.mysql2.mysql2Strings.TIMESTAMP
import typings.mysql2.mysql2Strings.local
import typings.mysql2.okPacketMod.OkPacket
import typings.mysql2.queryMod.QueryError
import typings.mysql2.queryMod.QueryOptions
import typings.mysql2.resultSetHeaderMod.ResultSetHeader
import typings.mysql2.rowDataPacketMod.RowDataPacket
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionMod {
  
  @JSImport("mysql2/typings/mysql/lib/Connection", JSImport.Namespace)
  @js.native
  class ^ () extends Connection
  
  /* static member */
  @JSImport("mysql2/typings/mysql/lib/Connection", "createQuery")
  @js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): typings.mysql2.queryMod.^ = js.native
  @JSImport("mysql2/typings/mysql/lib/Connection", "createQuery")
  @js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typings.mysql2.queryMod.^ = js.native
  /* static member */
  @JSImport("mysql2/typings/mysql/lib/Connection", "createQuery")
  @js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): typings.mysql2.queryMod.^ = js.native
  @JSImport("mysql2/typings/mysql/lib/Connection", "createQuery")
  @js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: js.Any,
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typings.mysql2.queryMod.^ = js.native
  @JSImport("mysql2/typings/mysql/lib/Connection", "createQuery")
  @js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): typings.mysql2.queryMod.^ = js.native
  @JSImport("mysql2/typings/mysql/lib/Connection", "createQuery")
  @js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: js.Array[_],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typings.mysql2.queryMod.^ = js.native
  @JSImport("mysql2/typings/mysql/lib/Connection", "createQuery")
  @js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): typings.mysql2.queryMod.^ = js.native
  @JSImport("mysql2/typings/mysql/lib/Connection", "createQuery")
  @js.native
  def createQuery[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
    sql: String,
    values: StringDictionary[js.Any],
    callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
  ): typings.mysql2.queryMod.^ = js.native
  
  @js.native
  trait Connection extends EventEmitter {
    
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
    def end(options: js.Any): Unit = js.native
    def end(options: js.Any, callback: js.Function1[/* err */ QueryError | Null, Unit]): Unit = js.native
    
    def escape(value: js.Any): String = js.native
    
    def escapeId(value: String): String = js.native
    def escapeId(values: js.Array[String]): String = js.native
    
    def format(sql: String): String = js.native
    def format(sql: String, values: js.Any): String = js.native
    def format(sql: String, values: js.Array[_]): String = js.native
    def format(sql: String, values: StringDictionary[js.Any]): String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    
    def pause(): Unit = js.native
    
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      callback: js.Function3[
          /* err */ QueryError | Null, 
          /* result */ T, 
          /* fields */ js.UndefOr[js.Array[FieldPacket]], 
          _
        ]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Any): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: js.Array[_]): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: js.Array[_],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](options: QueryOptions, values: StringDictionary[js.Any]): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      options: QueryOptions,
      values: StringDictionary[js.Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Any): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Any,
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: js.Array[_]): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: js.Array[_],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](sql: String, values: StringDictionary[js.Any]): typings.mysql2.queryMod.^ = js.native
    def query[T /* <: (js.Array[js.Array[RowDataPacket] | OkPacket | RowDataPacket]) | OkPacket | ResultSetHeader */](
      sql: String,
      values: StringDictionary[js.Any],
      callback: js.Function3[/* err */ QueryError | Null, /* result */ T, /* fields */ js.Array[FieldPacket], _]
    ): typings.mysql2.queryMod.^ = js.native
    
    def resume(): Unit = js.native
    
    def rollback(callback: js.Function0[Unit]): Unit = js.native
    
    var threadId: Double = js.native
  }
  
  @js.native
  trait ConnectionOptions extends StObject {
    
    /**
      * Enabling both supportBigNumbers and bigNumberStrings forces big numbers (BIGINT and DECIMAL columns) to be
      * always returned as JavaScript String objects (Default: false). Enabling supportBigNumbers but leaving
      * bigNumberStrings disabled will return big numbers as String objects only when they cannot be accurately
      * represented with [JavaScript Number objects] (http://ecma262-5.com/ELS5_HTML.htm#Section_8.5)
      * (which happens when they exceed the [-2^53, +2^53] range), otherwise they will be returned as Number objects.
      * This option is ignored if supportBigNumbers is disabled.
      */
    var bigNumberStrings: js.UndefOr[Boolean] = js.native
    
    /**
      * The charset for the connection. This is called 'collation' in the SQL-level of MySQL (like utf8_general_ci).
      * If a SQL-level charset is specified (like utf8mb4) then the default collation for that charset is used.
      * (Default: 'UTF8_GENERAL_CI')
      */
    var charset: js.UndefOr[String] = js.native
    
    /**
      * The milliseconds before a timeout occurs during the initial connection to the MySQL server. (Default: 10 seconds)
      */
    var connectTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Name of the database to use for this connection
      */
    var database: js.UndefOr[String] = js.native
    
    /**
      * Force date types (TIMESTAMP, DATETIME, DATE) to be returned as strings rather then inflated into JavaScript Date
      * objects. Can be true/false or an array of type names to keep as strings.
      *
      * (Default: false)
      */
    var dateStrings: js.UndefOr[Boolean | (js.Array[TIMESTAMP | DATETIME | DATE])] = js.native
    
    /**
      * This will print all incoming and outgoing packets on stdout.
      * You can also restrict debugging to packet types by passing an array of types (strings) to debug;
      *
      * (Default: false)
      */
    var debug: js.UndefOr[js.Any] = js.native
    
    /**
      * List of connection flags to use other than the default ones. It is also possible to blacklist default ones
      */
    var flags: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The hostname of the database you are connecting to. (Default: localhost)
      */
    var host: js.UndefOr[String] = js.native
    
    /**
      * Allow connecting to MySQL instances that ask for the old (insecure) authentication method. (Default: false)
      */
    var insecureAuth: js.UndefOr[Boolean] = js.native
    
    /**
      * The source IP address to use for TCP connection
      */
    var localAddress: js.UndefOr[String] = js.native
    
    /**
      * Allow multiple mysql statements per query. Be careful with this, it exposes you to SQL injection attacks. (Default: false)
      */
    var multipleStatements: js.UndefOr[Boolean] = js.native
    
    /**
      * The password of that MySQL user
      */
    var password: js.UndefOr[String] = js.native
    
    /**
      * The port number to connect to. (Default: 3306)
      */
    var port: js.UndefOr[Double] = js.native
    
    /**
      * A custom query format function
      */
    var queryFormat: js.UndefOr[js.Function2[/* query */ String, /* values */ js.Any, Unit]] = js.native
    
    /**
      * The path to a unix domain socket to connect to. When used host and port are ignored
      */
    var socketPath: js.UndefOr[String] = js.native
    
    /**
      * object with ssl parameters or a string containing name of ssl profile
      */
    var ssl: js.UndefOr[String | SslOptions] = js.native
    
    /**
      * Stringify objects instead of converting to values. (Default: 'false')
      */
    var stringifyObjects: js.UndefOr[Boolean] = js.native
    
    /**
      * When dealing with big numbers (BIGINT and DECIMAL columns) in the database, you should enable this option
      * (Default: false)
      */
    var supportBigNumbers: js.UndefOr[Boolean] = js.native
    
    /**
      * The timezone used to store local dates. (Default: 'local')
      */
    var timezone: js.UndefOr[String | local] = js.native
    
    /**
      * Generates stack traces on Error to include call site of library entrance ('long stack traces'). Slight
      * performance penalty for most calls. (Default: true)
      */
    var trace: js.UndefOr[Boolean] = js.native
    
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
    var typeCast: js.UndefOr[Boolean | (js.Function2[/* field */ js.Any, /* next */ js.Function0[Unit], _])] = js.native
    
    /**
      * The MySQL user to authenticate as
      */
    var user: js.UndefOr[String] = js.native
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
      def setBigNumberStrings(value: Boolean): Self = StObject.set(x, "bigNumberStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigNumberStringsUndefined: Self = StObject.set(x, "bigNumberStrings", js.undefined)
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setDateStrings(value: Boolean | (js.Array[TIMESTAMP | DATETIME | DATE])): Self = StObject.set(x, "dateStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateStringsUndefined: Self = StObject.set(x, "dateStrings", js.undefined)
      
      @scala.inline
      def setDateStringsVarargs(value: (TIMESTAMP | DATETIME | DATE)*): Self = StObject.set(x, "dateStrings", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: js.Any): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setInsecureAuth(value: Boolean): Self = StObject.set(x, "insecureAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsecureAuthUndefined: Self = StObject.set(x, "insecureAuth", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMultipleStatements(value: Boolean): Self = StObject.set(x, "multipleStatements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleStatementsUndefined: Self = StObject.set(x, "multipleStatements", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setQueryFormat(value: (/* query */ String, /* values */ js.Any) => Unit): Self = StObject.set(x, "queryFormat", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueryFormatUndefined: Self = StObject.set(x, "queryFormat", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setSsl(value: String | SslOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setStringifyObjects(value: Boolean): Self = StObject.set(x, "stringifyObjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringifyObjectsUndefined: Self = StObject.set(x, "stringifyObjects", js.undefined)
      
      @scala.inline
      def setSupportBigNumbers(value: Boolean): Self = StObject.set(x, "supportBigNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportBigNumbersUndefined: Self = StObject.set(x, "supportBigNumbers", js.undefined)
      
      @scala.inline
      def setTimezone(value: String | local): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      @scala.inline
      def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      @scala.inline
      def setTypeCast(value: Boolean | (js.Function2[/* field */ js.Any, /* next */ js.Function0[Unit], _])): Self = StObject.set(x, "typeCast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeCastFunction2(value: (/* field */ js.Any, /* next */ js.Function0[Unit]) => _): Self = StObject.set(x, "typeCast", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTypeCastUndefined: Self = StObject.set(x, "typeCast", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait SslOptions extends StObject {
    
    /**
      * Either a string or list of strings of PEM encoded CA certificates to trust.
      */
    var ca: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * A string holding the PEM encoded certificate
      */
    var cert: js.UndefOr[String] = js.native
    
    /**
      * A string describing the ciphers to use or exclude
      */
    var ciphers: js.UndefOr[String] = js.native
    
    /**
      * Either a string or list of strings of PEM encoded CRLs (Certificate Revocation List)
      */
    var crl: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * A string holding the PEM encoded private key
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * A string of passphrase for the private key or pfx
      */
    var passphrase: js.UndefOr[String] = js.native
    
    /**
      * A string or buffer holding the PFX or PKCS12 encoded private key, certificate and CA certificates
      */
    var pfx: js.UndefOr[String] = js.native
    
    /**
      * You can also connect to a MySQL server without properly providing the appropriate CA to trust. You should not do this.
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  }
  object SslOptions {
    
    @scala.inline
    def apply(): SslOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SslOptions]
    }
    
    @scala.inline
    implicit class SslOptionsMutableBuilder[Self <: SslOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: String | js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setCrl(value: String | js.Array[String]): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      @scala.inline
      def setCrlVarargs(value: String*): Self = StObject.set(x, "crl", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
}
