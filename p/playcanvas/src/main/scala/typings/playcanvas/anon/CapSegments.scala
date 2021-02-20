package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapSegments extends StObject {
  
  var capSegments: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var heightSegments: js.UndefOr[Double] = js.native
  
  var radius: js.UndefOr[Double] = js.native
}
object CapSegments {
  
  @scala.inline
  def apply(): CapSegments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapSegments]
  }
  
  @scala.inline
  implicit class CapSegmentsMutableBuilder[Self <: CapSegments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapSegments(value: Double): Self = StObject.set(x, "capSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapSegmentsUndefined: Self = StObject.set(x, "capSegments", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightSegmentsUndefined: Self = StObject.set(x, "heightSegments", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
