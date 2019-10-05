package typings.atPhosphorWidgets.libCommandpaletteMod.CommandPalette

import typings.atPhosphorVirtualdom.atPhosphorVirtualdomMod.ElementDataset
import typings.atPhosphorVirtualdom.atPhosphorVirtualdomMod.VirtualElement
import typings.atPhosphorVirtualdom.atPhosphorVirtualdomMod.h.Child
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of `IRenderer`.
  */
@JSImport("@phosphor/widgets/lib/commandpalette", "CommandPalette.Renderer")
@js.native
class Renderer () extends IRenderer {
  /**
    * Create the class name for the command item icon.
    *
    * @param data - The data to use for the class name.
    *
    * @returns The full class name for the item icon.
    */
  def createIconClass(data: IItemRenderData): String = js.native
  /**
    * Create the class name for the command palette item.
    *
    * @param data - The data to use for the class name.
    *
    * @returns The full class name for the command palette item.
    */
  def createItemClass(data: IItemRenderData): String = js.native
  /**
    * Create the dataset for the command palette item.
    *
    * @param data - The data to use for creating the dataset.
    *
    * @returns The dataset for the command palette item.
    */
  def createItemDataset(data: IItemRenderData): ElementDataset = js.native
  /**
    * Create the render content for the empty message node.
    *
    * @param data - The data to use for the empty message content.
    *
    * @returns The content to add to the empty message node.
    */
  def formatEmptyMessage(data: IEmptyMessageRenderData): Child = js.native
  /**
    * Create the render content for the header node.
    *
    * @param data - The data to use for the header content.
    *
    * @returns The content to add to the header node.
    */
  def formatHeader(data: IHeaderRenderData): Child = js.native
  /**
    * Create the render content for the item caption node.
    *
    * @param data - The data to use for the caption content.
    *
    * @returns The content to add to the caption node.
    */
  def formatItemCaption(data: IItemRenderData): Child = js.native
  /**
    * Create the render content for the item label node.
    *
    * @param data - The data to use for the label content.
    *
    * @returns The content to add to the label node.
    */
  def formatItemLabel(data: IItemRenderData): Child = js.native
  /**
    * Create the render content for the item shortcut node.
    *
    * @param data - The data to use for the shortcut content.
    *
    * @returns The content to add to the shortcut node.
    */
  def formatItemShortcut(data: IItemRenderData): Child = js.native
  /**
    * Render the empty results message for a command palette.
    *
    * @param data - The data to use for rendering the message.
    *
    * @returns A virtual element representing the message.
    */
  /* CompleteClass */
  override def renderEmptyMessage(data: IEmptyMessageRenderData): VirtualElement = js.native
  /**
    * Render the virtual element for a command palette header.
    *
    * @param data - The data to use for rendering the header.
    *
    * @returns A virtual element representing the header.
    */
  /* CompleteClass */
  override def renderHeader(data: IHeaderRenderData): VirtualElement = js.native
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
  override def renderItem(data: IItemRenderData): VirtualElement = js.native
  /**
    * Render the caption for a command palette item.
    *
    * @param data - The data to use for rendering the caption.
    *
    * @returns A virtual element representing the caption.
    */
  def renderItemCaption(data: IItemRenderData): VirtualElement = js.native
  /**
    * Render the content for a command palette item.
    *
    * @param data - The data to use for rendering the content.
    *
    * @returns A virtual element representing the content.
    */
  def renderItemContent(data: IItemRenderData): VirtualElement = js.native
  /**
    * Render the icon for a command palette item.
    *
    * @param data - The data to use for rendering the icon.
    *
    * @returns A virtual element representing the icon.
    */
  def renderItemIcon(data: IItemRenderData): VirtualElement = js.native
  /**
    * Render the label for a command palette item.
    *
    * @param data - The data to use for rendering the label.
    *
    * @returns A virtual element representing the label.
    */
  def renderItemLabel(data: IItemRenderData): VirtualElement = js.native
  /**
    * Render the shortcut for a command palette item.
    *
    * @param data - The data to use for rendering the shortcut.
    *
    * @returns A virtual element representing the shortcut.
    */
  def renderItemShortcut(data: IItemRenderData): VirtualElement = js.native
}

