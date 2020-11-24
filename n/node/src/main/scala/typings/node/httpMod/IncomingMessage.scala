package typings.node.httpMod

import typings.node.NodeJS.Dict
import typings.node.netMod.Socket
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http", "IncomingMessage")
@js.native
class IncomingMessage protected () extends Readable {
  def this(socket: Socket) = this()
  
  var aborted: Boolean = js.native
  
  var complete: Boolean = js.native
  
  /**
    * @deprecate Use `socket` instead.
    */
  var connection: Socket = js.native
  
  var headers: IncomingHttpHeaders = js.native
  
  var httpVersion: String = js.native
  
  var httpVersionMajor: Double = js.native
  
  var httpVersionMinor: Double = js.native
  
  /**
    * Only valid for request obtained from http.Server.
    */
  var method: js.UndefOr[String] = js.native
  
  var rawHeaders: js.Array[String] = js.native
  
  var rawTrailers: js.Array[String] = js.native
  
  def setTimeout(msecs: Double): this.type = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): this.type = js.native
  
  var socket: Socket = js.native
  
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusCode: js.UndefOr[Double] = js.native
  
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusMessage: js.UndefOr[String] = js.native
  
  var trailers: Dict[String] = js.native
  
  /**
    * Only valid for request obtained from http.Server.
    */
  var url: js.UndefOr[String] = js.native
}
