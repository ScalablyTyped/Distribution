package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "createSecureServer")
@js.native
object createSecureServer extends js.Object {
  def apply(): Http2SecureServer = js.native
  def apply(
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2SecureServer = js.native
  def apply(options: SecureServerOptions): Http2SecureServer = js.native
  def apply(
    options: SecureServerOptions,
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2SecureServer = js.native
}

