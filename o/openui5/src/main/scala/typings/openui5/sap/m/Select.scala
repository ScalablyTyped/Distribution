package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Item
import typings.openui5.sap.ui.core.TextAlign
import typings.openui5.sap.ui.core.TextDirection
import typings.openui5.sap.ui.core.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select
  extends StObject
     with Control {
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Select = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Select = js.native
  
  /**
    * Adds an item to the aggregation named <code>items</code>.
    * @param oItem The item to be added; if empty, nothing is added.
    * @returns <code>this</code> to allow method chaining.
    */
  def addItem(oItem: Item): Select = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>change</code> event of this
    * <code>sap.m.Select</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Select</code> itself.This event is fired when the value in the selection field is
    * changed in combination with one ofthe following actions:<ul>    <li>The focus leaves the selection
    * field</li>    <li>The <i>Enter</i> key is pressed</li>    <li>The item is pressed</li></ul>
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Select</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachChange(oData: js.Any, fnFunction: js.Any): Select = js.native
  def attachChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Select = js.native
  
  /**
    * Binds aggregation <code>items</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindItems(oBindingInfo: js.Any): Select = js.native
  
  /**
    * Closes the control's picker popup.
    * @since 1.16
    * @returns <code>this</code> to allow method chaining.
    */
  def close(): Select = js.native
  
  /**
    * Creates a picker popup container where the selection should take place.
    * @param sPickerType undefined
    */
  def createPicker(sPickerType: String): Popover | Dialog = js.native
  
  /**
    * Destroys all the items in the aggregation named <code>items</code>.
    * @returns <code>this</code> to allow method chaining.
    */
  def destroyItems(): Select = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>change</code> event of this
    * <code>sap.m.Select</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachChange(fnFunction: js.Any, oListener: js.Any): Select = js.native
  
  /**
    * Fires event <code>change</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selectedItem</code> of type <code>sap.ui.core.Item</code>The selected
    * item.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireChange(mArguments: js.Any): Select = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.27.0
    */
  def getAriaLabelledBy(): js.Array[js.Any] = js.native
  
  /**
    * Gets current value of property <code>autoAdjustWidth</code>.Indicates whether the width of the input
    * field is determined by the selected item's content.Default value is <code>false</code>.
    * @since 1.16
    * @returns Value of property <code>autoAdjustWidth</code>
    */
  def getAutoAdjustWidth(): Boolean = js.native
  
  /**
    * Gets current value of property <code>enabled</code>.Indicates whether the user can change the
    * selection.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  
  /**
    * Gets the enabled items from the aggregation named <code>items</code>.
    * @since 1.22.0
    * @param aItems Items to filter.
    * @returns An array containing the enabled items.
    */
  def getEnabledItems(aItems: js.Array[Item]): js.Array[Item] = js.native
  
  /**
    * Gets the first item from the aggregation named <code>items</code>.
    * @since 1.16
    * @returns The first item, or null if there are no items.
    */
  def getFirstItem(): Item | js.Any = js.native
  
  /**
    * Gets current value of property <code>forceSelection</code>.Indicates whether the selection is
    * restricted to one of the items in the list.<b>Note:</b> We strongly recommend that you always set
    * this property to <code>false</code> and bindthe <code>selectedKey</code> property to the desired
    * value for better interoperability with data binding.Default value is <code>true</code>.
    * @since 1.34
    * @returns Value of property <code>forceSelection</code>
    */
  def getForceSelection(): Boolean = js.native
  
  /**
    * Gets current value of property <code>icon</code>.The URI to the icon that will be displayed only
    * when using the <code>IconOnly</code> type.Default value is <code></code>.
    * @since 1.16
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  
  /**
    * Gets the item from the aggregation named <code>items</code> at the given 0-based index.
    * @since 1.16
    * @param iIndex Index of the item to return.
    * @returns Item at the given index, or null if none.
    */
  def getItemAt(iIndex: Double): Item | js.Any = js.native
  
  /**
    * Gets the item with the given key from the aggregation named <code>items</code>.<b>Note: </b> If
    * duplicate keys exist, the first item matching the key is returned.
    * @since 1.16
    * @param sKey An item key that specifies the item to be retrieved.
    */
  def getItemByKey(sKey: String): Item | js.Any = js.native
  
  /**
    * Gets aggregation <code>items</code>.<b>Note</b>: This is the default aggregation.
    */
  def getItems(): js.Array[Item] = js.native
  
  /**
    * Gets the last item from the aggregation named <code>items</code>.
    * @since 1.16
    * @returns The last item, or null if there are no items.
    */
  def getLastItem(): Item | js.Any = js.native
  
  /**
    * Gets current value of property <code>maxWidth</code>.Sets the maximum width of the
    * control.<b>Note:</b> This property is ignored if the <code>autoAdjustWidth</code> property is set to
    * <code>true</code>.Default value is <code>100%</code>.
    * @returns Value of property <code>maxWidth</code>
    */
  def getMaxWidth(): js.Any = js.native
  
  /**
    * Gets current value of property <code>name</code>.The name to be used in the HTML code (for example,
    * for HTML forms that send data to the server via submit).Default value is <code></code>.
    * @returns Value of property <code>name</code>
    */
  def getName(): String = js.native
  
  /**
    * Gets the selected item object from the aggregation named <code>items</code>.
    * @returns The current target of the <code>selectedItem</code> association, or null.
    */
  def getSelectedItem(): Item | js.Any = js.native
  
  /**
    * Gets current value of property <code>selectedItemId</code>.ID of the selected item.Default value is
    * <code></code>.
    * @since 1.12
    * @returns Value of property <code>selectedItemId</code>
    */
  def getSelectedItemId(): String = js.native
  
  /**
    * Gets current value of property <code>selectedKey</code>.Key of the selected item.<b>Note:</b> If
    * duplicate keys exist, the first item matching the key is used.Default value is <code></code>.
    * @since 1.11
    * @returns Value of property <code>selectedKey</code>
    */
  def getSelectedKey(): String = js.native
  
  /**
    * Gets current value of property <code>showSecondaryValues</code>.Indicates whether the text values of
    * the <code>additionalText</code> property of a{@link sap.ui.core.ListItem} are shown.Default value is
    * <code>false</code>.
    * @since 1.40
    * @returns Value of property <code>showSecondaryValues</code>
    */
  def getShowSecondaryValues(): Boolean = js.native
  
  /**
    * Gets current value of property <code>textAlign</code>.Sets the horizontal alignment of the text
    * within the input field.Default value is <code>Initial</code>.
    * @since 1.28
    * @returns Value of property <code>textAlign</code>
    */
  def getTextAlign(): TextAlign = js.native
  
  /**
    * Gets current value of property <code>textDirection</code>.Specifies the direction of the text within
    * the input field with enumerated options.By default, the control inherits text direction from the
    * DOM.Default value is <code>Inherit</code>.
    * @since 1.28
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): TextDirection = js.native
  
  /**
    * Gets current value of property <code>type</code>.Type of a select. Possible values
    * <code>Default</code>, <code>IconOnly</code>.Default value is <code>Default</code>.
    * @since 1.16
    * @returns Value of property <code>type</code>
    */
  def getType(): SelectType = js.native
  
  /**
    * Gets current value of property <code>valueState</code>.Visualizes the validation state of the
    * control, e.g. <code>Error</code>, <code>Warning</code>,<code>Success</code>.Default value is
    * <code>None</code>.
    * @since 1.40.2
    * @returns Value of property <code>valueState</code>
    */
  def getValueState(): ValueState = js.native
  
  /**
    * Gets current value of property <code>valueStateText</code>.Defines the text of the value state
    * message popup.If this is not specified, a default text is shown from the resource bundle.Default
    * value is <code></code>.
    * @since 1.40.5
    * @returns Value of property <code>valueStateText</code>
    */
  def getValueStateText(): String = js.native
  
  /**
    * Gets current value of property <code>width</code>.Sets the width of the control. The default width
    * is derived from the widest item.If the width defined is smaller than the widest item in the
    * selection list, only the width ofthe selection field will be changed: the list will keep the width
    * of its widest item.If the list is wider than the viewport, it is truncated and an ellipsis is
    * displayed for each item.For phones, the width of the list is always the same as the
    * viewport.<b>Note:</b> This property is ignored if the <code>autoAdjustWidth</code> property is set
    * to <code>true</code>.Default value is <code>auto</code>.
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
    * Inserts an item into the aggregation named <code>items</code>.
    * @param oItem The item to be inserted; if empty, nothing is inserted.
    * @param iIndex The <code>0</code>-based index the item should be inserted at; for            a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value           
    * greater than the current size of the aggregation, the item is inserted at the last position.
    * @returns <code>this</code> to allow method chaining.
    */
  def insertItem(oItem: Item, iIndex: Double): Select = js.native
  
  /**
    * Indicates whether the control's picker popup is opened.
    * @since 1.16
    * @returns Indicates whether the picker popup is currently open (this includes opening and closing
    * animations).
    */
  def isOpen(): Boolean = js.native
  
  /**
    * Open the control's picker popup.
    * @since 1.16
    * @returns <code>this</code> to allow method chaining.
    */
  def open(): Select = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[js.Any] = js.native
  
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
    * @param vItem The item to be removed or its index or ID.
    * @returns The removed item or null.
    */
  def removeItem(vItem: Double): Item = js.native
  def removeItem(vItem: Item): Item = js.native
  
  /**
    * Sets a new value for property <code>autoAdjustWidth</code>.Indicates whether the width of the input
    * field is determined by the selected item's content.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.16
    * @param bAutoAdjustWidth New value for property <code>autoAdjustWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAutoAdjustWidth(bAutoAdjustWidth: Boolean): Select = js.native
  
  /**
    * Sets a new value for property <code>enabled</code>.Indicates whether the user can change the
    * selection.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): Select = js.native
  
  /**
    * Sets a new value for property <code>forceSelection</code>.Indicates whether the selection is
    * restricted to one of the items in the list.<b>Note:</b> We strongly recommend that you always set
    * this property to <code>false</code> and bindthe <code>selectedKey</code> property to the desired
    * value for better interoperability with data binding.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @since 1.34
    * @param bForceSelection New value for property <code>forceSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setForceSelection(bForceSelection: Boolean): Select = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.The URI to the icon that will be displayed only when
    * using the <code>IconOnly</code> type.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @since 1.16
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): Select = js.native
  
  /**
    * Sets a new value for property <code>maxWidth</code>.Sets the maximum width of the
    * control.<b>Note:</b> This property is ignored if the <code>autoAdjustWidth</code> property is set to
    * <code>true</code>.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>100%</code>.
    * @param sMaxWidth New value for property <code>maxWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxWidth(sMaxWidth: js.Any): Select = js.native
  
  /**
    * Sets a new value for property <code>name</code>.The name to be used in the HTML code (for example,
    * for HTML forms that send data to the server via submit).When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: String): Select = js.native
  
  /**
    * Sets the <code>selectedItem</code> association.Default value is <code>null</code>.
    * @param vItem New value for the <code>selectedItem</code> association.If an ID of a
    * <code>sap.ui.core.Item</code> is given, the item with this ID becomes the <code>selectedItem</code>
    * association.Alternatively, a <code>sap.ui.core.Item</code> instance may be given or
    * <code>null</code>.If the value of <code>null</code> is provided, the first enabled item will be
    * selected (if any items exist).
    * @returns <code>this</code> to allow method chaining.
    */
  def setSelectedItem(vItem: String): Select = js.native
  def setSelectedItem(vItem: js.Any): Select = js.native
  def setSelectedItem(vItem: Item): Select = js.native
  
  /**
    * Sets the <code>selectedItemId</code> property.Default value is an empty string <code>""</code> or
    * <code>undefined</code>.
    * @since 1.12
    * @param vItem New value for property <code>selectedItemId</code>.If the provided <code>vItem</code>
    * has a default value, the first enabled item will be selected (if any items exist).
    * @returns <code>this</code> to allow method chaining.
    */
  def setSelectedItemId(vItem: String): Select = js.native
  def setSelectedItemId(vItem: js.Any): Select = js.native
  
  /**
    * Sets property <code>selectedKey</code>.Default value is an empty string <code>""</code> or
    * <code>undefined</code>.
    * @since 1.11
    * @param sKey New value for property <code>selectedKey</code>.If the <code>forceSelection</code>
    * property is set to <code>true</code> and the provided <code>sKey</code> isan empty string
    * <code>""</code> or <code>undefined</code>, the value of <code>sKey</code> is changed to matchthe
    * <code>key</code> of the first enabled item and the first enabled item is selected (if any items
    * exist).In the case that an item has the default key value, it is selected instead.If duplicate keys
    * exist, the first item matching the key is selected.
    * @returns <code>this</code> to allow method chaining.
    */
  def setSelectedKey(sKey: String): Select = js.native
  
  /**
    * Sets a new value for property <code>showSecondaryValues</code>.Indicates whether the text values of
    * the <code>additionalText</code> property of a{@link sap.ui.core.ListItem} are shown.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @since 1.40
    * @param bShowSecondaryValues New value for property <code>showSecondaryValues</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSecondaryValues(bShowSecondaryValues: Boolean): Select = js.native
  
  /**
    * Sets a new value for property <code>textAlign</code>.Sets the horizontal alignment of the text
    * within the input field.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>Initial</code>.
    * @since 1.28
    * @param sTextAlign New value for property <code>textAlign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextAlign(sTextAlign: TextAlign): Select = js.native
  
  /**
    * Sets a new value for property <code>textDirection</code>.Specifies the direction of the text within
    * the input field with enumerated options.By default, the control inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.28
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: TextDirection): Select = js.native
  
  /**
    * Sets a new value for property <code>type</code>.Type of a select. Possible values
    * <code>Default</code>, <code>IconOnly</code>.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Default</code>.
    * @since 1.16
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: SelectType): Select = js.native
  
  /**
    * Sets a new value for property <code>valueState</code>.Visualizes the validation state of the
    * control, e.g. <code>Error</code>, <code>Warning</code>,<code>Success</code>.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>None</code>.
    * @since 1.40.2
    * @param sValueState New value for property <code>valueState</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueState(sValueState: ValueState): Select = js.native
  
  /**
    * Sets a new value for property <code>valueStateText</code>.Defines the text of the value state
    * message popup.If this is not specified, a default text is shown from the resource bundle.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code></code>.
    * @since 1.40.5
    * @param sValueStateText New value for property <code>valueStateText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueStateText(sValueStateText: String): Select = js.native
  
  /**
    * Sets a new value for property <code>width</code>.Sets the width of the control. The default width is
    * derived from the widest item.If the width defined is smaller than the widest item in the selection
    * list, only the width ofthe selection field will be changed: the list will keep the width of its
    * widest item.If the list is wider than the viewport, it is truncated and an ellipsis is displayed for
    * each item.For phones, the width of the list is always the same as the viewport.<b>Note:</b> This
    * property is ignored if the <code>autoAdjustWidth</code> property is set to <code>true</code>.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>auto</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Select = js.native
  
  /**
    * Unbinds aggregation <code>items</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindItems(): Select = js.native
}
