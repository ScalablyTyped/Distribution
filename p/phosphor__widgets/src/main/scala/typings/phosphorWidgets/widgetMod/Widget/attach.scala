package typings.phosphorWidgets.widgetMod.Widget

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/widget", "Widget.attach")
@js.native
object attach extends js.Object {
  /**
    * Attach a widget to a host DOM node.
    *
    * @param widget - The widget of interest.
    *
    * @param host - The DOM node to use as the widget's host.
    *
    * @param ref - The child of `host` to use as the reference element.
    *   If this is provided, the widget will be inserted before this
    *   node in the host. The default is `null`, which will cause the
    *   widget to be added as the last child of the host.
    *
    * #### Notes
    * This will throw an error if the widget is not a root widget, if
    * the widget is already attached, or if the host is not attached
    * to the DOM.
    */
  def apply(widget: typings.phosphorWidgets.widgetMod.Widget, host: HTMLElement): Unit = js.native
  def apply(widget: typings.phosphorWidgets.widgetMod.Widget, host: HTMLElement, ref: HTMLElement): Unit = js.native
}

