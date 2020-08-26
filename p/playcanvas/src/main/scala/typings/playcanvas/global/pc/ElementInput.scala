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
}

