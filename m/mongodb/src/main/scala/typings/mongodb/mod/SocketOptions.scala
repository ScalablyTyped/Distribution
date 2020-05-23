package typings.mongodb.mod

import typings.mongodb.mongodbNumbers.`4`
import typings.mongodb.mongodbNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  /**
    * Reconnect on error. default:false
    */
  var autoReconnect: js.UndefOr[Boolean] = js.undefined
  /**
    * TCP Connection timeout setting. default 0
    */
  var connectTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * Version of IP stack. Can be 4, 6 or null. default: null.
    *
    * If null, will attempt to connect with IPv6, and will fall back to IPv4 on failure
    * refer to http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html
    */
  var family: js.UndefOr[`4` | `6` | Null] = js.undefined
  /**
    * TCP KeepAlive enabled on the socket. default:true
    */
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  /**
    * TCP KeepAlive initial delay before sending first keep-alive packet when idle. default:300000
    */
  var keepAliveInitialDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * TCP Socket NoDelay option. default:true
    */
  var noDelay: js.UndefOr[Boolean] = js.undefined
  /**
    * TCP Socket timeout setting. default 0
    */
  var socketTimeoutMS: js.UndefOr[scala.Double] = js.undefined
}

object SocketOptions {
  @scala.inline
  def apply(
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    connectTimeoutMS: js.UndefOr[scala.Double] = js.undefined,
    family: js.UndefOr[Null | `4` | `6`] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelay: js.UndefOr[scala.Double] = js.undefined,
    noDelay: js.UndefOr[Boolean] = js.undefined,
    socketTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeoutMS)) __obj.updateDynamic("connectTimeoutMS")(connectTimeoutMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveInitialDelay)) __obj.updateDynamic("keepAliveInitialDelay")(keepAliveInitialDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noDelay)) __obj.updateDynamic("noDelay")(noDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(socketTimeoutMS)) __obj.updateDynamic("socketTimeoutMS")(socketTimeoutMS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
}

