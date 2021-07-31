package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraPopoverOptions extends StObject {
  
  var arrowDir: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object CameraPopoverOptions {
  
  @scala.inline
  def apply(): CameraPopoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraPopoverOptions]
  }
  
  @scala.inline
  implicit class CameraPopoverOptionsMutableBuilder[Self <: CameraPopoverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowDir(value: Double): Self = StObject.set(x, "arrowDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowDirUndefined: Self = StObject.set(x, "arrowDir", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
