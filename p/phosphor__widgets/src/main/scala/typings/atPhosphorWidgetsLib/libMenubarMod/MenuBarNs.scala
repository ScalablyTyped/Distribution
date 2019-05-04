package typings
package atPhosphorWidgetsLib.libMenubarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/menubar", "MenuBar")
@js.native
object MenuBarNs extends js.Object {
  /**
    * An options object for creating a menu bar.
    */
  trait IOptions extends js.Object {
    /**
      * A custom renderer for creating menu bar content.
      *
      * The default is a shared renderer instance.
      */
    var renderer: js.UndefOr[IRenderer] = js.undefined
  }
  
  /**
    * An object which holds the data to render a menu bar item.
    */
  trait IRenderData extends js.Object {
    /**
      * Whether the item is the active item.
      */
    val active: scala.Boolean
    /**
      * The title to be rendered.
      */
    val title: atPhosphorWidgetsLib.libTitleMod.Title[atPhosphorWidgetsLib.libWidgetMod.Widget]
  }
  
  /**
    * A renderer for use with a menu bar.
    */
  trait IRenderer extends js.Object {
    /**
      * Render the virtual element for a menu bar item.
      *
      * @param data - The data to use for rendering the item.
      *
      * @returns A virtual element representing the item.
      */
    def renderItem(data: IRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement
  }
  
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
      * Create the class name for the menu bar item icon.
      *
      * @param data - The data to use for the class name.
      *
      * @returns The full class name for the item icon.
      */
    def createIconClass(data: IRenderData): java.lang.String = js.native
    /**
      * Create the class name for the menu bar item.
      *
      * @param data - The data to use for the class name.
      *
      * @returns The full class name for the menu item.
      */
    def createItemClass(data: IRenderData): java.lang.String = js.native
    /**
      * Create the dataset for a menu bar item.
      *
      * @param data - The data to use for the item.
      *
      * @returns The dataset for the menu bar item.
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
      * Render the icon element for a menu bar item.
      *
      * @param data - The data to use for rendering the icon.
      *
      * @returns A virtual element representing the item icon.
      */
    def renderIcon(data: IRenderData): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the virtual element for a menu bar item.
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
  }
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: Renderer = js.native
}

