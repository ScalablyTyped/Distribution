package typings.node.httpMod

import typings.node.netMod.Socket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequestArgs extends js.Object {
  var _defaultAgent: js.UndefOr[Agent] = js.undefined
  var agent: js.UndefOr[Agent | Boolean] = js.undefined
  var auth: js.UndefOr[String | Null] = js.undefined
  // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L278
  var createConnection: js.UndefOr[
    js.Function2[
      /* options */ ClientRequestArgs, 
      /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
      Socket
    ]
  ] = js.undefined
  var defaultPort: js.UndefOr[Double | String] = js.undefined
  var family: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var host: js.UndefOr[String | Null] = js.undefined
  var hostname: js.UndefOr[String | Null] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String | Null] = js.undefined
  var port: js.UndefOr[Double | String | Null] = js.undefined
  var protocol: js.UndefOr[String | Null] = js.undefined
  var setHost: js.UndefOr[Boolean] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ClientRequestArgs {
  @scala.inline
  def apply(
    _defaultAgent: Agent = null,
    agent: Agent | Boolean = null,
    auth: String = null,
    createConnection: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket = null,
    defaultPort: Double | String = null,
    family: Int | Double = null,
    headers: OutgoingHttpHeaders = null,
    host: String = null,
    hostname: String = null,
    localAddress: String = null,
    method: String = null,
    path: String = null,
    port: Double | String = null,
    protocol: String = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    socketPath: String = null,
    timeout: Int | Double = null
  ): ClientRequestArgs = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequestArgs]
  }
}

