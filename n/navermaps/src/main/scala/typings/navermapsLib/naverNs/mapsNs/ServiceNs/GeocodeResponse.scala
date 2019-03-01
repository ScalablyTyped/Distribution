package typings
package navermapsLib.naverNs.mapsNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeResponse extends js.Object {
  var result: navermapsLib.Anon_Items
}

object GeocodeResponse {
  @scala.inline
  def apply(result: navermapsLib.Anon_Items): GeocodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[GeocodeResponse]
  }
}

