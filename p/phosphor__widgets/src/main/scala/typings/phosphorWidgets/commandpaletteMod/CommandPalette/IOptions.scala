package typings.phosphorWidgets.commandpaletteMod.CommandPalette

import typings.phosphorCommands.mod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a command palette.
  */
trait IOptions extends js.Object {
  /**
    * The command registry for use with the command palette.
    */
  var commands: CommandRegistry
  /**
    * A custom renderer for use with the command palette.
    *
    * The default is a shared renderer instance.
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

