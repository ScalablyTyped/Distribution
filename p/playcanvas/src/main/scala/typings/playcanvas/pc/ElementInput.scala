package typings.playcanvas.pc

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new pc.ElementInput instance.
  * @param domElement - The DOM element.
  * @param [options] - Optional arguments.
  * @param [options.useMouse] - Whether to allow mouse input. Defaults to true.
  * @param [options.useTouch] - Whether to allow touch input. Defaults to true.
  * @param [options.useXr] - Whether to allow XR input sources. Defaults to true.
  */
trait ElementInput extends js.Object {
  /**
    * Add a {@link pc.ElementComponent} to the internal list of ElementComponents that are being checked for input.
    * @param element - The ElementComponent.
    */
  def addElement(element: ElementComponent): Unit
  /**
    * Attach mouse and touch events to a DOM element.
    * @param domElement - The DOM element.
    */
  def attach(domElement: Element): Unit
  /**
    * Remove mouse and touch events from the DOM element that it is attached to.
    */
  def detach(): Unit
  /**
    * Remove a {@link pc.ElementComponent} from the internal list of ElementComponents that are being checked for input.
    * @param element - The ElementComponent.
    */
  def removeElement(element: ElementComponent): Unit
}

object ElementInput {
  @scala.inline
  def apply(
    addElement: ElementComponent => Unit,
    attach: Element => Unit,
    detach: () => Unit,
    removeElement: ElementComponent => Unit
  ): ElementInput = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction1(addElement), attach = js.Any.fromFunction1(attach), detach = js.Any.fromFunction0(detach), removeElement = js.Any.fromFunction1(removeElement))
    __obj.asInstanceOf[ElementInput]
  }
}

