package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerEvent extends StObject {
  
  var coord: Coord = js.native
  
  var feature: Feature = js.native
  
  var offset: Point = js.native
  
  var point: Point = js.native
  
  var pointerEvent: DOMEvent = js.native
}
object PointerEvent {
  
  @scala.inline
  def apply(coord: Coord, feature: Feature, offset: Point, point: Point, pointerEvent: DOMEvent): PointerEvent = {
    val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointerEvent = pointerEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEvent]
  }
  
  @scala.inline
  implicit class PointerEventMutableBuilder[Self <: PointerEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoord(value: Coord): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEvent(value: DOMEvent): Self = StObject.set(x, "pointerEvent", value.asInstanceOf[js.Any])
  }
}
