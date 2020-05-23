package typings.navermaps.naver.maps.Service

import typings.navermaps.anon.Total
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReverseGeocodeResponse extends js.Object {
  var result: Total
}

object ReverseGeocodeResponse {
  @scala.inline
  def apply(result: Total): ReverseGeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseGeocodeResponse]
  }
}

