package typings
package atPhosphorWidgetsLib.libTabbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/tabbar", "TabBar")
@js.native
object TabBarNs extends js.Object {
  /**
    * The arguments object for the `currentChanged` signal.
    */
  trait ICurrentChangedArgs[T] extends js.Object {
    /**
      * The currently selected index.
      */
    val currentIndex: scala.Double
    /**
      * The currently selected title.
      */
    val currentTitle: atPhosphorWidgetsLib.libTitleMod.Title[T] | scala.Null
    /**
      * The previously selected index.
      */
    val previousIndex: scala.Double
    /**
      * The previously selected title.
      */
    val previousTitle: atPhosphorWidgetsLib.libTitleMod.Title[T] | scala.Null
  }
  
  /**
    * An options object for creating a tab bar.
    */
  trait IOptions[T] extends js.Object {
    /**
      * Whether a tab can be deselected by the user.
      *
      * The default is `false`.
      */
    var allowDeselect: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The selection behavior when inserting a tab.
      *
      * The default is `'select-tab-if-needed'`.
      */
    var insertBehavior: js.UndefOr[InsertBehavior] = js.undefined
    /**
      * The layout orientation of the tab bar.
      *
      * The default is `horizontal`.
      */
    var orientation: js.UndefOr[Orientation] = js.undefined
    /**
      * The selection behavior when removing a tab.
      *
      * The default is `'select-tab-after'`.
      */
    var removeBehavior: js.UndefOr[RemoveBehavior] = js.undefined
    /**
      * A renderer to use with the tab bar.
      *
      * The default is a shared renderer instance.
      */
    var renderer: js.UndefOr[IRenderer[T]] = js.undefined
    /**
      * Whether the tabs are movable by the user.
      *
      * The default is `false`.
      */
    var tabsMovable: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  /**
    * An object which holds the data to render a tab.
    */
  trait IRenderData[T] extends js.Object {
    /**
      * Whether the tab is the current tab.
      */
    val current: scala.Boolean
    /**
      * The title associated with the tab.
      */
    val title: atPhosphorWidgetsLib.libTitleMod.Title[T]
    /**
      * The z-index for the tab.
      */
    val zIndex: scala.Double
  }
  
  /**
    * A renderer for use with a tab bar.
    */
  trait IRenderer[T] extends js.Object {
    /**
      * A selector which matches the close icon node in a tab.
      */
    val closeIconSelector: java.lang.String
    /**
      * Render the virtual element for a tab.
      *
      * @param data - The data to use for rendering the tab.
      *
      * @returns A virtual element representing the tab.
      */
    def renderTab(data: IRenderData[T]): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement
  }
  
  /**
    * The arguments object for the `tabActivateRequested` signal.
    */
  trait ITabActivateRequestedArgs[T] extends js.Object {
    /**
      * The index of the tab to activate.
      */
    val index: scala.Double
    /**
      * The title for the tab.
      */
    val title: atPhosphorWidgetsLib.libTitleMod.Title[T]
  }
  
  /**
    * The arguments object for the `tabCloseRequested` signal.
    */
  trait ITabCloseRequestedArgs[T] extends js.Object {
    /**
      * The index of the tab to close.
      */
    val index: scala.Double
    /**
      * The title for the tab.
      */
    val title: atPhosphorWidgetsLib.libTitleMod.Title[T]
  }
  
  /**
    * The arguments object for the `tabDetachRequested` signal.
    */
  trait ITabDetachRequestedArgs[T] extends js.Object {
    /**
      * The current client X position of the mouse.
      */
    val clientX: scala.Double
    /**
      * The current client Y position of the mouse.
      */
    val clientY: scala.Double
    /**
      * The index of the tab to detach.
      */
    val index: scala.Double
    /**
      * The node representing the tab.
      */
    val tab: stdLib.HTMLElement
    /**
      * The title for the tab.
      */
    val title: atPhosphorWidgetsLib.libTitleMod.Title[T]
  }
  
  /**
    * The arguments object for the `tabMoved` signal.
    */
  trait ITabMovedArgs[T] extends js.Object {
    /**
      * The previous index of the tab.
      */
    val fromIndex: scala.Double
    /**
      * The title for the tab.
      */
    val title: atPhosphorWidgetsLib.libTitleMod.Title[T]
    /**
      * The current index of the tab.
      */
    val toIndex: scala.Double
  }
  
  /**
    * A type alias for the selection behavior on tab insert.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.none
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`select-tab`
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`select-tab-if-needed`
  */
  trait InsertBehavior extends js.Object
  
  /**
    * A type alias for a tab bar orientation.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.horizontal
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.vertical
  */
  trait Orientation extends js.Object
  
  /**
    * A type alias for the selection behavior on tab remove.
    */
  /* Rewritten from type alias, can be one of: 
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.none
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`select-tab-after`
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`select-tab-before`
    - atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`select-previous-tab`
  */
  trait RemoveBehavior extends js.Object
  
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
  class Renderer ()
    extends IRenderer[js.Any] {
    var _tabID: js.Any = js.native
    var _tabKeys: js.Any = js.native
    /**
      * A selector which matches the close icon node in a tab.
      */
    /* CompleteClass */
    override val closeIconSelector: java.lang.String = js.native
    /**
      * Create the class name for the tab icon.
      *
      * @param data - The data to use for the tab.
      *
      * @returns The full class name for the tab icon.
      */
    def createIconClass(data: IRenderData[_]): java.lang.String = js.native
    /**
      * Create the class name for the tab.
      *
      * @param data - The data to use for the tab.
      *
      * @returns The full class name for the tab.
      */
    def createTabClass(data: IRenderData[_]): java.lang.String = js.native
    /**
      * Create the dataset for a tab.
      *
      * @param data - The data to use for the tab.
      *
      * @returns The dataset for the tab.
      */
    def createTabDataset(data: IRenderData[_]): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.ElementDataset = js.native
    /**
      * Create a unique render key for the tab.
      *
      * @param data - The data to use for the tab.
      *
      * @returns The unique render key for the tab.
      *
      * #### Notes
      * This method caches the key against the tab title the first time
      * the key is generated. This enables efficient rendering of moved
      * tabs and avoids subtle hover style artifacts.
      */
    def createTabKey(data: IRenderData[_]): java.lang.String = js.native
    /**
      * Create the inline style object for a tab.
      *
      * @param data - The data to use for the tab.
      *
      * @returns The inline style data for the tab.
      */
    def createTabStyle(data: IRenderData[_]): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.ElementInlineStyle = js.native
    /**
      * Render the close icon element for a tab.
      *
      * @param data - The data to use for rendering the tab.
      *
      * @returns A virtual element representing the tab close icon.
      */
    def renderCloseIcon(data: IRenderData[_]): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the icon element for a tab.
      *
      * @param data - The data to use for rendering the tab.
      *
      * @returns A virtual element representing the tab icon.
      */
    def renderIcon(data: IRenderData[_]): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the label element for a tab.
      *
      * @param data - The data to use for rendering the tab.
      *
      * @returns A virtual element representing the tab label.
      */
    def renderLabel(data: IRenderData[_]): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
    /**
      * Render the virtual element for a tab.
      *
      * @param data - The data to use for rendering the tab.
      *
      * @returns A virtual element representing the tab.
      */
    /* CompleteClass */
    override def renderTab(data: IRenderData[js.Any]): atPhosphorVirtualdomLib.atPhosphorVirtualdomMod.VirtualElement = js.native
  }
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: Renderer = js.native
}

