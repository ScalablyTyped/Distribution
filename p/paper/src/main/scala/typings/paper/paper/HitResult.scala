package typings.paper.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * A HitResult object contains information about the results of a hit
  * test. It is returned by {@link Item#hitTest} and
  * {@link Project#hitTest}.
  */
trait HitResult extends StObject {
  
  /** 
    * If the HitResult has a type of 'pixel', this property refers to the color
    * of the pixel on the {@link Raster} that was hit.
    */
  var color: Color | Null
  
  /** 
    * The item that was hit.
    */
  var item: Item
  
  /** 
    * If the HitResult has a type of 'curve' or 'stroke', this property gives
    * more information about the exact position that was hit on the path.
    */
  var location: CurveLocation
  
  /** 
    * If the HitResult has a {@link HitResult#type} of `'bounds'`, this
    * property describes which corner of the bounding rectangle was hit.
    */
  var name: String
  
  /** 
    * Describes the actual coordinates of the segment, handle or bounding box
    * corner that was hit.
    */
  var point: Point
  
  /** 
    * If the HitResult has a type of 'stroke', 'segment', 'handle-in' or
    * 'handle-out', this property refers to the segment that was hit or that
    * is closest to the hitResult.location on the curve.
    */
  var segment: Segment
  
  /** 
    * Describes the type of the hit result. For example, if you hit a segment
    * point, the type would be `'segment'`.
    */
  var `type`: String
}
object HitResult {
  
  @scala.inline
  def apply(item: Item, location: CurveLocation, name: String, point: Point, segment: Segment, `type`: String): HitResult = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any], color = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitResult]
  }
  
  @scala.inline
  implicit class HitResultMutableBuilder[Self <: HitResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNull: Self = StObject.set(x, "color", null)
    
    @scala.inline
    def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: CurveLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegment(value: Segment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
