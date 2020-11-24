package typings.photonui.photonui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseManager extends Base {
  
  var action: String = js.native
  
   // readonly
  var btnLeft: Boolean = js.native
  
   // readonly
  var btnMiddle: Boolean = js.native
  
   // readonly
  var btnRight: Boolean = js.native
  
   // readonly
  var button: String = js.native
  
   // readonly
  var deltaX: Double = js.native
  
   // readonly
  var deltaY: Double = js.native
  
  var element: HTMLElement = js.native
  
   // readonly
  var pageX: Double = js.native
  
   // readonly
  var pageY: Double = js.native
  
  var threshold: Double = js.native
  
   // readonly
  var x: Double = js.native
  
   // readonly
  var y: Double = js.native
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
  implicit class MouseManagerOps[Self <: MouseManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnLeft(value: Boolean): Self = this.set("btnLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnMiddle(value: Boolean): Self = this.set("btnMiddle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnRight(value: Boolean): Self = this.set("btnRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
