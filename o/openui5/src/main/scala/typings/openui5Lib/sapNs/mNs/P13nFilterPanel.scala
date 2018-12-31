package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.P13nFilterPanel")
@js.native
class P13nFilterPanel protected () extends P13nPanel {
  /**
    * Constructor for a new P13nFilterPanel.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some filterItem to the aggregation <code>filterItems</code>.
    * @since 1.26
    * @param oFilterItem the filterItem to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addFilterItem(oFilterItem: P13nFilterItem): P13nFilterPanel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>addFilterItem</code> event of this
    * <code>sap.m.P13nFilterPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nFilterPanel</code> itself.Event raised if a filter item has been added.
    * @since 1.26
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nFilterPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAddFilterItem(oData: js.Any, fnFunction: js.Any): P13nFilterPanel = js.native
  def attachAddFilterItem(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nFilterPanel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>removeFilterItem</code> event of this
    * <code>sap.m.P13nFilterPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nFilterPanel</code> itself.Removes a filter item.
    * @since 1.26
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nFilterPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachRemoveFilterItem(oData: js.Any, fnFunction: js.Any): P13nFilterPanel = js.native
  def attachRemoveFilterItem(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nFilterPanel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>updateFilterItem</code> event of this
    * <code>sap.m.P13nFilterPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nFilterPanel</code> itself.Updates a filter item.
    * @since 1.26
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nFilterPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUpdateFilterItem(oData: js.Any, fnFunction: js.Any): P13nFilterPanel = js.native
  def attachUpdateFilterItem(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nFilterPanel = js.native
  /**
    * Binds aggregation <code>filterItems</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.26
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindFilterItems(oBindingInfo: js.Any): P13nFilterPanel = js.native
  /**
    * Destroys all the filterItems in the aggregation <code>filterItems</code>.
    * @since 1.26
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyFilterItems(): P13nFilterPanel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>addFilterItem</code> event of this
    * <code>sap.m.P13nFilterPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAddFilterItem(fnFunction: js.Any, oListener: js.Any): P13nFilterPanel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>removeFilterItem</code> event of this
    * <code>sap.m.P13nFilterPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachRemoveFilterItem(fnFunction: js.Any, oListener: js.Any): P13nFilterPanel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>updateFilterItem</code> event of this
    * <code>sap.m.P13nFilterPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUpdateFilterItem(fnFunction: js.Any, oListener: js.Any): P13nFilterPanel = js.native
  /**
    * Fires event <code>addFilterItem</code> to attached listeners.
    * @since 1.26
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAddFilterItem(mArguments: js.Any): P13nFilterPanel = js.native
  /**
    * Fires event <code>removeFilterItem</code> to attached listeners.
    * @since 1.26
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireRemoveFilterItem(mArguments: js.Any): P13nFilterPanel = js.native
  /**
    * Fires event <code>updateFilterItem</code> to attached listeners.
    * @since 1.26
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUpdateFilterItem(mArguments: js.Any): P13nFilterPanel = js.native
  /**
    * Returns the array of conditions.
    * @since 1.26
    */
  def getConditions(): scala.Unit = js.native
  /**
    * Gets current value of property <code>containerQuery</code>.Defines if the <code>mediaQuery</code> or
    * a <code>ContainerResize</code> is used for layout update. If the<code>ConditionPanel</code> is used
    * in a dialog, the property must be set to <code>true</code>.Default value is <code>false</code>.
    * @since 1.26
    * @returns Value of property <code>containerQuery</code>
    */
  def getContainerQuery(): scala.Boolean = js.native
  /**
    * Getter for the exclude operations.
    * @since 1.26
    * @param the type for which the operations are defined
    * @returns array of operations [<code>sap.m.P13nConditionOperation.BT</code>,        
    * <code>sap.m.P13nConditionOperation.EQ</code>]
    */
  def getExcludeOperations(the: java.lang.String): js.Array[_] = js.native
  /**
    * Gets content of aggregation <code>filterItems</code>.Defines filter items.
    * @since 1.26
    */
  def getFilterItems(): js.Array[P13nFilterItem] = js.native
  /**
    * Getter for the include operations.
    * @since 1.26
    * @param the type for which the operations are defined
    * @returns array of operations [<code>sap.m.P13nConditionOperation.BT</code>,        
    * <code>sap.m.P13nConditionOperation.EQ</code>]
    */
  def getIncludeOperations(the: java.lang.String): js.Any = js.native
  /**
    * Gets current value of property <code>layoutMode</code>.Can be used to control the layout behavior.
    * Default is "" which will automatically change the layout. With "Desktop", "Table"or"Phone" you can
    * set a fixed layout.
    * @since 1.26
    * @returns Value of property <code>layoutMode</code>
    */
  def getLayoutMode(): java.lang.String = js.native
  /**
    * Gets current value of property <code>maxExcludes</code>.Defines the maximum number of exclude
    * filters.Default value is <code>-1</code>.
    * @since 1.26
    * @returns Value of property <code>maxExcludes</code>
    */
  def getMaxExcludes(): java.lang.String = js.native
  /**
    * Gets current value of property <code>maxIncludes</code>.Defines the maximum number of include
    * filters.Default value is <code>-1</code>.
    * @since 1.26
    * @returns Value of property <code>maxIncludes</code>
    */
  def getMaxIncludes(): java.lang.String = js.native
  /**
    * Checks for the provided <code>sap.m.P13nFilterItem</code> in the aggregation
    * <code>filterItems</code>.and returns its index if found or -1 otherwise.
    * @since 1.26
    * @param oFilterItem The filterItem whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfFilterItem(oFilterItem: P13nFilterItem): scala.Double = js.native
  /**
    * Inserts a filterItem into the aggregation <code>filterItems</code>.
    * @since 1.26
    * @param oFilterItem the filterItem to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the filterItem should be inserted at; for             a
    * negative value of <code>iIndex</code>, the filterItem is inserted at position 0; for a value        
    *     greater than the current size of the aggregation, the filterItem is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertFilterItem(oFilterItem: P13nFilterItem, iIndex: scala.Double): P13nFilterPanel = js.native
  /**
    * Removes all the controls from the aggregation <code>filterItems</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @since 1.26
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllFilterItems(): js.Array[P13nFilterItem] = js.native
  def removeFilterItem(vFilterItem: java.lang.String): P13nFilterItem = js.native
  def removeFilterItem(vFilterItem: P13nFilterItem): P13nFilterItem = js.native
  /**
    * Removes a filterItem from the aggregation <code>filterItems</code>.
    * @since 1.26
    * @param vFilterItem The filterItem to remove or its index or id
    * @returns The removed filterItem or <code>null</code>
    */
  def removeFilterItem(vFilterItem: scala.Double): P13nFilterItem = js.native
  /**
    * Removes all invalid conditions.
    * @since 1.28
    */
  def removeInvalidConditions(): scala.Unit = js.native
  /**
    * Removes all errors and warnings states from of all filter conditions.
    * @since 1.28
    */
  def removeValidationErrors(): scala.Unit = js.native
  /**
    * Sets the array of conditions.
    * @since 1.26
    * @param aConditions the complete list of conditions
    * @returns this for chaining
    */
  def setConditions(aConditions: js.Array[_]): P13nFilterPanel = js.native
  /**
    * Sets a new value for property <code>containerQuery</code>.Defines if the <code>mediaQuery</code> or
    * a <code>ContainerResize</code> is used for layout update. If the<code>ConditionPanel</code> is used
    * in a dialog, the property must be set to <code>true</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @since 1.26
    * @param bContainerQuery New value for property <code>containerQuery</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContainerQuery(bContainerQuery: scala.Boolean): P13nFilterPanel = js.native
  /**
    * Setter for the supported exclude operations array.
    * @since 1.26
    * @param array of operations [<code>sap.m.P13nConditionOperation.BT</code>,      
    * <code>sap.m.P13nConditionOperation.EQ</code>]
    * @param the type for which the operations are defined
    */
  def setExcludeOperations(array: js.Array[_], the: java.lang.String): scala.Unit = js.native
  /**
    * Setter for the supported Include operations array.
    * @since 1.26
    * @param array of operations [<code>sap.m.P13nConditionOperation.BT</code>,      
    * <code>sap.m.P13nConditionOperation.EQ</code>]
    * @param the type for which the operations are defined
    */
  def setIncludeOperations(array: js.Array[_], the: java.lang.String): scala.Unit = js.native
  /**
    * Sets a new value for property <code>layoutMode</code>.Can be used to control the layout behavior.
    * Default is "" which will automatically change the layout. With "Desktop", "Table"or"Phone" you can
    * set a fixed layout.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @since 1.26
    * @param sLayoutMode New value for property <code>layoutMode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLayoutMode(sLayoutMode: java.lang.String): P13nFilterPanel = js.native
  /**
    * Sets a new value for property <code>maxExcludes</code>.Defines the maximum number of exclude
    * filters.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>-1</code>.
    * @since 1.26
    * @param sMaxExcludes New value for property <code>maxExcludes</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxExcludes(sMaxExcludes: java.lang.String): P13nFilterPanel = js.native
  /**
    * Sets a new value for property <code>maxIncludes</code>.Defines the maximum number of include
    * filters.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>-1</code>.
    * @since 1.26
    * @param sMaxIncludes New value for property <code>maxIncludes</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxIncludes(sMaxIncludes: java.lang.String): P13nFilterPanel = js.native
  /**
    * Unbinds aggregation <code>filterItems</code> from model data.
    * @since 1.26
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindFilterItems(): P13nFilterPanel = js.native
  /**
    * Checks if the entered and modified conditions are correct, marks invalid fields in yellow (warning).
    * @since 1.26
    * @returns <code>false</code>, if there is an invalid condition
    */
  def validateConditions(): scala.Boolean = js.native
}

