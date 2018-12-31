package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.SelectDialog")
@js.native
class SelectDialog protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new SelectDialog.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: ListItemBase): SelectDialog = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>cancel</code> event of this
    * <code>sap.m.SelectDialog</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SelectDialog</code> itself.This event will be fired when the cancel button is
    * clicked
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SelectDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachCancel(oData: js.Any, fnFunction: js.Any): SelectDialog = js.native
  def attachCancel(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SelectDialog = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>confirm</code> event of this
    * <code>sap.m.SelectDialog</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SelectDialog</code> itself.This event will be fired when the dialog is confirmed
    * by selecting an item in single selection mode or by pressing the confirmation button in multi
    * selection mode . The items being selected are returned as event parameters.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SelectDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachConfirm(oData: js.Any, fnFunction: js.Any): SelectDialog = js.native
  def attachConfirm(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SelectDialog = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>liveChange</code> event of this
    * <code>sap.m.SelectDialog</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SelectDialog</code> itself.This event will be fired when the value of the search
    * field is changed by a user - e.g. at each key press
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SelectDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachLiveChange(oData: js.Any, fnFunction: js.Any): SelectDialog = js.native
  def attachLiveChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SelectDialog = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>search</code> event of this
    * <code>sap.m.SelectDialog</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.SelectDialog</code> itself.This event will be fired when the search button has
    * been clicked on the searchfield on the visual control
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SelectDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSearch(oData: js.Any, fnFunction: js.Any): SelectDialog = js.native
  def attachSearch(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SelectDialog = js.native
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): SelectDialog = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>cancel</code> event of this
    * <code>sap.m.SelectDialog</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachCancel(fnFunction: js.Any, oListener: js.Any): SelectDialog = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>confirm</code> event of this
    * <code>sap.m.SelectDialog</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachConfirm(fnFunction: js.Any, oListener: js.Any): SelectDialog = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>liveChange</code> event of this
    * <code>sap.m.SelectDialog</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachLiveChange(fnFunction: js.Any, oListener: js.Any): SelectDialog = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>search</code> event of this
    * <code>sap.m.SelectDialog</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSearch(fnFunction: js.Any, oListener: js.Any): SelectDialog = js.native
  /**
    * Fires event <code>cancel</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireCancel(mArguments: js.Any): SelectDialog = js.native
  /**
    * Fires event <code>confirm</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selectedItem</code> of type <code>sap.m.StandardListItem</code>Returns the
    * selected list item. When no item is selected, "null" is returned. When multi-selection is enabled
    * and multiple items are selected, only the first selected item is
    * returned.</li><li><code>selectedItems</code> of type <code>sap.m.StandardListItem[]</code>Returns an
    * array containing the visible selected list items. If no items are selected, an empty array is
    * returned.</li><li><code>selectedContexts</code> of type <code>string</code>Returns the binding
    * contexts of the selected items including the non-visible items.NOTE: In contrast to the parameter
    * "selectedItems", this parameter will also include the selected but NOT visible items (e.g. due to
    * list filtering). An empty array will be set for this parameter if no data binding is used.NOTE: When
    * the list binding is pre-filtered and there are items in the selection that are not visible upon
    * opening the dialog, these contexts are not loaded. Therefore, these items will not be included in
    * the selectedContexts array unless they are displayed at least once.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireConfirm(mArguments: js.Any): SelectDialog = js.native
  /**
    * Fires event <code>liveChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>string</code>The value to search for, which can
    * change at any keypress</li><li><code>itemsBinding</code> of type <code>any</code>The Items binding
    * of the Select Dialog. It will only be available if the items aggregation is bound to a
    * model.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireLiveChange(mArguments: js.Any): SelectDialog = js.native
  /**
    * Fires event <code>search</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>string</code>The value entered in the
    * search</li><li><code>itemsBinding</code> of type <code>any</code>The Items binding of the Select
    * Dialog for search purposes. It will only be available if the items aggregation is bound to a
    * model.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSearch(mArguments: js.Any): SelectDialog = js.native
  /**
    * Get the internal Dialog's contentHeight property {@link sap.m.Dialog}
    * @returns sHeight The content width of the internal dialog
    */
  def getContentHeight(): js.Any = js.native
  /**
    * Get the internal Dialog's contentWidth property {@link sap.m.Dialog}
    * @returns sWidth The content width of the internal dialog
    */
  def getContentWidth(): js.Any = js.native
  /**
    * Forward method to the inner dialog: getDomRef
    * @returns The Element's DOM Element sub DOM Element or null
    */
  def getDomRef(): openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
    * Gets current value of property <code>growingThreshold</code>.Determines the number of items
    * initially displayed in the list. Also defines the number of items to be requested from the model for
    * each grow.
    * @returns Value of property <code>growingThreshold</code>
    */
  def getGrowingThreshold(): scala.Double = js.native
  /**
    * Gets content of aggregation <code>items</code>.The items of the list shown in the search dialog. It
    * is recommended to use a StandardListItem for the dialog but other combinations are also possible.
    */
  def getItems(): js.Array[ListItemBase] = js.native
  /**
    * Gets current value of property <code>multiSelect</code>.Determines if the user can select several
    * options from the listDefault value is <code>false</code>.
    * @returns Value of property <code>multiSelect</code>
    */
  def getMultiSelect(): scala.Boolean = js.native
  /**
    * Get the internal List's no data text property
    * @returns the current no data text
    */
  def getNoDataText(): java.lang.String = js.native
  /**
    * Gets current value of property <code>rememberSelections</code>.This flag controls whether the dialog
    * clears the selection after the confirm event has been fired. If the dialog needs to be opened
    * multiple times in the same context to allow for corrections of previous user inputs, set this flag
    * to "true".Default value is <code>false</code>.
    * @since 1.18
    * @returns Value of property <code>rememberSelections</code>
    */
  def getRememberSelections(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>title</code>.Determines the title text that appears in the
    * dialog header
    * @returns Value of property <code>title</code>
    */
  def getTitle(): java.lang.String = js.native
  /**
    * Forward method to the inner dialog: hasStyleClass
    * @returns true if the class is set, false otherwise
    */
  def hasStyleClass(): scala.Boolean = js.native
  /**
    * Checks for the provided <code>sap.m.ListItemBase</code> in the aggregation <code>items</code>.and
    * returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: ListItemBase): scala.Double = js.native
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: ListItemBase, iIndex: scala.Double): SelectDialog = js.native
  /**
    * Opens the internal dialog with a searchfield and a list.
    * @param sSearchValue A value for the search can be passed to match with the filter applied to the
    * list binding.
    */
  def open(sSearchValue: java.lang.String): SelectDialog = js.native
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[ListItemBase] = js.native
  def removeItem(vItem: java.lang.String): ListItemBase = js.native
  def removeItem(vItem: ListItemBase): ListItemBase = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: scala.Double): ListItemBase = js.native
  /**
    * Forward method to the inner dialog: removeStyleClass
    * @returns this pointer for chaining
    */
  def removeStyleClass(): SelectDialog = js.native
  /**
    * Set the internal Dialog's contentHeight property {@link sap.m.Dialog}
    * @param sHeight The new content width value for the dialog
    * @returns this pointer for chaining
    */
  def setContentHeight(sHeight: js.Any): SelectDialog = js.native
  /**
    * Set the internal Dialog's contentWidth property {@link sap.m.Dialog}
    * @param sWidth The new content width value for the dialog
    * @returns this pointer for chaining
    */
  def setContentWidth(sWidth: js.Any): SelectDialog = js.native
  /**
    * Sets the growing threshold to the internal list
    * @param iValue Value for the list's growing threshold.
    * @returns this pointer for chaining
    */
  def setGrowingThreshold(iValue: scala.Double): SelectDialog = js.native
  /**
    * Enable/Disable multi selection mode.
    * @param bMulti Flag for multi selection mode
    * @returns this pointer for chaining
    */
  def setMultiSelect(bMulti: scala.Boolean): SelectDialog = js.native
  /**
    * Set the internal List's no data text property
    * @param sNoDataText The no data text for the list
    * @returns this pointer for chaining
    */
  def setNoDataText(sNoDataText: java.lang.String): SelectDialog = js.native
  /**
    * Sets a new value for property <code>rememberSelections</code>.This flag controls whether the dialog
    * clears the selection after the confirm event has been fired. If the dialog needs to be opened
    * multiple times in the same context to allow for corrections of previous user inputs, set this flag
    * to "true".When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @since 1.18
    * @param bRememberSelections New value for property <code>rememberSelections</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRememberSelections(bRememberSelections: scala.Boolean): SelectDialog = js.native
  /**
    * Set the title of the internal dialog
    * @param sTitle The title text for the dialog
    * @returns this pointer for chaining
    */
  def setTitle(sTitle: java.lang.String): SelectDialog = js.native
  /**
    * Forward method to the inner dialog: toggleStyleClass
    * @returns this pointer for chaining
    */
  def toggleStyleClass(): SelectDialog = js.native
}

