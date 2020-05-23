package typings.mysql.mod

import typings.mysql.anon.SecureContextOptionsrejec
import typings.mysql.mysqlStrings.DATE
import typings.mysql.mysqlStrings.DATETIME
import typings.mysql.mysqlStrings.TIMESTAMP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends ConnectionOptions {
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
  @scala.inline
  def apply(
    bigNumberStrings: js.UndefOr[Boolean] = js.undefined,
    charset: String = null,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    database: String = null,
    dateStrings: Boolean | (js.Array[TIMESTAMP | DATETIME | DATE]) = null,
    debug: Boolean | (js.Array[String | Types]) = null,
    flags: String | js.Array[String] = null,
    host: String = null,
    insecureAuth: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    multipleStatements: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    queryFormat: (/* query */ String, /* values */ js.Any) => String = null,
    socketPath: String = null,
    ssl: String | SecureContextOptionsrejec = null,
    stringifyObjects: js.UndefOr[Boolean] = js.undefined,
    supportBigNumbers: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    timezone: String = null,
    trace: js.UndefOr[Boolean] = js.undefined,
    typeCast: TypeCast = null,
    user: String = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bigNumberStrings)) __obj.updateDynamic("bigNumberStrings")(bigNumberStrings.get.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (dateStrings != null) __obj.updateDynamic("dateStrings")(dateStrings.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureAuth)) __obj.updateDynamic("insecureAuth")(insecureAuth.get.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleStatements)) __obj.updateDynamic("multipleStatements")(multipleStatements.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (queryFormat != null) __obj.updateDynamic("queryFormat")(js.Any.fromFunction2(queryFormat))
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifyObjects)) __obj.updateDynamic("stringifyObjects")(stringifyObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportBigNumbers)) __obj.updateDynamic("supportBigNumbers")(supportBigNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.get.asInstanceOf[js.Any])
    if (typeCast != null) __obj.updateDynamic("typeCast")(typeCast.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfig]
  }
}

