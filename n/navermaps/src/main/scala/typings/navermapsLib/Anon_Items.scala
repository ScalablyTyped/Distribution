package typings
package navermapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  var items: js.Array[navermapsLib.naverNs.mapsNs.ServiceNs.AddressItem]
  var total: scala.Double
  var userquery: js.Any
}

object Anon_Items {
  @scala.inline
  def apply(
    items: js.Array[navermapsLib.naverNs.mapsNs.ServiceNs.AddressItem],
    total: scala.Double,
    userquery: js.Any
  ): Anon_Items = {
    val __obj = js.Dynamic.literal(items = items, total = total, userquery = userquery)
  
    __obj.asInstanceOf[Anon_Items]
  }
}

