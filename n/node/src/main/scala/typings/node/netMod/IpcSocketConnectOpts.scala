package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpcSocketConnectOpts extends SocketConnectOpts {
  var path: java.lang.String
}

object IpcSocketConnectOpts {
  @scala.inline
  def apply(path: java.lang.String): IpcSocketConnectOpts = {
    val __obj = js.Dynamic.literal(path = path)
  
    __obj.asInstanceOf[IpcSocketConnectOpts]
  }
}

