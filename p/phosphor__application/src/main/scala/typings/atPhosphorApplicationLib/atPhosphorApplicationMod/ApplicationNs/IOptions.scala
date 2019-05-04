package typings
package atPhosphorApplicationLib.atPhosphorApplicationMod.ApplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating an application.
  */
trait IOptions[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */] extends js.Object {
  /**
    * A custom renderer for the context menu.
    */
  var contextMenuRenderer: js.UndefOr[atPhosphorWidgetsLib.libMenuMod.MenuNs.IRenderer] = js.undefined
  /**
    * The shell widget to use for the application.
    *
    * This should be a newly created and initialized widget.
    *
    * The application will attach the widget to the DOM.
    */
  var shell: T
}

object IOptions {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](shell: T, contextMenuRenderer: atPhosphorWidgetsLib.libMenuMod.MenuNs.IRenderer = null): IOptions[T] = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    if (contextMenuRenderer != null) __obj.updateDynamic("contextMenuRenderer")(contextMenuRenderer)
    __obj.asInstanceOf[IOptions[T]]
  }
}

