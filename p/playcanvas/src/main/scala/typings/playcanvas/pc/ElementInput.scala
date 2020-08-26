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
@js.native
trait ElementInput extends js.Object {
  /**
    * Add a {@link pc.ElementComponent} to the internal list of ElementComponents that are being checked for input.
    * @param element - The ElementComponent.
    */
  def addElement(element: ElementComponent): Unit = js.native
  /**
    * Attach mouse and touch events to a DOM element.
    * @param domElement - The DOM element.
    */
  def attach(domElement: Element): Unit = js.native
  /**
    * Remove mouse and touch events from the DOM element that it is attached to.
    */
  def detach(): Unit = js.native
  /**
    * Remove a {@link pc.ElementComponent} from the internal list of ElementComponents that are being checked for input.
    * @param element - The ElementComponent.
    */
  def removeElement(element: ElementComponent): Unit = js.native
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
  @scala.inline
  implicit class ElementInputOps[Self <: ElementInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddElement(value: ElementComponent => Unit): Self = this.set("addElement", js.Any.fromFunction1(value))
    @scala.inline
    def setAttach(value: Element => Unit): Self = this.set("attach", js.Any.fromFunction1(value))
    @scala.inline
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveElement(value: ElementComponent => Unit): Self = this.set("removeElement", js.Any.fromFunction1(value))
  }
  
}

