package typings.naverWhale

import typings.chrome.chrome.privacy.Network_
import typings.chrome.chrome.privacy.Services_
import typings.chrome.chrome.privacy.Websites_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofprivacy extends js.Object {
  var network: Network_
  var services: Services_
  var websites: Websites_
}

object Typeofprivacy {
  @scala.inline
  def apply(network: Network_, services: Services_, websites: Websites_): Typeofprivacy = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], websites = websites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofprivacy]
  }
}

