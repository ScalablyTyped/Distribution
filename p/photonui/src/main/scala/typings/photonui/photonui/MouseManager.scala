package typings.photonui.photonui

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseManager
  extends StObject
     with Base {
  
  var action: String
  
  // readonly
  var btnLeft: Boolean
  
  // readonly
  var btnMiddle: Boolean
  
  // readonly
  var btnRight: Boolean
  
  // readonly
  var button: String
  
  // readonly
  var deltaX: Double
  
  // readonly
  var deltaY: Double
  
  var element: HTMLElement
  
  // readonly
  var pageX: Double
  
  // readonly
  var pageY: Double
  
  var threshold: Double
  
  // readonly
  var x: Double
  
  // readonly
  var y: Double
}
object MouseManager {
  
  @scala.inline
  def apply(
    action: String,
    btnLeft: Boolean,
    btnMiddle: Boolean,
    btnRight: Boolean,
    button: String,
    deltaX: Double,
    deltaY: Double,
    destroy: () => Unit,
    element: HTMLElement,
    pageX: Double,
    pageY: Double,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    threshold: Double,
    x: Double,
    y: Double
  ): MouseManager = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], btnLeft = btnLeft.asInstanceOf[js.Any], btnMiddle = btnMiddle.asInstanceOf[js.Any], btnRight = btnRight.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), threshold = threshold.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseManager]
  }
  
  @scala.inline
  implicit class MouseManagerMutableBuilder[Self <: MouseManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnLeft(value: Boolean): Self = StObject.set(x, "btnLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnMiddle(value: Boolean): Self = StObject.set(x, "btnMiddle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnRight(value: Boolean): Self = StObject.set(x, "btnRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
