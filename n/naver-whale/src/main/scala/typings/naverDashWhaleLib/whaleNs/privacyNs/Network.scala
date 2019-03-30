package typings
package naverDashWhaleLib.whaleNs.privacyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  var networkPredictionEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** @since Chrome 42. */
  var webRTCMultipleRoutesEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** @since Chrome 47. Warning: this is the current Dev channel. */
  var webRTCNonProxiedUdpEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
}

object Network {
  @scala.inline
  def apply(
    networkPredictionEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    webRTCMultipleRoutesEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    webRTCNonProxiedUdpEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  ): Network = {
    val __obj = js.Dynamic.literal(networkPredictionEnabled = networkPredictionEnabled, webRTCMultipleRoutesEnabled = webRTCMultipleRoutesEnabled, webRTCNonProxiedUdpEnabled = webRTCNonProxiedUdpEnabled)
  
    __obj.asInstanceOf[Network]
  }
}

