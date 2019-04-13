package typings
package pinoDashHttpLib.pinoDashHttpMod.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingMessage extends js.Object {
  var log: pinoLib.pinoMod.Logger
}

object IncomingMessage {
  @scala.inline
  def apply(log: pinoLib.pinoMod.Logger): IncomingMessage = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[IncomingMessage]
  }
}

