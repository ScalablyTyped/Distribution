package typings.msDashRest.msDashRestMod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest", "IncomingMessage")
@js.native
class IncomingMessage protected ()
  extends typings.node.httpMod.IncomingMessage {
  def this(socket: Socket) = this()
}

