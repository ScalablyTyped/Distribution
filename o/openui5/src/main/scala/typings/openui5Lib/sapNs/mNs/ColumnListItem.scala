package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ColumnListItem")
@js.native
class ColumnListItem protected () extends ListItemBase {
  /**
    * Constructor for a new ColumnListItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Returns pop-in DOMRef as a jQuery Object
    * @since 1.26
    */
  @JSName("$Popin")
  def $Popin(): scala.Unit = js.native
  /**
    * Adds some cell to the aggregation <code>cells</code>.
    * @param oCell the cell to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addCell(oCell: openui5Lib.sapNs.uiNs.coreNs.Control): ColumnListItem = js.native
  /**
    * Binds aggregation <code>cells</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindCells(oBindingInfo: js.Any): ColumnListItem = js.native
  /**
    * Destroys all the cells in the aggregation <code>cells</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyCells(): ColumnListItem = js.native
  /**
    * Gets content of aggregation <code>cells</code>.Every <code>control</code> inside the
    * <code>cells</code> aggregation defines one cell of the row.<b>Note:</b> The order of the
    * <code>cells</code> aggregation must match the order of the <code>columns</code> aggregation of
    * <code>sap.m.Table</code>.
    */
  def getCells(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
    * Returns the pop-in element.
    * @since 1.30.9
    */
  def getPopin(): scala.Unit = js.native
  /**
    * Gets current value of property <code>vAlign</code>.Sets the vertical alignment of all the cells
    * within the table row (including selection and navigation).<b>Note:</b> <code>vAlign</code> property
    * of <code>sap.m.Column</code> overrides the property for cell vertical alignment if both are
    * set.Default value is <code>Inherit</code>.
    * @since 1.20
    * @returns Value of property <code>vAlign</code>
    */
  def getVAlign(): openui5Lib.sapNs.uiNs.coreNs.VerticalAlign = js.native
  /**
    * Determines whether control has pop-in or not.
    */
  def hasPopin(): scala.Unit = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>cells</code>.and
    * returns its index if found or -1 otherwise.
    * @param oCell The cell whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfCell(oCell: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
    * Inserts a cell into the aggregation <code>cells</code>.
    * @param oCell the cell to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the cell should be inserted at; for             a
    * negative value of <code>iIndex</code>, the cell is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the cell is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertCell(oCell: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): ColumnListItem = js.native
  /**
    * Removes all the controls from the aggregation <code>cells</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllCells(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  def removeCell(vCell: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  def removeCell(vCell: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Removes a cell from the aggregation <code>cells</code>.
    * @param vCell The cell to remove or its index or id
    * @returns The removed cell or <code>null</code>
    */
  def removeCell(vCell: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Pemove pop-in from DOM
    */
  def removePopin(): scala.Unit = js.native
  /**
    * Sets a new value for property <code>vAlign</code>.Sets the vertical alignment of all the cells
    * within the table row (including selection and navigation).<b>Note:</b> <code>vAlign</code> property
    * of <code>sap.m.Column</code> overrides the property for cell vertical alignment if both are set.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>Inherit</code>.
    * @since 1.20
    * @param sVAlign New value for property <code>vAlign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVAlign(sVAlign: openui5Lib.sapNs.uiNs.coreNs.VerticalAlign): ColumnListItem = js.native
  /**
    * Unbinds aggregation <code>cells</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindCells(): ColumnListItem = js.native
}

