package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.VerticalAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnListItem extends ListItemBase {
  
  /**
    * Returns pop-in DOMRef as a jQuery Object
    * @since 1.26
    */
  @JSName("$Popin")
  def $Popin(): Unit = js.native
  
  /**
    * Adds some cell to the aggregation <code>cells</code>.
    * @param oCell the cell to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addCell(oCell: Control): ColumnListItem = js.native
  
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
  def getCells(): js.Array[Control] = js.native
  
  /**
    * Returns the pop-in element.
    * @since 1.30.9
    */
  def getPopin(): Unit = js.native
  
  /**
    * Gets current value of property <code>vAlign</code>.Sets the vertical alignment of all the cells
    * within the table row (including selection and navigation).<b>Note:</b> <code>vAlign</code> property
    * of <code>sap.m.Column</code> overrides the property for cell vertical alignment if both are
    * set.Default value is <code>Inherit</code>.
    * @since 1.20
    * @returns Value of property <code>vAlign</code>
    */
  def getVAlign(): VerticalAlign = js.native
  
  /**
    * Determines whether control has pop-in or not.
    */
  def hasPopin(): Unit = js.native
  
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>cells</code>.and
    * returns its index if found or -1 otherwise.
    * @param oCell The cell whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfCell(oCell: Control): Double = js.native
  
  /**
    * Inserts a cell into the aggregation <code>cells</code>.
    * @param oCell the cell to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the cell should be inserted at; for             a
    * negative value of <code>iIndex</code>, the cell is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the cell is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertCell(oCell: Control, iIndex: Double): ColumnListItem = js.native
  
  /**
    * Removes all the controls from the aggregation <code>cells</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllCells(): js.Array[Control] = js.native
  
  def removeCell(vCell: String): Control = js.native
  /**
    * Removes a cell from the aggregation <code>cells</code>.
    * @param vCell The cell to remove or its index or id
    * @returns The removed cell or <code>null</code>
    */
  def removeCell(vCell: Double): Control = js.native
  def removeCell(vCell: Control): Control = js.native
  
  /**
    * Pemove pop-in from DOM
    */
  def removePopin(): Unit = js.native
  
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
  def setVAlign(sVAlign: VerticalAlign): ColumnListItem = js.native
  
  /**
    * Unbinds aggregation <code>cells</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindCells(): ColumnListItem = js.native
}
