package typings.mysql.mod

import typings.mysql.anon.SecureContextOptionsrejec
import typings.mysql.anon.UntypedFieldInfotypestrin
import typings.mysql.mysqlStrings.DATE
import typings.mysql.mysqlStrings.DATETIME
import typings.mysql.mysqlStrings.TIMESTAMP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionConfig extends ConnectionOptions {
  
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
    * The milliseconds before a timeout occurs during the initial connection to the MySQL server. (Default: 10 seconds)
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Force date types (TIMESTAMP, DATETIME, DATE) to be returned as strings rather then inflated into JavaScript
    * Date objects. Can be true/false or an array of type names to keep as strings. (Default: false)
    */
  var dateStrings: js.UndefOr[Boolean | (js.Array[TIMESTAMP | DATETIME | DATE])] = js.native
  
  /**
    * This will print all incoming and outgoing packets on stdout.
    * You can also restrict debugging to packet types by passing an array of types (strings) to debug;
    *
    * (Default: false)
    */
  var debug: js.UndefOr[Boolean | (js.Array[String | Types])] = js.native
  
  /**
    * List of connection flags to use other than the default ones. It is also possible to blacklist default ones
    */
  var flags: js.UndefOr[String | js.Array[String]] = js.native
  
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
    * The port number to connect to. (Default: 3306)
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * A custom query format function
    */
  var queryFormat: js.UndefOr[js.Function2[/* query */ String, /* values */ js.Any, String]] = js.native
  
  /**
    * The path to a unix domain socket to connect to. When used host and port are ignored
    */
  var socketPath: js.UndefOr[String] = js.native
  
  /**
    * object with ssl parameters or a string containing name of ssl profile
    */
  var ssl: js.UndefOr[String | SecureContextOptionsrejec] = js.native
  
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
  var timezone: js.UndefOr[String] = js.native
  
  /**
    * Generates stack traces on errors to include call site of library entrance ("long stack traces"). Slight
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
  var typeCast: js.UndefOr[TypeCast] = js.native
}
object ConnectionConfig {
  
  @scala.inline
  def apply(): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionConfig]
  }
  
  @scala.inline
  implicit class ConnectionConfigMutableBuilder[Self <: ConnectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigNumberStrings(value: Boolean): Self = StObject.set(x, "bigNumberStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigNumberStringsUndefined: Self = StObject.set(x, "bigNumberStrings", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    @scala.inline
    def setDateStrings(value: Boolean | (js.Array[TIMESTAMP | DATETIME | DATE])): Self = StObject.set(x, "dateStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateStringsUndefined: Self = StObject.set(x, "dateStrings", js.undefined)
    
    @scala.inline
    def setDateStringsVarargs(value: (TIMESTAMP | DATETIME | DATE)*): Self = StObject.set(x, "dateStrings", js.Array(value :_*))
    
    @scala.inline
    def setDebug(value: Boolean | (js.Array[String | Types])): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDebugVarargs(value: (String | Types)*): Self = StObject.set(x, "debug", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: String | js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
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
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setQueryFormat(value: (/* query */ String, /* values */ js.Any) => String): Self = StObject.set(x, "queryFormat", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueryFormatUndefined: Self = StObject.set(x, "queryFormat", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    
    @scala.inline
    def setSsl(value: String | SecureContextOptionsrejec): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
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
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    @scala.inline
    def setTypeCast(value: TypeCast): Self = StObject.set(x, "typeCast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeCastFunction2(value: (/* field */ UntypedFieldInfotypestrin, /* next */ js.Function0[Unit]) => js.Any): Self = StObject.set(x, "typeCast", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTypeCastUndefined: Self = StObject.set(x, "typeCast", js.undefined)
  }
}
