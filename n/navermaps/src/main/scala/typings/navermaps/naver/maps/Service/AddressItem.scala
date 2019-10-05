package typings.navermaps.naver.maps.Service

import typings.navermaps.Anon_Country
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressItem extends js.Object {
  var addrdetail: Anon_Country
  var address: String
}

object AddressItem {
  @scala.inline
  def apply(addrdetail: Anon_Country, address: String): AddressItem = {
    val __obj = js.Dynamic.literal(addrdetail = addrdetail, address = address)
  
    __obj.asInstanceOf[AddressItem]
  }
}

