package typings
package atPhosphorWidgetsLib.libTabpanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/tabpanel", "TabPanel")
@js.native
/**
  * Construct a new tab panel.
  *
  * @param options - The options for initializing the tab panel.
  */
class TabPanel ()
  extends atPhosphorWidgetsLib.libWidgetMod.Widget {
  def this(options: atPhosphorWidgetsLib.libTabpanelMod.TabPanelNs.IOptions) = this()
  var _currentChanged: js.Any = js.native
  var _tabPlacement: js.Any = js.native
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
  val currentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atPhosphorWidgetsLib.libTabpanelMod.TabPanelNs.ICurrentChangedArgs] = js.native
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
    * If the index is out of range, it will be set to `-1`.
    */
  var currentIndex: scala.Double = js.native
  /**
    * Get the currently selected widget.
    *
    * #### Notes
    * This will be `null` if there is no selected tab.
    */
  /**
    * Set the currently selected widget.
    *
    * #### Notes
    * If the widget is not in the panel, it will be set to `null`.
    */
  var currentWidget: atPhosphorWidgetsLib.libWidgetMod.Widget | scala.Null = js.native
  /**
    * The stacked panel used by the tab panel.
    *
    * #### Notes
    * Modifying the panel directly can lead to undefined behavior.
    */
  val stackedPanel: atPhosphorWidgetsLib.libStackedpanelMod.StackedPanel = js.native
  /**
    * The tab bar used by the tab panel.
    *
    * #### Notes
    * Modifying the tab bar directly can lead to undefined behavior.
    */
  val tabBar: atPhosphorWidgetsLib.libTabbarMod.TabBar[atPhosphorWidgetsLib.libWidgetMod.Widget] = js.native
  /**
    * Get the tab placement for the tab panel.
    *
    * #### Notes
    * This controls the position of the tab bar relative to the content.
    */
  /**
    * Set the tab placement for the tab panel.
    *
    * #### Notes
    * This controls the position of the tab bar relative to the content.
    */
  var tabPlacement: atPhosphorWidgetsLib.libTabpanelMod.TabPanelNs.TabPlacement = js.native
  /**
    * Get the whether the tabs are movable by the user.
    *
    * #### Notes
    * Tabs can always be moved programmatically.
    */
  /**
    * Set the whether the tabs are movable by the user.
    *
    * #### Notes
    * Tabs can always be moved programmatically.
    */
  var tabsMovable: scala.Boolean = js.native
  /**
    * A read-only array of the widgets in the panel.
    */
  val widgets: js.Array[atPhosphorWidgetsLib.libWidgetMod.Widget] = js.native
  /**
    * Handle the `currentChanged` signal from the tab bar.
    */
  /* private */ def _onCurrentChanged(sender: js.Any, args: js.Any): js.Any = js.native
  /**
    * Handle the `tabActivateRequested` signal from the tab bar.
    */
  /* private */ def _onTabActivateRequested(sender: js.Any, args: js.Any): js.Any = js.native
  /**
    * Handle the `tabCloseRequested` signal from the tab bar.
    */
  /* private */ def _onTabCloseRequested(sender: js.Any, args: js.Any): js.Any = js.native
  /**
    * Handle the `tabMoved` signal from the tab bar.
    */
  /* private */ def _onTabMoved(sender: js.Any, args: js.Any): js.Any = js.native
  /**
    * Handle the `widgetRemoved` signal from the stacked panel.
    */
  /* private */ def _onWidgetRemoved(sender: js.Any, widget: js.Any): js.Any = js.native
  /**
    * Add a widget to the end of the tab panel.
    *
    * @param widget - The widget to add to the tab panel.
    *
    * #### Notes
    * If the widget is already contained in the panel, it will be moved.
    *
    * The widget's `title` is used to populate the tab.
    */
  def addWidget(widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Unit = js.native
  /**
    * Insert a widget into the tab panel at a specified index.
    *
    * @param index - The index at which to insert the widget.
    *
    * @param widget - The widget to insert into to the tab panel.
    *
    * #### Notes
    * If the widget is already contained in the panel, it will be moved.
    *
    * The widget's `title` is used to populate the tab.
    */
  def insertWidget(index: scala.Double, widget: atPhosphorWidgetsLib.libWidgetMod.Widget): scala.Unit = js.native
}

