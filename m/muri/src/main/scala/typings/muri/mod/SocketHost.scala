package typings.muri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketHost extends Host {
  var ipc: String
}

object SocketHost {
  @scala.inline
  def apply(ipc: String): SocketHost = {
    val __obj = js.Dynamic.literal(ipc = ipc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketHost]
  }
}

