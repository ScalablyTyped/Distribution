package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Switch")
@js.native
class Switch protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new Switch.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Switch = js.native
  def addAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): Switch = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>change</code> event of this
    * <code>sap.m.Switch</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Switch</code> itself.Triggered when a switch changes the state.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Switch</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachChange(oData: js.Any, fnFunction: js.Any): Switch = js.native
  def attachChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Switch = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>change</code> event of this
    * <code>sap.m.Switch</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachChange(fnFunction: js.Any, oListener: js.Any): Switch = js.native
  /**
    * Fires event <code>change</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>state</code> of type <code>boolean</code>The new state of the
    * switch.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireChange(mArguments: js.Any): Switch = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.27.0
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>customTextOff</code>.Custom text for the "OFF" state."OFF"
    * translated to the current language is the default value.Beware that the given text will be cut off
    * after three characters.Default value is <code></code>.
    * @returns Value of property <code>customTextOff</code>
    */
  def getCustomTextOff(): java.lang.String = js.native
  /**
    * Gets current value of property <code>customTextOn</code>.Custom text for the "ON" state."ON"
    * translated to the current language is the default value.Beware that the given text will be cut off
    * after three characters.Default value is <code></code>.
    * @returns Value of property <code>customTextOn</code>
    */
  def getCustomTextOn(): java.lang.String = js.native
  /**
    * Gets current value of property <code>enabled</code>.Whether the switch is enabled.Default value is
    * <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>name</code>.The name to be used in the HTML code for the switch
    * (e.g. for HTML forms that send data to the server via submit).Default value is <code></code>.
    * @returns Value of property <code>name</code>
    */
  def getName(): java.lang.String = js.native
  /**
    * Gets current value of property <code>state</code>.A boolean value indicating whether the switch is
    * on or off.Default value is <code>false</code>.
    * @returns Value of property <code>state</code>
    */
  def getState(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>type</code>.Type of a Switch. Possibles values "Default",
    * "AcceptReject".Default value is <code>Default</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): SwitchType = js.native
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
    * Sets a new value for property <code>customTextOff</code>.Custom text for the "OFF" state."OFF"
    * translated to the current language is the default value.Beware that the given text will be cut off
    * after three characters.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code></code>.
    * @param sCustomTextOff New value for property <code>customTextOff</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomTextOff(sCustomTextOff: java.lang.String): Switch = js.native
  /**
    * Sets a new value for property <code>customTextOn</code>.Custom text for the "ON" state."ON"
    * translated to the current language is the default value.Beware that the given text will be cut off
    * after three characters.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code></code>.
    * @param sCustomTextOn New value for property <code>customTextOn</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomTextOn(sCustomTextOn: java.lang.String): Switch = js.native
  /**
    * Sets a new value for property <code>enabled</code>.Whether the switch is enabled.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: scala.Boolean): Switch = js.native
  /**
    * Sets a new value for property <code>name</code>.The name to be used in the HTML code for the switch
    * (e.g. for HTML forms that send data to the server via submit).When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: java.lang.String): Switch = js.native
  /**
    * Change the switch state between on and off.
    * @param bState undefined
    * @returns <code>this</code> to allow method chaining.
    */
  def setState(bState: scala.Boolean): Switch = js.native
  /**
    * Sets a new value for property <code>type</code>.Type of a Switch. Possibles values "Default",
    * "AcceptReject".When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>Default</code>.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: SwitchType): Switch = js.native
}

