package typings
package nodeLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", "Server")
@js.native
class Server ()
  extends nodeLib.netMod.Server {
  def this(requestListener: js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, scala.Unit]) = this()
  var keepAliveTimeout: scala.Double = js.native
  var maxHeadersCount: scala.Double = js.native
  var timeout: scala.Double = js.native
  def setTimeout(): this.type = js.native
  def setTimeout(callback: js.Function0[scala.Unit]): this.type = js.native
  def setTimeout(msecs: scala.Double): this.type = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
}

