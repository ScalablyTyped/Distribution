package typings.atPhosphorWidgets.libContextmenuMod.ContextMenu

import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import typings.atPhosphorWidgets.libMenuMod.Menu.IRenderer
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
  var commands: CommandRegistry
  /**
    * A custom renderer for use with the context menu.
    */
  var renderer: js.UndefOr[IRenderer] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(commands: CommandRegistry, renderer: IRenderer = null): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

