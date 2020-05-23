package typings.navermaps.naver.maps.Service

import typings.navermaps.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeResponse extends js.Object {
  var result: Items
}

object GeocodeResponse {
  @scala.inline
  def apply(result: Items): GeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeResponse]
  }
}

