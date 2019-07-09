package typings
package atPhosphorWidgetsLib.libTabbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/tabbar", "TabBar")
@js.native
/**
  * Construct a new tab bar.
  *
  * @param options - The options for initializing the tab bar.
  */
class TabBar[T] ()
  extends atPhosphorWidgetsLib.libWidgetMod.Widget {
  def this(options: atPhosphorWidgetsLib.libTabbarMod.TabBarNs.IOptions[T]) = this()
  /**
    * Adjust the current index for a tab insert operation.
    *
    * This method accounts for the tab bar's insertion behavior when
    * adjusting the current index and emitting the changed signal.
    */
  var _adjustCurrentForInsert: js.Any = js.native
  /**
    * Adjust the current index for a tab move operation.
    *
    * This method will not cause the actual current tab to change.
    * It silently adjusts the index to account for the given move.
    */
  var _adjustCurrentForMove: js.Any = js.native
  /**
    * Adjust the current index for a tab remove operation.
    *
    * This method accounts for the tab bar's remove behavior when
    * adjusting the current index and emitting the changed signal.
    */
  var _adjustCurrentForRemove: js.Any = js.native
  var _currentChanged: js.Any = js.native
  var _currentIndex: js.Any = js.native
  var _dragData: js.Any = js.native
  /**
    * Handle the `'keydown'` event for the tab bar.
    */
  var _evtKeyDown: js.Any = js.native
  /**
    * Handle the `'mousedown'` event for the tab bar.
    */
  var _evtMouseDown: js.Any = js.native
  /**
    * Handle the `'mousemove'` event for the tab bar.
    */
  var _evtMouseMove: js.Any = js.native
  /**
    * Handle the `'mouseup'` event for the document.
    */
  var _evtMouseUp: js.Any = js.native
  /**
    * Handle the `changed` signal of a title object.
    */
  var _onTitleChanged: js.Any = js.native
  var _orientation: js.Any = js.native
  var _previousTitle: js.Any = js.native
  /**
    * Release the mouse and restore the non-dragged tab positions.
    */
  var _releaseMouse: js.Any = js.native
  var _tabActivateRequested: js.Any = js.native
  var _tabCloseRequested: js.Any = js.native
  var _tabDetachRequested: js.Any = js.native
  var _tabMoved: js.Any = js.native
  var _titles: js.Any = js.native
  /**
    * Whether a tab can be deselected by the user.
    *
    * #### Notes
    * Tabs can be always be deselected programmatically.
    */
  var allowDeselect: scala.Boolean = js.native
  /**
    * The tab bar content node.
    *
    * #### Notes
    * This is the node which holds the tab nodes.
    *
    * Modifying this node directly can lead to undefined behavior.
    */
  val contentNode: stdLib.HTMLUListElement = js.native
  /**
    * A signal emitted when the current tab is changed.
    *
    * #### Notes
    * This signal is emitted when the currently selected tab is changed
    * either through user or programmatic interaction.
    *
    * Notably, this signal is not emitted when the index of the current
    * tab changes due to tabs being inserted, removed, or moved. It is
    * only emitted when the actual current tab node is changed.
    */
  val currentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atPhosphorWidgetsLib.libTabbarMod.TabBarNs.ICurrentChangedArgs[T]] = js.native
  /**
    * Get the index of the currently selected tab.
    *
    * #### Notes
    * This will be `-1` if no tab is selected.
    */
  /**
    * Set the index of the currently selected tab.
    *
    * #### Notes
    * If the value is out of range, the index will be set to `-1`.
    */
  var currentIndex: scala.Double = js.native
  /**
    * Get the currently selected title.
    *
    * #### Notes
    * This will be `null` if no tab is selected.
    */
  /**
    * Set the currently selected title.
    *
    * #### Notes
    * If the title does not exist, the title will be set to `null`.
    */
  var currentTitle: atPhosphorWidgetsLib.libTitleMod.Title[T] | scala.Null = js.native
  /**
    * The selection behavior when inserting a tab.
    */
  var insertBehavior: atPhosphorWidgetsLib.libTabbarMod.TabBarNs.InsertBehavior = js.native
  /**
    * Get the orientation of the tab bar.
    *
    * #### Notes
    * This controls whether the tabs are arranged in a row or column.
    */
  /**
    * Set the orientation of the tab bar.
    *
    * #### Notes
    * This controls whether the tabs are arranged in a row or column.
    */
  var orientation: atPhosphorWidgetsLib.libTabbarMod.TabBarNs.Orientation = js.native
  /**
    * The selection behavior when removing a tab.
    */
  var removeBehavior: atPhosphorWidgetsLib.libTabbarMod.TabBarNs.RemoveBehavior = js.native
  /**
    * The renderer used by the tab bar.
    */
  val renderer: atPhosphorWidgetsLib.libTabbarMod.TabBarNs.IRenderer[T] = js.native
  /**
    * A signal emitted when a tab is clicked by the user.
    *
    * #### Notes
    * If the clicked tab is not the current tab, the clicked tab will be
    * made current and the `currentChanged` signal will be emitted first.
    *
    * This signal is emitted even if the clicked tab is the current tab.
    */
  val tabActivateRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atPhosphorWidgetsLib.libTabbarMod.TabBarNs.ITabActivateRequestedArgs[T]] = js.native
  /**
    * A signal emitted when a tab close icon is clicked.
    *
    * #### Notes
    * This signal is not emitted unless the tab title is `closable`.
    */
  val tabCloseRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atPhosphorWidgetsLib.libTabbarMod.TabBarNs.ITabCloseRequestedArgs[T]] = js.native
  /**
    * A signal emitted when a tab is dragged beyond the detach threshold.
    *
    * #### Notes
    * This signal is emitted when the user drags a tab with the mouse,
    * and mouse is dragged beyond the detach threshold.
    *
    * The consumer of the signal should call `releaseMouse` and remove
    * the tab in order to complete the detach.
    *
    * This signal is only emitted once per drag cycle.
    */
  val tabDetachRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atPhosphorWidgetsLib.libTabbarMod.TabBarNs.ITabDetachRequestedArgs[T]] = js.native
  /**
    * A signal emitted when a tab is moved by the user.
    *
    * #### Notes
    * This signal is emitted when a tab is moved by user interaction.
    *
    * This signal is not emitted when a tab is moved programmatically.
    */
  val tabMoved: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atPhosphorWidgetsLib.libTabbarMod.TabBarNs.ITabMovedArgs[T]] = js.native
  /**
    * Whether the tabs are movable by the user.
    *
    * #### Notes
    * Tabs can always be moved programmatically.
    */
  var tabsMovable: scala.Boolean = js.native
  /**
    * A read-only array of the titles in the tab bar.
    */
  val titles: js.Array[atPhosphorWidgetsLib.libTitleMod.Title[T]] = js.native
  /**
    * Add a tab to the end of the tab bar.
    *
    * @param value - The title which holds the data for the tab,
    *   or an options object to convert to a title.
    *
    * @returns The title object added to the tab bar.
    *
    * #### Notes
    * If the title is already added to the tab bar, it will be moved.
    */
  def addTab(value: atPhosphorWidgetsLib.libTitleMod.Title[T]): atPhosphorWidgetsLib.libTitleMod.Title[T] = js.native
  def addTab(value: atPhosphorWidgetsLib.libTitleMod.TitleNs.IOptions[T]): atPhosphorWidgetsLib.libTitleMod.Title[T] = js.native
  /**
    * Remove all tabs from the tab bar.
    */
  def clearTabs(): scala.Unit = js.native
  /**
    * Handle the DOM events for the tab bar.
    *
    * @param event - The DOM event sent to the tab bar.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the tab bar's DOM node.
    *
    * This should not be called directly by user code.
    */
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
  /**
    * Insert a tab into the tab bar at the specified index.
    *
    * @param index - The index at which to insert the tab.
    *
    * @param value - The title which holds the data for the tab,
    *   or an options object to convert to a title.
    *
    * @returns The title object added to the tab bar.
    *
    * #### Notes
    * The index will be clamped to the bounds of the tabs.
    *
    * If the title is already added to the tab bar, it will be moved.
    */
  def insertTab(index: scala.Double, value: atPhosphorWidgetsLib.libTitleMod.Title[T]): atPhosphorWidgetsLib.libTitleMod.Title[T] = js.native
  def insertTab(index: scala.Double, value: atPhosphorWidgetsLib.libTitleMod.TitleNs.IOptions[T]): atPhosphorWidgetsLib.libTitleMod.Title[T] = js.native
  /**
    * Release the mouse and restore the non-dragged tab positions.
    *
    * #### Notes
    * This will cause the tab bar to stop handling mouse events and to
    * restore the tabs to their non-dragged positions.
    */
  def releaseMouse(): scala.Unit = js.native
  /**
    * Remove a tab from the tab bar.
    *
    * @param title - The title for the tab to remove.
    *
    * #### Notes
    * This is a no-op if the title is not in the tab bar.
    */
  def removeTab(title: atPhosphorWidgetsLib.libTitleMod.Title[T]): scala.Unit = js.native
  /**
    * Remove the tab at a given index from the tab bar.
    *
    * @param index - The index of the tab to remove.
    *
    * #### Notes
    * This is a no-op if the index is out of range.
    */
  def removeTabAt(index: scala.Double): scala.Unit = js.native
}

