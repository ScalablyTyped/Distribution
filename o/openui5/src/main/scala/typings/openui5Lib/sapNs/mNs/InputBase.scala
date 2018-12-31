package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.InputBase")
@js.native
class InputBase protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new <code>sap.m.InputBase</code>.Accepts an object literal <code>mSettings</code>
    * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Use labels as placeholder configuration.It can be necessary for the subclasses to overwrite this
    * whennative placeholder usage causes undesired input events or whenplaceholder attribute is not
    * supported for the specified
    * type.https://html.spec.whatwg.org/multipage/forms.html#input-type-attr-summary
    */
  var bShowLabelAsPlaceholder: js.Any = js.native
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): InputBase = js.native
  def addAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): InputBase = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>change</code> event of this
    * <code>sap.m.InputBase</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.InputBase</code> itself.Is fired when the text in the input field has changed and the
    * focus leaves the input field or the enter key is pressed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.InputBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachChange(oData: js.Any, fnFunction: js.Any): InputBase = js.native
  def attachChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): InputBase = js.native
  /**
    * Registers an event listener to the browser input event.
    * @param fnCallback Function to be called when the value of the input element is changed.
    * @returns <code>this</code> to allow method chaining.
    */
  def bindToInputEvent(fnCallback: js.Any): InputBase = js.native
  /**
    * Binds property <code>value</code> to model data.See {@link sap.ui.base.ManagedObject#bindProperty
    * ManagedObject.bindProperty} for a detailed description of the possible properties of
    * <code>oBindingInfo</code>
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindValue(oBindingInfo: js.Any): InputBase = js.native
  /**
    * Close value state message popup.
    * @since 1.26
    */
  def closeValueStateMessage(): scala.Unit = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>change</code> event of this
    * <code>sap.m.InputBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachChange(fnFunction: js.Any, oListener: js.Any): InputBase = js.native
  /**
    * Fires event <code>change</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>string</code>The new <code>value</code> of the
    * <code>control</code>.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireChange(mArguments: js.Any): InputBase = js.native
  /**
    * Fires the change event for the listeners
    * @since 1.22.1
    * @param sValue value of the input.
    * @param oParams extra event parameters.
    */
  def fireChangeEvent(sValue: java.lang.String): scala.Unit = js.native
  def fireChangeEvent(sValue: java.lang.String, oParams: js.Any): scala.Unit = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.27.0
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets the reference element which the message popup should dock to.
    * @since 1.26
    * @returns DOM element which the message popup should dock to
    */
  def getDomRefForValueStateMessage(): js.Any = js.native
  /**
    * Gets current value of property <code>editable</code>.Defines whether the control can be modified by
    * the user or not.<b>Note:</b> A user can tab to non-editable control, highlight it, and copy the text
    * from it.Default value is <code>true</code>.
    * @since 1.12.0
    * @returns Value of property <code>editable</code>
    */
  def getEditable(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>enabled</code>.Indicates whether the user can interact with the
    * control or not.<b>Note:</b> Disabled controls cannot be focused and they are out of the
    * tab-chain.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>name</code>.Defines the name of the control for the purposes of
    * form submission.
    * @returns Value of property <code>name</code>
    */
  def getName(): java.lang.String = js.native
  /**
    * Gets current value of property <code>placeholder</code>.Defines a short hint intended to aid the
    * user with data entry when the control has no value.
    * @returns Value of property <code>placeholder</code>
    */
  def getPlaceholder(): java.lang.String = js.native
  /**
    * Gets current value of property <code>required</code>.Indicates that user input is required. This
    * property is only needed for accessibility purposes when a single relationship betweenthe field and a
    * label (see aggregation <code>labelFor</code> of <code>sap.m.Label</code>) cannot be established(e.g.
    * one label should label multiple fields).Default value is <code>false</code>.
    * @since 1.38.4
    * @returns Value of property <code>required</code>
    */
  def getRequired(): scala.Boolean = js.native
  /**
    * Retrieves the selected text.Only supported for input control's type of Text, Url, Tel and Password.
    * @since 1.32
    * @returns The selected text.
    */
  def getSelectedText(): java.lang.String = js.native
  /**
    * Gets current value of property <code>showValueStateMessage</code>.Indicates whether the value state
    * message should be shown or not.Default value is <code>true</code>.
    * @since 1.26.0
    * @returns Value of property <code>showValueStateMessage</code>
    */
  def getShowValueStateMessage(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>textAlign</code>.Defines the horizontal alignment of the text
    * that is shown inside the input field.Default value is <code>Initial</code>.
    * @since 1.26.0
    * @returns Value of property <code>textAlign</code>
    */
  def getTextAlign(): openui5Lib.sapNs.uiNs.coreNs.TextAlign = js.native
  /**
    * Gets current value of property <code>textDirection</code>.Defines the text directionality of the
    * input field, e.g. <code>RTL</code>, <code>LTR</code>Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): openui5Lib.sapNs.uiNs.coreNs.TextDirection = js.native
  /**
    * Gets current value of property <code>value</code>.Defines the value of the control.
    * @returns Value of property <code>value</code>
    */
  def getValue(): java.lang.String = js.native
  /**
    * Gets current value of property <code>valueState</code>.Visualizes the validation state of the
    * control, e.g. <code>Error</code>, <code>Warning</code>, <code>Success</code>.Default value is
    * <code>None</code>.
    * @returns Value of property <code>valueState</code>
    */
  def getValueState(): openui5Lib.sapNs.uiNs.coreNs.ValueState = js.native
  /**
    * Gets current value of property <code>valueStateText</code>.Defines the text that appears in the
    * value state message pop-up. If this is not specified, a default text is shown from the resource
    * bundle.
    * @since 1.26.0
    * @returns Value of property <code>valueStateText</code>
    */
  def getValueStateText(): java.lang.String = js.native
  /**
    * Gets current value of property <code>width</code>.Defines the width of the control.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Handles the change event.
    * @param oEvent undefined
    * @returns true when change event is fired
    */
  def onChange(oEvent: js.Any): scala.Boolean | js.Any = js.native
  /**
    * Hook method that gets called when the input value is reverted with hitting escape.It may require to
    * re-implement this method from sub classes for control specific behaviour.
    * @since 1.26
    * @param sValue Reverted value of the input.
    */
  def onValueRevertedByEscape(sValue: java.lang.String): scala.Unit = js.native
  /**
    * Open value state message popup.
    * @since 1.26
    */
  def openValueStateMessage(): scala.Unit = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: scala.Double): js.Any = js.native
  /**
    * Selects the text within the input field between the specified start and end positions.Only supported
    * for input control's type of Text, Url, Tel and Password.
    * @since 1.22.1
    * @param iSelectionStart The index into the text at which the first selected character is located.
    * @param iSelectionEnd The index into the text at which the last selected character is located.
    * @returns <code>this</code> to allow method chaining.
    */
  def selectText(iSelectionStart: scala.Double, iSelectionEnd: scala.Double): InputBase = js.native
  /**
    * Sets a new value for property <code>editable</code>.Defines whether the control can be modified by
    * the user or not.<b>Note:</b> A user can tab to non-editable control, highlight it, and copy the text
    * from it.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @since 1.12.0
    * @param bEditable New value for property <code>editable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEditable(bEditable: scala.Boolean): InputBase = js.native
  /**
    * Sets a new value for property <code>enabled</code>.Indicates whether the user can interact with the
    * control or not.<b>Note:</b> Disabled controls cannot be focused and they are out of the
    * tab-chain.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: scala.Boolean): InputBase = js.native
  /**
    * Sets a new value for property <code>name</code>.Defines the name of the control for the purposes of
    * form submission.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: java.lang.String): InputBase = js.native
  /**
    * Sets a new value for property <code>placeholder</code>.Defines a short hint intended to aid the user
    * with data entry when the control has no value.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sPlaceholder New value for property <code>placeholder</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPlaceholder(sPlaceholder: java.lang.String): InputBase = js.native
  /**
    * Sets a new value for property <code>required</code>.Indicates that user input is required. This
    * property is only needed for accessibility purposes when a single relationship betweenthe field and a
    * label (see aggregation <code>labelFor</code> of <code>sap.m.Label</code>) cannot be established(e.g.
    * one label should label multiple fields).When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.38.4
    * @param bRequired New value for property <code>required</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRequired(bRequired: scala.Boolean): InputBase = js.native
  /**
    * Sets a new value for property <code>showValueStateMessage</code>.Indicates whether the value state
    * message should be shown or not.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @since 1.26.0
    * @param bShowValueStateMessage New value for property <code>showValueStateMessage</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowValueStateMessage(bShowValueStateMessage: scala.Boolean): InputBase = js.native
  /**
    * Sets a new value for property <code>textAlign</code>.Defines the horizontal alignment of the text
    * that is shown inside the input field.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Initial</code>.
    * @since 1.26.0
    * @param sTextAlign New value for property <code>textAlign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextAlign(sTextAlign: openui5Lib.sapNs.uiNs.coreNs.TextAlign): InputBase = js.native
  /**
    * Sets a new value for property <code>textDirection</code>.Defines the text directionality of the
    * input field, e.g. <code>RTL</code>, <code>LTR</code>When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Inherit</code>.
    * @since 1.28.0
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection): InputBase = js.native
  /**
    * Setter for property <code>value</code>.Default value is empty/<code>undefined</code>.
    * @param sValue New value for property <code>value</code>.
    * @returns <code>this</code> to allow method chaining.
    */
  def setValue(sValue: java.lang.String): InputBase = js.native
  /**
    * Setter for property <code>valueState</code>.Default value is <code>None</code>.
    * @param sValueState New value for property <code>valueState</code>.
    * @returns <code>this</code> to allow method chaining.
    */
  def setValueState(sValueState: openui5Lib.sapNs.uiNs.coreNs.ValueState): InputBase = js.native
  /**
    * Setter for property <code>valueStateText</code>.Default value is empty/<code>undefined</code>.
    * @since 1.26
    * @param sText New value for property <code>valueStateText</code>.
    * @returns <code>this</code> to allow method chaining
    */
  def setValueStateText(sText: java.lang.String): InputBase = js.native
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the control.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): InputBase = js.native
  /**
    * Unbinds property <code>value</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindValue(): InputBase = js.native
  /**
    * Sets the DOM value of the input field and handles placeholder visibility.
    * @since 1.22
    * @param sValue value of the input field.
    * @returns <code>this</code> to allow method chaining.
    */
  def updateDomValue(sValue: java.lang.String): InputBase = js.native
}

