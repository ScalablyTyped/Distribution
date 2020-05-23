package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconTabHeader extends Control {
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: IconTab): IconTabHeader = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.m.IconTabHeader</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.IconTabHeader</code> itself.Fires when an item is selected.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.IconTabHeader</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): IconTabHeader = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): IconTabHeader = js.native
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): IconTabHeader = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.m.IconTabHeader</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): IconTabHeader = js.native
  /**
    * Fires event <code>select</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>item</code> of type <code>sap.m.IconTabFilter</code>The selected
    * item</li><li><code>key</code> of type <code>string</code>The key of the selected item</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): IconTabHeader = js.native
  /**
    * Gets content of aggregation <code>items</code>.The items displayed in the IconTabHeader.
    */
  def getItems(): js.Array[IconTab] = js.native
  /**
    * Gets current value of property <code>mode</code>.Specifies the header mode.<b>Note:</b> The Inline
    * mode works only if no icons are set.Default value is <code>Standard</code>.
    * @since 1.40
    * @returns Value of property <code>mode</code>
    */
  def getMode(): IconTabHeaderMode = js.native
  /**
    * Gets current value of property <code>selectedKey</code>.Key of the selected item.If the key has no
    * corresponding aggregated item, no changes will apply.If duplicate keys exists the first item
    * matching, the key is used.
    * @since 1.15.0
    * @returns Value of property <code>selectedKey</code>
    */
  def getSelectedKey(): String = js.native
  /**
    * Gets current value of property <code>showSelection</code>.Defines whether the current selection is
    * visualized.Default value is <code>true</code>.
    * @returns Value of property <code>showSelection</code>
    */
  def getShowSelection(): Boolean = js.native
  /**
    * Checks for the provided <code>sap.m.IconTab</code> in the aggregation <code>items</code>.and returns
    * its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: IconTab): Double = js.native
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: IconTab, iIndex: Double): IconTabHeader = js.native
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[IconTab] = js.native
  def removeItem(vItem: String): IconTab = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): IconTab = js.native
  def removeItem(vItem: IconTab): IconTab = js.native
  /**
    * Sets a new value for property <code>mode</code>.Specifies the header mode.<b>Note:</b> The Inline
    * mode works only if no icons are set.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Standard</code>.
    * @since 1.40
    * @param sMode New value for property <code>mode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMode(sMode: IconTabHeaderMode): IconTabHeader = js.native
  /**
    * Sets the selected item based on key.
    * @param sKey The key of the item to be selected
    * @returns this pointer for chaining
    */
  def setSelectedKey(sKey: String): IconTabHeader = js.native
  /**
    * Sets a new value for property <code>showSelection</code>.Defines whether the current selection is
    * visualized.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bShowSelection New value for property <code>showSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSelection(bShowSelection: Boolean): IconTabHeader = js.native
}

