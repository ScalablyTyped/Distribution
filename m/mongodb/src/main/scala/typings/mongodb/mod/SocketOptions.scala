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
    connectTimeoutMS: Int | scala.Double = null,
    family: `4` | `6` = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelay: Int | scala.Double = null,
    noDelay: js.UndefOr[Boolean] = js.undefined,
    socketTimeoutMS: Int | scala.Double = null
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.asInstanceOf[js.Any])
    if (connectTimeoutMS != null) __obj.updateDynamic("connectTimeoutMS")(connectTimeoutMS.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (keepAliveInitialDelay != null) __obj.updateDynamic("keepAliveInitialDelay")(keepAliveInitialDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(noDelay)) __obj.updateDynamic("noDelay")(noDelay.asInstanceOf[js.Any])
    if (socketTimeoutMS != null) __obj.updateDynamic("socketTimeoutMS")(socketTimeoutMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
}

