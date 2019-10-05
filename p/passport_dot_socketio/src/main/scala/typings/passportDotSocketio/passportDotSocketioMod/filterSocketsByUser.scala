package typings.passportDotSocketio.passportDotSocketioMod

import typings.socketDotIo.socketDotIoMod.Server
import typings.socketDotIo.socketDotIoMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport.socketio", "filterSocketsByUser")
@js.native
object filterSocketsByUser extends js.Object {
  def apply(io: Server, filter: js.Function1[/* user */ js.Any, Boolean]): js.Array[Socket] = js.native
}

