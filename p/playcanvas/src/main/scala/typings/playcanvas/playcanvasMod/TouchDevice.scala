package typings.playcanvas.playcanvasMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.TouchDevice
  * @extends pc.EventHandler
  * @classdesc Attach a TouchDevice to an element and it will receive and fire events when the element is touched.
  * See also {@link pc.Touch} and {@link pc.TouchEvent}
  * @description Create a new touch device and attach it to an element
  * @param {Element} element The element to attach listen for events on
  */
@JSImport("playcanvas", "TouchDevice")
@js.native
class TouchDevice protected ()
  extends typings.playcanvas.pcNs.TouchDevice {
  def this(element: Element) = this()
}

