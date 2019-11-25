package typings.atPhosphorWidgets.libCommandpaletteMod.CommandPalette

import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a command item.
  */
trait IItemOptions extends js.Object {
  /**
    * The arguments for the command.
    *
    * The default value is an empty object.
    */
  var args: js.UndefOr[ReadonlyJSONObject] = js.undefined
  /**
    * The category for the item.
    */
  var category: String
  /**
    * The command to execute when the item is triggered.
    */
  var command: String
  /**
    * The rank for the command item.
    *
    * The rank is used as a tie-breaker when ordering command items
    * for display. Items are sorted in the following order:
    *   1. Text match (lower is better)
    *   2. Category (locale order)
    *   3. Rank (lower is better)
    *   4. Label (locale order)
    *
    * The default rank is `Infinity`.
    */
  var rank: js.UndefOr[Double] = js.undefined
}

object IItemOptions {
  @scala.inline
  def apply(category: String, command: String, args: ReadonlyJSONObject = null, rank: Int | Double = null): IItemOptions = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemOptions]
  }
}

