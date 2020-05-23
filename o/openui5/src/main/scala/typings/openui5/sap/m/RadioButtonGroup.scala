package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.TextDirection
import typings.openui5.sap.ui.core.ValueState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioButtonGroup extends Control {
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): RadioButtonGroup = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): RadioButtonGroup = js.native
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): RadioButtonGroup = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): RadioButtonGroup = js.native
  /**
    * Adds a new radio button to the group.
    * @param oButton The button which will be added to the group
    * @returns Pointer to the control instance for chaining
    */
  def addButton(oButton: RadioButton): RadioButtonGroup = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.m.RadioButtonGroup</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.RadioButtonGroup</code> itself.Fires when selection is changed by user
    * interaction.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.RadioButtonGroup</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): RadioButtonGroup = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): RadioButtonGroup = js.native
  /**
    * Binds aggregation <code>buttons</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindButtons(oBindingInfo: js.Any): RadioButtonGroup = js.native
  /**
    * Destroys all radio buttons.
    * @returns Pointer to the control instance for chaining
    */
  def destroyButtons(): RadioButtonGroup = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.m.RadioButtonGroup</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): RadioButtonGroup = js.native
  /**
    * Fires event <code>select</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selectedIndex</code> of type <code>int</code>Index of the selected
    * RadioButton.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): RadioButtonGroup = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[_] = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets content of aggregation <code>buttons</code>.Returns a list of the RadioButtons in a
    * RadioButtonGroup
    */
  def getButtons(): js.Array[RadioButton] = js.native
  /**
    * Gets current value of property <code>columns</code>.Specifies the maximum number of radio buttons
    * displayed in one line.Default value is <code>1</code>.
    * @returns Value of property <code>columns</code>
    */
  def getColumns(): Double = js.native
  /**
    * Gets current value of property <code>editable</code>.Specifies whether the user can change the
    * selected value of the RadioButtonGroup.When the property is set to false, the control obtains visual
    * stylesdifferent from its visual styles for the normal and the disabled state.Additionally, the
    * control is no longer interactive, but can receive focus.Default value is <code>true</code>.
    * @returns Value of property <code>editable</code>
    */
  def getEditable(): Boolean = js.native
  /**
    * Gets current value of property <code>enabled</code>.Switches the enabled state of the control. All
    * Radio Buttons inside a disabled group are disabled. Default value is “true”.Default value is
    * <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  /**
    * Returns the selected radio button.
    * @returns The selected radio button
    */
  def getSelectedButton(): RadioButton = js.native
  /**
    * Gets current value of property <code>selectedIndex</code>.Determines the index of the
    * selected/checked RadioButton. Default is 0.If no radio button is selected, the selectedIndex
    * property will return -1.Default value is <code>0</code>.
    * @returns Value of property <code>selectedIndex</code>
    */
  def getSelectedIndex(): Double = js.native
  /**
    * Gets current value of property <code>textDirection</code>.This property specifies the element's text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): TextDirection = js.native
  /**
    * Gets current value of property <code>valueState</code>.Тhe value state to be displayed for the radio
    * button. Possible values are: sap.ui.core.ValueState.Error,sap.ui.core.ValueState.Warning,
    * sap.ui.core.ValueState.Success and sap.ui.core.ValueState.None.Note: Setting this attribute to
    * sap.ui.core.ValueState.Error when the accessibility feature is enabled,sets the value of the invalid
    * propery for the whole RadioButtonGroup to “true”.Default value is <code>None</code>.
    * @returns Value of property <code>valueState</code>
    */
  def getValueState(): ValueState = js.native
  /**
    * Gets current value of property <code>width</code>.Specifies the width of the RadioButtonGroup.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.m.RadioButton</code> in the aggregation <code>buttons</code>.and
    * returns its index if found or -1 otherwise.
    * @param oButton The button whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfButton(oButton: RadioButton): Double = js.native
  /**
    * Adds a new radio button to the group at a specified index.
    * @param oButton The radio button which will be added to the group
    * @param iIndex The index, at which the radio button will be added
    * @returns Pointer to the control instance for chaining
    */
  def insertButton(oButton: RadioButton, iIndex: Double): RadioButtonGroup = js.native
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all radio buttons.
    * @returns Array of removed buttons or null
    */
  def removeAllButtons(): js.Array[_] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  /**
    * Removes a radio button from the group.
    * @returns The removed radio button
    */
  def removeButton(): RadioButton = js.native
  /**
    * Sets a new value for property <code>columns</code>.Specifies the maximum number of radio buttons
    * displayed in one line.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>1</code>.
    * @param iColumns New value for property <code>columns</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumns(iColumns: Double): RadioButtonGroup = js.native
  /**
    * Sets the editable property of all radio buttons in the group.Non editable radio buttons can still
    * obtain focus.
    * @param bEditable Defines whether the radio buttons should be interactive.
    * @returns Pointer to the control instance for chaining
    */
  def setEditable(bEditable: Boolean): RadioButtonGroup = js.native
  /**
    * Sets the enabled property of all radio buttons in the group.
    * @param bEnabled Defines whether the radio buttons should be interactive.
    * @returns Pointer to the control instance for chaining
    */
  def setEnabled(bEnabled: Boolean): RadioButtonGroup = js.native
  /**
    * Sets the selected sap.m.RadioButton using sap.m.RadioButton.
    * @param oSelectedButton The item to be selected
    * @returns Pointer to the control instance for chaining
    */
  def setSelectedButton(oSelectedButton: RadioButton): RadioButtonGroup = js.native
  /**
    * Sets the selected sap.m.RadioButton using index.
    * @param iSelectedIndex The index of the radio button which has to be selected
    * @returns Pointer to the control instance for chaining
    */
  def setSelectedIndex(iSelectedIndex: Double): RadioButtonGroup = js.native
  /**
    * Sets a new value for property <code>textDirection</code>.This property specifies the element's text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: TextDirection): RadioButtonGroup = js.native
  /**
    * Sets ValueState of all radio buttons in the group.
    * @param sValueState The value state of the radio group - none, success, warning, error.
    * @returns Pointer to the control instance for chaining
    */
  def setValueState(sValueState: String): RadioButtonGroup = js.native
  /**
    * Sets a new value for property <code>width</code>.Specifies the width of the RadioButtonGroup.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): RadioButtonGroup = js.native
  /**
    * Unbinds aggregation <code>buttons</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindButtons(): RadioButtonGroup = js.native
}

