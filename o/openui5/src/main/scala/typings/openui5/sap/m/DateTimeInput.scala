package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.TextAlign
import typings.openui5.sap.ui.core.TextDirection
import typings.openui5.sap.ui.core.ValueState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.DateTimeInput")
@js.native
class DateTimeInput protected () extends Control {
  /**
    * Constructor for a new DateTimeInput.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): DateTimeInput = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): DateTimeInput = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>change</code> event of this
    * <code>sap.m.DateTimeInput</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.DateTimeInput</code> itself.This event gets fired when the selection has
    * finished and the value has changed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.DateTimeInput</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachChange(oData: js.Any, fnFunction: js.Any): DateTimeInput = js.native
  def attachChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): DateTimeInput = js.native
  /**
    * Binds property <code>value</code> to model data.See {@link sap.ui.base.ManagedObject#bindProperty
    * ManagedObject.bindProperty} for a detailed description of the possible properties of
    * <code>oBindingInfo</code>
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindValue(oBindingInfo: js.Any): DateTimeInput = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>change</code> event of this
    * <code>sap.m.DateTimeInput</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachChange(fnFunction: js.Any, oListener: js.Any): DateTimeInput = js.native
  /**
    * Fires event <code>change</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>string</code>The string value of the control in
    * given valueFormat (or locale format).</li><li><code>dateValue</code> of type <code>object</code>The
    * value of control as JavaScript Date Object or null if value is empty.</li><li><code>valid</code> of
    * type <code>boolean</code>if set, the entered value is a valid date.If not set the entered value
    * cannot be converted to a date.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireChange(mArguments: js.Any): DateTimeInput = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.27.0
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>dateValue</code>.This property as JavaScript Date Object can be
    * used to assign a new value which is independent from valueFormat.
    * @returns Value of property <code>dateValue</code>
    */
  def getDateValue(): js.Any = js.native
  /**
    * Gets current value of property <code>displayFormat</code>.Displays date value in this given format
    * in text field. Default value is taken from locale settings.If you use data-binding on value property
    * with type sap.ui.model.type.Date then you can ignore this property or the latter wins.If the user's
    * browser supports native picker then this property is overwritten by browser with locale settings.
    * @returns Value of property <code>displayFormat</code>
    */
  def getDisplayFormat(): String = js.native
  /**
    * Gets current value of property <code>editable</code>.Defines whether the control can be modified by
    * the user or not.<b>Note:</b> A user can tab to non-editable control, highlight it, and copy the text
    * from it.Default value is <code>true</code>.
    * @since 1.12.0
    * @returns Value of property <code>editable</code>
    */
  def getEditable(): Boolean = js.native
  /**
    * Gets current value of property <code>enabled</code>.Indicates whether the user can interact with the
    * control or not.<b>Note:</b> Disabled controls cannot be focused and they are out of the
    * tab-chain.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  /**
    * Gets current value of property <code>name</code>.Defines the name of the control for the purposes of
    * form submission.
    * @returns Value of property <code>name</code>
    */
  def getName(): String = js.native
  /**
    * Gets current value of property <code>placeholder</code>.Defines a short hint intended to aid the
    * user with data entry when the control has no value.
    * @returns Value of property <code>placeholder</code>
    */
  def getPlaceholder(): String = js.native
  /**
    * Gets current value of property <code>showValueStateMessage</code>.Indicates whether the value state
    * message should be shown or not.Default value is <code>true</code>.
    * @since 1.26.0
    * @returns Value of property <code>showValueStateMessage</code>
    */
  def getShowValueStateMessage(): Boolean = js.native
  /**
    * Gets current value of property <code>textAlign</code>.Defines the horizontal alignment of the text
    * that is shown inside the input field.Default value is <code>Initial</code>.
    * @since 1.26.0
    * @returns Value of property <code>textAlign</code>
    */
  def getTextAlign(): TextAlign = js.native
  /**
    * Gets current value of property <code>textDirection</code>.Defines the text directionality of the
    * input field, e.g. <code>RTL</code>, <code>LTR</code>Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): TextDirection = js.native
  /**
    * Gets current value of property <code>type</code>.Type of DateTimeInput (e.g. Date, Time,
    * DateTime)Default value is <code>Date</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): DateTimeInputType = js.native
  /**
    * Gets current value of property <code>value</code>.Defines the value of the control.The new value
    * must be in the format set by <code>valueFormat</code>.The "Now" literal can also be assigned as a
    * parameter to show the current date and/or time.
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  /**
    * Gets current value of property <code>valueFormat</code>.Given value property should match with
    * valueFormat to parse date. Default value is taken from locale settings.You can only set and get
    * value in this format.If you use data-binding on value property with type sap.ui.model.type.Date you
    * can ignore this property or the latter wins.
    * @returns Value of property <code>valueFormat</code>
    */
  def getValueFormat(): String = js.native
  /**
    * Gets current value of property <code>valueState</code>.Visualizes the validation state of the
    * control, e.g. <code>Error</code>, <code>Warning</code>, <code>Success</code>.Default value is
    * <code>None</code>.
    * @returns Value of property <code>valueState</code>
    */
  def getValueState(): ValueState = js.native
  /**
    * Gets current value of property <code>valueStateText</code>.Defines the text that appears in the
    * value state message pop-up. If this is not specified, a default text is shown from the resource
    * bundle.
    * @since 1.26.0
    * @returns Value of property <code>valueStateText</code>
    */
  def getValueStateText(): String = js.native
  /**
    * Gets current value of property <code>width</code>.Defines the width of the control.Default value is
    * <code>100%</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  /**
    * Sets a new value for property <code>dateValue</code>.This property as JavaScript Date Object can be
    * used to assign a new value which is independent from valueFormat.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param oDateValue New value for property <code>dateValue</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDateValue(oDateValue: js.Any): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>displayFormat</code>.Displays date value in this given format in
    * text field. Default value is taken from locale settings.If you use data-binding on value property
    * with type sap.ui.model.type.Date then you can ignore this property or the latter wins.If the user's
    * browser supports native picker then this property is overwritten by browser with locale
    * settings.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sDisplayFormat New value for property <code>displayFormat</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDisplayFormat(sDisplayFormat: String): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>editable</code>.Defines whether the control can be modified by
    * the user or not.<b>Note:</b> A user can tab to non-editable control, highlight it, and copy the text
    * from it.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @since 1.12.0
    * @param bEditable New value for property <code>editable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEditable(bEditable: Boolean): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>enabled</code>.Indicates whether the user can interact with the
    * control or not.<b>Note:</b> Disabled controls cannot be focused and they are out of the
    * tab-chain.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>name</code>.Defines the name of the control for the purposes of
    * form submission.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: String): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>placeholder</code>.Defines a short hint intended to aid the user
    * with data entry when the control has no value.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sPlaceholder New value for property <code>placeholder</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPlaceholder(sPlaceholder: String): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>showValueStateMessage</code>.Indicates whether the value state
    * message should be shown or not.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @since 1.26.0
    * @param bShowValueStateMessage New value for property <code>showValueStateMessage</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowValueStateMessage(bShowValueStateMessage: Boolean): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>textAlign</code>.Defines the horizontal alignment of the text
    * that is shown inside the input field.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Initial</code>.
    * @since 1.26.0
    * @param sTextAlign New value for property <code>textAlign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextAlign(sTextAlign: TextAlign): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>textDirection</code>.Defines the text directionality of the
    * input field, e.g. <code>RTL</code>, <code>LTR</code>When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Inherit</code>.
    * @since 1.28.0
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: TextDirection): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>type</code>.Type of DateTimeInput (e.g. Date, Time,
    * DateTime)When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>Date</code>.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: DateTimeInputType): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>value</code>.Defines the value of the control.The new value must
    * be in the format set by <code>valueFormat</code>.The "Now" literal can also be assigned as a
    * parameter to show the current date and/or time.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>valueFormat</code>.Given value property should match with
    * valueFormat to parse date. Default value is taken from locale settings.You can only set and get
    * value in this format.If you use data-binding on value property with type sap.ui.model.type.Date you
    * can ignore this property or the latter wins.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sValueFormat New value for property <code>valueFormat</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueFormat(sValueFormat: String): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>valueState</code>.Visualizes the validation state of the
    * control, e.g. <code>Error</code>, <code>Warning</code>, <code>Success</code>.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>None</code>.
    * @param sValueState New value for property <code>valueState</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueState(sValueState: ValueState): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>valueStateText</code>.Defines the text that appears in the value
    * state message pop-up. If this is not specified, a default text is shown from the resource
    * bundle.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @since 1.26.0
    * @param sValueStateText New value for property <code>valueStateText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueStateText(sValueStateText: String): DateTimeInput = js.native
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the control.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100%</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): DateTimeInput = js.native
  /**
    * Unbinds property <code>value</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindValue(): DateTimeInput = js.native
}

