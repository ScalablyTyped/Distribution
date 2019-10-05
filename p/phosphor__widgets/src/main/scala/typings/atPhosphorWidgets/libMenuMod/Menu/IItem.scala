package typings.atPhosphorWidgets.libMenuMod.Menu

import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry.Dataset
import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry.IKeyBinding
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents a menu item.
  *
  * #### Notes
  * Item objects are created automatically by a menu.
  */
trait IItem extends js.Object {
  /**
    * The arguments for the command.
    */
  val args: ReadonlyJSONObject
  /**
    * The display caption for the menu item.
    */
  val caption: String
  /**
    * The extra class name for the menu item.
    */
  val className: String
  /**
    * The command to execute when the item is triggered.
    */
  val command: String
  /**
    * The dataset for the menu item.
    */
  val dataset: Dataset
  /**
    * @deprecated Use `iconClass` instead.
    */
  val icon: String
  /**
    * The icon class for the menu item.
    */
  val iconClass: String
  /**
    * The icon label for the menu item.
    */
  val iconLabel: String
  /**
    * Whether the menu item is enabled.
    */
  val isEnabled: Boolean
  /**
    * Whether the menu item is toggled.
    */
  val isToggled: Boolean
  /**
    * Whether the menu item is visible.
    */
  val isVisible: Boolean
  /**
    * The key binding for the menu item.
    */
  val keyBinding: IKeyBinding | Null
  /**
    * The display label for the menu item.
    */
  val label: String
  /**
    * The mnemonic index for the menu item.
    */
  val mnemonic: Double
  /**
    * The submenu for a `'submenu'` type item.
    */
  val submenu: typings.atPhosphorWidgets.libMenuMod.Menu | Null
  /**
    * The type of the menu item.
    */
  val `type`: ItemType
}

object IItem {
  @scala.inline
  def apply(
    args: ReadonlyJSONObject,
    caption: String,
    className: String,
    command: String,
    dataset: Dataset,
    icon: String,
    iconClass: String,
    iconLabel: String,
    isEnabled: Boolean,
    isToggled: Boolean,
    isVisible: Boolean,
    label: String,
    mnemonic: Double,
    `type`: ItemType,
    keyBinding: IKeyBinding = null,
    submenu: typings.atPhosphorWidgets.libMenuMod.Menu = null
  ): IItem = {
    val __obj = js.Dynamic.literal(args = args, caption = caption, className = className, command = command, dataset = dataset, icon = icon, iconClass = iconClass, iconLabel = iconLabel, isEnabled = isEnabled, isToggled = isToggled, isVisible = isVisible, label = label, mnemonic = mnemonic)
    __obj.updateDynamic("type")(`type`)
    if (keyBinding != null) __obj.updateDynamic("keyBinding")(keyBinding)
    if (submenu != null) __obj.updateDynamic("submenu")(submenu)
    __obj.asInstanceOf[IItem]
  }
}

