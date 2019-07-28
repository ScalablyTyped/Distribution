package typings.openui5.sapNs.uiNs.layoutNs.formNs

import typings.openui5.sapNs.uiNs.coreNs.LayoutData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.form.GridContainerData")
@js.native
class GridContainerData protected () extends LayoutData {
  /**
    * Constructor for a new sap.ui.layout.form.GridContainerData.Accepts an object literal
    * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
    * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>halfGrid</code>.If set, the container takes half the width of
    * the <code>Form</code> (8 cells), if not it takes the full width (16 cells).If the
    * <code>GridLayout</code> is set to <code>singleColumn</code>, the full width of the grid is only 8
    * cells. So containers are rendered only once per row.Default value is <code>false</code>.
    * @returns Value of property <code>halfGrid</code>
    */
  def getHalfGrid(): Boolean = js.native
  /**
    * Sets a new value for property <code>halfGrid</code>.If set, the container takes half the width of
    * the <code>Form</code> (8 cells), if not it takes the full width (16 cells).If the
    * <code>GridLayout</code> is set to <code>singleColumn</code>, the full width of the grid is only 8
    * cells. So containers are rendered only once per row.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bHalfGrid New value for property <code>halfGrid</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHalfGrid(bHalfGrid: Boolean): GridContainerData = js.native
}

