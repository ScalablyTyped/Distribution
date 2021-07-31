package typings.playcanvas.anon

import typings.playcanvas.pc.Vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightSegments extends StObject {
  
  var halfExtents: js.UndefOr[Vec3] = js.undefined
  
  var heightSegments: js.UndefOr[Double] = js.undefined
  
  var lengthSegments: js.UndefOr[Double] = js.undefined
  
  var widthSegments: js.UndefOr[Double] = js.undefined
}
object HeightSegments {
  
  @scala.inline
  def apply(): HeightSegments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightSegments]
  }
  
  @scala.inline
  implicit class HeightSegmentsMutableBuilder[Self <: HeightSegments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHalfExtents(value: Vec3): Self = StObject.set(x, "halfExtents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfExtentsUndefined: Self = StObject.set(x, "halfExtents", js.undefined)
    
    @scala.inline
    def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightSegmentsUndefined: Self = StObject.set(x, "heightSegments", js.undefined)
    
    @scala.inline
    def setLengthSegments(value: Double): Self = StObject.set(x, "lengthSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthSegmentsUndefined: Self = StObject.set(x, "lengthSegments", js.undefined)
    
    @scala.inline
    def setWidthSegments(value: Double): Self = StObject.set(x, "widthSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthSegmentsUndefined: Self = StObject.set(x, "widthSegments", js.undefined)
  }
}
