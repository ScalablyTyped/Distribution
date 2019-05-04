package typings
package atPhosphorWidgetsLib.libContextmenuMod.ContextMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a context menu.
  */
trait IOptions extends js.Object {
  /**
    * The command registry to use with the context menu.
    */
  var commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
  /**
    * A custom renderer for use with the context menu.
    */
  var renderer: js.UndefOr[atPhosphorWidgetsLib.libMenuMod.MenuNs.IRenderer] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry,
    renderer: atPhosphorWidgetsLib.libMenuMod.MenuNs.IRenderer = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[IOptions]
  }
}

