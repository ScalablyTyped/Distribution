package typings.mysql.mod

import typings.mysql.anon.SecureContextOptionsrejec
import typings.mysql.anon.UntypedFieldInfotypestrin
import typings.mysql.mysqlStrings.DATE
import typings.mysql.mysqlStrings.DATETIME
import typings.mysql.mysqlStrings.TIMESTAMP
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
  implicit class ConnectionConfigOps[Self <: ConnectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBigNumberStrings(value: Boolean): Self = this.set("bigNumberStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigNumberStrings: Self = this.set("bigNumberStrings", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setDateStringsVarargs(value: (TIMESTAMP | DATETIME | DATE)*): Self = this.set("dateStrings", js.Array(value :_*))
    
    @scala.inline
    def setDateStrings(value: Boolean | (js.Array[TIMESTAMP | DATETIME | DATE])): Self = this.set("dateStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateStrings: Self = this.set("dateStrings", js.undefined)
    
    @scala.inline
    def setDebugVarargs(value: (String | Types)*): Self = this.set("debug", js.Array(value :_*))
    
    @scala.inline
    def setDebug(value: Boolean | (js.Array[String | Types])): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setFlagsVarargs(value: String*): Self = this.set("flags", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: String | js.Array[String]): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setInsecureAuth(value: Boolean): Self = this.set("insecureAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecureAuth: Self = this.set("insecureAuth", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setMultipleStatements(value: Boolean): Self = this.set("multipleStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleStatements: Self = this.set("multipleStatements", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setQueryFormat(value: (/* query */ String, /* values */ js.Any) => String): Self = this.set("queryFormat", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteQueryFormat: Self = this.set("queryFormat", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    
    @scala.inline
    def setSsl(value: String | SecureContextOptionsrejec): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setStringifyObjects(value: Boolean): Self = this.set("stringifyObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringifyObjects: Self = this.set("stringifyObjects", js.undefined)
    
    @scala.inline
    def setSupportBigNumbers(value: Boolean): Self = this.set("supportBigNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportBigNumbers: Self = this.set("supportBigNumbers", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setTrace(value: Boolean): Self = this.set("trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    
    @scala.inline
    def setTypeCastFunction2(value: (/* field */ UntypedFieldInfotypestrin, /* next */ js.Function0[Unit]) => js.Any): Self = this.set("typeCast", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTypeCast(value: TypeCast): Self = this.set("typeCast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeCast: Self = this.set("typeCast", js.undefined)
  }
}
