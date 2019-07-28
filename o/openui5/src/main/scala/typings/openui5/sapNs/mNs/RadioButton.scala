package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.TextAlign
import typings.openui5.sapNs.uiNs.coreNs.TextDirection
import typings.openui5.sapNs.uiNs.coreNs.ValueState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.RadioButton")
@js.native
class RadioButton protected () extends Control {
  /**
    * Constructor for a new RadioButton.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): RadioButton = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): RadioButton = js.native
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): RadioButton = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): RadioButton = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.m.RadioButton</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.RadioButton</code> itself.Event is triggered when the user makes a change on the radio
    * button (selecting or unselecting it).
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.RadioButton</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): RadioButton = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): RadioButton = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.m.RadioButton</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): RadioButton = js.native
  /**
    * Fires event <code>select</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selected</code> of type <code>boolean</code>Checks whether the RadioButton
    * is active or not.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): RadioButton = js.native
  /**
    * Gets current value of property <code>activeHandling</code>.This is a flag to switch on
    * activeHandling. When it is switched off,there will not be visual changes on active state. Default
    * value is 'true'Default value is <code>true</code>.
    * @returns Value of property <code>activeHandling</code>
    */
  def getActiveHandling(): Boolean = js.native
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
    * Gets current value of property <code>editable</code>.Specifies whether the user can select the radio
    * button.Default value is <code>true</code>.
    * @since 1.25
    * @returns Value of property <code>editable</code>
    */
  def getEditable(): Boolean = js.native
  /**
    * Gets current value of property <code>enabled</code>.Specifies if the radio button is
    * disabled.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  /**
    * Gets current value of property <code>groupName</code>.Name of the radio button group the current
    * radio button belongs to. You can define a new name for the group.If no new name is specified, this
    * radio button belongs to the sapMRbDefaultGroup per default. Default behavior of a radio button in a
    * group is that when one of the radio buttons in a group is selected, all others are
    * unselected.Default value is <code>sapMRbDefaultGroup</code>.
    * @returns Value of property <code>groupName</code>
    */
  def getGroupName(): String = js.native
  /**
    * Gets current value of property <code>selected</code>.Specifies the select state of the radio
    * buttonDefault value is <code>false</code>.
    * @returns Value of property <code>selected</code>
    */
  def getSelected(): Boolean = js.native
  /**
    * Gets current value of property <code>text</code>.Specifies the text displayed next to the
    * RadioButton
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Gets current value of property <code>textAlign</code>.Specifies the alignment of the radio button.
    * Available alignment settings are "Begin", "Center", "End", "Left", and "Right".Default value is
    * <code>Begin</code>.
    * @since 1.28
    * @returns Value of property <code>textAlign</code>
    */
  def getTextAlign(): TextAlign = js.native
  /**
    * Gets current value of property <code>textDirection</code>.Options for the text direction are RTL and
    * LTR. Alternatively, the control can inherit the text direction from its parent container.Default
    * value is <code>Inherit</code>.
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): TextDirection = js.native
  /**
    * Gets current value of property <code>valueState</code>.Enumeration sap.ui.core.ValueState provides
    * state values Error, Success, Warning, NoneDefault value is <code>None</code>.
    * @since 1.25
    * @returns Value of property <code>valueState</code>
    */
  def getValueState(): ValueState = js.native
  /**
    * Gets current value of property <code>width</code>.Width of the LabelDefault value is <code></code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Pseudo event for pseudo 'select' event... space, enter, ... without modifiers (Ctrl, Alt or Shift)
    * @param oEvent provides information for the event
    */
  def onsapselect(oEvent: js.Any): Unit = js.native
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
    * Sets a new value for property <code>activeHandling</code>.This is a flag to switch on
    * activeHandling. When it is switched off,there will not be visual changes on active state. Default
    * value is 'true'When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bActiveHandling New value for property <code>activeHandling</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActiveHandling(bActiveHandling: Boolean): RadioButton = js.native
  /**
    * Method to set a RadioButton's state to active or inactive.
    * @param bActive Sets the active state to true or false
    */
  def setActiveState(bActive: Boolean): Unit = js.native
  /**
    * Sets a new value for property <code>editable</code>.Specifies whether the user can select the radio
    * button.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @since 1.25
    * @param bEditable New value for property <code>editable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEditable(bEditable: Boolean): RadioButton = js.native
  /**
    * Sets a new value for property <code>enabled</code>.Specifies if the radio button is disabled.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): RadioButton = js.native
  /**
    * Sets RadioButton's groupName. Only one radioButton from the same group can be selected
    * @param sGroupName Name of the group to which the RadioButton will belong.
    * @returns Reference to the control instance for chaining
    */
  def setGroupName(sGroupName: String): RadioButton = js.native
  /**
    * Sets the state of the RadioButton to selected.
    * @param bSelected defines if the radio button is selected
    * @returns Reference to the control instance for chaining
    */
  def setSelected(bSelected: Boolean): RadioButton = js.native
  /**
    * Sets the text for the RadioButton's label.
    * @param sText The text to be set
    * @returns Reference to the control instance for chaining
    */
  def setText(sText: String): RadioButton = js.native
  /**
    * Sets a new value for property <code>textAlign</code>.Specifies the alignment of the radio button.
    * Available alignment settings are "Begin", "Center", "End", "Left", and "Right".When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Begin</code>.
    * @since 1.28
    * @param sTextAlign New value for property <code>textAlign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextAlign(sTextAlign: TextAlign): RadioButton = js.native
  /**
    * Sets the text direction for the RadioButton's label.
    * @param sDirection Text direction to be set to RadioButton's label
    * @returns Reference to the control instance for chaining
    */
  def setTextDirection(sDirection: String): RadioButton = js.native
  /**
    * Sets a new value for property <code>valueState</code>.Enumeration sap.ui.core.ValueState provides
    * state values Error, Success, Warning, NoneWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>None</code>.
    * @since 1.25
    * @param sValueState New value for property <code>valueState</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueState(sValueState: ValueState): RadioButton = js.native
  /**
    * Sets the width for the RadioButton's label.
    * @param sWidth CSS size to be set as width of the label
    * @returns Reference to the control instance for chaining
    */
  def setWidth(sWidth: String): RadioButton = js.native
}

