package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.ElementDragHelper
  * @extends pc.EventHandler
  * @description Create a new ElementDragHelper
  * @classdesc Helper class that makes it easy to create Elements that can be dragged by the mouse or touch.
  * @param {pc.ElementComponent} element The Element that should become draggable.
  * @param {String} [axis] Optional axis to constrain to, either 'x', 'y' or null.
  */
@JSGlobal("pc.ElementDragHelper")
@js.native
class ElementDragHelper protected () extends EventHandler {
  def this(element: ElementComponent) = this()
  def this(element: ElementComponent, axis: String) = this()
}

