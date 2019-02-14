package typings
package nodeLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", "Server")
@js.native
class Server protected ()
  extends nodeLib.tlsMod.Server {
  def this(options: ServerOptions) = this()
  def this(options: ServerOptions, requestListener: nodeLib.httpMod.RequestListener) = this()
  var keepAliveTimeout: scala.Double = js.native
  var timeout: scala.Double = js.native
  def setTimeout(): this.type = js.native
  def setTimeout(callback: js.Function0[scala.Unit]): this.type = js.native
  def setTimeout(msecs: scala.Double): this.type = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
}

