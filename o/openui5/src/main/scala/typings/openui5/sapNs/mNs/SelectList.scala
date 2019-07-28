package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.SelectList")
@js.native
class SelectList protected () extends Control {
  /**
    * Constructor for a new <code>sap.m.SelectList</code>.Accepts an object literal <code>mSettings</code>
    * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId ID for the new control, generated automatically if no ID is given.
    * @param mSettings Initial settings for the new control.
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): SelectList = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): SelectList = js.native
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: Item): SelectList = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>itemPress</code> event of this
    * <code>sap.m.SelectList</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.SelectList</code> itself.This event is fired when an item is pressed.
    * @since 1.32.4
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SelectList</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachItemPress(oData: js.Any, fnFunction: js.Any): SelectList = js.native
  def attachItemPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SelectList = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>selectionChange</code> event of this
    * <code>sap.m.SelectList</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.SelectList</code> itself.This event is fired when the selection has changed.<b>Note:
    * </b> The selection can be changed by pressing an non-selected item orvia keyboard and after the
    * enter or space key is pressed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SelectList</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any): SelectList = js.native
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SelectList = js.native
  /**
    * Binds aggregation <code>items</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindItems(oBindingInfo: js.Any): SelectList = js.native
  /**
    * Clear the selection.
    */
  def clearSelection(): Unit = js.native
  /**
    * Destroys all the items in the aggregation named <code>items</code>.
    * @returns <code>this</code> to allow method chaining.
    */
  def destroyItems(): SelectList = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>itemPress</code> event of this
    * <code>sap.m.SelectList</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.32.4
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachItemPress(fnFunction: js.Any, oListener: js.Any): SelectList = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>selectionChange</code> event of this
    * <code>sap.m.SelectList</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelectionChange(fnFunction: js.Any, oListener: js.Any): SelectList = js.native
  /**
    * Fires event <code>itemPress</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>item</code> of type <code>sap.ui.core.Item</code>The pressed
    * item.</li></ul>
    * @since 1.32.4
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireItemPress(mArguments: js.Any): SelectList = js.native
  /**
    * Fires event <code>selectionChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selectedItem</code> of type <code>sap.ui.core.Item</code>The selected
    * item.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelectionChange(mArguments: js.Any): SelectList = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.27.0
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Retrieves the default selected item from the aggregation named <code>items</code>.
    * @param aItems undefined
    */
  def getDefaultSelectedItem(aItems: js.Array[Item]): Item | js.Any = js.native
  /**
    * Gets current value of property <code>enabled</code>.Indicates whether the user can change the
    * selection.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  /**
    * Gets the enabled items from the aggregation named <code>items</code>.
    * @param aItems items to filter
    * @returns An array containing the enabled items.
    */
  def getEnabledItems(aItems: js.Array[Item]): js.Array[Item] = js.native
  /**
    * Gets the first item from the aggregation named <code>items</code>.
    * @returns The first item, or null if there are no items.
    */
  def getFirstItem(): Item | js.Any = js.native
  /**
    * Gets the item from the aggregation named <code>items</code> at the given 0-based index.
    * @param iIndex Index of the item to return.
    * @returns Item at the given index, or null if none.
    */
  def getItemAt(iIndex: Double): Item | js.Any = js.native
  /**
    * Gets the item with the given key from the aggregation named <code>items</code>.<b>Note: </b> If
    * duplicate keys exists, the first item matching the key is returned.
    * @param sKey An item key that specifies the item to retrieve.
    */
  def getItemByKey(sKey: String): Item | js.Any = js.native
  /**
    * Gets content of aggregation <code>items</code>.Defines the items contained within this control.
    */
  def getItems(): js.Array[Item] = js.native
  /**
    * Gets current value of property <code>keyboardNavigationMode</code>.Defines the keyboard navigation
    * mode.<b>Note:</b> The <code>sap.m.SelectListKeyboardNavigationMode.None</code> enumeration value, is
    * onlyintended for use in some composite controls that handles keyboard navigation by
    * themselves.Default value is <code>Delimited</code>.
    * @since 1.38
    * @returns Value of property <code>keyboardNavigationMode</code>
    */
  def getKeyboardNavigationMode(): SelectListKeyboardNavigationMode = js.native
  /**
    * Gets the enabled items from the aggregation named <code>items</code>.
    * @returns The last item, or null if there are no items.
    */
  def getLastItem(): Item | js.Any = js.native
  /**
    * Gets current value of property <code>maxWidth</code>.Sets the maximum width of the control.Default
    * value is <code>100%</code>.
    * @returns Value of property <code>maxWidth</code>
    */
  def getMaxWidth(): js.Any = js.native
  /**
    * Gets the selected item object from the aggregation named <code>items</code>.
    * @returns The current target of the <code>selectedItem</code> association, or null.
    */
  def getSelectedItem(): Item | js.Any = js.native
  /**
    * Gets current value of property <code>selectedItemId</code>.ID of the selected item.Default value is
    * <code></code>.
    * @returns Value of property <code>selectedItemId</code>
    */
  def getSelectedItemId(): String = js.native
  /**
    * Gets current value of property <code>selectedKey</code>.Key of the selected item.<b>Note: </b> If
    * duplicate keys exist, the first item matching the key is used.Default value is <code></code>.
    * @returns Value of property <code>selectedKey</code>
    */
  def getSelectedKey(): String = js.native
  /**
    * Gets current value of property <code>showSecondaryValues</code>.Indicates whether the text values of
    * the <code>additionalText</code> property of a {@link sap.ui.core.ListItem} are shown.Default value
    * is <code>false</code>.
    * @since 1.32.3
    * @returns Value of property <code>showSecondaryValues</code>
    */
  def getShowSecondaryValues(): Boolean = js.native
  /**
    * Gets current value of property <code>width</code>.Sets the width of the control.Default value is
    * <code>auto</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Item</code> in the aggregation <code>items</code>.and
    * returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: Item): Double = js.native
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: Item, iIndex: Double): SelectList = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all the items in the aggregation named <code>items</code>.Additionally unregisters them from
    * the hosting UIArea.
    * @returns An array of the removed items (might be empty).
    */
  def removeAllItems(): js.Array[Item] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  def removeItem(vItem: String): Item = js.native
  /**
    * Removes an item from the aggregation named <code>items</code>.
    * @param vItem The item to remove or its index or id.
    * @returns The removed item or null.
    */
  def removeItem(vItem: Double): Item = js.native
  def removeItem(vItem: Item): Item = js.native
  /**
    * Sets a new value for property <code>enabled</code>.Indicates whether the user can change the
    * selection.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): SelectList = js.native
  /**
    * Sets a new value for property <code>keyboardNavigationMode</code>.Defines the keyboard navigation
    * mode.<b>Note:</b> The <code>sap.m.SelectListKeyboardNavigationMode.None</code> enumeration value, is
    * onlyintended for use in some composite controls that handles keyboard navigation by themselves.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>Delimited</code>.
    * @since 1.38
    * @param sKeyboardNavigationMode New value for property <code>keyboardNavigationMode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setKeyboardNavigationMode(sKeyboardNavigationMode: SelectListKeyboardNavigationMode): SelectList = js.native
  /**
    * Sets a new value for property <code>maxWidth</code>.Sets the maximum width of the control.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>100%</code>.
    * @param sMaxWidth New value for property <code>maxWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxWidth(sMaxWidth: js.Any): SelectList = js.native
  /**
    * Sets the <code>selectedItem</code> association.
    * @param vItem New value for the <code>selectedItem</code> association.If an ID of a
    * <code>sap.ui.core.Item</code> is given, the item with this ID becomes the <code>selectedItem</code>
    * association.Alternatively, a <code>sap.ui.core.Item</code> instance may be given or
    * <code>null</code> to clear the selection.
    * @returns <code>this</code> to allow method chaining.
    */
  def setSelectedItem(vItem: String): SelectList = js.native
  def setSelectedItem(vItem: js.Any): SelectList = js.native
  def setSelectedItem(vItem: Item): SelectList = js.native
  /**
    * Sets property <code>selectedItemId</code>.Default value is an empty string <code>""</code> or
    * <code>undefined</code>.
    * @param vItem New value for property <code>selectedItemId</code>.
    * @returns <code>this</code> to allow method chaining.
    */
  def setSelectedItemId(vItem: String): SelectList = js.native
  def setSelectedItemId(vItem: js.Any): SelectList = js.native
  /**
    * Sets property <code>selectedKey</code>.Default value is an empty string <code>""</code> or
    * <code>undefined</code>.
    * @param sKey New value for property <code>selectedKey</code>.
    * @returns <code>this</code> to allow method chaining.
    */
  def setSelectedKey(sKey: String): SelectList = js.native
  /**
    * Updates and synchronizes <code>selectedItem</code> association, <code>selectedItemId</code> and
    * <code>selectedKey</code> properties.
    * @param vItem undefined
    */
  def setSelection(vItem: String): Unit = js.native
  def setSelection(vItem: js.Any): Unit = js.native
  def setSelection(vItem: Item): Unit = js.native
  /**
    * Sets a new value for property <code>showSecondaryValues</code>.Indicates whether the text values of
    * the <code>additionalText</code> property of a {@link sap.ui.core.ListItem} are shown.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>false</code>.
    * @since 1.32.3
    * @param bShowSecondaryValues New value for property <code>showSecondaryValues</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSecondaryValues(bShowSecondaryValues: Boolean): SelectList = js.native
  /**
    * Sets a new value for property <code>width</code>.Sets the width of the control.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>auto</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): SelectList = js.native
  /**
    * Unbinds aggregation <code>items</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindItems(): SelectList = js.native
}

