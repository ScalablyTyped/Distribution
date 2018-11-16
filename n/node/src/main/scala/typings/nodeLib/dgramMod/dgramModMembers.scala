package typings
package nodeLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dgram", JSImport.Namespace)
@js.native
object dgramModMembers extends js.Object {
  def createSocket(options: SocketOptions): Socket = js.native
  def createSocket(
    options: SocketOptions,
    callback: js.Function2[/* msg */ nodeLib.Buffer, /* rinfo */ RemoteInfo, scala.Unit]
  ): Socket = js.native
  def createSocket(`type`: SocketType): Socket = js.native
  def createSocket(
    `type`: SocketType,
    callback: js.Function2[/* msg */ nodeLib.Buffer, /* rinfo */ RemoteInfo, scala.Unit]
  ): Socket = js.native
}

