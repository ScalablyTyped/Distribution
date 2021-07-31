package typings.playcanvas.pc

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new Touch object from the browser Touch.
  * @property id - The identifier of the touch.
  * @property x - The x co-ordinate relative to the element that the TouchDevice is attached to.
  * @property y - The y co-ordinate relative to the element that the TouchDevice is attached to.
  * @property target - The target element of the touch event.
  * @property touch - The original browser Touch object.
  * @param touch - The browser Touch object.
  */
trait Touch extends StObject {
  
  /**
    * The identifier of the touch.
    */
  var id: Double
  
  /**
    * The target element of the touch event.
    */
  var target: Element
  
  /**
    * The original browser Touch object.
    */
  var touch: Touch
  
  /**
    * The x co-ordinate relative to the element that the TouchDevice is attached to.
    */
  var x: Double
  
  /**
    * The y co-ordinate relative to the element that the TouchDevice is attached to.
    */
  var y: Double
}
object Touch {
  
  @scala.inline
  def apply(id: Double, target: Element, touch: Touch, x: Double, y: Double): Touch = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch]
  }
  
  @scala.inline
  implicit class TouchMutableBuilder[Self <: Touch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch(value: Touch): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
