package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngBoundsObjectLiteral extends js.Object {
  var east: Double
  var north: Double
  var south: Double
  var west: Double
}

object LatLngBoundsObjectLiteral {
  @scala.inline
  def apply(east: Double, north: Double, south: Double, west: Double): LatLngBoundsObjectLiteral = {
    val __obj = js.Dynamic.literal(east = east, north = north, south = south, west = west)
  
    __obj.asInstanceOf[LatLngBoundsObjectLiteral]
  }
}

