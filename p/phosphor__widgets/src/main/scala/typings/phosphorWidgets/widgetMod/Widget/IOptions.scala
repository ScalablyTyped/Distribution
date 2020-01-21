package typings.phosphorWidgets.widgetMod.Widget

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a widget.
  */
trait IOptions extends js.Object {
  /**
    * The optional node to use for the widget.
    *
    * If a node is provided, the widget will assume full ownership
    * and control of the node, as if it had created the node itself.
    *
    * The default is a new `<div>`.
    */
  var node: js.UndefOr[HTMLElement] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(node: HTMLElement = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

