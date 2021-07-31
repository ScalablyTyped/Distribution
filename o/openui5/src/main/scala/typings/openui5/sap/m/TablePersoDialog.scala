package typings.openui5.sap.m

import typings.openui5.sap.ui.base.ManagedObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablePersoDialog
  extends StObject
     with ManagedObject {
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>cancel</code> event of this
    * <code>sap.m.TablePersoDialog</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TablePersoDialog</code> itself.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TablePersoDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachCancel(oData: js.Any, fnFunction: js.Any): TablePersoDialog = js.native
  def attachCancel(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TablePersoDialog = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>confirm</code> event of this
    * <code>sap.m.TablePersoDialog</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TablePersoDialog</code> itself.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TablePersoDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachConfirm(oData: js.Any, fnFunction: js.Any): TablePersoDialog = js.native
  def attachConfirm(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TablePersoDialog = js.native
  
  /**
    * Destroys the persoService in the aggregation <code>persoService</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyPersoService(): TablePersoDialog = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>cancel</code> event of this
    * <code>sap.m.TablePersoDialog</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachCancel(fnFunction: js.Any, oListener: js.Any): TablePersoDialog = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>confirm</code> event of this
    * <code>sap.m.TablePersoDialog</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachConfirm(fnFunction: js.Any, oListener: js.Any): TablePersoDialog = js.native
  
  /**
    * Fires event <code>cancel</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireCancel(mArguments: js.Any): TablePersoDialog = js.native
  
  /**
    * Fires event <code>confirm</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireConfirm(mArguments: js.Any): TablePersoDialog = js.native
  
  /**
    * Gets current value of property <code>columnInfoCallback</code>.
    * @returns Value of property <code>columnInfoCallback</code>
    */
  def getColumnInfoCallback(): js.Any = js.native
  
  /**
    * Gets current value of property <code>contentHeight</code>.
    * @returns Value of property <code>contentHeight</code>
    */
  def getContentHeight(): js.Any = js.native
  
  /**
    * Gets current value of property <code>contentWidth</code>.
    * @returns Value of property <code>contentWidth</code>
    */
  def getContentWidth(): js.Any = js.native
  
  /**
    * Gets current value of property <code>hasGrouping</code>.
    * @returns Value of property <code>hasGrouping</code>
    */
  def getHasGrouping(): Boolean = js.native
  
  /**
    * Gets current value of property <code>initialColumnState</code>.
    * @returns Value of property <code>initialColumnState</code>
    */
  def getInitialColumnState(): js.Any = js.native
  
  /**
    * ID of the element which is the current target of the association <code>persoDialogFor</code>, or
    * <code>null</code>.
    */
  def getPersoDialogFor(): js.Any = js.native
  
  /**
    * Gets current value of property <code>persoMap</code>.
    * @returns Value of property <code>persoMap</code>
    */
  def getPersoMap(): js.Any = js.native
  
  /**
    * Gets content of aggregation <code>persoService</code>.Refers to the service for reading and writing
    * the personalization.
    */
  def getPersoService(): js.Any = js.native
  
  /**
    * Gets current value of property <code>showResetAll</code>.
    * @returns Value of property <code>showResetAll</code>
    */
  def getShowResetAll(): Boolean = js.native
  
  /**
    * Gets current value of property <code>showSelectAll</code>.
    * @returns Value of property <code>showSelectAll</code>
    */
  def getShowSelectAll(): Boolean = js.native
  
  /**
    * Initializes the TablePersoDialog instance after creation.
    */
  def init(): Unit = js.native
  
  /**
    * Sets the content of the dialog, being list items representingthe associated table's column settings,
    * and opens the dialog
    */
  def open(): Unit = js.native
  
  /**
    * Returns the personalizations made. Currently supportsa 'columns' property which holds an array of
    * settings,one element per column in the associated table. The elementcontains column-specific
    * information as follows: id: column id;order: new order; text: the column's header text that was
    * displayedin the dialog; visible: visibility (true or false).
    * @returns the personalization data
    */
  def retrievePersonalizations(): js.Any = js.native
  
  /**
    * Sets a new value for property <code>columnInfoCallback</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param oColumnInfoCallback New value for property <code>columnInfoCallback</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnInfoCallback(oColumnInfoCallback: js.Any): TablePersoDialog = js.native
  
  /**
    * Sets a new value for property <code>contentHeight</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sContentHeight New value for property <code>contentHeight</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContentHeight(sContentHeight: js.Any): TablePersoDialog = js.native
  
  /**
    * Sets a new value for property <code>contentWidth</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sContentWidth New value for property <code>contentWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContentWidth(sContentWidth: js.Any): TablePersoDialog = js.native
  
  /**
    * Setter to turn on/ switch off TablePersoDialog's grouping mode.
    * @param bHasGrouping groping mode on or off.
    * @returns the TablePersoDialog instance.
    */
  def setHasGrouping(bHasGrouping: Boolean): TablePersoDialog = js.native
  
  /**
    * Sets a new value for property <code>initialColumnState</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param oInitialColumnState New value for property <code>initialColumnState</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInitialColumnState(oInitialColumnState: js.Any): TablePersoDialog = js.native
  
  /**
    * Sets the associated <code>persoDialogFor</code>.
    * @param oPersoDialogFor ID of an element which becomes the new target of this persoDialogFor
    * association; alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPersoDialogFor(oPersoDialogFor: js.Any): TablePersoDialog = js.native
  def setPersoDialogFor(oPersoDialogFor: Table): TablePersoDialog = js.native
  
  /**
    * Sets a new value for property <code>persoMap</code>.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param oPersoMap New value for property <code>persoMap</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPersoMap(oPersoMap: js.Any): TablePersoDialog = js.native
  
  /**
    * Sets the aggregated <code>persoService</code>.
    * @param oPersoService The persoService to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPersoService(oPersoService: js.Any): TablePersoDialog = js.native
  
  /**
    * Setter to show/hide TablePersoDialog's 'Undo Personalization' button.
    * @param bShowResetAll 'undo Personalization' button visible or not.
    * @returns the TablePersoDialog instance.
    */
  def setShowResetAll(bShowResetAll: Boolean): TablePersoDialog = js.native
  
  /**
    * Setter to show/hide TablePersoDialog's 'selectAll' checkbox.
    * @param bShowSelectAll selectAll checkbox visible or not.
    * @returns the TablePersoDialog instance.
    */
  def setShowSelectAll(bShowSelectAll: Boolean): TablePersoDialog = js.native
}
