package typings.passportDotSocketio.passportDotSocketioMod

import typings.socketDotIo.socketDotIoMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport.socketio", "authorize")
@js.native
object authorize extends js.Object {
  def apply(options: PassportSocketIoOptions): js.Function2[/* socket */ Socket, /* fn */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit] = js.native
}

