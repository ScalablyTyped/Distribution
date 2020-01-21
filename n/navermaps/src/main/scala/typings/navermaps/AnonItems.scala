package typings.navermaps

import typings.navermaps.naver.maps.Service.AddressItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  var items: js.Array[AddressItem]
  var total: Double
  var userquery: js.Any
}

object AnonItems {
  @scala.inline
  def apply(items: js.Array[AddressItem], total: Double, userquery: js.Any): AnonItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItems]
  }
}

