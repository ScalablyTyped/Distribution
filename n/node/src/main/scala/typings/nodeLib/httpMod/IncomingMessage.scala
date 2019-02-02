package typings
package nodeLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", "IncomingMessage")
@js.native
class IncomingMessage protected ()
  extends nodeLib.streamMod.Readable {
  def this(socket: nodeLib.netMod.Socket) = this()
  var connection: nodeLib.netMod.Socket = js.native
  var headers: IncomingHttpHeaders = js.native
  var httpVersion: java.lang.String = js.native
  var httpVersionMajor: scala.Double = js.native
  var httpVersionMinor: scala.Double = js.native
  /**
    * Only valid for request obtained from http.Server.
    */
  var method: js.UndefOr[java.lang.String] = js.native
  var rawHeaders: js.Array[java.lang.String] = js.native
  var rawTrailers: js.Array[java.lang.String] = js.native
  var socket: nodeLib.netMod.Socket = js.native
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusCode: js.UndefOr[scala.Double] = js.native
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusMessage: js.UndefOr[java.lang.String] = js.native
  var trailers: /* import warning: ImportType.apply Failed type conversion: {[key: string] : string | undefined, [key: string] : string | undefined} */ js.Any = js.native
  /**
    * Only valid for request obtained from http.Server.
    */
  var url: js.UndefOr[java.lang.String] = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
}

