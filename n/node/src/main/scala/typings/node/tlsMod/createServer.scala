package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Server = js.native
  def apply(options: TlsOptions): Server = js.native
  def apply(options: TlsOptions, secureConnectionListener: js.Function1[/* socket */ TLSSocket, Unit]): Server = js.native
  def apply(secureConnectionListener: js.Function1[/* socket */ TLSSocket, Unit]): Server = js.native
}

