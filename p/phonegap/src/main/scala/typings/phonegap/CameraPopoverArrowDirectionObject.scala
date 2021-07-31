package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraPopoverArrowDirectionObject extends StObject {
  
  var ARROW_ANY: Double
  
  var ARROW_DOWN: Double
  
  var ARROW_LEFT: Double
  
  var ARROW_RIGHT: Double
  
  var ARROW_UP: Double
}
object CameraPopoverArrowDirectionObject {
  
  @scala.inline
  def apply(ARROW_ANY: Double, ARROW_DOWN: Double, ARROW_LEFT: Double, ARROW_RIGHT: Double, ARROW_UP: Double): CameraPopoverArrowDirectionObject = {
    val __obj = js.Dynamic.literal(ARROW_ANY = ARROW_ANY.asInstanceOf[js.Any], ARROW_DOWN = ARROW_DOWN.asInstanceOf[js.Any], ARROW_LEFT = ARROW_LEFT.asInstanceOf[js.Any], ARROW_RIGHT = ARROW_RIGHT.asInstanceOf[js.Any], ARROW_UP = ARROW_UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraPopoverArrowDirectionObject]
  }
  
  @scala.inline
  implicit class CameraPopoverArrowDirectionObjectMutableBuilder[Self <: CameraPopoverArrowDirectionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARROW_ANY(value: Double): Self = StObject.set(x, "ARROW_ANY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARROW_DOWN(value: Double): Self = StObject.set(x, "ARROW_DOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARROW_LEFT(value: Double): Self = StObject.set(x, "ARROW_LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARROW_RIGHT(value: Double): Self = StObject.set(x, "ARROW_RIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARROW_UP(value: Double): Self = StObject.set(x, "ARROW_UP", value.asInstanceOf[js.Any])
  }
}
