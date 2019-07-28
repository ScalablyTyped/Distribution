package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.P13nColumnsPanel")
@js.native
class P13nColumnsPanel protected () extends P13nPanel {
  /**
    * Constructor for a new P13nColumnsPanel.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Add ColumnsItem to columnsItems aggregation
    * @since 1.26.0
    * @param oColumnsItem is the new ColumnsItem that shall be added
    * @returns <code>this</code> to allow method chaining.
    */
  def addColumnsItem(oColumnsItem: P13nColumnsItem): P13nColumnsPanel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>addColumnsItem</code> event of this
    * <code>sap.m.P13nColumnsPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nColumnsPanel</code> itself.Event raised when a <code>columnsItem</code> is
    * added.
    * @since 1.26.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nColumnsPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAddColumnsItem(oData: js.Any, fnFunction: js.Any): P13nColumnsPanel = js.native
  def attachAddColumnsItem(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nColumnsPanel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>changeColumnsItems</code> event of this
    * <code>sap.m.P13nColumnsPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nColumnsPanel</code> itself.Event raised if <code>columnsItems</code> is
    * changed or new one needs to be created in the model.
    * @since 1.26.7
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nColumnsPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachChangeColumnsItems(oData: js.Any, fnFunction: js.Any): P13nColumnsPanel = js.native
  def attachChangeColumnsItems(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nColumnsPanel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>setData</code> event of this
    * <code>sap.m.P13nColumnsPanel</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.P13nColumnsPanel</code> itself.Event raised if <code>setData</code> is called in
    * model. The event serves the purpose of minimizing such calls since they cantake up a lot of
    * performance.
    * @since 1.26.7
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nColumnsPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSetData(oData: js.Any, fnFunction: js.Any): P13nColumnsPanel = js.native
  def attachSetData(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nColumnsPanel = js.native
  /**
    * Binds aggregation <code>columnsItems</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.26.0
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindColumnsItems(oBindingInfo: js.Any): P13nColumnsPanel = js.native
  /**
    * Destroy all instances from columnsItems aggregation
    * @since 1.26.0
    * @returns <code>this</code> to allow method chaining.
    */
  def destroyColumnsItems(): P13nColumnsPanel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>addColumnsItem</code> event of this
    * <code>sap.m.P13nColumnsPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAddColumnsItem(fnFunction: js.Any, oListener: js.Any): P13nColumnsPanel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>changeColumnsItems</code> event of
    * this <code>sap.m.P13nColumnsPanel</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @since 1.26.7
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachChangeColumnsItems(fnFunction: js.Any, oListener: js.Any): P13nColumnsPanel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>setData</code> event of this
    * <code>sap.m.P13nColumnsPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26.7
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSetData(fnFunction: js.Any, oListener: js.Any): P13nColumnsPanel = js.native
  /**
    * Fires event <code>addColumnsItem</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>newItem</code> of type
    * <code>sap.m.P13nColumnsItem</code><code>columnsItem</code> that needs to be added in the
    * model.</li></ul>
    * @since 1.26.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAddColumnsItem(mArguments: js.Any): P13nColumnsPanel = js.native
  /**
    * Fires event <code>changeColumnsItems</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>newItems</code> of type <code>sap.m.P13nColumnsItem[]</code>Contains
    * <code>columnsItems</code> that needs to be created in the model.</li><li><code>existingItems</code>
    * of type <code>sap.m.P13nColumnsItem[]</code>Contains <code>columnsItems</code> that needs to be
    * changed in the model.</li></ul>
    * @since 1.26.7
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireChangeColumnsItems(mArguments: js.Any): P13nColumnsPanel = js.native
  /**
    * Fires event <code>setData</code> to attached listeners.
    * @since 1.26.7
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSetData(mArguments: js.Any): P13nColumnsPanel = js.native
  /**
    * Gets content of aggregation <code>columnsItems</code>.List of columns that has been changed.
    * @since 1.26.0
    */
  def getColumnsItems(): js.Array[P13nColumnsItem] = js.native
  /**
    * Gets current value of property <code>visibleItemsThreshold</code>.Specifies a threshold of visible
    * items. If the end user makes a lot of columns visible, this might cause performance to slow
    * down.When this happens, the user can receive a corresponding warning triggered by the
    * <code>visibleItemsThreshold</code> property. Theproperty needs to be activated and set to the
    * required value by the consuming application to ensure that the warning message isshown when the
    * threshold has been exceeded. In the following example the message will be shown if more than 100
    * visible columns areselected:<pre>customData&gt;core:CustomData
    * key=&quot;p13nDialogSettings&quot;value='\{&quot;columns&quot;:\{&quot;visible&quot;: true,
    * &quot;payload&quot;: \{&quot;visibleItemsThreshold&quot;: 3\}\}\}' /&gt;/customData&gt;</pre>Default
    * value is <code>-1</code>.
    * @since 1.26.7
    * @returns Value of property <code>visibleItemsThreshold</code>
    */
  def getVisibleItemsThreshold(): Double = js.native
  /**
    * Checks for the provided <code>sap.m.P13nColumnsItem</code> in the aggregation
    * <code>columnsItems</code>.and returns its index if found or -1 otherwise.
    * @since 1.26.0
    * @param oColumnsItem The columnsItem whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfColumnsItem(oColumnsItem: P13nColumnsItem): Double = js.native
  /**
    * Insert ColumnsItem to columnsItems aggregation
    * @since 1.26.0
    * @param iIndex is the index where the columnsItem item shall be inserted
    * @param oColumnsItem is the new columnsItem that shall be inserted
    * @returns <code>this</code> to allow method chaining.
    */
  def insertColumnsItem(iIndex: Double, oColumnsItem: P13nColumnsItem): P13nColumnsPanel = js.native
  /**
    * This method does a re-initialization of the panel
    * @since 1.28
    */
  def reInitialize(): Unit = js.native
  /**
    * Remove all ColumnsItems from columnsItems aggregation
    * @since 1.26.0
    * @returns An array of the removed items (might be empty).
    */
  def removeAllColumnsItems(): js.Array[P13nColumnsItem] = js.native
  /**
    * Remove ColumnsItem from columnsItems aggregation
    * @since 1.26.0
    * @param oColumnsItem is the ColumnsItem that shall be removed
    * @returns The removed item or null.
    */
  def removeColumnsItem(oColumnsItem: P13nColumnsItem): P13nColumnsItem = js.native
  /**
    * Sets a new value for property <code>visibleItemsThreshold</code>.Specifies a threshold of visible
    * items. If the end user makes a lot of columns visible, this might cause performance to slow
    * down.When this happens, the user can receive a corresponding warning triggered by the
    * <code>visibleItemsThreshold</code> property. Theproperty needs to be activated and set to the
    * required value by the consuming application to ensure that the warning message isshown when the
    * threshold has been exceeded. In the following example the message will be shown if more than 100
    * visible columns areselected:<pre>customData&gt;core:CustomData
    * key=&quot;p13nDialogSettings&quot;value='\{&quot;columns&quot;:\{&quot;visible&quot;: true,
    * &quot;payload&quot;: \{&quot;visibleItemsThreshold&quot;: 3\}\}\}' /&gt;/customData&gt;</pre>When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>-1</code>.
    * @since 1.26.7
    * @param iVisibleItemsThreshold New value for property <code>visibleItemsThreshold</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisibleItemsThreshold(iVisibleItemsThreshold: Double): P13nColumnsPanel = js.native
  /**
    * Unbinds aggregation <code>columnsItems</code> from model data.
    * @since 1.26.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindColumnsItems(): P13nColumnsPanel = js.native
}

