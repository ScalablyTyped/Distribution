package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabContainer extends Control {
  
  def _toTabStripItem(vItem: String): js.Any = js.native
  /**
    * Finds the <code>sap.m.TabStripItem</code> corresponding to a given
    * <code>sap.m.TabContainerItem</code>.
    * @param vItem object or ID of the <code>TabContainerItem</code>
    * @returns <code>TabStripItem</code> corresponding to a given <code>sap.m.TabContainerItem</code> (if
    * any)
    */
  def _toTabStripItem(vItem: TabContainerItem): js.Any = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>addNewButtonPress</code> event of this
    * <code>sap.m.TabContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TabContainer</code> itself.Fired when <code>Add New Tab</code> button is
    * pressed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TabContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAddNewButtonPress(oData: js.Any, fnFunction: js.Any): TabContainer = js.native
  def attachAddNewButtonPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TabContainer = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>itemClose</code> event of this
    * <code>sap.m.TabContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TabContainer</code> itself.Fired when an item is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TabContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachItemClose(oData: js.Any, fnFunction: js.Any): TabContainer = js.native
  def attachItemClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TabContainer = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>itemSelect</code> event of this
    * <code>sap.m.TabContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TabContainer</code> itself.Fired when an item is pressed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TabContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachItemSelect(oData: js.Any, fnFunction: js.Any): TabContainer = js.native
  def attachItemSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TabContainer = js.native
  
  /**
    * Binds aggregation <code>items</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindItems(oBindingInfo: js.Any): TabContainer = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>addNewButtonPress</code> event of this
    * <code>sap.m.TabContainer</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAddNewButtonPress(fnFunction: js.Any, oListener: js.Any): TabContainer = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>itemClose</code> event of this
    * <code>sap.m.TabContainer</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachItemClose(fnFunction: js.Any, oListener: js.Any): TabContainer = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>itemSelect</code> event of this
    * <code>sap.m.TabContainer</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachItemSelect(fnFunction: js.Any, oListener: js.Any): TabContainer = js.native
  
  /**
    * Fires event <code>addNewButtonPress</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAddNewButtonPress(mArguments: js.Any): TabContainer = js.native
  
  /**
    * Fires event <code>itemClose</code> to attached listeners.Listeners may prevent the default action of
    * this event by using the <code>preventDefault</code>-method on the event object.Expects the following
    * event parameters:<ul><li><code>item</code> of type <code>sap.m.TabContainerItem</code>The item to be
    * closed.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Whether or not to prevent the default action
    */
  def fireItemClose(mArguments: js.Any): Boolean = js.native
  
  /**
    * Fires event <code>itemSelect</code> to attached listeners.Listeners may prevent the default action
    * of this event by using the <code>preventDefault</code>-method on the event object.Expects the
    * following event parameters:<ul><li><code>item</code> of type <code>sap.m.TabContainerItem</code>The
    * selected item.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Whether or not to prevent the default action
    */
  def fireItemSelect(mArguments: js.Any): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>items</code>.The items displayed in the <code>TabContainer</code>.
    */
  def getItems(): js.Array[TabContainerItem] = js.native
  
  /**
    * ID of the element which is the current target of the association <code>selectedItem</code>, or
    * <code>null</code>.
    */
  def getSelectedItem(): js.Any = js.native
  
  /**
    * Gets current value of property <code>showAddNewButton</code>.Defines whether an <code>Add New
    * Tab</code> button is displayed in the TabStrip.Default value is <code>false</code>.
    * @returns Value of property <code>showAddNewButton</code>
    */
  def getShowAddNewButton(): Boolean = js.native
  
  /**
    * Checks for the provided <code>sap.m.TabContainerItem</code> in the aggregation
    * <code>items</code>.and returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: TabContainerItem): Double = js.native
  
  def removeItem(vItem: String): TabContainerItem = js.native
  /**
    * Removes an item from the aggregation named <code>items</code>.
    * @param vItem The item to remove or its index or ID
    * @returns The removed item or null
    */
  def removeItem(vItem: Double): TabContainerItem = js.native
  def removeItem(vItem: TabContainerItem): TabContainerItem = js.native
  
  /**
    * Unbinds aggregation <code>items</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindItems(): TabContainer = js.native
}
