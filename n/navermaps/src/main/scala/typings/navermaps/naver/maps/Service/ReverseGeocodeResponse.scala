package typings.navermaps.naver.maps.Service

import typings.navermaps.AnonItemsTotal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReverseGeocodeResponse extends js.Object {
  var result: AnonItemsTotal
}

object ReverseGeocodeResponse {
  @scala.inline
  def apply(result: AnonItemsTotal): ReverseGeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReverseGeocodeResponse]
  }
}

