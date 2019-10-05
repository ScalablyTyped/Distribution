package typings.atPhosphorWidgets.libMenuMod.Menu

import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a menu.
  */
trait IOptions extends js.Object {
  /**
    * The command registry for use with the menu.
    */
  var commands: CommandRegistry
  /**
    * A custom renderer for use with the menu.
    *
    * The default is a shared renderer instance.
    */
  var renderer: js.UndefOr[IRenderer] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(commands: CommandRegistry, renderer: IRenderer = null): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[IOptions]
  }
}

