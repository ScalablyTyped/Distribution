package typings
package atPhosphorVirtualdomLib.atPhosphorVirtualdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/virtualdom", "VirtualDOM")
@js.native
object VirtualDOMNs extends js.Object {
  /**
    * Create a real DOM element from a virtual element node.
    *
    * @param node - The virtual element node to realize.
    *
    * @returns A new DOM element for the given virtual element node.
    *
    * #### Notes
    * This creates a brand new *real* DOM element with a structure which
    * matches the given virtual DOM node.
    *
    * If virtual diffing is desired, use the `render` function instead.
    */
  def realize(node: atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement): stdLib.HTMLElement = js.native
  /**
    * Render virtual DOM content into a host element.
    *
    * @param content - The virtual DOM content to render.
    *
    * @param host - The host element for the rendered content.
    *
    * #### Notes
    * This renders the delta from the previous rendering. It assumes that
    * the content of the host element is not manipulated by external code.
    *
    * Providing `null` content will clear the rendering.
    *
    * Externally modifying the provided content or the host element will
    * result in undefined rendering behavior.
    */
  def render(content: atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualNode, host: stdLib.HTMLElement): scala.Unit = js.native
  def render(
    content: js.Array[atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualNode],
    host: stdLib.HTMLElement
  ): scala.Unit = js.native
  def render(content: scala.Null, host: stdLib.HTMLElement): scala.Unit = js.native
}

