package typings.node.dgramMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dgram", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createSocket(options: SocketOptions): Socket = js.native
  def createSocket(options: SocketOptions, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = js.native
  def createSocket(`type`: SocketType): Socket = js.native
  def createSocket(`type`: SocketType, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = js.native
}

