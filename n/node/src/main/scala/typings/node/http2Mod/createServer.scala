package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Http2Server = js.native
  def apply(
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2Server = js.native
  def apply(options: ServerOptions): Http2Server = js.native
  def apply(
    options: ServerOptions,
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2Server = js.native
}

