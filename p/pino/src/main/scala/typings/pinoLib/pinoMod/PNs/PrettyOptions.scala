package typings
package pinoLib.pinoMod.PNs

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

