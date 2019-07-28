package typings.pinoDashHttp.pinoDashHttpMod.httpMod

import typings.pino.pinoMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingMessage extends js.Object {
  var log: Logger
}

object IncomingMessage {
  @scala.inline
  def apply(log: Logger): IncomingMessage = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[IncomingMessage]
  }
}

