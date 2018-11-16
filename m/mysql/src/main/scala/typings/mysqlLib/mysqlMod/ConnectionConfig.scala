package typings
package mysqlLib.mysqlMod

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
  var bigNumberStrings: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The milliseconds before a timeout occurs during the initial connection to the MySQL server. (Default: 10 seconds)
       */
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
       * Force date types (TIMESTAMP, DATETIME, DATE) to be returned as strings rather then inflated into JavaScript
       * Date objects. Can be true/false or an array of type names to keep as strings. (Default: false)
       */
  var dateStrings: js.UndefOr[
    scala.Boolean | (js.Array[
      mysqlLib.mysqlLibStrings.TIMESTAMP | mysqlLib.mysqlLibStrings.DATETIME | mysqlLib.mysqlLibStrings.DATE
    ])
  ] = js.undefined
  /**
       * This will print all incoming and outgoing packets on stdout.
       * You can also restrict debugging to packet types by passing an array of types (strings) to debug;
       *
       * (Default: false)
       */
  var debug: js.UndefOr[scala.Boolean | js.Array[java.lang.String] | js.Array[Types]] = js.undefined
  /**
       * List of connection flags to use other than the default ones. It is also possible to blacklist default ones
       */
  var flags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * The hostname of the database you are connecting to. (Default: localhost)
       */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Allow connecting to MySQL instances that ask for the old (insecure) authentication method. (Default: false)
       */
  var insecureAuth: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The source IP address to use for TCP connection
       */
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Allow multiple mysql statements per query. Be careful with this, it exposes you to SQL injection attacks. (Default: false)
       */
  var multipleStatements: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The port number to connect to. (Default: 3306)
       */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
       * A custom query format function
       */
  var queryFormat: js.UndefOr[js.Function2[/* query */ java.lang.String, /* values */ js.Any, scala.Unit]] = js.undefined
  /**
       * The path to a unix domain socket to connect to. When used host and port are ignored
       */
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  /**
       * object with ssl parameters or a string containing name of ssl profile
       */
  var ssl: js.UndefOr[
    java.lang.String | (nodeLib.tlsMod.SecureContextOptions with mysqlLib.Anon_RejectUnauthorized)
  ] = js.undefined
  /**
       * Stringify objects instead of converting to values. (Default: 'false')
       */
  var stringifyObjects: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * When dealing with big numbers (BIGINT and DECIMAL columns) in the database, you should enable this option
       * (Default: false)
       */
  var supportBigNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The timezone used to store local dates. (Default: 'local')
       */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Generates stack traces on errors to include call site of library entrance ("long stack traces"). Slight
       * performance penalty for most calls. (Default: true)
       */
  var trace: js.UndefOr[scala.Boolean] = js.undefined
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

