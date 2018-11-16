package typings
package pinoLib.pinoMod.PNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PrettyOptions extends js.Object {
  /**
           * If set to true, will add color information to the formatted output message. Default: `false`.
           */
  var forceColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A custom function to format the line, is passed the JSON object as an argument and should return a string value.
           */
  var formatter: js.UndefOr[js.Function1[/* log */ LogDescriptor, java.lang.String]] = js.undefined
  /**
           * If set to true, it will print the name of the log level as the first field in the log line. Default: `false`.
           */
  var levelFirst: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The key in the JSON object to use as the highlighted message. Default: "msg".
           */
  var messageKey: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If set to true, it will only covert the unix timestamp to ISO 8601 date format, and reserialize the JSON (equivalent to pino -t).
           */
  var timeTransOnly: js.UndefOr[scala.Boolean] = js.undefined
}

