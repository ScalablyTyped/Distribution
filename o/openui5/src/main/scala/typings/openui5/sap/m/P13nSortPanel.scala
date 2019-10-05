package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.P13nSortPanel")
@js.native
class P13nSortPanel protected () extends P13nPanel {
  /**
    * Constructor for a new P13nSortPanel.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some sortItem to the aggregation <code>sortItems</code>.
    * @since 1.26
    * @param oSortItem the sortItem to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSortItem(oSortItem: P13nSortItem): P13nSortPanel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>addSortItem</code> event of this
    * <code>sap.m.P13nSortPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nSortPanel</code> itself.event raised when a SortItem was added
    * @since 1.26
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nSortPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAddSortItem(oData: js.Any, fnFunction: js.Any): P13nSortPanel = js.native
  def attachAddSortItem(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nSortPanel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>removeSortItem</code> event of this
    * <code>sap.m.P13nSortPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nSortPanel</code> itself.remove a sort item
    * @since 1.26
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nSortPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachRemoveSortItem(oData: js.Any, fnFunction: js.Any): P13nSortPanel = js.native
  def attachRemoveSortItem(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nSortPanel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>updateSortItem</code> event of this
    * <code>sap.m.P13nSortPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nSortPanel</code> itself.update a sort item
    * @since 1.26
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nSortPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUpdateSortItem(oData: js.Any, fnFunction: js.Any): P13nSortPanel = js.native
  def attachUpdateSortItem(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nSortPanel = js.native
  /**
    * Binds aggregation <code>sortItems</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.26
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindSortItems(oBindingInfo: js.Any): P13nSortPanel = js.native
  /**
    * Destroys all the sortItems in the aggregation <code>sortItems</code>.
    * @since 1.26
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySortItems(): P13nSortPanel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>addSortItem</code> event of this
    * <code>sap.m.P13nSortPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAddSortItem(fnFunction: js.Any, oListener: js.Any): P13nSortPanel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>removeSortItem</code> event of this
    * <code>sap.m.P13nSortPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachRemoveSortItem(fnFunction: js.Any, oListener: js.Any): P13nSortPanel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>updateSortItem</code> event of this
    * <code>sap.m.P13nSortPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUpdateSortItem(fnFunction: js.Any, oListener: js.Any): P13nSortPanel = js.native
  /**
    * Fires event <code>addSortItem</code> to attached listeners.
    * @since 1.26
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAddSortItem(mArguments: js.Any): P13nSortPanel = js.native
  /**
    * Fires event <code>removeSortItem</code> to attached listeners.
    * @since 1.26
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireRemoveSortItem(mArguments: js.Any): P13nSortPanel = js.native
  /**
    * Fires event <code>updateSortItem</code> to attached listeners.
    * @since 1.26
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUpdateSortItem(mArguments: js.Any): P13nSortPanel = js.native
  /**
    * Gets current value of property <code>containerQuery</code>.defines if the mediaQuery or a
    * ContainerResize will be used for layout update. When the ConditionPanel is used on a dialog
    * theproperty should be set to true!Default value is <code>false</code>.
    * @since 1.26
    * @returns Value of property <code>containerQuery</code>
    */
  def getContainerQuery(): Boolean = js.native
  /**
    * Gets current value of property <code>layoutMode</code>.can be used to control the layout behavior.
    * Default is "" which will automatically change the layout. With "Desktop", "Table"or"Phone" you can
    * set a fixed layout.
    * @since 1.26
    * @returns Value of property <code>layoutMode</code>
    */
  def getLayoutMode(): String = js.native
  /**
    * Gets content of aggregation <code>sortItems</code>.defined Sort Items
    * @since 1.26
    */
  def getSortItems(): js.Array[P13nSortItem] = js.native
  /**
    * Checks for the provided <code>sap.m.P13nSortItem</code> in the aggregation
    * <code>sortItems</code>.and returns its index if found or -1 otherwise.
    * @since 1.26
    * @param oSortItem The sortItem whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSortItem(oSortItem: P13nSortItem): Double = js.native
  /**
    * Inserts a sortItem into the aggregation <code>sortItems</code>.
    * @since 1.26
    * @param oSortItem the sortItem to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the sortItem should be inserted at; for             a
    * negative value of <code>iIndex</code>, the sortItem is inserted at position 0; for a value          
    *   greater than the current size of the aggregation, the sortItem is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSortItem(oSortItem: P13nSortItem, iIndex: Double): P13nSortPanel = js.native
  /**
    * Removes all the controls from the aggregation <code>sortItems</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @since 1.26
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSortItems(): js.Array[P13nSortItem] = js.native
  /**
    * removes all invalid sort conditions.
    * @since 1.28
    */
  def removeInvalidConditions(): Unit = js.native
  def removeSortItem(vSortItem: String): P13nSortItem = js.native
  /**
    * Removes a sortItem from the aggregation <code>sortItems</code>.
    * @since 1.26
    * @param vSortItem The sortItem to remove or its index or id
    * @returns The removed sortItem or <code>null</code>
    */
  def removeSortItem(vSortItem: Double): P13nSortItem = js.native
  def removeSortItem(vSortItem: P13nSortItem): P13nSortItem = js.native
  /**
    * removes all errors/warning states from of all sort conditions.
    * @since 1.28
    */
  def removeValidationErrors(): Unit = js.native
  /**
    * Sets a new value for property <code>containerQuery</code>.defines if the mediaQuery or a
    * ContainerResize will be used for layout update. When the ConditionPanel is used on a dialog
    * theproperty should be set to true!When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.26
    * @param bContainerQuery New value for property <code>containerQuery</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContainerQuery(bContainerQuery: Boolean): P13nSortPanel = js.native
  /**
    * Sets a new value for property <code>layoutMode</code>.can be used to control the layout behavior.
    * Default is "" which will automatically change the layout. With "Desktop", "Table"or"Phone" you can
    * set a fixed layout.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @since 1.26
    * @param sLayoutMode New value for property <code>layoutMode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLayoutMode(sLayoutMode: String): P13nSortPanel = js.native
  /**
    * setter for the supported operations array
    * @since 1.26
    * @param array of operations [sap.m.P13nConditionOperation.BT, sap.m.P13nConditionOperation.EQ]
    * @returns this for chaining
    */
  def setOperations(array: js.Array[_]): P13nSortPanel = js.native
  /**
    * Unbinds aggregation <code>sortItems</code> from model data.
    * @since 1.26
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindSortItems(): P13nSortPanel = js.native
  /**
    * check if the entered/modified conditions are correct, marks invalid fields yellow (Warning state)
    * and opens a popup message dialog to give theuser the feedback that some values are wrong or missing.
    * @since 1.26
    */
  def validateConditions(): Unit = js.native
}

