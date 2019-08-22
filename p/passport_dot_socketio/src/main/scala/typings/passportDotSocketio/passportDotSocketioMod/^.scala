package typings.passportDotSocketio.passportDotSocketioMod

import typings.socketDotIo.socketDotIoMod.Server
import typings.socketDotIo.socketDotIoMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport.socketio", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def authorize(options: PassportSocketIoOptions): js.Function2[/* socket */ Socket, /* fn */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit] = js.native
  def filterSocketsByUser(io: Server, filter: js.Function1[/* user */ js.Any, Boolean]): js.Array[Socket] = js.native
}

