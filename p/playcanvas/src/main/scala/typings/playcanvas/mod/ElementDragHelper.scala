package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new ElementDragHelper.
  * @param element - The Element that should become draggable.
  * @param [axis] - Optional axis to constrain to, either 'x', 'y' or null.
  */
@JSImport("playcanvas", "ElementDragHelper")
@js.native
class ElementDragHelper protected ()
  extends typings.playcanvas.pc.EventHandler {
  def this(element: typings.playcanvas.pc.ElementComponent) = this()
  def this(element: typings.playcanvas.pc.ElementComponent, axis: String) = this()
}
