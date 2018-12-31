package typings
package openui5Lib.sapNs.uiNs.layoutNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.form.GridElementData")
@js.native
class GridElementData protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.LayoutData {
  /**
    * Constructor for a new sap.ui.layout.form.GridElementData.Accepts an object literal
    * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
    * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>hCells</code>.Number of cells in horizontal direction.If set to
    * "auto" the size is determined by the number of fields and the available cells. For labels the auto
    * size is 3 cells.If set to "full" only one field is allowed within the <code>FormElement</code>. It
    * gets the full width of the row and the label is displayed above. <b>Note:</b> For labels full size
    * has no effect.Default value is <code>auto</code>.
    * @returns Value of property <code>hCells</code>
    */
  def getHCells(): js.Any = js.native
  /**
    * Gets current value of property <code>vCells</code>.Number of cells in vertical
    * direction.<b>Note:</b> This property has no effect for labels.Default value is <code>1</code>.
    * @returns Value of property <code>vCells</code>
    */
  def getVCells(): scala.Double = js.native
  /**
    * Sets a new value for property <code>hCells</code>.Number of cells in horizontal direction.If set to
    * "auto" the size is determined by the number of fields and the available cells. For labels the auto
    * size is 3 cells.If set to "full" only one field is allowed within the <code>FormElement</code>. It
    * gets the full width of the row and the label is displayed above. <b>Note:</b> For labels full size
    * has no effect.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>auto</code>.
    * @param sHCells New value for property <code>hCells</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHCells(sHCells: js.Any): GridElementData = js.native
  /**
    * Sets a new value for property <code>vCells</code>.Number of cells in vertical direction.<b>Note:</b>
    * This property has no effect for labels.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>1</code>.
    * @param iVCells New value for property <code>vCells</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVCells(iVCells: scala.Double): GridElementData = js.native
}

