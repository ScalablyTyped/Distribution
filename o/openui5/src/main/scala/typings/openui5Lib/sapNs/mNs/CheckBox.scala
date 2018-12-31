package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.CheckBox")
@js.native
class CheckBox protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new CheckBox.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId The ID for the new control, generated automatically if no ID is given
    * @param mSettings The Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): CheckBox = js.native
  def addAriaDescribedBy(vAriaDescribedBy: openui5Lib.sapNs.uiNs.coreNs.Control): CheckBox = js.native
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): CheckBox = js.native
  def addAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): CheckBox = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.m.CheckBox</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.CheckBox</code> itself.Event is triggered when the control status is changed by the user
    * by selecting or deselecting the checkbox.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.CheckBox</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): CheckBox = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): CheckBox = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.m.CheckBox</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): CheckBox = js.native
  /**
    * Fires event <code>select</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selected</code> of type <code>boolean</code>Checks whether the CheckBox is
    * marked or not .</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): CheckBox = js.native
  /**
    * Gets current value of property <code>activeHandling</code>.Flag to switch on activeHandling, when it
    * is switched off, there will be no visual changes on active state. Default value is 'true'Default
    * value is <code>true</code>.
    * @returns Value of property <code>activeHandling</code>
    */
  def getActiveHandling(): scala.Boolean = js.native
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
    * Gets current value of property <code>editable</code>.Specifies whether the user shall be allowed to
    * edit the state of the checkboxDefault value is <code>true</code>.
    * @since 1.25
    * @returns Value of property <code>editable</code>
    */
  def getEditable(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>enabled</code>.Disables the Checkbox. Disabled controls are not
    * interactive and are rendered differently according to the theme.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>name</code>.The 'name' property to be used in the HTML code,
    * for example for HTML forms that send data to the server via submit.
    * @returns Value of property <code>name</code>
    */
  def getName(): java.lang.String = js.native
  /**
    * Gets current value of property <code>selected</code>.Stores the state of the checkbox whether it is
    * selected or not.Default value is <code>false</code>.
    * @returns Value of property <code>selected</code>
    */
  def getSelected(): scala.Boolean = js.native
  /**
    * Returns the CheckBox`s tab index.
    * @since 1.22
    * @returns iTabIndex for Checkbox
    */
  def getTabIndex(): scala.Double = js.native
  /**
    * Gets current value of property <code>text</code>.Defines the text displayed next to the checkbox
    * @returns Value of property <code>text</code>
    */
  def getText(): java.lang.String = js.native
  /**
    * Gets current value of property <code>textAlign</code>.Aligns the text of the checkbox. Available
    * alignment settings are "Begin", "Center", "End", "Left", and "Right".Default value is
    * <code>Begin</code>.
    * @returns Value of property <code>textAlign</code>
    */
  def getTextAlign(): openui5Lib.sapNs.uiNs.coreNs.TextAlign = js.native
  /**
    * Gets current value of property <code>textDirection</code>.Options for the text direction are RTL and
    * LTR. Alternatively, the control can inherit the text direction from its parent container.Default
    * value is <code>Inherit</code>.
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): openui5Lib.sapNs.uiNs.coreNs.TextDirection = js.native
  /**
    * Gets current value of property <code>valueState</code>.Accepts the core enumeration ValueState.type
    * that supports 'None', 'Error', 'Warning' and 'Success'.Default value is <code>None</code>.
    * @since 1.38
    * @returns Value of property <code>valueState</code>
    */
  def getValueState(): openui5Lib.sapNs.uiNs.coreNs.ValueState = js.native
  /**
    * Gets current value of property <code>width</code>.Width of the checkbox`s labelDefault value is
    * <code></code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
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
  def removeAriaDescribedBy(vAriaDescribedBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: scala.Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: scala.Double): js.Any = js.native
  /**
    * Sets a new value for property <code>activeHandling</code>.Flag to switch on activeHandling, when it
    * is switched off, there will be no visual changes on active state. Default value is 'true'When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>true</code>.
    * @param bActiveHandling New value for property <code>activeHandling</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActiveHandling(bActiveHandling: scala.Boolean): CheckBox = js.native
  /**
    * Sets a new value for property <code>editable</code>.Specifies whether the user shall be allowed to
    * edit the state of the checkboxWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @since 1.25
    * @param bEditable New value for property <code>editable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEditable(bEditable: scala.Boolean): CheckBox = js.native
  /**
    * Sets a new value for property <code>enabled</code>.Disables the Checkbox. Disabled controls are not
    * interactive and are rendered differently according to the theme.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: scala.Boolean): CheckBox = js.native
  /**
    * Sets a new value for property <code>name</code>.The 'name' property to be used in the HTML code, for
    * example for HTML forms that send data to the server via submit.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: java.lang.String): CheckBox = js.native
  /**
    * Sets the tab index of the control
    * @since 1.16
    * @param iTabIndex The tab index should be greater than or equal -1
    */
  def setTabIndex(iTabIndex: scala.Double): CheckBox = js.native
  /**
    * Sets a new value for property <code>text</code>.Defines the text displayed next to the checkboxWhen
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: java.lang.String): CheckBox = js.native
  /**
    * Sets a new value for property <code>textAlign</code>.Aligns the text of the checkbox. Available
    * alignment settings are "Begin", "Center", "End", "Left", and "Right".When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Begin</code>.
    * @param sTextAlign New value for property <code>textAlign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextAlign(sTextAlign: openui5Lib.sapNs.uiNs.coreNs.TextAlign): CheckBox = js.native
  /**
    * Sets a new value for property <code>textDirection</code>.Options for the text direction are RTL and
    * LTR. Alternatively, the control can inherit the text direction from its parent container.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>Inherit</code>.
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection): CheckBox = js.native
  /**
    * Sets a new value for property <code>valueState</code>.Accepts the core enumeration ValueState.type
    * that supports 'None', 'Error', 'Warning' and 'Success'.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>None</code>.
    * @since 1.38
    * @param sValueState New value for property <code>valueState</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueState(sValueState: openui5Lib.sapNs.uiNs.coreNs.ValueState): CheckBox = js.native
  /**
    * Sets a new value for property <code>width</code>.Width of the checkbox`s labelWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): CheckBox = js.native
}

