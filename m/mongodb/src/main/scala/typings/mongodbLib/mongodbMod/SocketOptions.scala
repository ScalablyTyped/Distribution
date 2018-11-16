package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SocketOptions extends js.Object {
  // Reconnect on error. default:false
  var autoReconnect: js.UndefOr[scala.Boolean] = js.undefined
  // TCP Connection timeout setting. default 0
  var connectTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  // Version of IP stack. Can be 4, 6 or null. default: null.
  // If null, will attempt to connect with IPv6, and will fall back to IPv4 on failure
  // refer to http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html
  var family: js.UndefOr[mongodbLib.mongodbLibNumbers.`4` | mongodbLib.mongodbLibNumbers.`6` | scala.Null] = js.undefined
  // TCP KeepAlive enabled on the socket. default:true
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  // TCP KeepAlive initial delay before sending first keep-alive packet when idle. default:300000
  var keepAliveInitialDelay: js.UndefOr[scala.Double] = js.undefined
  // TCP Socket NoDelay option. default:true
  var noDelay: js.UndefOr[scala.Boolean] = js.undefined
  // TCP Socket timeout setting. default 0
  var socketTimeoutMS: js.UndefOr[scala.Double] = js.undefined
}

