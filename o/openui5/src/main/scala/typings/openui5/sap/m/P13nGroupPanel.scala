package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait P13nGroupPanel extends P13nPanel {
  
  /**
    * Adds some groupItem to the aggregation <code>groupItems</code>.
    * @since 1.26
    * @param oGroupItem the groupItem to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addGroupItem(oGroupItem: P13nGroupItem): P13nGroupPanel = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>addGroupItem</code> event of this
    * <code>sap.m.P13nGroupPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nGroupPanel</code> itself.Event raised if a <code>GroupItem</code> has been
    * added.
    * @since 1.26
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nGroupPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAddGroupItem(oData: js.Any, fnFunction: js.Any): P13nGroupPanel = js.native
  def attachAddGroupItem(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nGroupPanel = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>removeGroupItem</code> event of this
    * <code>sap.m.P13nGroupPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nGroupPanel</code> itself.Removes a group item.
    * @since 1.26
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nGroupPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachRemoveGroupItem(oData: js.Any, fnFunction: js.Any): P13nGroupPanel = js.native
  def attachRemoveGroupItem(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nGroupPanel = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>updateGroupItem</code> event of this
    * <code>sap.m.P13nGroupPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nGroupPanel</code> itself.Updates a group item.
    * @since 1.26
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nGroupPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUpdateGroupItem(oData: js.Any, fnFunction: js.Any): P13nGroupPanel = js.native
  def attachUpdateGroupItem(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nGroupPanel = js.native
  
  /**
    * Binds aggregation <code>groupItems</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.26
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindGroupItems(oBindingInfo: js.Any): P13nGroupPanel = js.native
  
  /**
    * Destroys all the groupItems in the aggregation <code>groupItems</code>.
    * @since 1.26
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyGroupItems(): P13nGroupPanel = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>addGroupItem</code> event of this
    * <code>sap.m.P13nGroupPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAddGroupItem(fnFunction: js.Any, oListener: js.Any): P13nGroupPanel = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>removeGroupItem</code> event of this
    * <code>sap.m.P13nGroupPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachRemoveGroupItem(fnFunction: js.Any, oListener: js.Any): P13nGroupPanel = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>updateGroupItem</code> event of this
    * <code>sap.m.P13nGroupPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUpdateGroupItem(fnFunction: js.Any, oListener: js.Any): P13nGroupPanel = js.native
  
  /**
    * Fires event <code>addGroupItem</code> to attached listeners.
    * @since 1.26
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAddGroupItem(mArguments: js.Any): P13nGroupPanel = js.native
  
  /**
    * Fires event <code>removeGroupItem</code> to attached listeners.
    * @since 1.26
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireRemoveGroupItem(mArguments: js.Any): P13nGroupPanel = js.native
  
  /**
    * Fires event <code>updateGroupItem</code> to attached listeners.
    * @since 1.26
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUpdateGroupItem(mArguments: js.Any): P13nGroupPanel = js.native
  
  /**
    * Gets current value of property <code>containerQuery</code>.Defines if <code>mediaQuery</code> or
    * <code>ContainerResize</code> is used for a layout update. If <code>ConditionPanel</code>is used in a
    * dialog, the property must be set to true.Default value is <code>false</code>.
    * @since 1.26
    * @returns Value of property <code>containerQuery</code>
    */
  def getContainerQuery(): Boolean = js.native
  
  /**
    * Gets content of aggregation <code>groupItems</code>.Defined group items.
    * @since 1.26
    */
  def getGroupItems(): js.Array[P13nGroupItem] = js.native
  
  /**
    * Gets current value of property <code>layoutMode</code>.Can be used to control the layout behavior.
    * Default is "" which will automatically change the layout. With "Desktop", "Table"or"Phone" you can
    * set a fixed layout.
    * @since 1.26
    * @returns Value of property <code>layoutMode</code>
    */
  def getLayoutMode(): String = js.native
  
  /**
    * Gets current value of property <code>maxGroups</code>.Defines the maximum number of groups.Default
    * value is <code>-1</code>.
    * @since 1.26
    * @returns Value of property <code>maxGroups</code>
    */
  def getMaxGroups(): String = js.native
  
  /**
    * Checks for the provided <code>sap.m.P13nGroupItem</code> in the aggregation
    * <code>groupItems</code>.and returns its index if found or -1 otherwise.
    * @since 1.26
    * @param oGroupItem The groupItem whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfGroupItem(oGroupItem: P13nGroupItem): Double = js.native
  
  /**
    * Inserts a groupItem into the aggregation <code>groupItems</code>.
    * @since 1.26
    * @param oGroupItem the groupItem to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the groupItem should be inserted at; for             a
    * negative value of <code>iIndex</code>, the groupItem is inserted at position 0; for a value         
    *    greater than the current size of the aggregation, the groupItem is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertGroupItem(oGroupItem: P13nGroupItem, iIndex: Double): P13nGroupPanel = js.native
  
  /**
    * Removes all the controls from the aggregation <code>groupItems</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @since 1.26
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllGroupItems(): js.Array[P13nGroupItem] = js.native
  
  def removeGroupItem(vGroupItem: String): P13nGroupItem = js.native
  /**
    * Removes a groupItem from the aggregation <code>groupItems</code>.
    * @since 1.26
    * @param vGroupItem The groupItem to remove or its index or id
    * @returns The removed groupItem or <code>null</code>
    */
  def removeGroupItem(vGroupItem: Double): P13nGroupItem = js.native
  def removeGroupItem(vGroupItem: P13nGroupItem): P13nGroupItem = js.native
  
  /**
    * Removes all invalid group conditions.
    * @since 1.28
    */
  def removeInvalidConditions(): Unit = js.native
  
  /**
    * Removes all errors/warning states from of all group conditions.
    * @since 1.28
    */
  def removeValidationErrors(): Unit = js.native
  
  /**
    * Sets a new value for property <code>containerQuery</code>.Defines if <code>mediaQuery</code> or
    * <code>ContainerResize</code> is used for a layout update. If <code>ConditionPanel</code>is used in a
    * dialog, the property must be set to true.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.26
    * @param bContainerQuery New value for property <code>containerQuery</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContainerQuery(bContainerQuery: Boolean): P13nGroupPanel = js.native
  
  /**
    * Sets a new value for property <code>layoutMode</code>.Can be used to control the layout behavior.
    * Default is "" which will automatically change the layout. With "Desktop", "Table"or"Phone" you can
    * set a fixed layout.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @since 1.26
    * @param sLayoutMode New value for property <code>layoutMode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLayoutMode(sLayoutMode: String): P13nGroupPanel = js.native
  
  /**
    * Sets a new value for property <code>maxGroups</code>.Defines the maximum number of groups.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>-1</code>.
    * @since 1.26
    * @param sMaxGroups New value for property <code>maxGroups</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxGroups(sMaxGroups: String): P13nGroupPanel = js.native
  
  /**
    * Setter for the supported operations array.
    * @since 1.26
    * @param array of operations [sap.m.P13nConditionOperation.BT, sap.m.P13nConditionOperation.EQ]
    */
  def setOperations(array: js.Array[_]): Unit = js.native
  
  /**
    * Unbinds aggregation <code>groupItems</code> from model data.
    * @since 1.26
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindGroupItems(): P13nGroupPanel = js.native
  
  /**
    * Checks if the entered or modified conditions are correct, marks invalid fields yellow (Warning) and
    * opens a popup message dialog to let theuser know that some values are not correct or missing.
    * @since 1.26
    */
  def validateConditions(): Unit = js.native
}
