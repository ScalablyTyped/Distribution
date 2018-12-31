package typings
package pinoDashHttpLib.pinoDashHttpMod.PinoHttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends pinoLib.pinoMod.PNs.LoggerOptions {
  var genReqId: js.UndefOr[js.Function1[/* req */ nodeLib.httpMod.IncomingMessage, scala.Double]] = js.undefined
  var logger: js.UndefOr[pinoLib.pinoMod.PNs.Logger] = js.undefined
  var useLevel: js.UndefOr[pinoLib.pinoMod.PNs.Level] = js.undefined
}

