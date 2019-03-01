package typings
package navermapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsTotal extends js.Object {
  var items: js.Array[navermapsLib.naverNs.mapsNs.ServiceNs.AddressItem]
  var total: scala.Double
  var userquery: java.lang.String
}

object Anon_ItemsTotal {
  @scala.inline
  def apply(
    items: js.Array[navermapsLib.naverNs.mapsNs.ServiceNs.AddressItem],
    total: scala.Double,
    userquery: java.lang.String
  ): Anon_ItemsTotal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("total")(total)
    __obj.updateDynamic("userquery")(userquery)
    __obj.asInstanceOf[Anon_ItemsTotal]
  }
}

