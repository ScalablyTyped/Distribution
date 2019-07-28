package typings.openui5.sapNs.uiNs.layoutNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.form.GridLayout")
@js.native
class GridLayout protected () extends FormLayout {
  /**
    * Constructor for a new sap.ui.layout.form.GridLayout.Accepts an object literal <code>mSettings</code>
    * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>singleColumn</code>.If set, the grid renders only one
    * <code>FormContainer</code> per column. That means one <code>FormContainer</code> is below the other.
    * The whole grid has 8 cells per row.If not set, <code>FormContainer</code> can use the full width of
    * the grid or two <code>FormContainers</code> can be placed beside each other. In this case the whole
    * grid has 16 cells per row.Default value is <code>false</code>.
    * @returns Value of property <code>singleColumn</code>
    */
  def getSingleColumn(): Boolean = js.native
  /**
    * Sets a new value for property <code>singleColumn</code>.If set, the grid renders only one
    * <code>FormContainer</code> per column. That means one <code>FormContainer</code> is below the other.
    * The whole grid has 8 cells per row.If not set, <code>FormContainer</code> can use the full width of
    * the grid or two <code>FormContainers</code> can be placed beside each other. In this case the whole
    * grid has 16 cells per row.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>false</code>.
    * @param bSingleColumn New value for property <code>singleColumn</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSingleColumn(bSingleColumn: Boolean): GridLayout = js.native
}

