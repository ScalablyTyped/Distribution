package typings.muri.muriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketHost extends Host {
  var ipc: String
}

object SocketHost {
  @scala.inline
  def apply(ipc: String): SocketHost = {
    val __obj = js.Dynamic.literal(ipc = ipc)
  
    __obj.asInstanceOf[SocketHost]
  }
}

