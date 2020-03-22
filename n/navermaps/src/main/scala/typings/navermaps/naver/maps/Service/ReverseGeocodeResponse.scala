package typings.navermaps.naver.maps.Service

import typings.navermaps.AnonTotal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReverseGeocodeResponse extends js.Object {
  var result: AnonTotal
}

object ReverseGeocodeResponse {
  @scala.inline
  def apply(result: AnonTotal): ReverseGeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReverseGeocodeResponse]
  }
}

