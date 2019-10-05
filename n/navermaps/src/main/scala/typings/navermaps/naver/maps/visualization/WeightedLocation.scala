package typings.navermaps.naver.maps.visualization

import typings.navermaps.naver.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.visualization.WeightedLocation")
@js.native
class WeightedLocation protected () extends js.Object {
  def this(lat: Double, lng: Double) = this()
  def this(lat: Double, lng: Double, weight: Double) = this()
  def getLocation(): LatLng = js.native
  def getWeight(): Double = js.native
  def lat(): Double = js.native
  def lng(): Double = js.native
}

