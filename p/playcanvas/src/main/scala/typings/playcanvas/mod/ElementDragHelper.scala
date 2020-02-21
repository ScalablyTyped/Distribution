package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.ElementDragHelper
  * @augments pc.EventHandler
  * @description Create a new ElementDragHelper.
  * @classdesc Helper class that makes it easy to create Elements that can be dragged by the mouse or touch.
  * @param {pc.ElementComponent} element - The Element that should become draggable.
  * @param {string} [axis] - Optional axis to constrain to, either 'x', 'y' or null.
  */
@JSImport("playcanvas", "ElementDragHelper")
@js.native
class ElementDragHelper protected ()
  extends typings.playcanvas.pc.ElementDragHelper {
  def this(element: typings.playcanvas.pc.ElementComponent) = this()
  def this(element: typings.playcanvas.pc.ElementComponent, axis: String) = this()
}

