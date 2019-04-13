package typings
package pinoLib.pinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrettyOptions extends js.Object {
  /**
    * If set to true, will add color information to the formatted output message. Default: `false`.
    */
  var colorize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Appends carriage return and line feed, instead of just a line feed, to the formatted log line.
    */
  var crlf: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Define the log keys that are associated with error like objects. Default: ["err", "error"]
    */
  var errorLikeObjectKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    *  When formatting an error object, display this list of properties.
    *  The list should be a comma separated list of properties. Default: ''
    */
  var errorProps: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to true, it will print the name of the log level as the first field in the log line. Default: `false`.
    */
  var levelFirst: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The key in the JSON object to use as the highlighted message. Default: "msg".
    */
  var messageKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify a search pattern according to {@link http://jmespath.org|jmespath}
    */
  var search: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Translate the epoch time value into a human readable date and time string.
    * This flag also can set the format string to apply when translating the date to human readable format.
    * The default format is yyyy-mm-dd HH:MM:ss.l o in UTC.
    * For a list of available pattern letters see the {@link https://www.npmjs.com/package/dateformat|dateformat documentation}.
    */
  var translateTime: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object PrettyOptions {
  @scala.inline
  def apply(
    colorize: js.UndefOr[scala.Boolean] = js.undefined,
    crlf: js.UndefOr[scala.Boolean] = js.undefined,
    errorLikeObjectKeys: js.Array[java.lang.String] = null,
    errorProps: java.lang.String = null,
    levelFirst: js.UndefOr[scala.Boolean] = js.undefined,
    messageKey: java.lang.String = null,
    search: java.lang.String = null,
    translateTime: scala.Boolean | java.lang.String = null
  ): PrettyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorize)) __obj.updateDynamic("colorize")(colorize)
    if (!js.isUndefined(crlf)) __obj.updateDynamic("crlf")(crlf)
    if (errorLikeObjectKeys != null) __obj.updateDynamic("errorLikeObjectKeys")(errorLikeObjectKeys)
    if (errorProps != null) __obj.updateDynamic("errorProps")(errorProps)
    if (!js.isUndefined(levelFirst)) __obj.updateDynamic("levelFirst")(levelFirst)
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey)
    if (search != null) __obj.updateDynamic("search")(search)
    if (translateTime != null) __obj.updateDynamic("translateTime")(translateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrettyOptions]
  }
}

