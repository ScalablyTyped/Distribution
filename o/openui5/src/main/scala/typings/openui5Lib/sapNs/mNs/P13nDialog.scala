package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.P13nDialog")
@js.native
class P13nDialog protected () extends Dialog {
  /**
    * Constructor for a new P13nDialog.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some panel to the aggregation <code>panels</code>.
    * @since 1.26.0
    * @param oPanel the panel to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addPanel(oPanel: P13nPanel): P13nDialog = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>cancel</code> event of this
    * <code>sap.m.P13nDialog</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.P13nDialog</code> itself.Event fired if the 'cancel' button in P13nDialog is clicked.
    * @since 1.26.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachCancel(oData: js.Any, fnFunction: js.Any): P13nDialog = js.native
  def attachCancel(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nDialog = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>ok</code> event of this
    * <code>sap.m.P13nDialog</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.P13nDialog</code> itself.Event fired if the 'ok' button in P13nDialog is clicked.
    * @since 1.26.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachOk(oData: js.Any, fnFunction: js.Any): P13nDialog = js.native
  def attachOk(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nDialog = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>reset</code> event of this
    * <code>sap.m.P13nDialog</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.P13nDialog</code> itself.Event fired if the 'reset' button in P13nDialog is clicked.
    * @since 1.26.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.P13nDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachReset(oData: js.Any, fnFunction: js.Any): P13nDialog = js.native
  def attachReset(oData: js.Any, fnFunction: js.Any, oListener: js.Any): P13nDialog = js.native
  /**
    * Binds aggregation <code>panels</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.26.0
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindPanels(oBindingInfo: js.Any): P13nDialog = js.native
  /**
    * Destroys all the panels in the aggregation <code>panels</code>.
    * @since 1.26.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyPanels(): P13nDialog = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>cancel</code> event of this
    * <code>sap.m.P13nDialog</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.26.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachCancel(fnFunction: js.Any, oListener: js.Any): P13nDialog = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>ok</code> event of this
    * <code>sap.m.P13nDialog</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.26.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachOk(fnFunction: js.Any, oListener: js.Any): P13nDialog = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>reset</code> event of this
    * <code>sap.m.P13nDialog</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.26.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachReset(fnFunction: js.Any, oListener: js.Any): P13nDialog = js.native
  /**
    * Fires event <code>cancel</code> to attached listeners.
    * @since 1.26.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireCancel(mArguments: js.Any): P13nDialog = js.native
  /**
    * Fires event <code>ok</code> to attached listeners.
    * @since 1.26.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireOk(mArguments: js.Any): P13nDialog = js.native
  /**
    * Fires event <code>reset</code> to attached listeners.
    * @since 1.26.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireReset(mArguments: js.Any): P13nDialog = js.native
  /**
    * Gets current value of property <code>initialVisiblePanelType</code>.This property determines which
    * panel is initially shown when dialog is opened. Due to extensibility reason the type should
    * be<code>string</code>. So it is feasible to add a custom panel without expanding the type.
    * @since 1.26.0
    * @returns Value of property <code>initialVisiblePanelType</code>
    */
  def getInitialVisiblePanelType(): java.lang.String = js.native
  /**
    * Gets content of aggregation <code>panels</code>.The dialog panels displayed in the dialog.
    * @since 1.26.0
    */
  def getPanels(): js.Array[P13nPanel] = js.native
  /**
    * Gets current value of property <code>showReset</code>.This property determines whether the 'Restore'
    * button is shown inside the dialog. If this property is set to true, clicking the'Reset' button will
    * trigger the <code>reset</code> event sending a notification that model data must be reset.Default
    * value is <code>false</code>.
    * @since 1.26.0
    * @returns Value of property <code>showReset</code>
    */
  def getShowReset(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>showResetEnabled</code>.This property determines whether the
    * 'Restore' button is enabled and is taken into account only if <code>showReset</code> is setto
    * <code>true</code>.Default value is <code>false</code>.
    * @since 1.36.0
    * @returns Value of property <code>showResetEnabled</code>
    */
  def getShowResetEnabled(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>validationExecutor</code>.Calls the validation listener once
    * all panel-relevant validation checks have been done. This callback function is called in orderto
    * perform cross-model validation checks.
    * @returns Value of property <code>validationExecutor</code>
    */
  def getValidationExecutor(): js.Any = js.native
  /**
    * Returns visible panel.
    * @since 1.26.0
    */
  def getVisiblePanel(): P13nPanel | js.Any = js.native
  /**
    * Checks for the provided <code>sap.m.P13nPanel</code> in the aggregation <code>panels</code>.and
    * returns its index if found or -1 otherwise.
    * @since 1.26.0
    * @param oPanel The panel whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfPanel(oPanel: P13nPanel): scala.Double = js.native
  /**
    * Inserts a panel into the aggregation <code>panels</code>.
    * @since 1.26.0
    * @param oPanel the panel to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the panel should be inserted at; for             a
    * negative value of <code>iIndex</code>, the panel is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the panel is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertPanel(oPanel: P13nPanel, iIndex: scala.Double): P13nDialog = js.native
  /**
    * Removes all the controls from the aggregation <code>panels</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @since 1.26.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllPanels(): js.Array[P13nPanel] = js.native
  def removePanel(vPanel: java.lang.String): P13nPanel = js.native
  def removePanel(vPanel: P13nPanel): P13nPanel = js.native
  /**
    * Removes a panel from the aggregation <code>panels</code>.
    * @since 1.26.0
    * @param vPanel The panel to remove or its index or id
    * @returns The removed panel or <code>null</code>
    */
  def removePanel(vPanel: scala.Double): P13nPanel = js.native
  /**
    * Sets a new value for property <code>initialVisiblePanelType</code>.This property determines which
    * panel is initially shown when dialog is opened. Due to extensibility reason the type should
    * be<code>string</code>. So it is feasible to add a custom panel without expanding the type.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @since 1.26.0
    * @param sInitialVisiblePanelType New value for property <code>initialVisiblePanelType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInitialVisiblePanelType(sInitialVisiblePanelType: java.lang.String): P13nDialog = js.native
  /**
    * Sets a new value for property <code>showReset</code>.This property determines whether the 'Restore'
    * button is shown inside the dialog. If this property is set to true, clicking the'Reset' button will
    * trigger the <code>reset</code> event sending a notification that model data must be reset.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @since 1.26.0
    * @param bShowReset New value for property <code>showReset</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowReset(bShowReset: scala.Boolean): P13nDialog = js.native
  /**
    * Sets a new value for property <code>showResetEnabled</code>.This property determines whether the
    * 'Restore' button is enabled and is taken into account only if <code>showReset</code> is setto
    * <code>true</code>.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @since 1.36.0
    * @param bShowResetEnabled New value for property <code>showResetEnabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowResetEnabled(bShowResetEnabled: scala.Boolean): P13nDialog = js.native
  /**
    * Sets a new value for property <code>validationExecutor</code>.Calls the validation listener once all
    * panel-relevant validation checks have been done. This callback function is called in orderto perform
    * cross-model validation checks.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param oValidationExecutor New value for property <code>validationExecutor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValidationExecutor(oValidationExecutor: js.Any): P13nDialog = js.native
  /**
    * Unbinds aggregation <code>panels</code> from model data.
    * @since 1.26.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindPanels(): P13nDialog = js.native
}

