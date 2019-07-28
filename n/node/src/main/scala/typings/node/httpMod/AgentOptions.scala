package typings.node.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions extends js.Object {
  /**
    * Keep sockets around in a pool to be used by other requests in the future. Default = false
    */
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  /**
    * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
    * Only relevant if keepAlive is set to true.
    */
  var keepAliveMsecs: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
    */
  var maxFreeSockets: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
    */
  var maxSockets: js.UndefOr[Double] = js.undefined
  /**
    * Socket timeout in milliseconds. This will set the timeout after the socket is connected.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object AgentOptions {
  @scala.inline
  def apply(
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveMsecs: Int | Double = null,
    maxFreeSockets: Int | Double = null,
    maxSockets: Int | Double = null,
    timeout: Int | Double = null
  ): AgentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveMsecs != null) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.asInstanceOf[js.Any])
    if (maxFreeSockets != null) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOptions]
  }
}

