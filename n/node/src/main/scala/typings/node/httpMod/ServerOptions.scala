package typings.node.httpMod

import org.scalablytyped.runtime.Instantiable1
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage]] = js.undefined
  var ServerResponse: js.UndefOr[Instantiable1[/* req */ IncomingMessage, typings.node.httpMod.ServerResponse]] = js.undefined
  /**
    * Use an insecure HTTP parser that accepts invalid HTTP headers when true.
    * Using the insecure parser should be avoided.
    * See --insecure-http-parser for more information.
    * @default false
    */
  var insecureHTTPParser: js.UndefOr[Boolean] = js.undefined
  /**
    * Optionally overrides the value of
    * [`--max-http-header-size`][] for requests received by this server, i.e.
    * the maximum length of request headers in bytes.
    * @default 8192
    */
  var maxHeaderSize: js.UndefOr[Double] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    IncomingMessage: Instantiable1[/* socket */ Socket, IncomingMessage] = null,
    ServerResponse: Instantiable1[/* req */ IncomingMessage, ServerResponse] = null,
    insecureHTTPParser: js.UndefOr[Boolean] = js.undefined,
    maxHeaderSize: js.UndefOr[Double] = js.undefined
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (IncomingMessage != null) __obj.updateDynamic("IncomingMessage")(IncomingMessage.asInstanceOf[js.Any])
    if (ServerResponse != null) __obj.updateDynamic("ServerResponse")(ServerResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureHTTPParser)) __obj.updateDynamic("insecureHTTPParser")(insecureHTTPParser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeaderSize)) __obj.updateDynamic("maxHeaderSize")(maxHeaderSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

