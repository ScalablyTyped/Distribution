package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem extends Item {
  
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: MenuItem): MenuItem = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>aggregationChanged</code> event of this
    * <code>sap.m.MenuItem</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.MenuItem</code> itself.Fired when aggregation of the item changes.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.MenuItem</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAggregationChanged(oData: js.Any, fnFunction: js.Any): MenuItem = js.native
  def attachAggregationChanged(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MenuItem = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.MenuItem</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.MenuItem</code> itself.Fired after the item has been pressed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.MenuItem</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): MenuItem = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MenuItem = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>propertyChanged</code> event of this
    * <code>sap.m.MenuItem</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.MenuItem</code> itself.Fired when a property of the item changes.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.MenuItem</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPropertyChanged(oData: js.Any, fnFunction: js.Any): MenuItem = js.native
  def attachPropertyChanged(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MenuItem = js.native
  
  /**
    * Binds aggregation <code>items</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindItems(oBindingInfo: js.Any): MenuItem = js.native
  
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): MenuItem = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>aggregationChanged</code> event of
    * this <code>sap.m.MenuItem</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAggregationChanged(fnFunction: js.Any, oListener: js.Any): MenuItem = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.MenuItem</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): MenuItem = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>propertyChanged</code> event of this
    * <code>sap.m.MenuItem</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPropertyChanged(fnFunction: js.Any, oListener: js.Any): MenuItem = js.native
  
  /**
    * Fires event <code>aggregationChanged</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>aggregationName</code> of type <code>String</code>The aggregation name of
    * the changed aggregation.</li><li><code>methodName</code> of type <code>String</code>Which method
    * changed the aggregation.</li><li><code>methodParams</code> of type <code>Object</code>What
    * parameters were used to change the aggregation.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAggregationChanged(mArguments: js.Any): MenuItem = js.native
  
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): MenuItem = js.native
  
  /**
    * Fires event <code>propertyChanged</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>propertyKey</code> of type <code>string</code>The property name to be
    * changed.</li><li><code>propertyValue</code> of type <code>mixed</code>The new property
    * value.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePropertyChanged(mArguments: js.Any): MenuItem = js.native
  
  /**
    * Gets current value of property <code>icon</code>.Defines the icon, which belongs to the item.This
    * can be an URI to an image or an icon font URI.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): String = js.native
  
  /**
    * Gets content of aggregation <code>items</code>.Defines the sub-items contained within this element.
    */
  def getItems(): js.Array[MenuItem] = js.native
  
  /**
    * Gets current value of property <code>startsSection</code>.Defines whether a visual separator should
    * be rendered before the item.<b>Note:</b> If an item is invisible its separator is also not
    * displayed.Default value is <code>false</code>.
    * @returns Value of property <code>startsSection</code>
    */
  def getStartsSection(): Boolean = js.native
  
  /**
    * Gets current value of property <code>visible</code>.Defines whether the item should be visible on
    * the screen. If set to <code>false</code>,a placeholder is rendered instead of the real item.Default
    * value is <code>true</code>.
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Checks for the provided <code>sap.m.MenuItem</code> in the aggregation <code>items</code>.and
    * returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: MenuItem): Double = js.native
  
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: MenuItem, iIndex: Double): MenuItem = js.native
  
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[MenuItem] = js.native
  
  def removeItem(vItem: String): MenuItem = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): MenuItem = js.native
  def removeItem(vItem: MenuItem): MenuItem = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.Defines the icon, which belongs to the item.This can
    * be an URI to an image or an icon font URI.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: String): MenuItem = js.native
  
  /**
    * Sets a new value for property <code>startsSection</code>.Defines whether a visual separator should
    * be rendered before the item.<b>Note:</b> If an item is invisible its separator is also not
    * displayed.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @param bStartsSection New value for property <code>startsSection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStartsSection(bStartsSection: Boolean): MenuItem = js.native
  
  /**
    * Sets a new value for property <code>visible</code>.Defines whether the item should be visible on the
    * screen. If set to <code>false</code>,a placeholder is rendered instead of the real item.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>true</code>.
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: Boolean): MenuItem = js.native
  
  /**
    * Unbinds aggregation <code>items</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindItems(): MenuItem = js.native
}
