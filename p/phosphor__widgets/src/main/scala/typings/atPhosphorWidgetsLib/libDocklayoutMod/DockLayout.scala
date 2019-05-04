package typings
package atPhosphorWidgetsLib.libDocklayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/docklayout", "DockLayout")
@js.native
class DockLayout protected ()
  extends atPhosphorWidgetsLib.libLayoutMod.Layout {
  /**
    * Construct a new dock layout.
    *
    * @param options - The options for initializing the layout.
    */
  def this(options: atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.IOptions) = this()
  var _box: js.Any = js.native
  var _dirty: js.Any = js.native
  var _items: js.Any = js.native
  var _root: js.Any = js.native
  var _spacing: js.Any = js.native
  /**
    * Whether the dock layout is empty.
    */
  val isEmpty: scala.Boolean = js.native
  /**
    * The renderer used by the dock layout.
    */
  val renderer: atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.IRenderer = js.native
  /**
    * Get the inter-element spacing for the dock layout.
    */
  /**
    * Set the inter-element spacing for the dock layout.
    */
  var spacing: scala.Double = js.native
  /**
    * Create a new handle for the dock layout.
    *
    * #### Notes
    * The handle will be attached to the parent if it exists.
    */
  /* private */ def _createHandle(): js.Any = js.native
  /**
    * Create a new tab bar for use by the dock layout.
    *
    * #### Notes
    * The tab bar will be attached to the parent if it exists.
    */
  /* private */ def _createTabBar(): js.Any = js.native
  /**
    * Fit the layout to the total size required by the widgets.
    */
  /* private */ def _fit(): js.Any = js.native
  /**
    * Insert a widget as a new split area.
    *
    * #### Notes
    * This does not attach the widget to the parent widget.
    */
  /* private */ def _insertSplit(widget: js.Any, ref: js.Any, refNode: js.Any, orientation: js.Any, after: js.Any): js.Any = js.native
  /**
    * Insert a widget next to an existing tab.
    *
    * #### Notes
    * This does not attach the widget to the parent widget.
    */
  /* private */ def _insertTab(widget: js.Any, ref: js.Any, refNode: js.Any, after: js.Any): js.Any = js.native
  /**
    * Remove the specified widget from the layout structure.
    *
    * #### Notes
    * This is a no-op if the widget is not in the layout tree.
    *
    * This does not detach the widget from the parent node.
    */
  /* private */ def _removeWidget(widget: js.Any): js.Any = js.native
  /**
    * Ensure the root is a split node with the given orientation.
    */
  /* private */ def _splitRoot(orientation: js.Any): js.Any = js.native
  /**
    * Update the layout position and size of the widgets.
    *
    * The parent offset dimensions should be `-1` if unknown.
    */
  /* private */ def _update(offsetWidth: js.Any, offsetHeight: js.Any): js.Any = js.native
  /**
    * Add a widget to the dock layout.
    *
    * @param widget - The widget to add to the dock layout.
    *
    * @param options - The additional options for adding the widget.
    *
    * #### Notes
    * The widget will be moved if it is already contained in the layout.
    *
    * An error will be thrown if the reference widget is invalid.
    */
  def addWidget(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Unit = js.native
  def addWidget(
    widget: atPhosphorWidgetsLib.libWidgetMod.Widget,
    options: atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.IAddOptions
  ): scala.Unit = js.native
  /**
    * Attach the widget to the layout parent widget.
    *
    * @param widget - The widget to attach to the parent.
    *
    * #### Notes
    * This is a no-op if the widget is already attached.
    */
  /* protected */ def attachWidget(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Unit = js.native
  /**
    * Detach the widget from the layout parent widget.
    *
    * @param widget - The widget to detach from the parent.
    *
    * #### Notes
    * This is a no-op if the widget is not attached.
    */
  /* protected */ def detachWidget(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Unit = js.native
  /**
    * Create an iterator over the handles in the layout.
    *
    * @returns A new iterator over the handles in the layout.
    */
  def handles(): atPhosphorAlgorithmLib.libIterMod.IIterator[stdLib.HTMLDivElement] = js.native
  /**
    * Find the tab area which contains the given client position.
    *
    * @param clientX - The client X position of interest.
    *
    * @param clientY - The client Y position of interest.
    *
    * @returns The geometry of the tab area at the given position, or
    *   `null` if there is no tab area at the given position.
    */
  def hitTestTabAreas(clientX: scala.Double, clientY: scala.Double): atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.ITabAreaGeometry | scala.Null = js.native
  /**
    * Move a handle to the given offset position.
    *
    * @param handle - The handle to move.
    *
    * @param offsetX - The desired offset X position of the handle.
    *
    * @param offsetY - The desired offset Y position of the handle.
    *
    * #### Notes
    * If the given handle is not contained in the layout, this is no-op.
    *
    * The handle will be moved as close as possible to the desired
    * position without violating any of the layout constraints.
    *
    * Only one of the coordinates is used depending on the orientation
    * of the handle. This method accepts both coordinates to make it
    * easy to invoke from a mouse move event without needing to know
    * the handle orientation.
    */
  def moveHandle(handle: stdLib.HTMLDivElement, offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  /**
    * Restore the layout to a previously saved configuration.
    *
    * @param config - The layout configuration to restore.
    *
    * #### Notes
    * Widgets which currently belong to the layout but which are not
    * contained in the config will be unparented.
    */
  def restoreLayout(config: atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.ILayoutConfig): scala.Unit = js.native
  /**
    * Save the current configuration of the dock layout.
    *
    * @returns A new config object for the current layout state.
    *
    * #### Notes
    * The return value can be provided to the `restoreLayout` method
    * in order to restore the layout to its current configuration.
    */
  def saveLayout(): atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.ILayoutConfig = js.native
  /**
    * Create an iterator over the selected widgets in the layout.
    *
    * @returns A new iterator over the selected user widgets.
    *
    * #### Notes
    * This iterator yields the widgets corresponding to the current tab
    * of each tab bar in the layout.
    */
  def selectedWidgets(): atPhosphorAlgorithmLib.libIterMod.IIterator[atPhosphorWidgetsLib.libWidgetMod.Widget] = js.native
  /**
    * Create an iterator over the tab bars in the layout.
    *
    * @returns A new iterator over the tab bars in the layout.
    *
    * #### Notes
    * This iterator does not include the user widgets.
    */
  def tabBars(): atPhosphorAlgorithmLib.libIterMod.IIterator[
    atPhosphorWidgetsLib.libTabbarMod.TabBar[atPhosphorWidgetsLib.libWidgetMod.Widget]
  ] = js.native
  /**
    * Create an iterator over the user widgets in the layout.
    *
    * @returns A new iterator over the user widgets in the layout.
    *
    * #### Notes
    * This iterator does not include the generated tab bars.
    */
  def widgets(): atPhosphorAlgorithmLib.libIterMod.IIterator[atPhosphorWidgetsLib.libWidgetMod.Widget] = js.native
}

