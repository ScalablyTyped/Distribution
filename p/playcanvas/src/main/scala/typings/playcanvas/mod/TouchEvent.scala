package typings.playcanvas.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new TouchEvent from an existing browser event.
  * @property element - The target Element that the event was fired from.
  * @property touches - A list of all touches currently in contact with the device.
  * @property changedTouches - A list of touches that have changed since the last event.
  * @property event - The original browser TouchEvent.
  * @param device - The source device of the touch events.
  * @param event - The original browser TouchEvent.
  */
@JSImport("playcanvas", "TouchEvent")
@js.native
class TouchEvent protected ()
  extends typings.playcanvas.pc.TouchEvent {
  def this(device: typings.playcanvas.pc.TouchDevice, event: typings.playcanvas.pc.TouchEvent) = this()
  /**
    * A list of touches that have changed since the last event.
    */
  /* CompleteClass */
  override var changedTouches: js.Array[typings.playcanvas.pc.Touch] = js.native
  /**
    * The target Element that the event was fired from.
    */
  /* CompleteClass */
  override var element: Element = js.native
  /**
    * The original browser TouchEvent.
    */
  /* CompleteClass */
  override var event: typings.playcanvas.pc.TouchEvent = js.native
  /**
    * A list of all touches currently in contact with the device.
    */
  /* CompleteClass */
  override var touches: js.Array[typings.playcanvas.pc.Touch] = js.native
  /**
    * Get an event from one of the touch lists by the id. It is useful to access
    touches by their id so that you can be sure you are referencing the same touch.
    * @param id - The identifier of the touch.
    * @param list - An array of touches to search.
    * @returns The {@link pc.Touch} object or null.
    */
  /* CompleteClass */
  override def getTouchById(id: Double, list: js.Array[typings.playcanvas.pc.Touch]): typings.playcanvas.pc.Touch = js.native
}

