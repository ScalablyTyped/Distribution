package typings
package nodeLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpcNetConnectOpts
  extends IpcSocketConnectOpts
     with SocketConstructorOpts {
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

