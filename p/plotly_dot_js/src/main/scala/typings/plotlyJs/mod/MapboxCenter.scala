package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapboxCenter extends js.Object {
  var lat: Double
  var lon: Double
}

object MapboxCenter {
  @scala.inline
  def apply(lat: Double, lon: Double): MapboxCenter = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxCenter]
  }
}

