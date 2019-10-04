package typings.pinoDashHttp.pinoDashHttpMod.httpMod

import typings.pino.pinoMod.Logger
import typings.pinoDashHttp.pinoDashHttpMod.ReqId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingMessage extends js.Object {
  var id: ReqId
  var log: Logger
}

object IncomingMessage {
  @scala.inline
  def apply(id: ReqId, log: Logger): IncomingMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], log = log)
  
    __obj.asInstanceOf[IncomingMessage]
  }
}

