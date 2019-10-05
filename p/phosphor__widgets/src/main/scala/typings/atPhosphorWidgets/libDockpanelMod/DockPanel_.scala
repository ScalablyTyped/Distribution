package typings.atPhosphorWidgets.libDockpanelMod

import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.atPhosphorWidgets.libDockpanelMod.DockPanel.IAddOptions
import typings.atPhosphorWidgets.libDockpanelMod.DockPanel.ILayoutConfig
import typings.atPhosphorWidgets.libDockpanelMod.DockPanel.IOptions
import typings.atPhosphorWidgets.libDockpanelMod.DockPanel.IOverlay
import typings.atPhosphorWidgets.libDockpanelMod.DockPanel.IRenderer
import typings.atPhosphorWidgets.libDockpanelMod.DockPanel.Mode
import typings.atPhosphorWidgets.libTabbarMod.TabBar
import typings.atPhosphorWidgets.libWidgetMod.Widget
import typings.std.Event
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/dockpanel", "DockPanel")
@js.native
/**
  * Construct a new dock panel.
  *
  * @param options - The options for initializing the panel.
  */
class DockPanel_ () extends Widget {
  def this(options: IOptions) = this()
  /**
    * Create a new handle for use by the panel.
    */
  var _createHandle: js.Any = js.native
  /**
    * Create a new tab bar for use by the panel.
    */
  var _createTabBar: js.Any = js.native
  var _drag: js.Any = js.native
  var _edges: js.Any = js.native
  /**
    * Handle the `'p-dragenter'` event for the dock panel.
    */
  var _evtDragEnter: js.Any = js.native
  /**
    * Handle the `'p-dragleave'` event for the dock panel.
    */
  var _evtDragLeave: js.Any = js.native
  /**
    * Handle the `'p-dragover'` event for the dock panel.
    */
  var _evtDragOver: js.Any = js.native
  /**
    * Handle the `'p-drop'` event for the dock panel.
    */
  var _evtDrop: js.Any = js.native
  /**
    * Handle the `'keydown'` event for the dock panel.
    */
  var _evtKeyDown: js.Any = js.native
  /**
    * Handle the `'mousedown'` event for the dock panel.
    */
  var _evtMouseDown: js.Any = js.native
  /**
    * Handle the `'mousemove'` event for the dock panel.
    */
  var _evtMouseMove: js.Any = js.native
  /**
    * Handle the `'mouseup'` event for the dock panel.
    */
  var _evtMouseUp: js.Any = js.native
  var _layoutModified: js.Any = js.native
  var _mode: js.Any = js.native
  /**
    * Handle the `currentChanged` signal from a tab bar.
    */
  var _onCurrentChanged: js.Any = js.native
  /**
    * Handle the `tabActivateRequested` signal from a tab bar.
    */
  var _onTabActivateRequested: js.Any = js.native
  /**
    * Handle the `tabCloseRequested` signal from a tab bar.
    */
  var _onTabCloseRequested: js.Any = js.native
  /**
    * Handle the `tabDetachRequested` signal from a tab bar.
    */
  var _onTabDetachRequested: js.Any = js.native
  /**
    * Handle the `tabMoved` signal from a tab bar.
    */
  var _onTabMoved: js.Any = js.native
  var _pressData: js.Any = js.native
  /**
    * Release the mouse grab for the dock panel.
    */
  var _releaseMouse: js.Any = js.native
  var _renderer: js.Any = js.native
  /**
    * Show the overlay indicator at the given client position.
    *
    * Returns the drop zone at the specified client position.
    *
    * #### Notes
    * If the position is not over a valid zone, the overlay is hidden.
    */
  var _showOverlay: js.Any = js.native
  /**
    * Whether the dock panel is empty.
    */
  val isEmpty: Boolean = js.native
  /**
    * A signal emitted when the layout configuration is modified.
    *
    * #### Notes
    * This signal is emitted whenever the current layout configuration
    * may have changed.
    *
    * This signal is emitted asynchronously in a collapsed fashion, so
    * that multiple synchronous modifications results in only a single
    * emit of the signal.
    */
  val layoutModified: ISignal[this.type, Unit] = js.native
  /**
    * Get the mode for the dock panel.
    */
  /**
    * Set the mode for the dock panel.
    *
    * #### Notes
    * Changing the mode is a destructive operation with respect to the
    * panel's layout configuration. If layout state must be preserved,
    * save the current layout config before changing the mode.
    */
  var mode: Mode = js.native
  /**
    * The overlay used by the dock panel.
    */
  val overlay: IOverlay = js.native
  /**
    * The renderer used by the dock panel.
    */
  val renderer: IRenderer = js.native
  /**
    * Get the spacing between the widgets.
    */
  /**
    * Set the spacing between the widgets.
    */
  var spacing: Double = js.native
  /**
    * Activate a specified widget in the dock panel.
    *
    * @param widget - The widget of interest.
    *
    * #### Notes
    * This will select and activate the given widget.
    */
  def activateWidget(widget: Widget): Unit = js.native
  /**
    * Add a widget to the dock panel.
    *
    * @param widget - The widget to add to the dock panel.
    *
    * @param options - The additional options for adding the widget.
    *
    * #### Notes
    * If the panel is in single document mode, the options are ignored
    * and the widget is always added as tab in the hidden tab bar.
    */
  def addWidget(widget: Widget): Unit = js.native
  def addWidget(widget: Widget, options: IAddOptions): Unit = js.native
  /**
    * Handle the DOM events for the dock panel.
    *
    * @param event - The DOM event sent to the panel.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the panel's DOM node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  /**
    * Create an iterator over the handles in the panel.
    *
    * @returns A new iterator over the handles in the panel.
    */
  def handles(): IIterator[HTMLDivElement] = js.native
  /**
    * Restore the layout to a previously saved configuration.
    *
    * @param config - The layout configuration to restore.
    *
    * #### Notes
    * Widgets which currently belong to the layout but which are not
    * contained in the config will be unparented.
    *
    * The dock panel automatically reverts to `'multiple-document'`
    * mode when a layout config is restored.
    */
  def restoreLayout(config: ILayoutConfig): Unit = js.native
  /**
    * Save the current layout configuration of the dock panel.
    *
    * @returns A new config object for the current layout state.
    *
    * #### Notes
    * The return value can be provided to the `restoreLayout` method
    * in order to restore the layout to its current configuration.
    */
  def saveLayout(): ILayoutConfig = js.native
  /**
    * Select a specific widget in the dock panel.
    *
    * @param widget - The widget of interest.
    *
    * #### Notes
    * This will make the widget the current widget in its tab area.
    */
  def selectWidget(widget: Widget): Unit = js.native
  /**
    * Create an iterator over the selected widgets in the panel.
    *
    * @returns A new iterator over the selected user widgets.
    *
    * #### Notes
    * This iterator yields the widgets corresponding to the current tab
    * of each tab bar in the panel.
    */
  def selectedWidgets(): IIterator[Widget] = js.native
  /**
    * Create an iterator over the tab bars in the panel.
    *
    * @returns A new iterator over the tab bars in the panel.
    *
    * #### Notes
    * This iterator does not include the user widgets.
    */
  def tabBars(): IIterator[TabBar[Widget]] = js.native
  /**
    * Create an iterator over the user widgets in the panel.
    *
    * @returns A new iterator over the user widgets in the panel.
    *
    * #### Notes
    * This iterator does not include the generated tab bars.
    */
  def widgets(): IIterator[Widget] = js.native
}

