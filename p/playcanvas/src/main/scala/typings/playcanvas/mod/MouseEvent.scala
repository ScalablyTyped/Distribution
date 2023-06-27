package typings.playcanvas.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MouseEvent object that is passed to events 'mousemove', 'mouseup', 'mousedown' and 'mousewheel'.
  */
@JSImport("playcanvas", "MouseEvent")
@js.native
open class MouseEvent protected ()
  extends StObject
     with MouseEvent1 {
  /**
    * Create a new MouseEvent instance.
    *
    * @param {import('./mouse.js').Mouse} mouse - The Mouse device that is firing this event.
    * @param {globalThis.MouseEvent} event - The original browser event that fired.
    */
  def this(
    mouse: Mouse,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.MouseEvent */ Any
  ) = this()
  
  /**
    * True if the alt key was pressed when this event was fired.
    *
    * @type {boolean}
    */
  /* CompleteClass */
  var altKey: Boolean = js.native
  
  /**
    * The mouse button associated with this event. Can be:
    *
    * - {@link MOUSEBUTTON_LEFT}
    * - {@link MOUSEBUTTON_MIDDLE}
    * - {@link MOUSEBUTTON_RIGHT}
    *
    * @type {number}
    */
  /* CompleteClass */
  var button: Double = js.native
  
  /* CompleteClass */
  var buttons: js.Array[Boolean] = js.native
  
  /**
    * True if the ctrl key was pressed when this event was fired.
    *
    * @type {boolean}
    */
  /* CompleteClass */
  var ctrlKey: Boolean = js.native
  
  /**
    * The change in x coordinate since the last mouse event.
    *
    * @type {number}
    */
  /* CompleteClass */
  var dx: Double = js.native
  
  /**
    * The change in y coordinate since the last mouse event.
    *
    * @type {number}
    */
  /* CompleteClass */
  var dy: Double = js.native
  
  /**
    * The element that the mouse was fired from.
    *
    * @type {Element}
    */
  /* CompleteClass */
  var element: Element = js.native
  
  /**
    * The original browser event.
    *
    * @type {globalThis.MouseEvent}
    */
  /* CompleteClass */
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.MouseEvent */ Any = js.native
  
  /**
    * True if the meta key was pressed when this event was fired.
    *
    * @type {boolean}
    */
  /* CompleteClass */
  var metaKey: Boolean = js.native
  
  /**
    * True if the shift key was pressed when this event was fired.
    *
    * @type {boolean}
    */
  /* CompleteClass */
  var shiftKey: Boolean = js.native
  
  /**
    * A value representing the amount the mouse wheel has moved, only valid for
    * {@link EVENT_MOUSEWHEEL} events.
    *
    * @type {number}
    */
  /* CompleteClass */
  var wheelDelta: Double = js.native
  
  /**
    * The x coordinate of the mouse pointer relative to the element {@link Mouse} is
    * attached to.
    *
    * @type {number}
    */
  /* CompleteClass */
  var x: Double = js.native
  
  /**
    * The y coordinate of the mouse pointer relative to the element {@link Mouse} is
    * attached to.
    *
    * @type {number}
    */
  /* CompleteClass */
  var y: Double = js.native
}
