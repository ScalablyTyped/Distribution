package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableSelectDialog extends Control {
  
  /**
    * Sets the binding context for the internal table AND the current control so that both controls can be
    * used with the context.
    */
  var _setBindingContext: js.Any = js.native
  
  /**
    * Sets the model for the internal table and the current control, so that both controls can be used
    * with data binding.
    */
  var _setModel: js.Any = js.native
  
  /**
    * Adds some column to the aggregation <code>columns</code>.
    * @param oColumn the column to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addColumn(oColumn: Column): TableSelectDialog = js.native
  
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: ColumnListItem): TableSelectDialog = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>cancel</code> event of this
    * <code>sap.m.TableSelectDialog</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TableSelectDialog</code> itself.Fires when the Cancel button is clicked.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TableSelectDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachCancel(oData: js.Any, fnFunction: js.Any): TableSelectDialog = js.native
  def attachCancel(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TableSelectDialog = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>confirm</code> event of this
    * <code>sap.m.TableSelectDialog</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TableSelectDialog</code> itself.Fires when the dialog is confirmed by selecting
    * an item in single-selection mode or by pressing the confirmation button in multi-selection mode. The
    * items being selected are returned as event parameters.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TableSelectDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachConfirm(oData: js.Any, fnFunction: js.Any): TableSelectDialog = js.native
  def attachConfirm(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TableSelectDialog = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>liveChange</code> event of this
    * <code>sap.m.TableSelectDialog</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TableSelectDialog</code> itself.Fires when the value of the search field is
    * changed by a user (for example at each key press).
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TableSelectDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachLiveChange(oData: js.Any, fnFunction: js.Any): TableSelectDialog = js.native
  def attachLiveChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TableSelectDialog = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>search</code> event of this
    * <code>sap.m.TableSelectDialog</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TableSelectDialog</code> itself.Fires when the search button has been clicked on
    * dialog.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TableSelectDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSearch(oData: js.Any, fnFunction: js.Any): TableSelectDialog = js.native
  def attachSearch(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TableSelectDialog = js.native
  
  /**
    * Binds aggregation <code>columns</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindColumns(oBindingInfo: js.Any): TableSelectDialog = js.native
  
  /**
    * Binds aggregation <code>items</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindItems(oBindingInfo: js.Any): TableSelectDialog = js.native
  
  /**
    * Destroys all the columns in the aggregation <code>columns</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyColumns(): TableSelectDialog = js.native
  
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): TableSelectDialog = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>cancel</code> event of this
    * <code>sap.m.TableSelectDialog</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachCancel(fnFunction: js.Any, oListener: js.Any): TableSelectDialog = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>confirm</code> event of this
    * <code>sap.m.TableSelectDialog</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachConfirm(fnFunction: js.Any, oListener: js.Any): TableSelectDialog = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>liveChange</code> event of this
    * <code>sap.m.TableSelectDialog</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachLiveChange(fnFunction: js.Any, oListener: js.Any): TableSelectDialog = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>search</code> event of this
    * <code>sap.m.TableSelectDialog</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSearch(fnFunction: js.Any, oListener: js.Any): TableSelectDialog = js.native
  
  /**
    * Fires event <code>cancel</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireCancel(mArguments: js.Any): TableSelectDialog = js.native
  
  /**
    * Fires event <code>confirm</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selectedItem</code> of type <code>sap.m.StandardListItem</code>Returns the
    * selected list item. When no item is selected, "null" is returned. When multi-selection is enabled
    * and multiple items are selected, only the first selected item is
    * returned.</li><li><code>selectedItems</code> of type <code>sap.m.StandardListItem[]</code>Returns an
    * array containing the visible selected list items. If no items are selected, an empty array is
    * returned.</li><li><code>selectedContexts</code> of type <code>string</code>Returns the binding
    * contexts of the selected items including the non-visible items.Note: In contrast to the parameter
    * "selectedItems", this parameter includes the selected but NOT visible items (due to list filtering).
    * An empty array is set for this parameter if no Databinding is used.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireConfirm(mArguments: js.Any): TableSelectDialog = js.native
  
  /**
    * Fires event <code>liveChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>string</code>Specifies the value entered in the
    * search field.</li><li><code>itemsBinding</code> of type <code>any</code>The Items binding of the
    * Table Select Dialog.Only available if the items aggregation is bound to a model.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireLiveChange(mArguments: js.Any): TableSelectDialog = js.native
  
  /**
    * Fires event <code>search</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>string</code>Specifies the value entered in the
    * search field.</li><li><code>itemsBinding</code> of type <code>any</code>Determines the Items binding
    * of the Table Select Dialog. Only available if the items aggregation is bound to a model.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSearch(mArguments: js.Any): TableSelectDialog = js.native
  
  /**
    * Gets content of aggregation <code>columns</code>.The columns bindings.
    */
  def getColumns(): js.Array[Column] = js.native
  
  /**
    * Retrieves content height of the select dialog {@link sap.m.Dialog}
    * @returns sHeight the content height of the internal dialog
    */
  def getContentHeight(): js.Any = js.native
  
  /**
    * Retrieves content width of the select dialog {@link sap.m.Dialog}
    * @returns sWidth the content width of the internal dialog
    */
  def getContentWidth(): js.Any = js.native
  
  /**
    * Transfers method to the inner dialog: getDomRef
    * @returns The Element's DOM Element sub DOM Element or null
    */
  def getDomRef(): Element = js.native
  
  /**
    * Gets current value of property <code>growingThreshold</code>.Determines the number of items
    * initially displayed in the table.
    * @returns Value of property <code>growingThreshold</code>
    */
  def getGrowingThreshold(): Double = js.native
  
  /**
    * Gets content of aggregation <code>items</code>.The items of the table.
    */
  def getItems(): js.Array[ColumnListItem] = js.native
  
  /**
    * Gets current value of property <code>multiSelect</code>.Enables the user to select several options
    * from the table.Default value is <code>false</code>.
    * @returns Value of property <code>multiSelect</code>
    */
  def getMultiSelect(): Boolean = js.native
  
  /**
    * Retrieves the internal List's no data text property
    * @returns the current no data text
    */
  def getNoDataText(): String = js.native
  
  /**
    * Gets current value of property <code>rememberSelections</code>.Controls whether the dialog clears
    * the selection or not. When the dialog is opened multiple times in the same context to allow for
    * corrections of previous user inputs, set this flag to "true". When the dialog should reset the
    * selection to allow for a new selection each time set it to "false"Note: This property must be set
    * before the Dialog is opened to have an effect.Default value is <code>false</code>.
    * @since 1.18
    * @returns Value of property <code>rememberSelections</code>
    */
  def getRememberSelections(): Boolean = js.native
  
  /**
    * Gets current value of property <code>title</code>.Specifies the title text in the dialog header.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  
  /**
    * Transfers method to the inner dialog: hasStyleClass
    * @returns true if the class is set, false otherwise
    */
  def hasStyleClass(): Boolean = js.native
  
  /**
    * Checks for the provided <code>sap.m.Column</code> in the aggregation <code>columns</code>.and
    * returns its index if found or -1 otherwise.
    * @param oColumn The column whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfColumn(oColumn: Column): Double = js.native
  
  /**
    * Checks for the provided <code>sap.m.ColumnListItem</code> in the aggregation <code>items</code>.and
    * returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: ColumnListItem): Double = js.native
  
  /**
    * Inserts a column into the aggregation <code>columns</code>.
    * @param oColumn the column to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the column should be inserted at; for             a
    * negative value of <code>iIndex</code>, the column is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the column is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertColumn(oColumn: Column, iIndex: Double): TableSelectDialog = js.native
  
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: ColumnListItem, iIndex: Double): TableSelectDialog = js.native
  
  /**
    * Opens the internal dialog with a searchfield and a table.
    * @param sSearchValue Value for the search. The table will be automatically trigger the search event
    * if this parameter is set.
    * @returns <code>this</code> to allow method chaining
    */
  def open(sSearchValue: String): TableSelectDialog = js.native
  
  /**
    * Removes all the controls from the aggregation <code>columns</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllColumns(): js.Array[Column] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[ColumnListItem] = js.native
  
  def removeColumn(vColumn: String): Column = js.native
  /**
    * Removes a column from the aggregation <code>columns</code>.
    * @param vColumn The column to remove or its index or id
    * @returns The removed column or <code>null</code>
    */
  def removeColumn(vColumn: Double): Column = js.native
  def removeColumn(vColumn: Column): Column = js.native
  
  def removeItem(vItem: String): ColumnListItem = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): ColumnListItem = js.native
  def removeItem(vItem: ColumnListItem): ColumnListItem = js.native
  
  /**
    * Transfers method to the inner dialog: removeStyleClass
    * @returns this pointer for chaining
    */
  def removeStyleClass(): TableSelectDialog = js.native
  
  /**
    * Sets content height of the select dialog {@link sap.m.Dialog}
    * @param sHeight the new content height value for the dialog
    * @returns this pointer for chaining
    */
  def setContentHeight(sHeight: js.Any): TableSelectDialog = js.native
  
  /**
    * Sets content width of the select dialog {@link sap.m.Dialog}
    * @param sWidth the new content width value for the dialog
    * @returns this pointer for chaining
    */
  def setContentWidth(sWidth: js.Any): TableSelectDialog = js.native
  
  /**
    * Sets the growing threshold to the internal table
    * @param iValue Value for the table's growing threshold.
    * @returns this pointer for chaining
    */
  def setGrowingThreshold(iValue: Double): TableSelectDialog = js.native
  
  /**
    * Enables/Disables multi selection mode.
    * @param bMulti flag for multi selection mode
    * @returns this pointer for chaining
    */
  def setMultiSelect(bMulti: Boolean): TableSelectDialog = js.native
  
  /**
    * Sets the no data text of the internal table
    * @param sNoDataText the no data text for the table
    */
  def setNoDataText(sNoDataText: String): Unit = js.native
  
  /**
    * Sets a new value for property <code>rememberSelections</code>.Controls whether the dialog clears the
    * selection or not. When the dialog is opened multiple times in the same context to allow for
    * corrections of previous user inputs, set this flag to "true". When the dialog should reset the
    * selection to allow for a new selection each time set it to "false"Note: This property must be set
    * before the Dialog is opened to have an effect.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.18
    * @param bRememberSelections New value for property <code>rememberSelections</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRememberSelections(bRememberSelections: Boolean): TableSelectDialog = js.native
  
  /**
    * Sets the title of the internal dialog
    * @param sTitle the title text for the dialog
    * @returns this pointer for chaining
    */
  def setTitle(sTitle: String): TableSelectDialog = js.native
  
  /**
    * Transfers method to the inner dialog: toggleStyleClass
    * @returns this pointer for chaining
    */
  def toggleStyleClass(): TableSelectDialog = js.native
  
  /**
    * Unbinds aggregation <code>columns</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindColumns(): TableSelectDialog = js.native
  
  /**
    * Unbinds aggregation <code>items</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindItems(): TableSelectDialog = js.native
}
