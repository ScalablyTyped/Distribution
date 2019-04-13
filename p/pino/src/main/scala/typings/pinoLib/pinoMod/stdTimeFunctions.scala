package typings
package pinoLib.pinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functions for generating the timestamp property in the log output. You can set the `timestamp` option during
  * initialization to one of these functions to adjust the output format. Alternatively, you can specify your own time function.
  * A time function must synchronously return a string that would be a valid component of a JSON string. For example,
  * the default function returns a string like `,"time":1493426328206`.
  */
@JSImport("pino", "stdTimeFunctions")
@js.native
object stdTimeFunctions extends js.Object {
  /**
    * The default time function for Pino. Returns a string like `,"time":1493426328206`.
    */
  @JSName("epochTime")
  var epochTime_Original: pinoLib.pinoMod.TimeFn = js.native
  /**
    * Returns an empty string. This function is used when the `timestamp` option is set to `false`.
    */
  @JSName("nullTime")
  var nullTime_Original: pinoLib.pinoMod.TimeFn = js.native
  /**
    * The default time function for Pino. Returns a string like `,"time":1493426328206`.
    */
  def epochTime(): java.lang.String = js.native
  /**
    * Returns an empty string. This function is used when the `timestamp` option is set to `false`.
    */
  def nullTime(): java.lang.String = js.native
}

