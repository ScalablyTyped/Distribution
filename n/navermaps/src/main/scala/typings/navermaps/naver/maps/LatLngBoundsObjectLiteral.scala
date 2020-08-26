package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLngBoundsObjectLiteral extends js.Object {
  var east: Double = js.native
  var north: Double = js.native
  var south: Double = js.native
  var west: Double = js.native
}

object LatLngBoundsObjectLiteral {
  @scala.inline
  def apply(east: Double, north: Double, south: Double, west: Double): LatLngBoundsObjectLiteral = {
    val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngBoundsObjectLiteral]
  }
  @scala.inline
  implicit class LatLngBoundsObjectLiteralOps[Self <: LatLngBoundsObjectLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEast(value: Double): Self = this.set("east", value.asInstanceOf[js.Any])
    @scala.inline
    def setNorth(value: Double): Self = this.set("north", value.asInstanceOf[js.Any])
    @scala.inline
    def setSouth(value: Double): Self = this.set("south", value.asInstanceOf[js.Any])
    @scala.inline
    def setWest(value: Double): Self = this.set("west", value.asInstanceOf[js.Any])
  }
  
}

