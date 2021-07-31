package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComboBox
  extends StObject
     with ComboBoxBase {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>selectionChange</code> event of this
    * <code>sap.m.ComboBox</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ComboBox</code> itself.This event is fired when the user types something that matches
    * with an item in the list;it is also fired when the user presses on a list item, or when navigating
    * via keyboard.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ComboBox</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any): ComboBox = js.native
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ComboBox = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>selectionChange</code> event of this
    * <code>sap.m.ComboBox</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelectionChange(fnFunction: js.Any, oListener: js.Any): ComboBox = js.native
  
  /**
    * Fires event <code>selectionChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selectedItem</code> of type <code>sap.ui.core.Item</code>The selected
    * item.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelectionChange(mArguments: js.Any): ComboBox = js.native
  
  /**
    * Gets the default selected item from the aggregation named <code>items</code>.
    */
  def getDefaultSelectedItem(): Unit = js.native
  
  /**
    * Gets the selected item object from the aggregation named <code>items</code>.
    * @returns The current target of the <code>selectedItem</code> association,or <code>null</code>.
    */
  def getSelectedItem(): Item | js.Any = js.native
  
  /**
    * Gets current value of property <code>selectedItemId</code>.ID of the selected item.Default value is
    * <code></code>.
    * @returns Value of property <code>selectedItemId</code>
    */
  def getSelectedItemId(): String = js.native
  
  /**
    * Gets current value of property <code>selectedKey</code>.Key of the selected item.<b>Note:</b> If
    * duplicate keys exist, the first item matching the key is used.Default value is <code></code>.
    * @returns Value of property <code>selectedKey</code>
    */
  def getSelectedKey(): String = js.native
  
  /**
    * Gets current value of property <code>showSecondaryValues</code>.Indicates whether the text values of
    * the <code>additionalText</code> property of a{@link sap.ui.core.ListItem} are shown.Default value is
    * <code>false</code>.
    * @since 1.32.3
    * @returns Value of property <code>showSecondaryValues</code>
    */
  def getShowSecondaryValues(): Boolean = js.native
  
  /**
    * This event handler is called before the picker popup is opened.
    */
  def onBeforeOpen(): Unit = js.native
  
  /**
    * Sets the <code>selectedItem</code> association.Default value is <code>null</code>.
    * @param vItem New value for the <code>selectedItem</code> association.If an ID of a
    * <code>sap.ui.core.Item</code> is given, the item with this ID becomes the<code>selectedItem</code>
    * association.Alternatively, a <code>sap.ui.core.Item</code> instance may be given or
    * <code>null</code> to clearthe selection.
    * @returns <code>this</code> to allow method chaining.
    */
  def setSelectedItem(vItem: String): ComboBox = js.native
  def setSelectedItem(vItem: js.Any): ComboBox = js.native
  def setSelectedItem(vItem: Item): ComboBox = js.native
  
  /**
    * Sets the <code>selectedItemId</code> property.Default value is an empty string <code>""</code> or
    * <code>undefined</code>.
    * @param vItem New value for property <code>selectedItemId</code>.If the provided <code>vItem</code>
    * is an empty string <code>""</code> or <code>undefined</code>,the selection is cleared.If the ID has
    * no corresponding aggregated item, the selected item is not changed.
    * @returns <code>this</code> to allow method chaining.
    */
  def setSelectedItemId(vItem: String): ComboBox = js.native
  def setSelectedItemId(vItem: js.Any): ComboBox = js.native
  
  /**
    * Sets the <code>selectedKey</code> property.Default value is an empty string <code>""</code> or
    * <code>undefined</code>.
    * @param sKey New value for property <code>selectedKey</code>.If the provided <code>sKey</code> is an
    * empty string <code>""</code> or <code>undefined</code>,the selection is cleared.If duplicate keys
    * exist, the first item matching the key is selected.
    * @returns <code>this</code> to allow method chaining.
    */
  def setSelectedKey(sKey: String): ComboBox = js.native
  
  /**
    * Sets a new value for property <code>showSecondaryValues</code>.Indicates whether the text values of
    * the <code>additionalText</code> property of a{@link sap.ui.core.ListItem} are shown.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @since 1.32.3
    * @param bShowSecondaryValues New value for property <code>showSecondaryValues</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSecondaryValues(bShowSecondaryValues: Boolean): ComboBox = js.native
  
  /**
    * Synchronizes the <code>selectedItem</code> association and the <code>selectedItemId</code> property.
    */
  def synchronizeSelection(): Unit = js.native
}
