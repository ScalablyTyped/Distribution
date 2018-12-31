package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ComboBoxTextField")
@js.native
class ComboBoxTextField protected () extends InputBase {
  /**
    * Constructor for a new <code>sap.m.ComboBoxTextField</code>.Accepts an object literal
    * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
    * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * @param sId ID for the new control, generated automatically if no ID is given.
    * @param mSettings Initial settings for the new control.
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>maxWidth</code>.Sets the maximum width of the text
    * field.Default value is <code>100%</code>.
    * @returns Value of property <code>maxWidth</code>
    */
  def getMaxWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>showButton</code>.Indicates whether the dropdown arrow button
    * is shown.Default value is <code>true</code>.
    * @since 1.38
    * @returns Value of property <code>showButton</code>
    */
  def getShowButton(): scala.Boolean = js.native
  /**
    * Sets a new value for property <code>maxWidth</code>.Sets the maximum width of the text field.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>100%</code>.
    * @param sMaxWidth New value for property <code>maxWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxWidth(sMaxWidth: js.Any): ComboBoxTextField = js.native
  /**
    * Sets a new value for property <code>showButton</code>.Indicates whether the dropdown arrow button is
    * shown.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @since 1.38
    * @param bShowButton New value for property <code>showButton</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowButton(bShowButton: scala.Boolean): ComboBoxTextField = js.native
}

