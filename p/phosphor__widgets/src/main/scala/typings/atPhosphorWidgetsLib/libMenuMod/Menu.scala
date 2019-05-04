package typings
package atPhosphorWidgetsLib.libMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/menu", "Menu")
@js.native
class Menu protected ()
  extends atPhosphorWidgetsLib.libWidgetMod.Widget {
  /**
    * Construct a new menu.
    *
    * @param options - The options for initializing the menu.
    */
  def this(options: atPhosphorWidgetsLib.libMenuMod.MenuNs.IOptions) = this()
  var _aboutToClose: js.Any = js.native
  var _activeIndex: js.Any = js.native
  var _childIndex: js.Any = js.native
  var _childMenu: js.Any = js.native
  var _closeTimerID: js.Any = js.native
  var _items: js.Any = js.native
  var _menuRequested: js.Any = js.native
  var _openTimerID: js.Any = js.native
  var _parentMenu: js.Any = js.native
  /**
    * A signal emitted just before the menu is closed.
    *
    * #### Notes
    * This signal is emitted when the menu receives a `'close-request'`
    * message, just before it removes itself from the DOM.
    *
    * This signal is not emitted if the menu is already detached from
    * the DOM when it receives the `'close-request'` message.
    */
  val aboutToClose: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * Get the index of the currently active menu item.
    *
    * #### Notes
    * This will be `-1` if no menu item is active.
    */
  /**
    * Set the index of the currently active menu item.
    *
    * #### Notes
    * If the item cannot be activated, the index will be set to `-1`.
    */
  var activeIndex: scala.Double = js.native
  /**
    * Get the currently active menu item.
    */
  /**
    * Set the currently active menu item.
    *
    * #### Notes
    * If the item cannot be activated, the item will be set to `null`.
    */
  var activeItem: atPhosphorWidgetsLib.libMenuMod.MenuNs.IItem | scala.Null = js.native
  /**
    * The child menu of the menu.
    *
    * #### Notes
    * This is `null` unless the menu has an open submenu.
    */
  val childMenu: Menu | scala.Null = js.native
  /**
    * The command registry used by the menu.
    */
  val commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry = js.native
  /**
    * The menu content node.
    *
    * #### Notes
    * This is the node which holds the menu item nodes.
    *
    * Modifying this node directly can lead to undefined behavior.
    */
  val contentNode: stdLib.HTMLUListElement = js.native
  /**
    * A read-only array of the menu items in the menu.
    */
  val items: js.Array[atPhosphorWidgetsLib.libMenuMod.MenuNs.IItem] = js.native
  /**
    * The leaf menu of the menu hierarchy.
    */
  val leafMenu: Menu = js.native
  /**
    * A signal emitted when a new menu is requested by the user.
    *
    * #### Notes
    * This signal is emitted whenever the user presses the right or left
    * arrow keys, and a submenu cannot be opened or closed in response.
    *
    * This signal is useful when implementing menu bars in order to open
    * the next or previous menu in response to a user key press.
    *
    * This signal is only emitted for the root menu in a hierarchy.
    */
  val menuRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.next | atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.previous
  ] = js.native
  /**
    * The parent menu of the menu.
    *
    * #### Notes
    * This is `null` unless the menu is an open submenu.
    */
  val parentMenu: Menu | scala.Null = js.native
  /**
    * The renderer used by the menu.
    */
  val renderer: atPhosphorWidgetsLib.libMenuMod.MenuNs.IRenderer = js.native
  /**
    * The root menu of the menu hierarchy.
    */
  val rootMenu: Menu = js.native
  /**
    * Cancel the close timer, if the timer is pending.
    */
  /* private */ def _cancelCloseTimer(): js.Any = js.native
  /**
    * Cancel the open timer, if the timer is pending.
    */
  /* private */ def _cancelOpenTimer(): js.Any = js.native
  /**
    * Close the child menu immediately.
    *
    * This is a no-op if a child menu is not open.
    */
  /* private */ def _closeChildMenu(): js.Any = js.native
  /**
    * Handle the `'keydown'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the menu node.
    */
  /* private */ def _evtKeyDown(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mousedown'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the document node.
    */
  /* private */ def _evtMouseDown(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mouseenter'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the menu node.
    */
  /* private */ def _evtMouseEnter(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mouseleave'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the menu node.
    */
  /* private */ def _evtMouseLeave(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mousemove'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the menu node.
    */
  /* private */ def _evtMouseMove(event: js.Any): js.Any = js.native
  /**
    * Handle the `'mouseup'` event for the menu.
    *
    * #### Notes
    * This listener is attached to the menu node.
    */
  /* private */ def _evtMouseUp(event: js.Any): js.Any = js.native
  /**
    * Open the child menu at the active index immediately.
    *
    * If a different child menu is already open, it will be closed,
    * even if the active item is not a valid submenu.
    */
  /* private */ def _openChildMenu(): js.Any = js.native
  /* private */ def _openChildMenu(activateFirst: js.Any): js.Any = js.native
  /**
    * Start the close timer, unless it is already pending.
    */
  /* private */ def _startCloseTimer(): js.Any = js.native
  /**
    * Start the open timer, unless it is already pending.
    */
  /* private */ def _startOpenTimer(): js.Any = js.native
  /**
    * Activate the next selectable item in the menu.
    *
    * #### Notes
    * If no item is selectable, the index will be set to `-1`.
    */
  def activateNextItem(): scala.Unit = js.native
  /**
    * Activate the previous selectable item in the menu.
    *
    * #### Notes
    * If no item is selectable, the index will be set to `-1`.
    */
  def activatePreviousItem(): scala.Unit = js.native
  /**
    * Add a menu item to the end of the menu.
    *
    * @param options - The options for creating the menu item.
    *
    * @returns The menu item added to the menu.
    */
  def addItem(options: atPhosphorWidgetsLib.libMenuMod.MenuNs.IItemOptions): atPhosphorWidgetsLib.libMenuMod.MenuNs.IItem = js.native
  /**
    * Remove all menu items from the menu.
    */
  def clearItems(): scala.Unit = js.native
  /**
    * Handle the DOM events for the menu.
    *
    * @param event - The DOM event sent to the menu.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the menu's DOM nodes. It should
    * not be called directly by user code.
    */
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
  /**
    * Insert a menu item into the menu at the specified index.
    *
    * @param index - The index at which to insert the item.
    *
    * @param options - The options for creating the menu item.
    *
    * @returns The menu item added to the menu.
    *
    * #### Notes
    * The index will be clamped to the bounds of the items.
    */
  def insertItem(index: scala.Double, options: atPhosphorWidgetsLib.libMenuMod.MenuNs.IItemOptions): atPhosphorWidgetsLib.libMenuMod.MenuNs.IItem = js.native
  /**
    * Open the menu at the specified location.
    *
    * @param x - The client X coordinate of the menu location.
    *
    * @param y - The client Y coordinate of the menu location.
    *
    * @param options - The additional options for opening the menu.
    *
    * #### Notes
    * The menu will be opened at the given location unless it will not
    * fully fit on the screen. If it will not fit, it will be adjusted
    * to fit naturally on the screen.
    *
    * This is a no-op if the menu is already attached to the DOM.
    */
  def open(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def open(x: scala.Double, y: scala.Double, options: atPhosphorWidgetsLib.libMenuMod.MenuNs.IOpenOptions): scala.Unit = js.native
  /**
    * Remove an item from the menu.
    *
    * @param item - The item to remove from the menu.
    *
    * #### Notes
    * This is a no-op if the item is not in the menu.
    */
  def removeItem(item: atPhosphorWidgetsLib.libMenuMod.MenuNs.IItem): scala.Unit = js.native
  /**
    * Remove the item at a given index from the menu.
    *
    * @param index - The index of the item to remove.
    *
    * #### Notes
    * This is a no-op if the index is out of range.
    */
  def removeItemAt(index: scala.Double): scala.Unit = js.native
  /**
    * Trigger the active menu item.
    *
    * #### Notes
    * If the active item is a submenu, it will be opened and the first
    * item will be activated.
    *
    * If the active item is a command, the command will be executed.
    *
    * If the menu is not attached, this is a no-op.
    *
    * If there is no active item, this is a no-op.
    */
  def triggerActiveItem(): scala.Unit = js.native
}

