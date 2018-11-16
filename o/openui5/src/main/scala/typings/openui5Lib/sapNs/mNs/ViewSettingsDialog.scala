package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ViewSettingsDialog")
@js.native
class ViewSettingsDialog protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new ViewSettingsDialog.Accepts an object literal <code>mSettings</code> that
         * defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new ViewSettingsDialog.Accepts an object literal <code>mSettings</code> that
         * defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Overwrites the aggregation setter in order to have ID validation logic as some stringsare reserved
         * for the predefined tabs.
         * @param oCustomTab The custom tab to be added
         * @returns this pointer for chaining
        */
  def addCustomTab(oCustomTab: js.Any): ViewSettingsDialog = js.native
  /**
         * Adds some filterItem to the aggregation <code>filterItems</code>.
         * @since 1.16
         * @param oFilterItem the filterItem to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addFilterItem(oFilterItem: ViewSettingsItem): ViewSettingsDialog = js.native
  /**
         * Adds a group item and sets the association to reflect the selected state.
         * @param oItem The item to be added to the group items
         * @returns this pointer for chaining
        */
  def addGroupItem(oItem: ViewSettingsItem): ViewSettingsDialog = js.native
  /**
         * Adds a preset filter item and sets the association to reflect the selected state.
         * @param oItem The selected item or a string with the key
         * @returns this pointer for chaining
        */
  def addPresetFilterItem(oItem: ViewSettingsItem): ViewSettingsDialog = js.native
  /**
         * Adds a sort item and sets the association to reflect the selected state.
         * @param oItem The item to be added to the aggregation
         * @returns this pointer for chaining
        */
  def addSortItem(oItem: ViewSettingsItem): ViewSettingsDialog = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>cancel</code> event of this
         * <code>sap.m.ViewSettingsDialog</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ViewSettingsDialog</code> itself.Called when the Cancel button is pressed. It
         * can be used to set the state of custom filter controls.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ViewSettingsDialog</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachCancel(oData: js.Any, fnFunction: js.Any): ViewSettingsDialog = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>cancel</code> event of this
         * <code>sap.m.ViewSettingsDialog</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ViewSettingsDialog</code> itself.Called when the Cancel button is pressed. It
         * can be used to set the state of custom filter controls.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ViewSettingsDialog</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachCancel(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ViewSettingsDialog = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>confirm</code> event of this
         * <code>sap.m.ViewSettingsDialog</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ViewSettingsDialog</code> itself.Indicates that the user has pressed the OK
         * button and the selected sort, group, and filter settings should be applied to the data on this
         * page.</br></br><b>Note:</b> Custom tabs are not converted to event parameters automatically. For
         * custom tabs, you have to read the state of your controls inside the callback of this event.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ViewSettingsDialog</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachConfirm(oData: js.Any, fnFunction: js.Any): ViewSettingsDialog = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>confirm</code> event of this
         * <code>sap.m.ViewSettingsDialog</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ViewSettingsDialog</code> itself.Indicates that the user has pressed the OK
         * button and the selected sort, group, and filter settings should be applied to the data on this
         * page.</br></br><b>Note:</b> Custom tabs are not converted to event parameters automatically. For
         * custom tabs, you have to read the state of your controls inside the callback of this event.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ViewSettingsDialog</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachConfirm(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ViewSettingsDialog = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>filterDetailPageOpened</code> event of
         * this <code>sap.m.ViewSettingsDialog</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ViewSettingsDialog</code> itself.Fired when the filter detail page is opened.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ViewSettingsDialog</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachFilterDetailPageOpened(oData: js.Any, fnFunction: js.Any): ViewSettingsDialog = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>filterDetailPageOpened</code> event of
         * this <code>sap.m.ViewSettingsDialog</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ViewSettingsDialog</code> itself.Fired when the filter detail page is opened.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ViewSettingsDialog</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachFilterDetailPageOpened(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ViewSettingsDialog = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>resetFilters</code> event of this
         * <code>sap.m.ViewSettingsDialog</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ViewSettingsDialog</code> itself.Called when the reset filters button is
         * pressed. It can be used to clear the state of custom filter controls.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ViewSettingsDialog</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachResetFilters(oData: js.Any, fnFunction: js.Any): ViewSettingsDialog = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>resetFilters</code> event of this
         * <code>sap.m.ViewSettingsDialog</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.ViewSettingsDialog</code> itself.Called when the reset filters button is
         * pressed. It can be used to clear the state of custom filter controls.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.ViewSettingsDialog</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachResetFilters(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ViewSettingsDialog = js.native
  /**
         * Binds aggregation <code>customTabs</code> to model data.See {@link
         * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
         * of the possible properties of <code>oBindingInfo</code>.
         * @since 1.30
         * @param oBindingInfo The binding information
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def bindCustomTabs(oBindingInfo: js.Any): ViewSettingsDialog = js.native
  /**
         * Binds aggregation <code>filterItems</code> to model data.See {@link
         * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
         * of the possible properties of <code>oBindingInfo</code>.
         * @since 1.16
         * @param oBindingInfo The binding information
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def bindFilterItems(oBindingInfo: js.Any): ViewSettingsDialog = js.native
  /**
         * Binds aggregation <code>groupItems</code> to model data.See {@link
         * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
         * of the possible properties of <code>oBindingInfo</code>.
         * @since 1.16
         * @param oBindingInfo The binding information
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def bindGroupItems(oBindingInfo: js.Any): ViewSettingsDialog = js.native
  /**
         * Binds aggregation <code>presetFilterItems</code> to model data.See {@link
         * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
         * of the possible properties of <code>oBindingInfo</code>.
         * @since 1.16
         * @param oBindingInfo The binding information
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def bindPresetFilterItems(oBindingInfo: js.Any): ViewSettingsDialog = js.native
  /**
         * Binds aggregation <code>sortItems</code> to model data.See {@link
         * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
         * of the possible properties of <code>oBindingInfo</code>.
         * @since 1.16
         * @param oBindingInfo The binding information
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def bindSortItems(oBindingInfo: js.Any): ViewSettingsDialog = js.native
  /**
         * Destroys all the customTabs in the aggregation <code>customTabs</code>.
         * @since 1.30
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyCustomTabs(): ViewSettingsDialog = js.native
  /**
         * Destroys all the filterItems in the aggregation <code>filterItems</code>.
         * @since 1.16
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyFilterItems(): ViewSettingsDialog = js.native
  /**
         * Destroys all the groupItems in the aggregation <code>groupItems</code>.
         * @since 1.16
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyGroupItems(): ViewSettingsDialog = js.native
  /**
         * Destroys all the presetFilterItems in the aggregation <code>presetFilterItems</code>.
         * @since 1.16
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyPresetFilterItems(): ViewSettingsDialog = js.native
  /**
         * Destroys all the sortItems in the aggregation <code>sortItems</code>.
         * @since 1.16
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroySortItems(): ViewSettingsDialog = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>cancel</code> event of this
         * <code>sap.m.ViewSettingsDialog</code>.The passed function and listener object must match the ones
         * used for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachCancel(fnFunction: js.Any, oListener: js.Any): ViewSettingsDialog = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>confirm</code> event of this
         * <code>sap.m.ViewSettingsDialog</code>.The passed function and listener object must match the ones
         * used for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachConfirm(fnFunction: js.Any, oListener: js.Any): ViewSettingsDialog = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>filterDetailPageOpened</code> event of
         * this <code>sap.m.ViewSettingsDialog</code>.The passed function and listener object must match the
         * ones used for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachFilterDetailPageOpened(fnFunction: js.Any, oListener: js.Any): ViewSettingsDialog = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>resetFilters</code> event of this
         * <code>sap.m.ViewSettingsDialog</code>.The passed function and listener object must match the ones
         * used for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachResetFilters(fnFunction: js.Any, oListener: js.Any): ViewSettingsDialog = js.native
  /**
         * Fires event <code>cancel</code> to attached listeners.
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireCancel(mArguments: js.Any): ViewSettingsDialog = js.native
  /**
         * Fires event <code>confirm</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>sortItem</code> of type <code>sap.m.ViewSettingsItem</code>The selected
         * sort item.</li><li><code>sortDescending</code> of type <code>boolean</code>The selected sort order
         * (true = descending, false = ascending).</li><li><code>groupItem</code> of type
         * <code>sap.m.ViewSettingsItem</code>The selected group item.</li><li><code>groupDescending</code> of
         * type <code>boolean</code>The selected group order (true = descending, false =
         * ascending).</li><li><code>presetFilterItem</code> of type <code>sap.m.ViewSettingsItem</code>The
         * selected preset filter item.</li><li><code>filterItems</code> of type
         * <code>sap.m.ViewSettingsItem[]</code>The selected filters in an array of
         * ViewSettingsItem.</li><li><code>filterKeys</code> of type <code>object</code>The selected filter
         * items in an object notation format: { key: boolean }. If a custom control filter was displayed (for
         * example, the user clicked on the filter item), the value for its key is set to true to indicate that
         * there has been an interaction with the control.</li><li><code>filterString</code> of type
         * <code>string</code>The selected filter items in a string format to display in the control's header
         * bar in format "Filtered by: key (subkey1, subkey2, subkey3)".</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireConfirm(mArguments: js.Any): ViewSettingsDialog = js.native
  /**
         * Fires event <code>filterDetailPageOpened</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>parentFilterItem</code> of type
         * <code>sap.m.ViewSettingsFilterItem</code>The filter item for which the details are opened.</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireFilterDetailPageOpened(mArguments: js.Any): ViewSettingsDialog = js.native
  /**
         * Fires event <code>resetFilters</code> to attached listeners.
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireResetFilters(mArguments: js.Any): ViewSettingsDialog = js.native
  /**
         * Gets content of aggregation <code>customTabs</code>.The list of all the custom tabs.
         * @since 1.30
        */
  def getCustomTabs(): js.Array[ViewSettingsCustomTab] = js.native
  /**
         * Forward method to the inner dialog method: getDomRef.
         * @returns The Element's DOM Element sub DOM Element or null
        */
  def getDomRef(): openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
         * Gets content of aggregation <code>filterItems</code>.The list of items with key and value that can
         * be filtered on (for example, a list of columns for a table). A filterItem is associated with one or
         * more detail filters.
         * @since 1.16
        */
  def getFilterItems(): js.Array[ViewSettingsItem] = js.native
  /**
         * Gets current value of property <code>groupDescending</code>.Determines whether the group order is
         * descending or ascending (default).Default value is <code>false</code>.
         * @returns Value of property <code>groupDescending</code>
        */
  def getGroupDescending(): scala.Boolean = js.native
  /**
         * Gets content of aggregation <code>groupItems</code>.The list of items with key and value that can be
         * grouped on (for example, a list of columns for a table).
         * @since 1.16
        */
  def getGroupItems(): js.Array[ViewSettingsItem] = js.native
  /**
         * Gets content of aggregation <code>presetFilterItems</code>.The list of preset filter items that
         * allows the selection of more complex or custom filters. These entries are displayed at the top of
         * the filter tab.
         * @since 1.16
        */
  def getPresetFilterItems(): js.Array[ViewSettingsItem] = js.native
  /**
         * Returns the selected filters as an array of ViewSettingsItems.It can be used to create matching
         * sorters and filters to apply the selected settings to the data.
         * @returns An array of selected filter items
        */
  def getSelectedFilterItems(): js.Array[ViewSettingsItem] = js.native
  /**
         * Gets the selected filter object in format {key: boolean}.It can be used to create matching sorters
         * and filters to apply the selected settings to the data.
         * @returns An object with item and subitem keys
        */
  def getSelectedFilterKeys(): js.Any = js.native
  /**
         * Gets the filter string in format: "filter name (subfilter1 name, subfilter2name, ...), ...".For
         * custom and preset filters it will only add the filter name to the resulting string.
         * @returns The selected filter string
        */
  def getSelectedFilterString(): java.lang.String = js.native
  /**
         * ID of the element which is the current target of the association <code>selectedGroupItem</code>, or
         * <code>null</code>.
        */
  def getSelectedGroupItem(): js.Any = js.native
  /**
         * ID of the element which is the current target of the association
         * <code>selectedPresetFilterItem</code>, or <code>null</code>.
        */
  def getSelectedPresetFilterItem(): js.Any = js.native
  /**
         * ID of the element which is the current target of the association <code>selectedSortItem</code>, or
         * <code>null</code>.
        */
  def getSelectedSortItem(): js.Any = js.native
  /**
         * Gets current value of property <code>sortDescending</code>.Determines whether the sort order is
         * descending or ascending (default).Default value is <code>false</code>.
         * @returns Value of property <code>sortDescending</code>
        */
  def getSortDescending(): scala.Boolean = js.native
  /**
         * Gets content of aggregation <code>sortItems</code>.The list of items with key and value that can be
         * sorted over (for example, a list of columns for a table).
         * @since 1.16
        */
  def getSortItems(): js.Array[ViewSettingsItem] = js.native
  /**
         * Gets current value of property <code>title</code>.Defines the title of the dialog. If not set and
         * there is only one active tab, the dialog uses the default "View" or "Sort", "Group", "Filter"
         * respectively.
         * @returns Value of property <code>title</code>
        */
  def getTitle(): java.lang.String = js.native
  /**
         * Forward method to the inner dialog method: hasStyleClass.
         * @returns true if the class is set, false otherwise
        */
  def hasStyleClass(): scala.Boolean = js.native
  /**
         * Checks for the provided <code>sap.m.ViewSettingsCustomTab</code> in the aggregation
         * <code>customTabs</code>.and returns its index if found or -1 otherwise.
         * @since 1.30
         * @param oCustomTab The customTab whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfCustomTab(oCustomTab: ViewSettingsCustomTab): scala.Double = js.native
  /**
         * Checks for the provided <code>sap.m.ViewSettingsItem</code> in the aggregation
         * <code>filterItems</code>.and returns its index if found or -1 otherwise.
         * @since 1.16
         * @param oFilterItem The filterItem whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfFilterItem(oFilterItem: ViewSettingsItem): scala.Double = js.native
  /**
         * Checks for the provided <code>sap.m.ViewSettingsItem</code> in the aggregation
         * <code>groupItems</code>.and returns its index if found or -1 otherwise.
         * @since 1.16
         * @param oGroupItem The groupItem whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfGroupItem(oGroupItem: ViewSettingsItem): scala.Double = js.native
  /**
         * Checks for the provided <code>sap.m.ViewSettingsItem</code> in the aggregation
         * <code>presetFilterItems</code>.and returns its index if found or -1 otherwise.
         * @since 1.16
         * @param oPresetFilterItem The presetFilterItem whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfPresetFilterItem(oPresetFilterItem: ViewSettingsItem): scala.Double = js.native
  /**
         * Checks for the provided <code>sap.m.ViewSettingsItem</code> in the aggregation
         * <code>sortItems</code>.and returns its index if found or -1 otherwise.
         * @since 1.16
         * @param oSortItem The sortItem whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfSortItem(oSortItem: ViewSettingsItem): scala.Double = js.native
  /**
         * Inserts a customTab into the aggregation <code>customTabs</code>.
         * @since 1.30
         * @param oCustomTab the customTab to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the customTab should be inserted at; for             a
         * negative value of <code>iIndex</code>, the customTab is inserted at position 0; for a value         
         *    greater than the current size of the aggregation, the customTab is inserted at             the
         * last position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertCustomTab(oCustomTab: ViewSettingsCustomTab, iIndex: scala.Double): ViewSettingsDialog = js.native
  /**
         * Inserts a filterItem into the aggregation <code>filterItems</code>.
         * @since 1.16
         * @param oFilterItem the filterItem to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the filterItem should be inserted at; for             a
         * negative value of <code>iIndex</code>, the filterItem is inserted at position 0; for a value        
         *     greater than the current size of the aggregation, the filterItem is inserted at             the
         * last position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertFilterItem(oFilterItem: ViewSettingsItem, iIndex: scala.Double): ViewSettingsDialog = js.native
  /**
         * Inserts a groupItem into the aggregation <code>groupItems</code>.
         * @since 1.16
         * @param oGroupItem the groupItem to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the groupItem should be inserted at; for             a
         * negative value of <code>iIndex</code>, the groupItem is inserted at position 0; for a value         
         *    greater than the current size of the aggregation, the groupItem is inserted at             the
         * last position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertGroupItem(oGroupItem: ViewSettingsItem, iIndex: scala.Double): ViewSettingsDialog = js.native
  /**
         * Inserts a presetFilterItem into the aggregation <code>presetFilterItems</code>.
         * @since 1.16
         * @param oPresetFilterItem the presetFilterItem to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the presetFilterItem should be inserted at; for        
         *     a negative value of <code>iIndex</code>, the presetFilterItem is inserted at position 0; for a
         * value             greater than the current size of the aggregation, the presetFilterItem is inserted
         * at             the last position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertPresetFilterItem(oPresetFilterItem: ViewSettingsItem, iIndex: scala.Double): ViewSettingsDialog = js.native
  /**
         * Inserts a sortItem into the aggregation <code>sortItems</code>.
         * @since 1.16
         * @param oSortItem the sortItem to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the sortItem should be inserted at; for             a
         * negative value of <code>iIndex</code>, the sortItem is inserted at position 0; for a value          
         *   greater than the current size of the aggregation, the sortItem is inserted at             the last
         * position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertSortItem(oSortItem: ViewSettingsItem, iIndex: scala.Double): ViewSettingsDialog = js.native
  /**
         * Opens the ViewSettingsDialog relative to the parent control.
         * @param sPageId The ID of the initial page to be opened in the dialog.	The available values are
         * "sort", "group", "filter" or IDs of custom tabs.
         * @returns this pointer for chaining
        */
  def open(sPageId: java.lang.String): ViewSettingsDialog = js.native
  /**
         * Removes all the controls from the aggregation <code>customTabs</code>.Additionally, it unregisters
         * them from the hosting UIArea.
         * @since 1.30
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllCustomTabs(): js.Array[ViewSettingsCustomTab] = js.native
  /**
         * Removes all filter Items and resets the remembered page if it was a filter detail page and all of
         * its filter items are being removed.
         * @returns this pointer for chaining
        */
  def removeAllFilterItems(): ViewSettingsDialog = js.native
  /**
         * Removes all the controls from the aggregation <code>groupItems</code>.Additionally, it unregisters
         * them from the hosting UIArea.
         * @since 1.16
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllGroupItems(): js.Array[ViewSettingsItem] = js.native
  /**
         * Removes all the controls from the aggregation <code>presetFilterItems</code>.Additionally, it
         * unregisters them from the hosting UIArea.
         * @since 1.16
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllPresetFilterItems(): js.Array[ViewSettingsItem] = js.native
  /**
         * Removes all the controls from the aggregation <code>sortItems</code>.Additionally, it unregisters
         * them from the hosting UIArea.
         * @since 1.16
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllSortItems(): js.Array[ViewSettingsItem] = js.native
  /**
         * Removes a customTab from the aggregation <code>customTabs</code>.
         * @since 1.30
         * @param vCustomTab The customTab to remove or its index or id
         * @returns The removed customTab or <code>null</code>
        */
  def removeCustomTab(vCustomTab: java.lang.String): ViewSettingsCustomTab = js.native
  /**
         * Removes a customTab from the aggregation <code>customTabs</code>.
         * @since 1.30
         * @param vCustomTab The customTab to remove or its index or id
         * @returns The removed customTab or <code>null</code>
        */
  def removeCustomTab(vCustomTab: ViewSettingsCustomTab): ViewSettingsCustomTab = js.native
  /**
         * Removes a customTab from the aggregation <code>customTabs</code>.
         * @since 1.30
         * @param vCustomTab The customTab to remove or its index or id
         * @returns The removed customTab or <code>null</code>
        */
  def removeCustomTab(vCustomTab: scala.Double): ViewSettingsCustomTab = js.native
  /**
         * Removes a filter Item and resets the remembered page if it was the filter detail page of the removed
         * filter.
         * @param vFilterItem The filter item's index, or the item itself, or its id
         * @returns this pointer for chaining
        */
  def removeFilterItem(vFilterItem: java.lang.String): ViewSettingsDialog = js.native
  /**
         * Removes a filter Item and resets the remembered page if it was the filter detail page of the removed
         * filter.
         * @param vFilterItem The filter item's index, or the item itself, or its id
         * @returns this pointer for chaining
        */
  def removeFilterItem(vFilterItem: ViewSettingsFilterItem): ViewSettingsDialog = js.native
  /**
         * Removes a filter Item and resets the remembered page if it was the filter detail page of the removed
         * filter.
         * @param vFilterItem The filter item's index, or the item itself, or its id
         * @returns this pointer for chaining
        */
  def removeFilterItem(vFilterItem: scala.Double): ViewSettingsDialog = js.native
  /**
         * Removes a groupItem from the aggregation <code>groupItems</code>.
         * @since 1.16
         * @param vGroupItem The groupItem to remove or its index or id
         * @returns The removed groupItem or <code>null</code>
        */
  def removeGroupItem(vGroupItem: java.lang.String): ViewSettingsItem = js.native
  /**
         * Removes a groupItem from the aggregation <code>groupItems</code>.
         * @since 1.16
         * @param vGroupItem The groupItem to remove or its index or id
         * @returns The removed groupItem or <code>null</code>
        */
  def removeGroupItem(vGroupItem: ViewSettingsItem): ViewSettingsItem = js.native
  /**
         * Removes a groupItem from the aggregation <code>groupItems</code>.
         * @since 1.16
         * @param vGroupItem The groupItem to remove or its index or id
         * @returns The removed groupItem or <code>null</code>
        */
  def removeGroupItem(vGroupItem: scala.Double): ViewSettingsItem = js.native
  /**
         * Removes a presetFilterItem from the aggregation <code>presetFilterItems</code>.
         * @since 1.16
         * @param vPresetFilterItem The presetFilterItem to remove or its index or id
         * @returns The removed presetFilterItem or <code>null</code>
        */
  def removePresetFilterItem(vPresetFilterItem: java.lang.String): ViewSettingsItem = js.native
  /**
         * Removes a presetFilterItem from the aggregation <code>presetFilterItems</code>.
         * @since 1.16
         * @param vPresetFilterItem The presetFilterItem to remove or its index or id
         * @returns The removed presetFilterItem or <code>null</code>
        */
  def removePresetFilterItem(vPresetFilterItem: ViewSettingsItem): ViewSettingsItem = js.native
  /**
         * Removes a presetFilterItem from the aggregation <code>presetFilterItems</code>.
         * @since 1.16
         * @param vPresetFilterItem The presetFilterItem to remove or its index or id
         * @returns The removed presetFilterItem or <code>null</code>
        */
  def removePresetFilterItem(vPresetFilterItem: scala.Double): ViewSettingsItem = js.native
  /**
         * Removes a sortItem from the aggregation <code>sortItems</code>.
         * @since 1.16
         * @param vSortItem The sortItem to remove or its index or id
         * @returns The removed sortItem or <code>null</code>
        */
  def removeSortItem(vSortItem: java.lang.String): ViewSettingsItem = js.native
  /**
         * Removes a sortItem from the aggregation <code>sortItems</code>.
         * @since 1.16
         * @param vSortItem The sortItem to remove or its index or id
         * @returns The removed sortItem or <code>null</code>
        */
  def removeSortItem(vSortItem: ViewSettingsItem): ViewSettingsItem = js.native
  /**
         * Removes a sortItem from the aggregation <code>sortItems</code>.
         * @since 1.16
         * @param vSortItem The sortItem to remove or its index or id
         * @returns The removed sortItem or <code>null</code>
        */
  def removeSortItem(vSortItem: scala.Double): ViewSettingsItem = js.native
  /**
         * Forward method to the inner dialog method: removeStyleClass.
         * @returns this pointer for chaining
        */
  def removeStyleClass(): ViewSettingsDialog = js.native
  /**
         * Sets a new value for property <code>groupDescending</code>.Determines whether the group order is
         * descending or ascending (default).When called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>false</code>.
         * @param bGroupDescending New value for property <code>groupDescending</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setGroupDescending(bGroupDescending: scala.Boolean): ViewSettingsDialog = js.native
  /**
         * Sets the selected filter object in format {key: boolean}.
         * @param oSelectedFilterKeys A configuration object with filter item and sub item keys in the format:
         * { key: boolean }.        Setting boolean to true will set the filter to true, false or omitting an
         * entry will set the filter to false.        It can be used to set the dialog state based on presets.
         * @returns this pointer for chaining
        */
  def setSelectedFilterKeys(oSelectedFilterKeys: js.Any): ViewSettingsDialog = js.native
  /**
         * Sets the selected group item (either by key or by item).
         * @param vItemOrKey The selected item or the item's key string
         * @returns this pointer for chaining
        */
  def setSelectedGroupItem(vItemOrKey: java.lang.String): ViewSettingsDialog = js.native
  /**
         * Sets the selected group item (either by key or by item).
         * @param vItemOrKey The selected item or the item's key string
         * @returns this pointer for chaining
        */
  def setSelectedGroupItem(vItemOrKey: ViewSettingsItem): ViewSettingsDialog = js.native
  /**
         * Sets the selected preset filter item.
         * @param vItemOrKey The selected item or the item's key string
         * @returns this pointer for chaining
        */
  def setSelectedPresetFilterItem(vItemOrKey: java.lang.String): ViewSettingsDialog = js.native
  /**
         * Sets the selected preset filter item.
         * @param vItemOrKey The selected item or the item's key string
         * @returns this pointer for chaining
        */
  def setSelectedPresetFilterItem(vItemOrKey: ViewSettingsItem): ViewSettingsDialog = js.native
  /**
         * Sets the selected sort item (either by key or by item).
         * @param vItemOrKey The selected item or the item's key string
         * @returns this pointer for chaining
        */
  def setSelectedSortItem(vItemOrKey: java.lang.String): ViewSettingsDialog = js.native
  /**
         * Sets the selected sort item (either by key or by item).
         * @param vItemOrKey The selected item or the item's key string
         * @returns this pointer for chaining
        */
  def setSelectedSortItem(vItemOrKey: ViewSettingsItem): ViewSettingsDialog = js.native
  /**
         * Sets a new value for property <code>sortDescending</code>.Determines whether the sort order is
         * descending or ascending (default).When called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>false</code>.
         * @param bSortDescending New value for property <code>sortDescending</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setSortDescending(bSortDescending: scala.Boolean): ViewSettingsDialog = js.native
  /**
         * Sets the title of the internal dialog.
         * @param sTitle The title text for the dialog
         * @returns this pointer for chaining
        */
  def setTitle(sTitle: java.lang.String): ViewSettingsDialog = js.native
  /**
         * Forward method to the inner dialog method: toggleStyleClass.
         * @returns this pointer for chaining
        */
  def toggleStyleClass(): ViewSettingsDialog = js.native
  /**
         * Unbinds aggregation <code>customTabs</code> from model data.
         * @since 1.30
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def unbindCustomTabs(): ViewSettingsDialog = js.native
  /**
         * Unbinds aggregation <code>filterItems</code> from model data.
         * @since 1.16
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def unbindFilterItems(): ViewSettingsDialog = js.native
  /**
         * Unbinds aggregation <code>groupItems</code> from model data.
         * @since 1.16
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def unbindGroupItems(): ViewSettingsDialog = js.native
  /**
         * Unbinds aggregation <code>presetFilterItems</code> from model data.
         * @since 1.16
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def unbindPresetFilterItems(): ViewSettingsDialog = js.native
  /**
         * Unbinds aggregation <code>sortItems</code> from model data.
         * @since 1.16
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def unbindSortItems(): ViewSettingsDialog = js.native
}

