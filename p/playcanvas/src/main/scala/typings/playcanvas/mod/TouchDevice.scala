package typings.playcanvas.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new touch device and attach it to an element.
  * @param element - The element to attach listen for events on.
  */
@JSImport("playcanvas", "TouchDevice")
@js.native
class TouchDevice protected ()
  extends typings.playcanvas.pc.TouchDevice {
  def this(element: Element) = this()
}

