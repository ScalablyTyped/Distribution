package typings.playcanvas.pc

import typings.playcanvas.AnonUseMouse
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ElementInput
  * @classdesc Handles mouse and touch events for {@link pc.ElementComponent}s. When input events
  * occur on an ElementComponent this fires the appropriate events on the ElementComponent.
  * @description Create a new pc.ElementInput instance.
  * @param {Element} domElement The DOM element
  * @param {Object} [options] Optional arguments
  * @param {Boolean} [options.useMouse] Whether to allow mouse input. Defaults to true.
  * @param {Boolean} [options.useTouch] Whether to allow touch input. Defaults to true.
  */
@JSGlobal("pc.ElementInput")
@js.native
class ElementInput protected () extends js.Object {
  def this(domElement: Element) = this()
  def this(domElement: Element, options: AnonUseMouse) = this()
  /**
    * @function
    * @name pc.ElementInput#addElement
    * @description Add a {@link pc.ElementComponent} to the internal list of ElementComponents that are being checked for input.
    * @param {pc.ElementComponent} element The ElementComponent
    */
  def addElement(element: ElementComponent): Unit = js.native
  /**
    * @function
    * @name pc.ElementInput#attach
    * @description Attach mouse and touch events to a DOM element.
    * @param {Element} domElement The DOM element
    */
  def attach(domElement: Element): Unit = js.native
  /**
    * @function
    * @name pc.ElementInput#detach
    * @description Remove mouse and touch events from the DOM element that it is attached to
    */
  def detach(): Unit = js.native
  /**
    * @function
    * @name pc.ElementInput#removeElement
    * @description Remove a {@link pc.ElementComponent} from the internal list of ElementComponents that are being checked for input.
    * @param {pc.ElementComponent} element The ElementComponent
    */
  def removeElement(element: ElementComponent): Unit = js.native
}

