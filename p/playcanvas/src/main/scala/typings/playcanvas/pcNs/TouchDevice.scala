package typings.playcanvas.pcNs

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
@JSGlobal("pc.TouchDevice")
@js.native
class TouchDevice protected () extends EventHandler {
  def this(element: Element) = this()
  /**
    * @function
    * @name pc.TouchDevice#attach
    * @description Attach a device to an element in the DOM.
    * If the device is already attached to an element this method will detach it first
    * @param {Element} element The element to attach to
    */
  def attach(element: Element): Unit = js.native
  /**
    * @function
    * @name pc.TouchDevice#detach
    * @description Detach a device from the element it is attached to
    */
  def detach(): Unit = js.native
}

