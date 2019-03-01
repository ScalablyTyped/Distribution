package typings
package ngeohashLib.ngeohashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographicPoint extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object GeographicPoint {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): GeographicPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[GeographicPoint]
  }
}

