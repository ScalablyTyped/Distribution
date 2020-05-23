package typings.playcanvas.global.pc

import typings.playcanvas.anon.UseMouse
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
@JSGlobal("pc.ElementInput")
@js.native
class ElementInput protected ()
  extends typings.playcanvas.pc.ElementInput {
  def this(domElement: Element) = this()
  def this(domElement: Element, options: UseMouse) = this()
  /**
    * Add a {@link pc.ElementComponent} to the internal list of ElementComponents that are being checked for input.
    * @param element - The ElementComponent.
    */
  /* CompleteClass */
  override def addElement(element: typings.playcanvas.pc.ElementComponent): Unit = js.native
  /**
    * Attach mouse and touch events to a DOM element.
    * @param domElement - The DOM element.
    */
  /* CompleteClass */
  override def attach(domElement: Element): Unit = js.native
  /**
    * Remove mouse and touch events from the DOM element that it is attached to.
    */
  /* CompleteClass */
  override def detach(): Unit = js.native
  /**
    * Remove a {@link pc.ElementComponent} from the internal list of ElementComponents that are being checked for input.
    * @param element - The ElementComponent.
    */
  /* CompleteClass */
  override def removeElement(element: typings.playcanvas.pc.ElementComponent): Unit = js.native
}

