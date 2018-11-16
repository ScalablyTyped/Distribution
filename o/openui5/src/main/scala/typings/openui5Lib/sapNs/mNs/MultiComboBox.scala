package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.MultiComboBox")
@js.native
abstract class MultiComboBox protected () extends ComboBoxBase {
  /**
         * Constructor for a new MultiComboBox.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new MultiComboBox.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Adds some item <code>oItem</code> to the association named <code>selectedItems</code>.
         * @param oItem The selected item to add; if empty, nothing is added.
         * @returns <code>this</code> to allow method chaining.
        */
  def addSelectedItem(oItem: openui5Lib.sapNs.uiNs.coreNs.Item): MultiComboBox = js.native
  /**
         * Adds selected items. Only items with valid keys are added as selected.
         * @param aKeys An array of item keys that identifies the items to be added as selected
        */
  def addSelectedKeys(aKeys: js.Array[java.lang.String]): MultiComboBox = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>selectionChange</code> event of this
         * <code>sap.m.MultiComboBox</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MultiComboBox</code> itself.Event is fired when selection of an item is
         * changed.Note: please do not use the "change" event inherited from sap.m.InputBase
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MultiComboBox</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any): MultiComboBox = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>selectionChange</code> event of this
         * <code>sap.m.MultiComboBox</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MultiComboBox</code> itself.Event is fired when selection of an item is
         * changed.Note: please do not use the "change" event inherited from sap.m.InputBase
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MultiComboBox</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MultiComboBox = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>selectionFinish</code> event of this
         * <code>sap.m.MultiComboBox</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MultiComboBox</code> itself.Event is fired when user has finished a selection of
         * items in a list box and list box has been closed.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MultiComboBox</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachSelectionFinish(oData: js.Any, fnFunction: js.Any): MultiComboBox = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>selectionFinish</code> event of this
         * <code>sap.m.MultiComboBox</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.MultiComboBox</code> itself.Event is fired when user has finished a selection of
         * items in a list box and list box has been closed.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.MultiComboBox</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachSelectionFinish(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MultiComboBox = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>selectionChange</code> event of this
         * <code>sap.m.MultiComboBox</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachSelectionChange(fnFunction: js.Any, oListener: js.Any): MultiComboBox = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>selectionFinish</code> event of this
         * <code>sap.m.MultiComboBox</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachSelectionFinish(fnFunction: js.Any, oListener: js.Any): MultiComboBox = js.native
  /**
         * Fires event <code>selectionChange</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>changedItem</code> of type <code>sap.ui.core.Item</code>Item which
         * selection is changed</li><li><code>selected</code> of type <code>boolean</code>Selection state: true
         * if item is selected, false ifitem is not selected</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireSelectionChange(mArguments: js.Any): MultiComboBox = js.native
  /**
         * Fires event <code>selectionFinish</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>selectedItems</code> of type <code>sap.ui.core.Item[]</code>The selected
         * items which are selected after list box has been closed.</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireSelectionFinish(mArguments: js.Any): MultiComboBox = js.native
  /**
         * Retrieves the selected item objects from the association named <code>selectedItems</code>.
         * @returns Array of sap.ui.core.Item instances. The current target of the <code>selectedItems</code>  
         *       association.
        */
  def getSelectedItems(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Item] = js.native
  /**
         * Gets current value of property <code>selectedKeys</code>.Keys of the selected items. If the key has
         * no corresponding item, no changes will apply. If duplicate keys exists the first item matching the
         * key is used.Default value is <code>[]</code>.
         * @returns Value of property <code>selectedKeys</code>
        */
  def getSelectedKeys(): js.Array[java.lang.String] = js.native
  /**
         * This hook method is called after the MultiComboBox's Pop-up is rendered.
        */
  def onAfterRenderingPicker(): scala.Unit = js.native
  /**
         * This hook method is called before the MultiComboBox's Pop-up is rendered.
        */
  def onBeforeRenderingPicker(): scala.Unit = js.native
  /**
         * Removes all the controls in the association named <code>selectedItems</code>.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllSelectedItems(): js.Array[_] = js.native
  /**
         * Removes an selectedItem from the association named <code>selectedItems</code>.
         * @param vSelectedItem The selectedItem to be removed or its index or ID
         * @returns The removed selectedItem or <code>null</code>
        */
  def removeSelectedItem(vSelectedItem: js.Any): js.Any = js.native
  /**
         * Removes an selectedItem from the association named <code>selectedItems</code>.
         * @param vSelectedItem The selectedItem to be removed or its index or ID
         * @returns The removed selectedItem or <code>null</code>
        */
  def removeSelectedItem(vSelectedItem: openui5Lib.sapNs.uiNs.coreNs.Item): js.Any = js.native
  /**
         * Removes an selectedItem from the association named <code>selectedItems</code>.
         * @param vSelectedItem The selectedItem to be removed or its index or ID
         * @returns The removed selectedItem or <code>null</code>
        */
  def removeSelectedItem(vSelectedItem: scala.Double): js.Any = js.native
  /**
         * Removes selected items. Only items with valid keys are removed.
         * @param aKeys An array of item keys that identifies the items to be removed
        */
  def removeSelectedKeys(aKeys: js.Array[java.lang.String]): MultiComboBox = js.native
  /**
         * Setter for association <code>selectedItems</code>.
         * @param aItems new values for association <code>selectedItems</code>.Array of sap.ui.core.Item Id
         * which becomes the new target of this <code>selectedItems</code> association.Alternatively, an array
         * of sap.ui.core.Item instance may be given or null.
         * @returns <code>this</code> to allow method chaining.
        */
  def setSelectedItems(aItems: js.Any): MultiComboBox = js.native
  /**
         * Setter for association <code>selectedItems</code>.
         * @param aItems new values for association <code>selectedItems</code>.Array of sap.ui.core.Item Id
         * which becomes the new target of this <code>selectedItems</code> association.Alternatively, an array
         * of sap.ui.core.Item instance may be given or null.
         * @returns <code>this</code> to allow method chaining.
        */
  def setSelectedItems(aItems: js.Array[java.lang.String | openui5Lib.sapNs.uiNs.coreNs.Item]): MultiComboBox = js.native
  /**
         * Sets a new value for property <code>selectedKeys</code>.Keys of the selected items. If the key has
         * no corresponding item, no changes will apply. If duplicate keys exists the first item matching the
         * key is used.When called with a value of <code>null</code> or <code>undefined</code>, the default
         * value of the property will be restored.Default value is <code>[]</code>.
         * @param sSelectedKeys New value for property <code>selectedKeys</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setSelectedKeys(sSelectedKeys: js.Array[java.lang.String]): MultiComboBox = js.native
}

