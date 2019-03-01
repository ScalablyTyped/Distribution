package typings
package nodeDashGeocoderLib.nodeDashGeocoderMod.nodeUnderscoreGeocoderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var lat: scala.Double
  var lon: scala.Double
}

object Location {
  @scala.inline
  def apply(lat: scala.Double, lon: scala.Double): Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lon")(lon)
    __obj.asInstanceOf[Location]
  }
}

