package typings.playcanvas.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MouseEvent object that is passed to events 'mousemove', 'mouseup', 'mousedown' and 'mousewheel'.
  */
trait MouseEvent1 extends StObject {
  
  /**
    * True if the alt key was pressed when this event was fired.
    *
    * @type {boolean}
    */
  var altKey: Boolean
  
  /**
    * The mouse button associated with this event. Can be:
    *
    * - {@link MOUSEBUTTON_LEFT}
    * - {@link MOUSEBUTTON_MIDDLE}
    * - {@link MOUSEBUTTON_RIGHT}
    *
    * @type {number}
    */
  var button: Double
  
  var buttons: js.Array[Boolean]
  
  /**
    * True if the ctrl key was pressed when this event was fired.
    *
    * @type {boolean}
    */
  var ctrlKey: Boolean
  
  /**
    * The change in x coordinate since the last mouse event.
    *
    * @type {number}
    */
  var dx: Double
  
  /**
    * The change in y coordinate since the last mouse event.
    *
    * @type {number}
    */
  var dy: Double
  
  /**
    * The element that the mouse was fired from.
    *
    * @type {Element}
    */
  var element: Element
  
  /**
    * The original browser event.
    *
    * @type {globalThis.MouseEvent}
    */
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.MouseEvent */ Any
  
  /**
    * True if the meta key was pressed when this event was fired.
    *
    * @type {boolean}
    */
  var metaKey: Boolean
  
  /**
    * True if the shift key was pressed when this event was fired.
    *
    * @type {boolean}
    */
  var shiftKey: Boolean
  
  /**
    * A value representing the amount the mouse wheel has moved, only valid for
    * {@link mousewheel} events.
    *
    * @type {number}
    */
  var wheelDelta: Double
  
  /**
    * The x coordinate of the mouse pointer relative to the element {@link Mouse} is
    * attached to.
    *
    * @type {number}
    */
  var x: Double
  
  /**
    * The y coordinate of the mouse pointer relative to the element {@link Mouse} is
    * attached to.
    *
    * @type {number}
    */
  var y: Double
}
object MouseEvent1 {
  
  inline def apply(
    altKey: Boolean,
    button: Double,
    buttons: js.Array[Boolean],
    ctrlKey: Boolean,
    dx: Double,
    dy: Double,
    element: Element,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.MouseEvent */ Any,
    metaKey: Boolean,
    shiftKey: Boolean,
    wheelDelta: Double,
    x: Double,
    y: Double
  ): MouseEvent1 = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], wheelDelta = wheelDelta.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent1]
  }
  
  extension [Self <: MouseEvent1](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: js.Array[Boolean]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: Boolean*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.MouseEvent */ Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setWheelDelta(value: Double): Self = StObject.set(x, "wheelDelta", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
