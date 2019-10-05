package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ToggleButton")
@js.native
class ToggleButton protected () extends Button {
  /**
    * Constructor for a new ToggleButton.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>pressed</code>.The property is “true” when the control is
    * toggled. The default state of this property is "false".Default value is <code>false</code>.
    * @returns Value of property <code>pressed</code>
    */
  def getPressed(): Boolean = js.native
  /**
    * Sets a new value for property <code>pressed</code>.The property is “true” when the control is
    * toggled. The default state of this property is "false".When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bPressed New value for property <code>pressed</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPressed(bPressed: Boolean): ToggleButton = js.native
}

