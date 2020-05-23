package typings.navermaps.naver.maps.Service

import typings.navermaps.anon.Country
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressItem extends js.Object {
  var addrdetail: Country
  var address: String
}

object AddressItem {
  @scala.inline
  def apply(addrdetail: Country, address: String): AddressItem = {
    val __obj = js.Dynamic.literal(addrdetail = addrdetail.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressItem]
  }
}

