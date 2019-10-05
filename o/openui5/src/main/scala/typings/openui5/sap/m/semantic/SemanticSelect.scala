package typings.openui5.sap.m.semantic

import typings.openui5.sap.ui.core.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.semantic.SemanticSelect")
@js.native
abstract class SemanticSelect protected () extends SemanticControl {
  /**
    * Constructor for a new SemanticSelect.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: Item): SemanticSelect = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>change</code> event of this
    * <code>sap.m.semantic.SemanticSelect</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.semantic.SemanticSelect</code> itself.See {@link sap.m.Select#change}
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.semantic.SemanticSelect</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachChange(oData: js.Any, fnFunction: js.Any): SemanticSelect = js.native
  def attachChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SemanticSelect = js.native
  /**
    * Binds aggregation <code>items</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindItems(oBindingInfo: js.Any): SemanticSelect = js.native
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): SemanticSelect = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>change</code> event of this
    * <code>sap.m.semantic.SemanticSelect</code>.The passed function and listener object must match the
    * ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachChange(fnFunction: js.Any, oListener: js.Any): SemanticSelect = js.native
  /**
    * Fires event <code>change</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selectedItem</code> of type <code>sap.ui.core.Item</code>The selected
    * item.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireChange(mArguments: js.Any): SemanticSelect = js.native
  /**
    * Gets current value of property <code>enabled</code>.See {@link sap.m.Select#enabled}Default value is
    * <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  /**
    * Gets content of aggregation <code>items</code>.See {@link sap.m.Select#items}
    */
  def getItems(): js.Array[Item] = js.native
  /**
    * ID of the element which is the current target of the association <code>selectedItem</code>, or
    * <code>null</code>.
    */
  def getSelectedItem(): js.Any = js.native
  /**
    * Gets current value of property <code>selectedKey</code>.See {@link sap.m.Select#selectedKey}Default
    * value is <code></code>.
    * @returns Value of property <code>selectedKey</code>
    */
  def getSelectedKey(): String = js.native
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
  def insertItem(oItem: Item, iIndex: Double): SemanticSelect = js.native
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[Item] = js.native
  def removeItem(vItem: String): Item = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): Item = js.native
  def removeItem(vItem: Item): Item = js.native
  /**
    * Sets a new value for property <code>enabled</code>.See {@link sap.m.Select#enabled}When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): SemanticSelect = js.native
  /**
    * Sets the associated <code>selectedItem</code>.
    * @param oSelectedItem ID of an element which becomes the new target of this selectedItem association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSelectedItem(oSelectedItem: js.Any): SemanticSelect = js.native
  def setSelectedItem(oSelectedItem: Item): SemanticSelect = js.native
  /**
    * Sets a new value for property <code>selectedKey</code>.See {@link sap.m.Select#selectedKey}When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code></code>.
    * @param sSelectedKey New value for property <code>selectedKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSelectedKey(sSelectedKey: String): SemanticSelect = js.native
  /**
    * Unbinds aggregation <code>items</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindItems(): SemanticSelect = js.native
}

