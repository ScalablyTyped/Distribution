package typings
package atPhosphorWidgetsLib.libMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/menu", "Menu")
@js.native
object MenuNs extends js.Object {
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
    val args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
    /**
      * The display caption for the menu item.
      */
    val caption: java.lang.String
    /**
      * The extra class name for the menu item.
      */
    val className: java.lang.String
    /**
      * The command to execute when the item is triggered.
      */
    val command: java.lang.String
    /**
      * The dataset for the menu item.
      */
    val dataset: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.Dataset
    /**
      * @deprecated Use `iconClass` instead.
      */
    val icon: java.lang.String
    /**
      * The icon class for the menu item.
      */
    val iconClass: java.lang.String
    /**
      * The icon label for the menu item.
      */
    val iconLabel: java.lang.String
    /**
      * Whether the menu item is enabled.
      */
    val isEnabled: scala.Boolean
    /**
      * Whether the menu item is toggled.
      */
    val isToggled: scala.Boolean
    /**
      * Whether the menu item is visible.
      */
    val isVisible: scala.Boolean
    /**
      * The key binding for the menu item.
      */
    val keyBinding: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.IKeyBinding | scala.Null
    /**
      * The display label for the menu item.
      */
    val label: java.lang.String
    /**
      * The mnemonic index for the menu item.
      */
    val mnemonic: scala.Double
    /**
      * The submenu for a `'submenu'` type item.
      */
    val submenu: atPhosphorWidgetsLib.libMenuMod.Menu | scala.Null
    /**
      * The type of the menu item.
      */
    val `type`: ItemType
  }
  
  /**
    * An options object for creating a menu item.
    */
  trait IItemOptions extends js.Object {
    /**
      * The arguments for the command.
      *
      * The default value is an empty object.
      */
    var args: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject] = js.undefined
    /**
      * The command to execute when the item is triggered.
      *
      * The default value is an empty string.
      */
    var command: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The submenu for a `'submenu'` type item.
      *
      * The default value is `null`.
      */
    var submenu: js.UndefOr[atPhosphorWidgetsLib.libMenuMod.Menu | scala.Null] = js.undefined
    /**
      * The type of the menu item.
      *
      * The default value is `'command'`.
      */
    var `type`: js.UndefOr[ItemType] = js.undefined
  }
  
  /**
    * An options object for the `open` method on a menu.
    */
  trait IOpenOptions extends js.Object {
    /**
      * Whether to force the X position of the menu.
      *
      * Setting to `true` will disable the logic which repositions the
      * X coordinate of the menu if it will not fit entirely on screen.
      *
      * The default is `false`.
      */
    var forceX: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Whether to force the Y position of the menu.
      *
      * Setting to `true` will disable the logic which repositions the
      * Y coordinate of the menu if it will not fit entirely on screen.
      *
      * The default is `false`.
      */
    var forceY: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  /**
    * An options object for creating a menu.
    */
  trait IOptions extends js.Object {
    /**
      * The command registry for use with the menu.
      */
    var commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
    /**
      * A custom renderer for use with the menu.
      *
      * The default is a shared renderer instance.
      */
    var renderer: js.UndefOr[IRenderer] = js.undefined
  }
  
  /**
    * An object which holds the data to render a menu item.
    */
  trait IRenderData extends js.Object {
    /**
      * Whether the item is the active item.
      */
    val active: scala.Boolean
    /**
      * Whether the item should be collapsed.
      */
    val collapsed: scala.Boolean
    /**
      * The item to be rendered.
      */
    val item: IItem
  }
  
  /**
    * A renderer for use with a menu.
    */
  trait IRenderer extends js.Object {
    /**
      * Render the virtual element for a menu item.
      *
      * @param data - The data to use for rendering the item.
      *
      * @returns A virtual element representing the item.
      */
    def renderItem(data: IRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement
  }
  
  /**
    * A type alias for a menu item type.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.command
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.submenu
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.separator
  */
  trait ItemType extends js.Object
  
  /**
    * The default implementation of `IRenderer`.
    *
    * #### Notes
    * Subclasses are free to reimplement rendering methods as needed.
    */
  @js.native
  /**
    * Construct a new renderer.
    */
  class Renderer () extends IRenderer {
    /**
      * Create the class name for the menu item icon.
      *
      * @param data - The data to use for the class name.
      *
      * @returns The full class name for the item icon.
      */
    def createIconClass(data: IRenderData): java.lang.String = js.native
    /**
      * Create the class name for the menu item.
      *
      * @param data - The data to use for the class name.
      *
      * @returns The full class name for the menu item.
      */
    def createItemClass(data: IRenderData): java.lang.String = js.native
    /**
      * Create the dataset for the menu item.
      *
      * @param data - The data to use for creating the dataset.
      *
      * @returns The dataset for the menu item.
      */
    def createItemDataset(data: IRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.ElementDataset = js.native
    /**
      * Create the render content for the label node.
      *
      * @param data - The data to use for the label content.
      *
      * @returns The content to add to the label node.
      */
    def formatLabel(data: IRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.hNs.Child = js.native
    /**
      * Create the render content for the shortcut node.
      *
      * @param data - The data to use for the shortcut content.
      *
      * @returns The content to add to the shortcut node.
      */
    def formatShortcut(data: IRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.hNs.Child = js.native
    /**
      * Render the icon element for a menu item.
      *
      * @param data - The data to use for rendering the icon.
      *
      * @returns A virtual element representing the item icon.
      */
    def renderIcon(data: IRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the virtual element for a menu item.
      *
      * @param data - The data to use for rendering the item.
      *
      * @returns A virtual element representing the item.
      */
    /* CompleteClass */
    override def renderItem(data: IRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the label element for a menu item.
      *
      * @param data - The data to use for rendering the label.
      *
      * @returns A virtual element representing the item label.
      */
    def renderLabel(data: IRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the shortcut element for a menu item.
      *
      * @param data - The data to use for rendering the shortcut.
      *
      * @returns A virtual element representing the item shortcut.
      */
    def renderShortcut(data: IRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the submenu icon element for a menu item.
      *
      * @param data - The data to use for rendering the submenu icon.
      *
      * @returns A virtual element representing the submenu icon.
      */
    def renderSubmenu(data: IRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
  }
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: Renderer = js.native
}

