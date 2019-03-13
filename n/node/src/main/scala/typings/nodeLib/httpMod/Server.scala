package typings
package nodeLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", "Server")
@js.native
class Server ()
  extends nodeLib.netMod.Server {
  def this(options: ServerOptions) = this()
  def this(requestListener: RequestListener) = this()
  def this(options: ServerOptions, requestListener: RequestListener) = this()
  /**
    * Limit the amount of time the parser will wait to receive the complete HTTP headers.
    * @default 40000
    * {@link https://nodejs.org/api/http.html#http_server_headerstimeout}
    */
  var headersTimeout: scala.Double = js.native
  var keepAliveTimeout: scala.Double = js.native
  /**
    * Limits maximum incoming headers count. If set to 0, no limit will be applied.
    * @default 2000
    * {@link https://nodejs.org/api/http.html#http_server_maxheaderscount}
    */
  var maxHeadersCount: scala.Double | scala.Null = js.native
  var timeout: scala.Double = js.native
  def setTimeout(): this.type = js.native
  def setTimeout(callback: js.Function0[scala.Unit]): this.type = js.native
  def setTimeout(msecs: scala.Double): this.type = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
}

