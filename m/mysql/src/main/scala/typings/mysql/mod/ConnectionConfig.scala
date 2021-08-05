package typings.mysql.mod

import typings.mysql.anon.SecureContextOptionsrejec
import typings.mysql.anon.UntypedFieldInfotypestrin
import typings.mysql.mysqlStrings.DATE
import typings.mysql.mysqlStrings.DATETIME
import typings.mysql.mysqlStrings.TIMESTAMP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionConfig
  extends StObject
     with ConnectionOptions {
  
  /**
    * Enabling both supportBigNumbers and bigNumberStrings forces big numbers (BIGINT and DECIMAL columns) to be
    * always returned as JavaScript String objects (Default: false). Enabling supportBigNumbers but leaving
    * bigNumberStrings disabled will return big numbers as String objects only when they cannot be accurately
    * represented with [JavaScript Number objects] (http://ecma262-5.com/ELS5_HTML.htm#Section_8.5)
    * (which happens when they exceed the [-2^53, +2^53] range), otherwise they will be returned as Number objects.
    * This option is ignored if supportBigNumbers is disabled.
    */
  var bigNumberStrings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The milliseconds before a timeout occurs during the initial connection to the MySQL server. (Default: 10 seconds)
    */
  var connectTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Force date types (TIMESTAMP, DATETIME, DATE) to be returned as strings rather then inflated into JavaScript
    * Date objects. Can be true/false or an array of type names to keep as strings. (Default: false)
    */
  var dateStrings: js.UndefOr[Boolean | (js.Array[TIMESTAMP | DATETIME | DATE])] = js.undefined
  
  /**
    * This will print all incoming and outgoing packets on stdout.
    * You can also restrict debugging to packet types by passing an array of types (strings) to debug;
    *
    * (Default: false)
    */
  var debug: js.UndefOr[Boolean | (js.Array[String | Types])] = js.undefined
  
  /**
    * List of connection flags to use other than the default ones. It is also possible to blacklist default ones
    */
  var flags: js.UndefOr[String | js.Array[String]] = js.undefined
  
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
    * The port number to connect to. (Default: 3306)
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * A custom query format function
    */
  var queryFormat: js.UndefOr[js.Function2[/* query */ String, /* values */ js.Any, String]] = js.undefined
  
  /**
    * The path to a unix domain socket to connect to. When used host and port are ignored
    */
  var socketPath: js.UndefOr[String] = js.undefined
  
  /**
    * object with ssl parameters or a string containing name of ssl profile
    */
  var ssl: js.UndefOr[String | SecureContextOptionsrejec] = js.undefined
  
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
  var timezone: js.UndefOr[String] = js.undefined
  
  /**
    * Generates stack traces on errors to include call site of library entrance ("long stack traces"). Slight
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
  var typeCast: js.UndefOr[TypeCast] = js.undefined
}
object ConnectionConfig {
  
  inline def apply(): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionConfig]
  }
  
  extension [Self <: ConnectionConfig](x: Self) {
    
    inline def setBigNumberStrings(value: Boolean): Self = StObject.set(x, "bigNumberStrings", value.asInstanceOf[js.Any])
    
    inline def setBigNumberStringsUndefined: Self = StObject.set(x, "bigNumberStrings", js.undefined)
    
    inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    inline def setDateStrings(value: Boolean | (js.Array[TIMESTAMP | DATETIME | DATE])): Self = StObject.set(x, "dateStrings", value.asInstanceOf[js.Any])
    
    inline def setDateStringsUndefined: Self = StObject.set(x, "dateStrings", js.undefined)
    
    inline def setDateStringsVarargs(value: (TIMESTAMP | DATETIME | DATE)*): Self = StObject.set(x, "dateStrings", js.Array(value :_*))
    
    inline def setDebug(value: Boolean | (js.Array[String | Types])): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDebugVarargs(value: (String | Types)*): Self = StObject.set(x, "debug", js.Array(value :_*))
    
    inline def setFlags(value: String | js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInsecureAuth(value: Boolean): Self = StObject.set(x, "insecureAuth", value.asInstanceOf[js.Any])
    
    inline def setInsecureAuthUndefined: Self = StObject.set(x, "insecureAuth", js.undefined)
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    inline def setMultipleStatements(value: Boolean): Self = StObject.set(x, "multipleStatements", value.asInstanceOf[js.Any])
    
    inline def setMultipleStatementsUndefined: Self = StObject.set(x, "multipleStatements", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setQueryFormat(value: (/* query */ String, /* values */ js.Any) => String): Self = StObject.set(x, "queryFormat", js.Any.fromFunction2(value))
    
    inline def setQueryFormatUndefined: Self = StObject.set(x, "queryFormat", js.undefined)
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
    
    inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    
    inline def setSsl(value: String | SecureContextOptionsrejec): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    inline def setStringifyObjects(value: Boolean): Self = StObject.set(x, "stringifyObjects", value.asInstanceOf[js.Any])
    
    inline def setStringifyObjectsUndefined: Self = StObject.set(x, "stringifyObjects", js.undefined)
    
    inline def setSupportBigNumbers(value: Boolean): Self = StObject.set(x, "supportBigNumbers", value.asInstanceOf[js.Any])
    
    inline def setSupportBigNumbersUndefined: Self = StObject.set(x, "supportBigNumbers", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setTypeCast(value: TypeCast): Self = StObject.set(x, "typeCast", value.asInstanceOf[js.Any])
    
    inline def setTypeCastFunction2(value: (/* field */ UntypedFieldInfotypestrin, /* next */ js.Function0[Unit]) => js.Any): Self = StObject.set(x, "typeCast", js.Any.fromFunction2(value))
    
    inline def setTypeCastUndefined: Self = StObject.set(x, "typeCast", js.undefined)
  }
}
