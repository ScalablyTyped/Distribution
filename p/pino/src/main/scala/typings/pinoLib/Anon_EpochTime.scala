package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EpochTime extends js.Object {
  /**
    * The default time function for Pino. Returns a string like `,"time":1493426328206`.
    */
  @JSName("epochTime")
  var epochTime_Original: pinoLib.pinoMod.PNs.TimeFn = js.native
  /**
    * Returns an empty string. This function is used when the `timestamp` option is set to `false`.
    */
  @JSName("nullTime")
  var nullTime_Original: pinoLib.pinoMod.PNs.TimeFn = js.native
  /**
    * The default time function for Pino. Returns a string like `,"time":1493426328206`.
    */
  def epochTime(): java.lang.String = js.native
  /**
    * Returns an empty string. This function is used when the `timestamp` option is set to `false`.
    */
  def nullTime(): java.lang.String = js.native
}

