package typings.navermaps

import typings.navermaps.naver.maps.Service.AddressItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  var items: js.Array[AddressItem]
  var total: Double
  var userquery: js.Any
}

object Anon_Items {
  @scala.inline
  def apply(items: js.Array[AddressItem], total: Double, userquery: js.Any): Anon_Items = {
    val __obj = js.Dynamic.literal(items = items, total = total, userquery = userquery)
  
    __obj.asInstanceOf[Anon_Items]
  }
}

