package typings.playcanvas.anon

import typings.playcanvas.pc.Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HalfExtents extends StObject {
  
  var halfExtents: js.UndefOr[Vec2] = js.native
  
  var lengthSegments: js.UndefOr[Double] = js.native
  
  var widthSegments: js.UndefOr[Double] = js.native
}
object HalfExtents {
  
  @scala.inline
  def apply(): HalfExtents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HalfExtents]
  }
  
  @scala.inline
  implicit class HalfExtentsMutableBuilder[Self <: HalfExtents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHalfExtents(value: Vec2): Self = StObject.set(x, "halfExtents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfExtentsUndefined: Self = StObject.set(x, "halfExtents", js.undefined)
    
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
