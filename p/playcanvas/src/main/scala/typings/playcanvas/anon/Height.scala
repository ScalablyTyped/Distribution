package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var heightSegments: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var sides: js.UndefOr[Double] = js.undefined
}
object Height {
  
  @scala.inline
  def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
  }
}
