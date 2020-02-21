package typings.playcanvas.mod

import typings.playcanvas.AnonUseMouse
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ElementInput
  * @classdesc Handles mouse and touch events for {@link pc.ElementComponent}s. When input events
  * occur on an ElementComponent this fires the appropriate events on the ElementComponent.
  * @description Create a new pc.ElementInput instance.
  * @param {Element} domElement - The DOM element.
  * @param {object} [options] - Optional arguments.
  * @param {boolean} [options.useMouse] - Whether to allow mouse input. Defaults to true.
  * @param {boolean} [options.useTouch] - Whether to allow touch input. Defaults to true.
  */
@JSImport("playcanvas", "ElementInput")
@js.native
class ElementInput protected ()
  extends typings.playcanvas.pc.ElementInput {
  def this(domElement: Element) = this()
  def this(domElement: Element, options: AnonUseMouse) = this()
}

