package typings.pino.mod

import typings.pino.pinoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrettyOptions extends js.Object {
  /**
    * If set to true, will add color information to the formatted output message. Default: `false`.
    */
  var colorize: js.UndefOr[Boolean] = js.undefined
  /**
    * Appends carriage return and line feed, instead of just a line feed, to the formatted log line.
    */
  var crlf: js.UndefOr[Boolean] = js.undefined
  /**
    * Define the log keys that are associated with error like objects. Default: ["err", "error"]
    */
  var errorLikeObjectKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    *  When formatting an error object, display this list of properties.
    *  The list should be a comma separated list of properties. Default: ''
    */
  var errorProps: js.UndefOr[String] = js.undefined
  /**
    * Ignore one or several keys. Example: "time,hostname"
    */
  var ignore: js.UndefOr[String] = js.undefined
  /**
    * If set to true, it will print the name of the log level as the first field in the log line. Default: `false`.
    */
  var levelFirst: js.UndefOr[Boolean] = js.undefined
  /**
    * Format output of message, e.g. {level} - {pid} will output message: INFO - 1123 Default: `false`.
    */
  var messageFormat: js.UndefOr[`false` | String] = js.undefined
  /**
    * The key in the JSON object to use as the highlighted message. Default: "msg".
    */
  var messageKey: js.UndefOr[String] = js.undefined
  /**
    * Specify a search pattern according to {@link http://jmespath.org|jmespath}
    */
  var search: js.UndefOr[String] = js.undefined
  /**
    * The key in the JSON object to use for timestamp display. Default: "time".
    */
  var timestampKey: js.UndefOr[String] = js.undefined
  /**
    * Translate the epoch time value into a human readable date and time string.
    * This flag also can set the format string to apply when translating the date to human readable format.
    * The default format is yyyy-mm-dd HH:MM:ss.l o in UTC.
    * For a list of available pattern letters see the {@link https://www.npmjs.com/package/dateformat|dateformat documentation}.
    */
  var translateTime: js.UndefOr[Boolean | String] = js.undefined
}

object PrettyOptions {
  @scala.inline
  def apply(
    colorize: js.UndefOr[Boolean] = js.undefined,
    crlf: js.UndefOr[Boolean] = js.undefined,
    errorLikeObjectKeys: js.Array[String] = null,
    errorProps: String = null,
    ignore: String = null,
    levelFirst: js.UndefOr[Boolean] = js.undefined,
    messageFormat: `false` | String = null,
    messageKey: String = null,
    search: String = null,
    timestampKey: String = null,
    translateTime: Boolean | String = null
  ): PrettyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorize)) __obj.updateDynamic("colorize")(colorize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crlf)) __obj.updateDynamic("crlf")(crlf.get.asInstanceOf[js.Any])
    if (errorLikeObjectKeys != null) __obj.updateDynamic("errorLikeObjectKeys")(errorLikeObjectKeys.asInstanceOf[js.Any])
    if (errorProps != null) __obj.updateDynamic("errorProps")(errorProps.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(levelFirst)) __obj.updateDynamic("levelFirst")(levelFirst.get.asInstanceOf[js.Any])
    if (messageFormat != null) __obj.updateDynamic("messageFormat")(messageFormat.asInstanceOf[js.Any])
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (timestampKey != null) __obj.updateDynamic("timestampKey")(timestampKey.asInstanceOf[js.Any])
    if (translateTime != null) __obj.updateDynamic("translateTime")(translateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrettyOptions]
  }
}

