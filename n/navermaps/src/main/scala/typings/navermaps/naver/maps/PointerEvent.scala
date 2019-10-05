package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEvent extends js.Object {
  var coord: Coord
  var feature: Feature
  var offset: Point
  var point: Point
  var pointerEvent: DOMEvent
}

object PointerEvent {
  @scala.inline
  def apply(coord: Coord, feature: Feature, offset: Point, point: Point, pointerEvent: DOMEvent): PointerEvent = {
    val __obj = js.Dynamic.literal(coord = coord, feature = feature, offset = offset, point = point, pointerEvent = pointerEvent)
  
    __obj.asInstanceOf[PointerEvent]
  }
}

