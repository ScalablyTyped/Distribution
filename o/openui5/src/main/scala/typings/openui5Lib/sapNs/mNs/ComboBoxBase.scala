package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ComboBoxBase")
@js.native
class ComboBoxBase protected () extends ComboBoxTextField {
  /**
         * Constructor for a new <code>sap.m.ComboBoxBase</code>.Accepts an object literal
         * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
         * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
         * of the syntax of the settings object.
         * @param sId ID for the new control, generated automatically if no ID is given.
         * @param mSettings Initial settings for the new control.
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new <code>sap.m.ComboBoxBase</code>.Accepts an object literal
         * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
         * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
         * of the syntax of the settings object.
         * @param sId ID for the new control, generated automatically if no ID is given.
         * @param mSettings Initial settings for the new control.
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Adds an item to the aggregation named <code>items</code>.
         * @param oItem The item to be added; if empty, nothing is added.
         * @returns <code>this</code> to allow method chaining.
        */
  def addItem(oItem: openui5Lib.sapNs.uiNs.coreNs.Item): ComboBoxBase = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>loadItems</code> event of this
         * <code>sap.m.ComboBoxBase</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ComboBoxBase</code> itself.This event is fired when the end user moves the
         * cursor to the text field, performsan action that requires items to be loaded, and items are not
         * already loaded. For example,pressing F4 to open the dropdown list or typing something in the text
         * field fires the event.<b>Note:</b> We strongly recommend to only use this feature in performance
         * critical scenarios.Loading the items lazily (on demand) to defer initialization has several
         * implications for the end userexperience. For example, the busy indicator has to be shown while the
         * items are being loaded andassistive technology software also has to announce the state changes
         * (which may be confusingfor some screen reader users).<b>Note</b>: Currently the
         * <code>sap.m.MultiComboBox</code> does not support this event.
         * @since 1.38
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ComboBoxBase</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachLoadItems(oData: js.Any, fnFunction: js.Any): ComboBoxBase = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>loadItems</code> event of this
         * <code>sap.m.ComboBoxBase</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ComboBoxBase</code> itself.This event is fired when the end user moves the
         * cursor to the text field, performsan action that requires items to be loaded, and items are not
         * already loaded. For example,pressing F4 to open the dropdown list or typing something in the text
         * field fires the event.<b>Note:</b> We strongly recommend to only use this feature in performance
         * critical scenarios.Loading the items lazily (on demand) to defer initialization has several
         * implications for the end userexperience. For example, the busy indicator has to be shown while the
         * items are being loaded andassistive technology software also has to announce the state changes
         * (which may be confusingfor some screen reader users).<b>Note</b>: Currently the
         * <code>sap.m.MultiComboBox</code> does not support this event.
         * @since 1.38
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ComboBoxBase</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachLoadItems(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ComboBoxBase = js.native
  /**
         * Binds aggregation <code>items</code> to model data.See {@link
         * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
         * of the possible properties of <code>oBindingInfo</code>.
         * @param oBindingInfo The binding information
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def bindItems(oBindingInfo: js.Any): ComboBoxBase = js.native
  /**
         * Clears the selection.To be overwritten by subclasses.
        */
  def clearSelection(): scala.Unit = js.native
  /**
         * Closes the control's picker popup.
         * @returns <code>this</code> to allow method chaining.
        */
  def close(): ComboBoxBase = js.native
  /**
         * Creates a picker popup container where the selection should take place.To be overwritten by
         * subclasses.
         * @param sPickerType undefined
         * @returns The picker popup to be used.
        */
  def createPicker(sPickerType: java.lang.String): Popover | Dialog = js.native
  /**
         * Destroys all the items in the aggregation named <code>items</code>.
         * @returns <code>this</code> to allow method chaining.
        */
  def destroyItems(): ComboBoxBase = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>loadItems</code> event of this
         * <code>sap.m.ComboBoxBase</code>.The passed function and listener object must match the ones used for
         * event registration.
         * @since 1.38
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachLoadItems(fnFunction: js.Any, oListener: js.Any): ComboBoxBase = js.native
  /**
         * Fires event <code>loadItems</code> to attached listeners.
         * @since 1.38
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireLoadItems(mArguments: js.Any): ComboBoxBase = js.native
  /**
         * Gets the enabled items from the aggregation named <code>items</code>.
         * @param aItems Items to filter.
         * @returns An array containing the enabled items.
        */
  def getEnabledItems(aItems: js.Array[openui5Lib.sapNs.uiNs.coreNs.Item]): js.Array[openui5Lib.sapNs.uiNs.coreNs.Item] = js.native
  /**
         * Gets the first item from the aggregation named <code>items</code>.
         * @returns The first item, or null if there are no items.
        */
  def getFirstItem(): openui5Lib.sapNs.uiNs.coreNs.Item = js.native
  /**
         * Gets the item from the aggregation named <code>items</code> at the given 0-based index.
         * @param iIndex Index of the item to return.
         * @returns Item at the given index, or null if none.
        */
  def getItemAt(iIndex: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Item = js.native
  /**
         * Gets the item with the given key from the aggregation named <code>items</code>.<b>Note:</b> If
         * duplicate keys exist, the first item matching the key is returned.
         * @param sKey An item key that specifies the item to retrieve.
        */
  def getItemByKey(sKey: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Item = js.native
  /**
         * Gets content of aggregation <code>items</code>.Defines the items contained within this control.
        */
  def getItems(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Item] = js.native
  /**
         * Gets the last item from the aggregation named <code>items</code>.
         * @returns The last item, or null if there are no items.
        */
  def getLastItem(): openui5Lib.sapNs.uiNs.coreNs.Item = js.native
  /**
         * Gets the <code>list</code>.
         * @returns The list instance object or <code>null</code>.
        */
  def getList(): SelectList = js.native
  /**
         * Gets the control's picker popup.
         * @returns The picker instance, creating it if necessary by callingthe <code>createPicker()</code>
         * method.
        */
  def getPicker(): Dialog | Popover | js.Any = js.native
  /**
         * Gets the property <code>_sPickerType</code>
        */
  def getPickerType(): java.lang.String = js.native
  /**
         * Checks for the provided <code>sap.ui.core.Item</code> in the aggregation <code>items</code>.and
         * returns its index if found or -1 otherwise.
         * @param oItem The item whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfItem(oItem: openui5Lib.sapNs.uiNs.coreNs.Item): scala.Double = js.native
  /**
         * Inserts an item into the aggregation named <code>items</code>.
         * @param oItem The item to be inserted; if empty, nothing is inserted.
         * @param iIndex The <code>0</code>-based index the item should be inserted at; for            a
         * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value           
         * greater than the current size of the aggregation, the item is inserted at the last position.
         * @returns <code>this</code> to allow method chaining.
        */
  def insertItem(oItem: openui5Lib.sapNs.uiNs.coreNs.Item, iIndex: scala.Double): ComboBoxBase = js.native
  /**
         * Indicates whether the control's picker popup is open.
         * @returns Determines whether the control's picker popup is currently open (this includes opening and
         * closing animations).
        */
  def isOpen(): scala.Boolean = js.native
  /**
         * Opens the control's picker popup.
         * @returns <code>this</code> to allow method chaining.
        */
  def open(): ComboBoxBase = js.native
  /**
         * Removes all the controls in the aggregation named <code>items</code>.Additionally unregisters them
         * from the hosting UIArea and clears the selection.
         * @returns An array of the removed items (might be empty).
        */
  def removeAllItems(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Item] = js.native
  /**
         * Removes an item from the aggregation named <code>items</code>.
         * @param vItem The item to remove or its index or ID.
         * @returns The removed item or null.
        */
  def removeItem(vItem: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Item = js.native
  /**
         * Removes an item from the aggregation named <code>items</code>.
         * @param vItem The item to remove or its index or ID.
         * @returns The removed item or null.
        */
  def removeItem(vItem: openui5Lib.sapNs.uiNs.coreNs.Item): openui5Lib.sapNs.uiNs.coreNs.Item = js.native
  /**
         * Removes an item from the aggregation named <code>items</code>.
         * @param vItem The item to remove or its index or ID.
         * @returns The removed item or null.
        */
  def removeItem(vItem: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Item = js.native
  /**
         * Sets the property <code>_sPickerType</code>.
         * @param sPickerType undefined
        */
  def setPickerType(sPickerType: java.lang.String): scala.Unit = js.native
  /**
         * Unbinds aggregation <code>items</code> from model data.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def unbindItems(): ComboBoxBase = js.native
}

