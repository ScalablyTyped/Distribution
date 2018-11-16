package typings
package navermapsLib.naverNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.visualization.WeightedLocation")
@js.native
class WeightedLocation protected () extends js.Object {
  def this(lat: scala.Double, lng: scala.Double) = this()
  def this(lat: scala.Double, lng: scala.Double, weight: scala.Double) = this()
  def getLocation(): navermapsLib.naverNs.mapsNs.LatLng = js.native
  def getWeight(): scala.Double = js.native
  def lat(): scala.Double = js.native
  def lng(): scala.Double = js.native
}

