package typings.node.httpMod

import typings.node.Error
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequestArgs extends js.Object {
  var _defaultAgent: js.UndefOr[Agent] = js.undefined
  var agent: js.UndefOr[Agent | Boolean] = js.undefined
  var auth: js.UndefOr[java.lang.String] = js.undefined
  // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L278
  var createConnection: js.UndefOr[
    js.Function2[
      /* options */ ClientRequestArgs, 
      /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
      Socket
    ]
  ] = js.undefined
  var defaultPort: js.UndefOr[Double | java.lang.String] = js.undefined
  var family: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[Double | java.lang.String] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var setHost: js.UndefOr[Boolean] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ClientRequestArgs {
  @scala.inline
  def apply(
    _defaultAgent: Agent = null,
    agent: Agent | Boolean = null,
    auth: java.lang.String = null,
    createConnection: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket = null,
    defaultPort: Double | java.lang.String = null,
    family: Int | Double = null,
    headers: OutgoingHttpHeaders = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    localAddress: java.lang.String = null,
    method: java.lang.String = null,
    path: java.lang.String = null,
    port: Double | java.lang.String = null,
    protocol: java.lang.String = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    socketPath: java.lang.String = null,
    timeout: Int | Double = null
  ): ClientRequestArgs = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequestArgs]
  }
}

