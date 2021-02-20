package typings.microsoftAjax.Sys.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides cross-browser access to DOM event properties and helper APIs that are used to attach handlers to DOM element events.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310935(v=vs.100).aspx}
  */
@js.native
trait DomEvent extends StObject {
  
  //#endregion
  //#region Fields
  /**
    * Gets a Boolean value that indicates the state of the ALT key when the associated event occurred.
    * Use the altKey field to determine whether the ALT key is pressed when the event occurred.
    *
    * @return true if the ALT key was pressed when the event occurred; otherwise, false.
    */
  var altKey: Boolean = js.native
  
  /**
    * Gets a Sys.UI.MouseButton enumeration value that indicates the button state of the mouse when the related event occurred.
    * Use the button field to determine which mouse button was pressed when the related event occurred.
    * @return A MouseButton value
    */
  var button: MouseButton = js.native
  
  /**
    * Gets the character code of the key that raised the associated keyPress event.
    * Use the charCode field to get the character code of a pressed key or key combination that raised a keyPress event.
    * The keyPress event provides a single character code that identifies key combinations.
    * The keyPress event is not raised for single modifier keys such as ALT, CTRL, and SHIFT.
    *
    * @return An integer value that represents the character code of the key or key combination that was pressed to raise the keyPress event.
    */
  var charCode: Double = js.native
  
  /**
    * Gets the x-coordinate of the mouse pointer's position relative to the client area of the browser window, excluding window scroll bars.
    * @return An integer that represents the x-coordinate in pixels.
    */
  var clientX: Double = js.native
  
  /**
    * Gets the y-coordinate of the mouse pointer's position relative to the client area of the browser window, excluding window scroll bars.
    * @return An integer that represents the y-coordinate in pixels.
    */
  var clientY: Double = js.native
  
  /**
    * Gets a Boolean value that indicates the state of the CTRL key when the associated event occurred.
    * @return true if the CTRL key was pressed when the event occurred; otherwise, false.
    */
  var ctrlKey: Boolean = js.native
  
  /**
    * Gets the key code of the key that raised the keyUp or keyDown event.
    * @return An integer value that represents the key code of the key that was pressed to raise the keyUp or keyDown event.
    */
  var keyCode: Double = js.native
  
  /**
    * Gets the x-coordinate of the mouse pointer's position relative to the object that raised the event.
    * @return An integer that represents the x-coordinate in pixels.
    */
  var offsetX: Double = js.native
  
  /**
    * Gets the y-coordinate of the mouse pointer's position relative to the object that raised the event.
    * @return An integer that represents the y-coordinate in pixels.
    */
  var offsetY: Double = js.native
  
  /**
    * Prevents the default DOM event action from happening.
    * Use the preventDefault method to prevent the default event action for the browser from occurring.
    * For example, if you prevent the keydown event of an input element from occurring, the character typed by the user is not automatically appended to the input element's value.
    */
  def preventDefault(): Unit = js.native
  
  /**
    * Gets the x-coordinate of the mouse pointer's position relative to the user's screen.
    * @return An integer that represents the x-coordinate in pixels.
    */
  var screenX: Double = js.native
  
  /**
    * Gets the y-coordinate of the mouse pointer's position relative to the user's screen.
    * @return An integer that represents the y-coordinate in pixels.
    */
  var screenY: Double = js.native
  
  /**
    * Gets a Boolean value that indicates the state of the SHIFT key when the associated event occurred.
    * @return true if the SHIFT key was pressed when the event occurred; otherwise, false.
    */
  var shiftKey: Boolean = js.native
  
  /**
    * Prevents an event from being propagated (bubbled) to parent elements.
    * By default, event notification is bubbled from a child object to parent objects until it reaches the document object.
    * The event notification stops if the event is handled during the propagation process.
    * Use the stopPropagation method to prevent an event from being propagated to parent elements.
    */
  def stopPropagation(): Unit = js.native
  
  /**
    * Gets the object that the event acted on.
    * @return An object that represents the target that the event acted on.
    */
  var target: js.Any = js.native
  
  /**
    * Gets the name of the event that was raised.
    * @return A string that represents the name of the event that was raised.
    */
  var `type`: String = js.native
}
object DomEvent {
  
  @scala.inline
  def apply(
    altKey: Boolean,
    button: MouseButton,
    charCode: Double,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    keyCode: Double,
    offsetX: Double,
    offsetY: Double,
    preventDefault: () => Unit,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: js.Any,
    `type`: String
  ): DomEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEvent]
  }
  
  @scala.inline
  implicit class DomEventMutableBuilder[Self <: DomEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
