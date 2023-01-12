package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasPinchEvent
  extends StObject
     with CanvasEvent {
  
  var center: Point
  
  var distance: Double
  
  var gesturePoints: js.Array[GesturePoint]
  
  var lastCenter: Point
  
  var lastDistance: Double
  
  var pointerType: PointerType
  
  var preventDefaultPanAction: Boolean
  
  var preventDefaultRotateAction: Boolean
  
  var preventDefaultZoomAction: Boolean
  
  var shift: Boolean
}
object CanvasPinchEvent {
  
  inline def apply(
    center: Point,
    distance: Double,
    eventSource: Viewer,
    gesturePoints: js.Array[GesturePoint],
    lastCenter: Point,
    lastDistance: Double,
    originalEvent: Event,
    pointerType: PointerType,
    position: Point,
    preventDefaultPanAction: Boolean,
    preventDefaultRotateAction: Boolean,
    preventDefaultZoomAction: Boolean,
    shift: Boolean,
    tracker: MouseTracker,
    userData: Any
  ): CanvasPinchEvent = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], gesturePoints = gesturePoints.asInstanceOf[js.Any], lastCenter = lastCenter.asInstanceOf[js.Any], lastDistance = lastDistance.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefaultPanAction = preventDefaultPanAction.asInstanceOf[js.Any], preventDefaultRotateAction = preventDefaultRotateAction.asInstanceOf[js.Any], preventDefaultZoomAction = preventDefaultZoomAction.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasPinchEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasPinchEvent] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setGesturePoints(value: js.Array[GesturePoint]): Self = StObject.set(x, "gesturePoints", value.asInstanceOf[js.Any])
    
    inline def setGesturePointsVarargs(value: GesturePoint*): Self = StObject.set(x, "gesturePoints", js.Array(value*))
    
    inline def setLastCenter(value: Point): Self = StObject.set(x, "lastCenter", value.asInstanceOf[js.Any])
    
    inline def setLastDistance(value: Double): Self = StObject.set(x, "lastDistance", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultPanAction(value: Boolean): Self = StObject.set(x, "preventDefaultPanAction", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultRotateAction(value: Boolean): Self = StObject.set(x, "preventDefaultRotateAction", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultZoomAction(value: Boolean): Self = StObject.set(x, "preventDefaultZoomAction", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
  }
}
