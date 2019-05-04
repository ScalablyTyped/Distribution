package typings
package atPhosphorWidgetsLib.libCommandpaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/commandpalette", "CommandPalette")
@js.native
object CommandPaletteNs extends js.Object {
  /**
    * The render data for a command palette empty message.
    */
  trait IEmptyMessageRenderData extends js.Object {
    /**
      * The query which failed to match any commands.
      */
    var query: java.lang.String
  }
  
  /**
    * The render data for a command palette header.
    */
  trait IHeaderRenderData extends js.Object {
    /**
      * The category of the header.
      */
    val category: java.lang.String
    /**
      * The indices of the matched characters in the category.
      */
    val indices: js.Array[scala.Double] | scala.Null
  }
  
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
    val args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
    /**
      * The display caption for the command item.
      */
    val caption: java.lang.String
    /**
      * The category for the command item.
      */
    val category: java.lang.String
    /**
      * The extra class name for the command item.
      */
    val className: java.lang.String
    /**
      * The command to execute when the item is triggered.
      */
    val command: java.lang.String
    /**
      * The dataset for the command item.
      */
    val dataset: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.Dataset
    /**
      * The icon class for the command item.
      */
    val iconClass: java.lang.String
    /**
      * The icon label for the command item.
      */
    val iconLabel: java.lang.String
    /**
      * Whether the command item is enabled.
      */
    val isEnabled: scala.Boolean
    /**
      * Whether the command item is toggled.
      */
    val isToggled: scala.Boolean
    /**
      * Whether the command item is visible.
      */
    val isVisible: scala.Boolean
    /**
      * The key binding for the command item.
      */
    val keyBinding: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.IKeyBinding | scala.Null
    /**
      * The display label for the command item.
      */
    val label: java.lang.String
    /**
      * The rank for the command item.
      */
    val rank: scala.Double
  }
  
  /**
    * An options object for creating a command item.
    */
  trait IItemOptions extends js.Object {
    /**
      * The arguments for the command.
      *
      * The default value is an empty object.
      */
    var args: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject] = js.undefined
    /**
      * The category for the item.
      */
    var category: java.lang.String
    /**
      * The command to execute when the item is triggered.
      */
    var command: java.lang.String
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
    var rank: js.UndefOr[scala.Double] = js.undefined
  }
  
  /**
    * The render data for a command palette item.
    */
  trait IItemRenderData extends js.Object {
    /**
      * Whether the item is the active item.
      */
    val active: scala.Boolean
    /**
      * The indices of the matched characters in the label.
      */
    val indices: js.Array[scala.Double] | scala.Null
    /**
      * The command palette item to render.
      */
    val item: IItem
  }
  
  /**
    * An options object for creating a command palette.
    */
  trait IOptions extends js.Object {
    /**
      * The command registry for use with the command palette.
      */
    var commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
    /**
      * A custom renderer for use with the command palette.
      *
      * The default is a shared renderer instance.
      */
    var renderer: js.UndefOr[IRenderer] = js.undefined
  }
  
  /**
    * A renderer for use with a command palette.
    */
  trait IRenderer extends js.Object {
    /**
      * Render the empty results message for a command palette.
      *
      * @param data - The data to use for rendering the message.
      *
      * @returns A virtual element representing the message.
      */
    def renderEmptyMessage(data: IEmptyMessageRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement
    /**
      * Render the virtual element for a command palette header.
      *
      * @param data - The data to use for rendering the header.
      *
      * @returns A virtual element representing the header.
      */
    def renderHeader(data: IHeaderRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement
    /**
      * Render the virtual element for a command palette item.
      *
      * @param data - The data to use for rendering the item.
      *
      * @returns A virtual element representing the item.
      *
      * #### Notes
      * The command palette will not render invisible items.
      */
    def renderItem(data: IItemRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement
  }
  
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer () extends IRenderer {
    /**
      * Create the class name for the command item icon.
      *
      * @param data - The data to use for the class name.
      *
      * @returns The full class name for the item icon.
      */
    def createIconClass(data: IItemRenderData): java.lang.String = js.native
    /**
      * Create the class name for the command palette item.
      *
      * @param data - The data to use for the class name.
      *
      * @returns The full class name for the command palette item.
      */
    def createItemClass(data: IItemRenderData): java.lang.String = js.native
    /**
      * Create the dataset for the command palette item.
      *
      * @param data - The data to use for creating the dataset.
      *
      * @returns The dataset for the command palette item.
      */
    def createItemDataset(data: IItemRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.ElementDataset = js.native
    /**
      * Create the render content for the empty message node.
      *
      * @param data - The data to use for the empty message content.
      *
      * @returns The content to add to the empty message node.
      */
    def formatEmptyMessage(data: IEmptyMessageRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.hNs.Child = js.native
    /**
      * Create the render content for the header node.
      *
      * @param data - The data to use for the header content.
      *
      * @returns The content to add to the header node.
      */
    def formatHeader(data: IHeaderRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.hNs.Child = js.native
    /**
      * Create the render content for the item caption node.
      *
      * @param data - The data to use for the caption content.
      *
      * @returns The content to add to the caption node.
      */
    def formatItemCaption(data: IItemRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.hNs.Child = js.native
    /**
      * Create the render content for the item label node.
      *
      * @param data - The data to use for the label content.
      *
      * @returns The content to add to the label node.
      */
    def formatItemLabel(data: IItemRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.hNs.Child = js.native
    /**
      * Create the render content for the item shortcut node.
      *
      * @param data - The data to use for the shortcut content.
      *
      * @returns The content to add to the shortcut node.
      */
    def formatItemShortcut(data: IItemRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.hNs.Child = js.native
    /**
      * Render the empty results message for a command palette.
      *
      * @param data - The data to use for rendering the message.
      *
      * @returns A virtual element representing the message.
      */
    /* CompleteClass */
    override def renderEmptyMessage(data: IEmptyMessageRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the virtual element for a command palette header.
      *
      * @param data - The data to use for rendering the header.
      *
      * @returns A virtual element representing the header.
      */
    /* CompleteClass */
    override def renderHeader(data: IHeaderRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the virtual element for a command palette item.
      *
      * @param data - The data to use for rendering the item.
      *
      * @returns A virtual element representing the item.
      *
      * #### Notes
      * The command palette will not render invisible items.
      */
    /* CompleteClass */
    override def renderItem(data: IItemRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the caption for a command palette item.
      *
      * @param data - The data to use for rendering the caption.
      *
      * @returns A virtual element representing the caption.
      */
    def renderItemCaption(data: IItemRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the content for a command palette item.
      *
      * @param data - The data to use for rendering the content.
      *
      * @returns A virtual element representing the content.
      */
    def renderItemContent(data: IItemRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the icon for a command palette item.
      *
      * @param data - The data to use for rendering the icon.
      *
      * @returns A virtual element representing the icon.
      */
    def renderItemIcon(data: IItemRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the label for a command palette item.
      *
      * @param data - The data to use for rendering the label.
      *
      * @returns A virtual element representing the label.
      */
    def renderItemLabel(data: IItemRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the shortcut for a command palette item.
      *
      * @param data - The data to use for rendering the shortcut.
      *
      * @returns A virtual element representing the shortcut.
      */
    def renderItemShortcut(data: IItemRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
  }
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: Renderer = js.native
}

