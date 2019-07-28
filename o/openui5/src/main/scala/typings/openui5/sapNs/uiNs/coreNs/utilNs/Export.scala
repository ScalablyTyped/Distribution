package typings.openui5.sapNs.uiNs.coreNs.utilNs

import typings.jquery.JQueryPromise
import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.Export")
@js.native
class Export protected () extends Control {
  /**
    * Constructor for a new Export.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some column to the aggregation <code>columns</code>.
    * @param oColumn the column to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addColumn(oColumn: ExportColumn): Export = js.native
  /**
    * Adds some row to the aggregation <code>rows</code>.
    * @param oRow the row to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addRow(oRow: ExportRow): Export = js.native
  /**
    * Binds aggregation <code>columns</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindColumns(oBindingInfo: js.Any): Export = js.native
  /**
    * Binds aggregation <code>rows</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindRows(oBindingInfo: js.Any): Export = js.native
  /**
    * Destroys all the columns in the aggregation <code>columns</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyColumns(): Export = js.native
  /**
    * Destroys the exportType in the aggregation <code>exportType</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyExportType(): Export = js.native
  /**
    * Destroys all the rows in the aggregation <code>rows</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyRows(): Export = js.native
  /**
    * Generates the file content and returns a Promisewith the instance as context (this).<br>The promise
    * will be resolved with the generated contentas a string.<p><b>Please note: The return value was
    * changed from jQuery Promises to standard ES6 Promises.jQuery specific Promise methods ('done',
    * 'fail', 'always', 'pipe' and 'state') are still available but should not be used.Please use only the
    * standard methods 'then' and 'catch'!</b></p>
    * @returns Promise object
    */
  def generate(): JQueryPromise[_] = js.native
  /**
    * Gets content of aggregation <code>columns</code>.Columns for the Export.
    */
  def getColumns(): js.Array[ExportColumn] = js.native
  /**
    * Gets content of aggregation <code>exportType</code>.Type that generates the content.
    */
  def getExportType(): ExportType = js.native
  /**
    * Gets content of aggregation <code>rows</code>.Rows of the Export.
    */
  def getRows(): js.Array[ExportRow] = js.native
  /**
    * Checks for the provided <code>sap.ui.core.util.ExportColumn</code> in the aggregation
    * <code>columns</code>.and returns its index if found or -1 otherwise.
    * @param oColumn The column whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfColumn(oColumn: ExportColumn): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.util.ExportRow</code> in the aggregation
    * <code>rows</code>.and returns its index if found or -1 otherwise.
    * @param oRow The row whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfRow(oRow: ExportRow): Double = js.native
  /**
    * Inserts a column into the aggregation <code>columns</code>.
    * @param oColumn the column to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the column should be inserted at; for             a
    * negative value of <code>iIndex</code>, the column is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the column is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertColumn(oColumn: ExportColumn, iIndex: Double): Export = js.native
  /**
    * Inserts a row into the aggregation <code>rows</code>.
    * @param oRow the row to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the row should be inserted at; for             a
    * negative value of <code>iIndex</code>, the row is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the row is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertRow(oRow: ExportRow, iIndex: Double): Export = js.native
  /**
    * Removes all the controls from the aggregation <code>columns</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllColumns(): js.Array[ExportColumn] = js.native
  /**
    * Removes all the controls from the aggregation <code>rows</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllRows(): js.Array[ExportRow] = js.native
  def removeColumn(vColumn: String): ExportColumn = js.native
  /**
    * Removes a column from the aggregation <code>columns</code>.
    * @param vColumn The column to remove or its index or id
    * @returns The removed column or <code>null</code>
    */
  def removeColumn(vColumn: Double): ExportColumn = js.native
  def removeColumn(vColumn: ExportColumn): ExportColumn = js.native
  def removeRow(vRow: String): ExportRow = js.native
  /**
    * Removes a row from the aggregation <code>rows</code>.
    * @param vRow The row to remove or its index or id
    * @returns The removed row or <code>null</code>
    */
  def removeRow(vRow: Double): ExportRow = js.native
  def removeRow(vRow: ExportRow): ExportRow = js.native
  /**
    * Generates the file content, triggers a download / save action andreturns a Promise with the instance
    * as context (this).<br>The promise will be resolved with the generated contentas a string.<p><b>For
    * information about browser support, see <code>sap.ui.core.util.File.save</code></b></p><p><b>Please
    * note: The return value was changed from jQuery Promises to standard ES6 Promises.jQuery specific
    * Promise methods ('done', 'fail', 'always', 'pipe' and 'state') are still available but should not be
    * used.Please use only the standard methods 'then' and 'catch'!</b></p>
    * @param sFileName file name, defaults to 'data'
    * @returns Promise object
    */
  def saveFile(sFileName: String): JQueryPromise[_] = js.native
  /**
    * Sets the aggregated <code>exportType</code>.
    * @param oExportType The exportType to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setExportType(oExportType: ExportType): Export = js.native
  /**
    * Unbinds aggregation <code>columns</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindColumns(): Export = js.native
  /**
    * Unbinds aggregation <code>rows</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindRows(): Export = js.native
}

