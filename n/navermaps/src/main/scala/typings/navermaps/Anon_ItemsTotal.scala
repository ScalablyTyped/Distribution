package typings.navermaps

import typings.navermaps.naver.maps.Service.AddressItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsTotal extends js.Object {
  var items: js.Array[AddressItem]
  var total: Double
  var userquery: String
}

object Anon_ItemsTotal {
  @scala.inline
  def apply(items: js.Array[AddressItem], total: Double, userquery: String): Anon_ItemsTotal = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsTotal]
  }
}

