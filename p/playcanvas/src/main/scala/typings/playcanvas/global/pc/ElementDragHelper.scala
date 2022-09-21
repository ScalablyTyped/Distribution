package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper class that makes it easy to create Elements that can be dragged by the mouse or touch.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.ElementDragHelper")
@js.native
open class ElementDragHelper protected ()
  extends typings.playcanvas.mod.ElementDragHelper {
  /**
    * Create a new ElementDragHelper instance.
    *
    * @param {ElementComponent} element - The Element that should become draggable.
    * @param {string} [axis] - Optional axis to constrain to, either 'x', 'y' or null.
    */
  def this(element: typings.playcanvas.mod.ElementComponent) = this()
  def this(element: typings.playcanvas.mod.ElementComponent, axis: String) = this()
}
