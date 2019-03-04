package typings
package muriLib.muriMod.MuriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketHost extends Host {
  var ipc: java.lang.String
}

object SocketHost {
  @scala.inline
  def apply(ipc: java.lang.String): SocketHost = {
    val __obj = js.Dynamic.literal(ipc = ipc)
  
    __obj.asInstanceOf[SocketHost]
  }
}

