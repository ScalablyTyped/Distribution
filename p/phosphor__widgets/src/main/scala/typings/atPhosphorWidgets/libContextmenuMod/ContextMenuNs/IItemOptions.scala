package typings.atPhosphorWidgets.libContextmenuMod.ContextMenuNs

import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import typings.atPhosphorWidgets.libMenuMod.Menu
import typings.atPhosphorWidgets.libMenuMod.MenuNs.ItemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a context menu item.
  */
trait IItemOptions
  extends typings.atPhosphorWidgets.libMenuMod.MenuNs.IItemOptions {
  /**
    * The rank for the item.
    *
    * The rank is used as a tie-breaker when ordering context menu
    * items for display. Items are sorted in the following order:
    *   1. Depth in the DOM tree (deeper is better)
    *   2. Selector specificity (higher is better)
    *   3. Rank (lower is better)
    *   4. Insertion order
    *
    * The default rank is `Infinity`.
    */
  var rank: js.UndefOr[Double] = js.undefined
  /**
    * The CSS selector for the context menu item.
    *
    * The context menu item will only be displayed in the context menu
    * when the selector matches a node on the propagation path of the
    * contextmenu event. This allows the menu item to be restricted to
    * user-defined contexts.
    *
    * The selector must not contain commas.
    */
  var selector: String
}

object IItemOptions {
  @scala.inline
  def apply(
    selector: String,
    args: ReadonlyJSONObject = null,
    command: String = null,
    rank: Int | Double = null,
    submenu: Menu = null,
    `type`: ItemType = null
  ): IItemOptions = {
    val __obj = js.Dynamic.literal(selector = selector)
    if (args != null) __obj.updateDynamic("args")(args)
    if (command != null) __obj.updateDynamic("command")(command)
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (submenu != null) __obj.updateDynamic("submenu")(submenu)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IItemOptions]
  }
}

