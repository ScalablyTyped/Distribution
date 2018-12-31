package typings
package openui5Lib.sapNs.uiNs.layoutNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.form.FormLayout")
@js.native
class FormLayout protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new sap.ui.layout.form.FormLayout.Accepts an object literal <code>mSettings</code>
    * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>backgroundDesign</code>.Specifies the background color of the
    * <code>Form</code> content.The visualization of the different options depends on the used
    * theme.Default value is <code>Translucent</code>.
    * @since 1.36.0
    * @returns Value of property <code>backgroundDesign</code>
    */
  def getBackgroundDesign(): openui5Lib.sapNs.uiNs.layoutNs.BackgroundDesign = js.native
  /**
    * Sets a new value for property <code>backgroundDesign</code>.Specifies the background color of the
    * <code>Form</code> content.The visualization of the different options depends on the used theme.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>Translucent</code>.
    * @since 1.36.0
    * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundDesign(sBackgroundDesign: openui5Lib.sapNs.uiNs.layoutNs.BackgroundDesign): FormLayout = js.native
}

