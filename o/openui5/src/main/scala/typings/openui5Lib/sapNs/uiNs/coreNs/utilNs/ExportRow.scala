package typings
package openui5Lib.sapNs.uiNs.coreNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.ExportRow")
@js.native
class ExportRow protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.ManagedObject {
  /**
             * Constructor for a new ExportRow.Accepts an object literal <code>mSettings</code> that defines
             * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
             * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
             * object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String) = this()
  /**
             * Constructor for a new ExportRow.Accepts an object literal <code>mSettings</code> that defines
             * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
             * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
             * object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
             * Adds some cell to the aggregation <code>cells</code>.
             * @param oCell the cell to add; if empty, nothing is inserted
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def addCell(oCell: ExportCell): ExportRow = js.native
  /**
             * Destroys all the cells in the aggregation <code>cells</code>.
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def destroyCells(): ExportRow = js.native
  /**
             * Gets content of aggregation <code>cells</code>.Cells for the Export.
            */
  def getCells(): js.Array[ExportCell] = js.native
  /**
             * Checks for the provided <code>sap.ui.core.util.ExportCell</code> in the aggregation
             * <code>cells</code>.and returns its index if found or -1 otherwise.
             * @param oCell The cell whose index is looked for
             * @returns The index of the provided control in the aggregation if found, or -1 otherwise
            */
  def indexOfCell(oCell: ExportCell): scala.Double = js.native
  /**
             * Inserts a cell into the aggregation <code>cells</code>.
             * @param oCell the cell to insert; if empty, nothing is inserted
             * @param iIndex the <code>0</code>-based index the cell should be inserted at; for             a
             * negative value of <code>iIndex</code>, the cell is inserted at position 0; for a value            
             * greater than the current size of the aggregation, the cell is inserted at             the last
             * position
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def insertCell(oCell: ExportCell, iIndex: scala.Double): ExportRow = js.native
  /**
             * Removes all the controls from the aggregation <code>cells</code>.Additionally, it unregisters them
             * from the hosting UIArea.
             * @returns An array of the removed elements (might be empty)
            */
  def removeAllCells(): js.Array[ExportCell] = js.native
  /**
             * Removes a cell from the aggregation <code>cells</code>.
             * @param vCell The cell to remove or its index or id
             * @returns The removed cell or <code>null</code>
            */
  def removeCell(vCell: java.lang.String): ExportCell = js.native
  /**
             * Removes a cell from the aggregation <code>cells</code>.
             * @param vCell The cell to remove or its index or id
             * @returns The removed cell or <code>null</code>
            */
  def removeCell(vCell: ExportCell): ExportCell = js.native
  /**
             * Removes a cell from the aggregation <code>cells</code>.
             * @param vCell The cell to remove or its index or id
             * @returns The removed cell or <code>null</code>
            */
  def removeCell(vCell: scala.Double): ExportCell = js.native
}

