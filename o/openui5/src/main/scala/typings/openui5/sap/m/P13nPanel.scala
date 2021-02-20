package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait P13nPanel extends Control {
  
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @since 1.26.0
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: P13nItem): P13nPanel = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeNavigationTo</code> event of this
    * <code>sap.m.P13nPanel</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.P13nPanel</code> itself.Due to performance the data of the panel can be requested in
    * lazy mode e.g. when the panel is displayed
    * @since 1.28.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nPanel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeNavigationTo(oData: js.Any, fnFunction: js.Any): P13nPanel = js.native
  def attachBeforeNavigationTo(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nPanel = js.native
  
  /**
    * @since 1.28.0
    */
  def beforeNavigationTo(): Unit = js.native
  
  /**
    * Binds aggregation <code>items</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.26.0
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindItems(oBindingInfo: js.Any): P13nPanel = js.native
  
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @since 1.26.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): P13nPanel = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeNavigationTo</code> event of
    * this <code>sap.m.P13nPanel</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.28.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeNavigationTo(fnFunction: js.Any, oListener: js.Any): P13nPanel = js.native
  
  /**
    * Fires event <code>beforeNavigationTo</code> to attached listeners.
    * @since 1.28.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeNavigationTo(mArguments: js.Any): P13nPanel = js.native
  
  /**
    * Gets current value of property <code>changeNotifier</code>.Callback which notifies a change on this
    * panel.
    * @returns Value of property <code>changeNotifier</code>
    */
  def getChangeNotifier(): js.Any = js.native
  
  /**
    * Gets content of aggregation <code>items</code>.Aggregation of items
    * @since 1.26.0
    */
  def getItems(): js.Array[P13nItem] = js.native
  
  /**
    * This method can be overwritten by subclass in order to return a payload for Ok action
    * @since 1.26.7
    */
  def getOkPayload(): Unit = js.native
  
  /**
    * This method can be overwritten by subclass in order to return a payload for Reset action
    * @since 1.28.0
    */
  def getResetPayload(): Unit = js.native
  
  /**
    * Gets current value of property <code>title</code>.Title text appears in the panel.
    * @since 1.26.0
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  
  /**
    * Gets current value of property <code>titleLarge</code>.Large title text appears e.g. in dialog
    * header in case that only one panel is shown.
    * @since 1.30.0
    * @returns Value of property <code>titleLarge</code>
    */
  def getTitleLarge(): String = js.native
  
  /**
    * Gets current value of property <code>type</code>.Panel type for generic use. Due to extensibility
    * reason the type of <code>type</code> property should be <code>string</code>.So it is feasible to add
    * a custom panel without expanding the type.
    * @since 1.26.0
    * @returns Value of property <code>type</code>
    */
  def getType(): String = js.native
  
  /**
    * Gets current value of property <code>validationExecutor</code>.Callback method which is called in
    * order to validate end user entry.
    * @returns Value of property <code>validationExecutor</code>
    */
  def getValidationExecutor(): js.Any = js.native
  
  /**
    * Gets current value of property <code>validationListener</code>.Callback method which is called in
    * order to register for validation result.
    * @returns Value of property <code>validationListener</code>
    */
  def getValidationListener(): js.Any = js.native
  
  /**
    * Gets current value of property <code>verticalScrolling</code>.Enables the vertical Scrolling on the
    * P13nDialog when the panel is shown.Default value is <code>true</code>.
    * @since 1.26.0
    * @returns Value of property <code>verticalScrolling</code>
    */
  def getVerticalScrolling(): Boolean = js.native
  
  /**
    * Checks for the provided <code>sap.m.P13nItem</code> in the aggregation <code>items</code>.and
    * returns its index if found or -1 otherwise.
    * @since 1.26.0
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: P13nItem): Double = js.native
  
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @since 1.26.0
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: P13nItem, iIndex: Double): P13nPanel = js.native
  
  /**
    * This method can be overwritten by subclass in order to cleanup after navigation, e.g. to remove
    * invalid content on the panel.
    * @since 1.28.0
    */
  def onAfterNavigationFrom(): Unit = js.native
  
  /**
    * This method can be overwritten by subclass in order to prevent navigation to another panel. This
    * could be the case if some content on the panelis considered 'invalid'.
    * @since 1.28.0
    * @returns true if it is allowed to navigate away from this panel, false if it is not allowed
    */
  def onBeforeNavigationFrom(): Boolean = js.native
  
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @since 1.26.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[P13nItem] = js.native
  
  def removeItem(vItem: String): P13nItem = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @since 1.26.0
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): P13nItem = js.native
  def removeItem(vItem: P13nItem): P13nItem = js.native
  
  /**
    * Sets a new value for property <code>changeNotifier</code>.Callback which notifies a change on this
    * panel.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param oChangeNotifier New value for property <code>changeNotifier</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setChangeNotifier(oChangeNotifier: js.Any): P13nPanel = js.native
  
  /**
    * Sets a new value for property <code>title</code>.Title text appears in the panel.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.26.0
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): P13nPanel = js.native
  
  /**
    * Sets a new value for property <code>titleLarge</code>.Large title text appears e.g. in dialog header
    * in case that only one panel is shown.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.30.0
    * @param sTitleLarge New value for property <code>titleLarge</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitleLarge(sTitleLarge: String): P13nPanel = js.native
  
  /**
    * Sets a new value for property <code>type</code>.Panel type for generic use. Due to extensibility
    * reason the type of <code>type</code> property should be <code>string</code>.So it is feasible to add
    * a custom panel without expanding the type.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.26.0
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: String): P13nPanel = js.native
  
  /**
    * Sets a new value for property <code>validationExecutor</code>.Callback method which is called in
    * order to validate end user entry.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param oValidationExecutor New value for property <code>validationExecutor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValidationExecutor(oValidationExecutor: js.Any): P13nPanel = js.native
  
  /**
    * Sets a new value for property <code>validationListener</code>.Callback method which is called in
    * order to register for validation result.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param oValidationListener New value for property <code>validationListener</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValidationListener(oValidationListener: js.Any): P13nPanel = js.native
  
  /**
    * Sets a new value for property <code>verticalScrolling</code>.Enables the vertical Scrolling on the
    * P13nDialog when the panel is shown.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @since 1.26.0
    * @param bVerticalScrolling New value for property <code>verticalScrolling</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVerticalScrolling(bVerticalScrolling: Boolean): P13nPanel = js.native
  
  /**
    * Unbinds aggregation <code>items</code> from model data.
    * @since 1.26.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindItems(): P13nPanel = js.native
}
