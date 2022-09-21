package typings.playcanvas.global.pc

import typings.playcanvas.anon.UseMouse
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles mouse and touch events for {@link ElementComponent}s. When input events occur on an
  * ElementComponent this fires the appropriate events on the ElementComponent.
  */
@JSGlobal("pc.ElementInput")
@js.native
open class ElementInput protected ()
  extends typings.playcanvas.mod.ElementInput {
  /**
    * Create a new ElementInput instance.
    *
    * @param {Element} domElement - The DOM element.
    * @param {object} [options] - Optional arguments.
    * @param {boolean} [options.useMouse] - Whether to allow mouse input. Defaults to true.
    * @param {boolean} [options.useTouch] - Whether to allow touch input. Defaults to true.
    * @param {boolean} [options.useXr] - Whether to allow XR input sources. Defaults to true.
    */
  def this(domElement: Element) = this()
  def this(domElement: Element, options: UseMouse) = this()
}
