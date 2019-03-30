package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Network extends js.Object {
  var network: chromeLib.chromeNs.privacyNs.Network
  var services: chromeLib.chromeNs.privacyNs.Services
  var websites: chromeLib.chromeNs.privacyNs.Websites
}

object Anon_Network {
  @scala.inline
  def apply(
    network: chromeLib.chromeNs.privacyNs.Network,
    services: chromeLib.chromeNs.privacyNs.Services,
    websites: chromeLib.chromeNs.privacyNs.Websites
  ): Anon_Network = {
    val __obj = js.Dynamic.literal(network = network, services = services, websites = websites)
  
    __obj.asInstanceOf[Anon_Network]
  }
}

