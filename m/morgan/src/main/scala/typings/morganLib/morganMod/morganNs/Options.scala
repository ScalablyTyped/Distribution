package typings
package morganLib.morganMod.morganNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***
  * Morgan accepts these properties in the options object.
  */
trait Options extends js.Object {
  /***
    * Buffer duration before writing logs to the stream, defaults to false.
    * When set to true, defaults to 1000 ms.
    */
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  /***
    * Write log line on request instead of response. This means that a
    * requests will be logged even if the server crashes, but data from the
    * response cannot be logged (like the response code).
    */
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  /***
    * Function to determine if logging is skipped, defaults to false. This
    * function will be called as skip(req, res).
    */
  var skip: js.UndefOr[
    js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      scala.Boolean
    ]
  ] = js.undefined
  /***
    * Output stream for writing log lines, defaults to process.stdout.
    * @param str
    */
  var stream: js.UndefOr[StreamOptions] = js.undefined
}

