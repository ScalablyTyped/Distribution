package typings.navermaps

import typings.navermaps.naverNs.mapsNs.ServiceNs.AddressItem
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
    val __obj = js.Dynamic.literal(items = items, total = total, userquery = userquery)
  
    __obj.asInstanceOf[Anon_ItemsTotal]
  }
}

