package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewSettingsFilterItem extends ViewSettingsItem {
  
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: ViewSettingsItem): ViewSettingsFilterItem = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the
    * <code>filterDetailItemsAggregationChange</code> event of this
    * <code>sap.m.ViewSettingsFilterItem</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ViewSettingsFilterItem</code> itself.Let the outside world know that the filter
    * detail aggregation was changed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ViewSettingsFilterItem</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachFilterDetailItemsAggregationChange(oData: js.Any, fnFunction: js.Any): ViewSettingsFilterItem = js.native
  def attachFilterDetailItemsAggregationChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ViewSettingsFilterItem = js.native
  
  /**
    * Binds aggregation <code>items</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindItems(oBindingInfo: js.Any): ViewSettingsFilterItem = js.native
  
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): ViewSettingsFilterItem = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the
    * <code>filterDetailItemsAggregationChange</code> event of this
    * <code>sap.m.ViewSettingsFilterItem</code>.The passed function and listener object must match the
    * ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachFilterDetailItemsAggregationChange(fnFunction: js.Any, oListener: js.Any): ViewSettingsFilterItem = js.native
  
  /**
    * Fires event <code>filterDetailItemsAggregationChange</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireFilterDetailItemsAggregationChange(mArguments: js.Any): ViewSettingsFilterItem = js.native
  
  /**
    * Gets content of aggregation <code>items</code>.Items that are logically grouped under this filter
    * item. They are used to display filter details in the ViewSettingsDialog.
    */
  def getItems(): js.Array[ViewSettingsItem] = js.native
  
  /**
    * Gets current value of property <code>multiSelect</code>.If set to (true), multi selection will be
    * allowed for the items aggregation.Default value is <code>true</code>.
    * @returns Value of property <code>multiSelect</code>
    */
  def getMultiSelect(): Boolean = js.native
  
  /**
    * Checks for the provided <code>sap.m.ViewSettingsItem</code> in the aggregation
    * <code>items</code>.and returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: ViewSettingsItem): Double = js.native
  
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: ViewSettingsItem, iIndex: Double): ViewSettingsFilterItem = js.native
  
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[ViewSettingsItem] = js.native
  
  def removeItem(vItem: String): ViewSettingsItem = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): ViewSettingsItem = js.native
  def removeItem(vItem: ViewSettingsItem): ViewSettingsItem = js.native
  
  /**
    * Sets a new value for property <code>multiSelect</code>.If set to (true), multi selection will be
    * allowed for the items aggregation.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bMultiSelect New value for property <code>multiSelect</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMultiSelect(bMultiSelect: Boolean): ViewSettingsFilterItem = js.native
  
  /**
    * Unbinds aggregation <code>items</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindItems(): ViewSettingsFilterItem = js.native
}
