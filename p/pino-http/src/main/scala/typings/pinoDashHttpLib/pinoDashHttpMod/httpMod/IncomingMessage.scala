package typings
package pinoDashHttpLib.pinoDashHttpMod.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingMessage extends js.Object {
  var log: pinoLib.pinoMod.PNs.Logger
}

object IncomingMessage {
  @scala.inline
  def apply(log: pinoLib.pinoMod.PNs.Logger): IncomingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(log)
    __obj.asInstanceOf[IncomingMessage]
  }
}

