package typings.navermaps.naver.maps.visualization

import typings.navermaps.naver.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightedLocation extends js.Object {
  def getLocation(): LatLng
  def getWeight(): Double
  def lat(): Double
  def lng(): Double
}

object WeightedLocation {
  @scala.inline
  def apply(getLocation: () => LatLng, getWeight: () => Double, lat: () => Double, lng: () => Double): WeightedLocation = {
    val __obj = js.Dynamic.literal(getLocation = js.Any.fromFunction0(getLocation), getWeight = js.Any.fromFunction0(getWeight), lat = js.Any.fromFunction0(lat), lng = js.Any.fromFunction0(lng))
    __obj.asInstanceOf[WeightedLocation]
  }
}

