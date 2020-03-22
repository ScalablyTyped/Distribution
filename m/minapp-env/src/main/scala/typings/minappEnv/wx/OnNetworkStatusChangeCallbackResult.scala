package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.`2g`
import typings.minappEnv.minappEnvStrings.`3g`
import typings.minappEnv.minappEnvStrings.`4g`
import typings.minappEnv.minappEnvStrings.none
import typings.minappEnv.minappEnvStrings.unknown
import typings.minappEnv.minappEnvStrings.wifi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnNetworkStatusChangeCallbackResult extends js.Object {
  /** 当前是否有网络链接 */
  var isConnected: Boolean
  /** 网络类型
    *
    * 可选值：
    * - 'wifi': wifi 网络;
    * - '2g': 2g 网络;
    * - '3g': 3g 网络;
    * - '4g': 4g 网络;
    * - 'unknown': Android 下不常见的网络类型;
    * - 'none': 无网络; */
  var networkType: wifi | `2g` | `3g` | `4g` | unknown | none
}

object OnNetworkStatusChangeCallbackResult {
  @scala.inline
  def apply(isConnected: Boolean, networkType: wifi | `2g` | `3g` | `4g` | unknown | none): OnNetworkStatusChangeCallbackResult = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnNetworkStatusChangeCallbackResult]
  }
}

