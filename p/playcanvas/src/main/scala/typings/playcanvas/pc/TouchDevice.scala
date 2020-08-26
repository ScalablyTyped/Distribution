package typings.playcanvas.pc

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new touch device and attach it to an element.
  * @param element - The element to attach listen for events on.
  */
@js.native
trait TouchDevice extends EventHandler {
  /**
    * Attach a device to an element in the DOM.
    * If the device is already attached to an element this method will detach it first.
    * @param element - The element to attach to.
    */
  def attach(element: Element): Unit = js.native
  /**
    * Detach a device from the element it is attached to.
    */
  def detach(): Unit = js.native
}

