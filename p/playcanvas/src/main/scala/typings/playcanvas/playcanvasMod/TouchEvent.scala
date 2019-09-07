package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.TouchEvent
  * @classdesc A Event corresponding to touchstart, touchend, touchmove or touchcancel. TouchEvent wraps the standard
  * browser event and provides lists of {@link pc.Touch} objects.
  * @description Create a new TouchEvent from an existing browser event
  * @param {pc.TouchDevice} device The source device of the touch events
  * @param {TouchEvent} event The original browser TouchEvent
  * @property {Element} element The target Element that the event was fired from
  * @property {pc.Touch[]} touches A list of all touches currently in contact with the device
  * @property {pc.Touch[]} changedTouches A list of touches that have changed since the last event
  */
@JSImport("playcanvas", "TouchEvent")
@js.native
class TouchEvent protected ()
  extends typings.playcanvas.pcNs.TouchEvent {
  def this(device: typings.playcanvas.pcNs.TouchDevice, event: typings.playcanvas.pcNs.TouchEvent) = this()
}

