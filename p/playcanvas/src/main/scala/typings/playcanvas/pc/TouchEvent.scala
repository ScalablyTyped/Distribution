package typings.playcanvas.pc

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new TouchEvent from an existing browser event.
  * @property element - The target Element that the event was fired from.
  * @property touches - A list of all touches currently in contact with the device.
  * @property changedTouches - A list of touches that have changed since the last event.
  * @param device - The source device of the touch events.
  * @param event - The original browser TouchEvent.
  */
trait TouchEvent extends js.Object {
  /**
    * A list of touches that have changed since the last event.
    */
  var changedTouches: js.Array[Touch]
  /**
    * The target Element that the event was fired from.
    */
  var element: Element
  /**
    * A list of all touches currently in contact with the device.
    */
  var touches: js.Array[Touch]
  /**
    * Get an event from one of the touch lists by the id. It is useful to access
    touches by their id so that you can be sure you are referencing the same touch.
    * @param id - The identifier of the touch.
    * @param list - An array of touches to search.
    * @returns The {@link pc.Touch} object or null.
    */
  def getTouchById(id: Double, list: js.Array[Touch]): Touch
}

object TouchEvent {
  @scala.inline
  def apply(
    changedTouches: js.Array[Touch],
    element: Element,
    getTouchById: (Double, js.Array[Touch]) => Touch,
    touches: js.Array[Touch]
  ): TouchEvent = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], getTouchById = js.Any.fromFunction2(getTouchById), touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchEvent]
  }
}

