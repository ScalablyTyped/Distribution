package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NullTime extends js.Object {
  /**
    * The default time function for Pino. Returns a string like `,"time":1493426328206`.
    */
  var epochTime: pinoLib.pinoMod.PNs.TimeFn
  /**
    * Returns an empty string. This function is used when the `timestamp` option is set to `false`.
    */
  var nullTime: pinoLib.pinoMod.PNs.TimeFn
}

