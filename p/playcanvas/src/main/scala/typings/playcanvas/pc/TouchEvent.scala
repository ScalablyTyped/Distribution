package typings.playcanvas.pc

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.TouchEvent
  * @classdesc A Event corresponding to touchstart, touchend, touchmove or touchcancel. TouchEvent wraps the standard
  * browser event and provides lists of {@link pc.Touch} objects.
  * @description Create a new TouchEvent from an existing browser event.
  * @param {pc.TouchDevice} device - The source device of the touch events.
  * @param {TouchEvent} event - The original browser TouchEvent.
  * @property {Element} element The target Element that the event was fired from.
  * @property {pc.Touch[]} touches A list of all touches currently in contact with the device.
  * @property {pc.Touch[]} changedTouches A list of touches that have changed since the last event.
  */
@JSGlobal("pc.TouchEvent")
@js.native
class TouchEvent protected () extends js.Object {
  def this(device: TouchDevice, event: TouchEvent) = this()
  /**
    * A list of touches that have changed since the last event.
    */
  var changedTouches: js.Array[Touch] = js.native
  /**
    * The target Element that the event was fired from.
    */
  var element: Element = js.native
  /**
    * A list of all touches currently in contact with the device.
    */
  var touches: js.Array[Touch] = js.native
  /**
    * @function
    * @name pc.TouchEvent#getTouchById
    * @description Get an event from one of the touch lists by the id. It is useful to access
    * touches by their id so that you can be sure you are referencing the same touch.
    * @param {number} id - The identifier of the touch.
    * @param {pc.Touch[]} list - An array of touches to search.
    * @returns {pc.Touch} The {@link pc.Touch} object or null.
    */
  def getTouchById(id: Double, list: js.Array[Touch]): Touch = js.native
}

