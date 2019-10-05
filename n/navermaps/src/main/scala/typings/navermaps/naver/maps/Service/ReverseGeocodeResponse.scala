package typings.navermaps.naver.maps.Service

import typings.navermaps.Anon_ItemsTotal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReverseGeocodeResponse extends js.Object {
  var result: Anon_ItemsTotal
}

object ReverseGeocodeResponse {
  @scala.inline
  def apply(result: Anon_ItemsTotal): ReverseGeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result)
  
    __obj.asInstanceOf[ReverseGeocodeResponse]
  }
}

