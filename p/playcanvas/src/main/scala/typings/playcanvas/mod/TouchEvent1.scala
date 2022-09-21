package typings.playcanvas.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Event corresponding to touchstart, touchend, touchmove or touchcancel. TouchEvent wraps the
  * standard browser event and provides lists of {@link Touch} objects.
  */
@js.native
trait TouchEvent1 extends StObject {
  
  /**
    * A list of touches that have changed since the last event.
    *
    * @type {Touch[]}
    */
  var changedTouches: js.Array[Touch1] = js.native
  
  /**
    * The target Element that the event was fired from.
    *
    * @type {Element}
    */
  var element: Element = js.native
  
  /**
    * The original browser TouchEvent.
    *
    * @type {globalThis.TouchEvent}
    */
  var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.TouchEvent */ Any = js.native
  
  /**
    * Get an event from one of the touch lists by the id. It is useful to access
    * touches by their id so that you can be sure you are referencing the same
    * touch.
    *
    * @param {number} id - The identifier of the touch.
    * @param {Touch[]|null} list - An array of touches to search.
    * @returns {Touch} The {@link Touch} object or null.
    */
  def getTouchById(id: Double): Touch1 = js.native
  def getTouchById(id: Double, list: js.Array[Touch1]): Touch1 = js.native
  
  /**
    * A list of all touches currently in contact with the device.
    *
    * @type {Touch[]}
    */
  var touches: js.Array[Touch1] = js.native
}
