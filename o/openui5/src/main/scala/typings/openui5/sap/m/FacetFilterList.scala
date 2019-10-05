package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.FacetFilterList")
@js.native
class FacetFilterList protected () extends List {
  /**
    * Constructor for a new FacetFilterList.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>listClose</code> event of this
    * <code>sap.m.FacetFilterList</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.FacetFilterList</code> itself.Triggered after the list of items is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.FacetFilterList</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachListClose(oData: js.Any, fnFunction: js.Any): FacetFilterList = js.native
  def attachListClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FacetFilterList = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>listOpen</code> event of this
    * <code>sap.m.FacetFilterList</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.FacetFilterList</code> itself.Fired before the filter list is opened.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.FacetFilterList</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachListOpen(oData: js.Any, fnFunction: js.Any): FacetFilterList = js.native
  def attachListOpen(oData: js.Any, fnFunction: js.Any, oListener: js.Any): FacetFilterList = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>listClose</code> event of this
    * <code>sap.m.FacetFilterList</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachListClose(fnFunction: js.Any, oListener: js.Any): FacetFilterList = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>listOpen</code> event of this
    * <code>sap.m.FacetFilterList</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachListOpen(fnFunction: js.Any, oListener: js.Any): FacetFilterList = js.native
  /**
    * Fires event <code>listClose</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selectedItems</code> of type <code>sap.m.FacetFilterItem[]</code>Array of
    * selected items. Items returned are only copies and therefore can only be used to read properties,
    * not set them.</li><li><code>allSelected</code> of type <code>boolean</code><code>True</code> if the
    * select All checkbox is selected. This will be <code>false</code> if all items are actually selected
    * (every FacetFilterItem.selected == true). In that case selectedItems will contain all selected
    * items.</li><li><code>selectedKeys</code> of type <code>object</code>Associative array containing the
    * keys of selected FacetFilterItems. Unlike the selectedItems parameter, this contains only the keys
    * for all selected items, not the items themselves. Being an associative array, each object property
    * is the FacetFilterItem key value and the value of the property is the FacetFilterItem
    * text.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireListClose(mArguments: js.Any): FacetFilterList = js.native
  /**
    * Fires event <code>listOpen</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireListOpen(mArguments: js.Any): FacetFilterList = js.native
  /**
    * Gets current value of property <code>active</code>.Indicates that the list is displayed as a button
    * when the FacetFilter type is set to <code>Simple</code>.Default value is <code>true</code>.
    * @returns Value of property <code>active</code>
    */
  def getActive(): Boolean = js.native
  /**
    * Gets current value of property <code>allCount</code>.Determines the number of objects that match
    * this item in the target data set when all filter items are selected.
    * @returns Value of property <code>allCount</code>
    */
  def getAllCount(): Double = js.native
  /**
    * Gets current value of property <code>dataType</code>.FacetFilterList data type. Only String data
    * type will provide search function.Default value is <code>String</code>.
    * @returns Value of property <code>dataType</code>
    */
  def getDataType(): FacetFilterListDataType = js.native
  /**
    * Gets current value of property <code>enableCaseInsensitiveSearch</code>.If set to <code>true</code>,
    * enables case-insensitive search for OData.Default value is <code>false</code>.
    * @returns Value of property <code>enableCaseInsensitiveSearch</code>
    */
  def getEnableCaseInsensitiveSearch(): Boolean = js.native
  /**
    * Gets current value of property <code>key</code>.Unique identifier for this filter list.
    * @returns Value of property <code>key</code>
    */
  def getKey(): String = js.native
  /**
    * Gets current value of property <code>multiSelect</code>.Specifies whether multiple or single
    * selection is used.Default value is <code>true</code>.
    * @returns Value of property <code>multiSelect</code>
    */
  def getMultiSelect(): Boolean = js.native
  /**
    * Gets current value of property <code>retainListSequence</code>.Retains the list sequence if it is
    * inactive and made active again.Default value is <code>false</code>.
    * @since 1.22.1
    * @returns Value of property <code>retainListSequence</code>
    */
  def getRetainListSequence(): Boolean = js.native
  /**
    * Returns the keys of the selected elements as an associative array.An empty object is returned if no
    * items are selected.
    * @since 1.20.3
    * @returns Object with the selected keys
    */
  def getSelectedKeys(): js.Any = js.native
  /**
    * Gets current value of property <code>sequence</code>.Sequence that determines the order in which
    * FacetFilterList is shown on the FacetFilter. Lists are rendered by ascending order of
    * sequence.Default value is <code>-1</code>.
    * @returns Value of property <code>sequence</code>
    */
  def getSequence(): Double = js.native
  /**
    * Gets current value of property <code>showRemoveFacetIcon</code>.Specifies whether remove icon for
    * facet is visible or hidden.Default value is <code>true</code>.
    * @since 1.20.4
    * @returns Value of property <code>showRemoveFacetIcon</code>
    */
  def getShowRemoveFacetIcon(): Boolean = js.native
  /**
    * Gets current value of property <code>title</code>.Defines the title of the facet. The facet title is
    * displayed on the facet button when the FacetFilter type is set to <code>Simple</code>. It is also
    * displayed as a list item in the facet page of the dialog.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  /**
    * Gets current value of property <code>wordWrap</code>.If set to <code>true</code>, the item text
    * wraps when it is too long.Default value is <code>false</code>.
    * @returns Value of property <code>wordWrap</code>
    */
  def getWordWrap(): Boolean = js.native
  /**
    * Removes the specified key from the selected keys cache and deselects the item.
    * @since 1.20.4
    * @param sKey The key of the selected item to be removed from the cache. If <code>null</code> then the
    * text parameter will be used as the key.
    * @param sText The text of the selected item to be removed from the cache. If the key parameter is
    * <code>null</code> then text will be used as the key.
    */
  def removeSelectedKey(sKey: String, sText: String): Unit = js.native
  /**
    * Removes all selected keys from the selected keys cache and deselects all items.
    * @since 1.20.4
    */
  def removeSelectedKeys(): Unit = js.native
  /**
    * Sets a new value for property <code>active</code>.Indicates that the list is displayed as a button
    * when the FacetFilter type is set to <code>Simple</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bActive New value for property <code>active</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActive(bActive: Boolean): FacetFilterList = js.native
  /**
    * Sets a new value for property <code>allCount</code>.Determines the number of objects that match this
    * item in the target data set when all filter items are selected.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param iAllCount New value for property <code>allCount</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAllCount(iAllCount: Double): FacetFilterList = js.native
  /**
    * Sets a new value for property <code>dataType</code>.FacetFilterList data type. Only String data type
    * will provide search function.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>String</code>.
    * @param sDataType New value for property <code>dataType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDataType(sDataType: FacetFilterListDataType): FacetFilterList = js.native
  /**
    * Sets a new value for property <code>enableCaseInsensitiveSearch</code>.If set to <code>true</code>,
    * enables case-insensitive search for OData.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bEnableCaseInsensitiveSearch New value for property <code>enableCaseInsensitiveSearch</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnableCaseInsensitiveSearch(bEnableCaseInsensitiveSearch: Boolean): FacetFilterList = js.native
  /**
    * Sets a new value for property <code>key</code>.Unique identifier for this filter list.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sKey New value for property <code>key</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setKey(sKey: String): FacetFilterList = js.native
  /**
    * Sets a new value for property <code>retainListSequence</code>.Retains the list sequence if it is
    * inactive and made active again.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.22.1
    * @param bRetainListSequence New value for property <code>retainListSequence</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRetainListSequence(bRetainListSequence: Boolean): FacetFilterList = js.native
  /**
    * Used to pre-select FacetFilterItems, such as when restoring FacetFilterList selections from a
    * variant.Keys are cached separately from the actual FacetFilterItems so that they remain even when
    * the physical items are removed by filtering or sorting.If aKeys is <code>undefined</code>,
    * <code>null</code>, or {} (empty object) then all keys are deleted.After this method completes, only
    * those items with matching keys will be selected. All other items in the list will be deselected.
    * @since 1.20.3
    * @param oAKeys Associative array indicating which FacetFilterItems should be selected in the list.
    * Each property must be set to the value of a FacetFilterItem.key property. Each property value should
    * be set to the FacetFilterItem.text property value. The text value is used to display the
    * FacetFilterItem text when the FacetFilterList button or FacetFilter summary bar is displayed. If no
    * property value is set then the property key is used for the text.
    */
  def setSelectedKeys(oAKeys: js.Any): Unit = js.native
  /**
    * Sets a new value for property <code>sequence</code>.Sequence that determines the order in which
    * FacetFilterList is shown on the FacetFilter. Lists are rendered by ascending order of sequence.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>-1</code>.
    * @param iSequence New value for property <code>sequence</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSequence(iSequence: Double): FacetFilterList = js.native
  /**
    * Sets a new value for property <code>showRemoveFacetIcon</code>.Specifies whether remove icon for
    * facet is visible or hidden.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>true</code>.
    * @since 1.20.4
    * @param bShowRemoveFacetIcon New value for property <code>showRemoveFacetIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowRemoveFacetIcon(bShowRemoveFacetIcon: Boolean): FacetFilterList = js.native
  /**
    * Sets a new value for property <code>wordWrap</code>.If set to <code>true</code>, the item text wraps
    * when it is too long.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @param bWordWrap New value for property <code>wordWrap</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWordWrap(bWordWrap: Boolean): FacetFilterList = js.native
}

