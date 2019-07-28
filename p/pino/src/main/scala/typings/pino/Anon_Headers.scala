package typings.pino

import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: IncomingHttpHeaders
  var method: String
  var remoteAddress: String
  var remotePort: Double
  var url: String
}

object Anon_Headers {
  @scala.inline
  def apply(
    headers: IncomingHttpHeaders,
    method: String,
    remoteAddress: String,
    remotePort: Double,
    url: String
  ): Anon_Headers = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, remoteAddress = remoteAddress, remotePort = remotePort, url = url)
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

