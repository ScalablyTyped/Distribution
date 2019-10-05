package typings.atPhosphorWidgets.libCommandpaletteMod.CommandPalette

import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry.Dataset
import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry.IKeyBinding
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents an item in a command palette.
  *
  * #### Notes
  * Item objects are created automatically by a command palette.
  */
trait IItem extends js.Object {
  /**
    * The arguments for the command.
    */
  val args: ReadonlyJSONObject
  /**
    * The display caption for the command item.
    */
  val caption: String
  /**
    * The category for the command item.
    */
  val category: String
  /**
    * The extra class name for the command item.
    */
  val className: String
  /**
    * The command to execute when the item is triggered.
    */
  val command: String
  /**
    * The dataset for the command item.
    */
  val dataset: Dataset
  /**
    * The icon class for the command item.
    */
  val iconClass: String
  /**
    * The icon label for the command item.
    */
  val iconLabel: String
  /**
    * Whether the command item is enabled.
    */
  val isEnabled: Boolean
  /**
    * Whether the command item is toggled.
    */
  val isToggled: Boolean
  /**
    * Whether the command item is visible.
    */
  val isVisible: Boolean
  /**
    * The key binding for the command item.
    */
  val keyBinding: IKeyBinding | Null
  /**
    * The display label for the command item.
    */
  val label: String
  /**
    * The rank for the command item.
    */
  val rank: Double
}

object IItem {
  @scala.inline
  def apply(
    args: ReadonlyJSONObject,
    caption: String,
    category: String,
    className: String,
    command: String,
    dataset: Dataset,
    iconClass: String,
    iconLabel: String,
    isEnabled: Boolean,
    isToggled: Boolean,
    isVisible: Boolean,
    label: String,
    rank: Double,
    keyBinding: IKeyBinding = null
  ): IItem = {
    val __obj = js.Dynamic.literal(args = args, caption = caption, category = category, className = className, command = command, dataset = dataset, iconClass = iconClass, iconLabel = iconLabel, isEnabled = isEnabled, isToggled = isToggled, isVisible = isVisible, label = label, rank = rank)
    if (keyBinding != null) __obj.updateDynamic("keyBinding")(keyBinding)
    __obj.asInstanceOf[IItem]
  }
}

