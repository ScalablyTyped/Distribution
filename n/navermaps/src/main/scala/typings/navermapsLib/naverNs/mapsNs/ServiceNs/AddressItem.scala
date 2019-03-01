package typings
package navermapsLib.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressItem extends js.Object {
  var addrdetail: navermapsLib.Anon_Country
  var address: java.lang.String
}

object AddressItem {
  @scala.inline
  def apply(addrdetail: navermapsLib.Anon_Country, address: java.lang.String): AddressItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addrdetail")(addrdetail)
    __obj.updateDynamic("address")(address)
    __obj.asInstanceOf[AddressItem]
  }
}

