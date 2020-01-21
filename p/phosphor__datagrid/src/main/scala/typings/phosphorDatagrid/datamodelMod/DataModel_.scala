package typings.phosphorDatagrid.datamodelMod

import typings.phosphorDatagrid.datamodelMod.DataModel.CellRegion
import typings.phosphorDatagrid.datamodelMod.DataModel.ChangedArgs
import typings.phosphorDatagrid.datamodelMod.DataModel.ColumnRegion
import typings.phosphorDatagrid.datamodelMod.DataModel.Metadata
import typings.phosphorDatagrid.datamodelMod.DataModel.RowRegion
import typings.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/datamodel", "DataModel")
@js.native
abstract class DataModel_ () extends js.Object {
  var _changed: js.Any = js.native
  /**
    * A signal emitted when the data model has changed.
    */
  val changed: ISignal[this.type, ChangedArgs] = js.native
  /**
    * Get the column count for a region in the data model.
    *
    * @param region - The column region of interest.
    *
    * @returns - The column count for the region.
    *
    * #### Notes
    * This method is called often, and so should be efficient.
    */
  def columnCount(region: ColumnRegion): Double = js.native
  /**
    * Get the data value for a cell in the data model.
    *
    * @param region - The cell region of interest.
    *
    * @param row - The row index of the cell of interest.
    *
    * @param column - The column index of the cell of interest.
    *
    * @param returns - The data value for the specified cell.
    *
    * #### Notes
    * This method is called often, and so should be efficient.
    */
  def data(region: CellRegion, row: Double, column: Double): js.Any = js.native
  /**
    * Emit the `changed` signal for the data model.
    *
    * #### Notes
    * Subclass should call this method whenever the data model has
    * changed so that attached data grids can update themselves.
    */
  /* protected */ def emitChanged(args: ChangedArgs): Unit = js.native
  /**
    * Get the metadata for a column in the data model.
    *
    * @param region - The cell region of interest.
    *
    * @param column - The index of the column of interest.
    *
    * @returns The metadata for the column.
    *
    * #### Notes
    * The returned metadata should be treated as immutable.
    *
    * Models which support columnar data may reimplement this method to
    * return the metadata for a column.
    *
    * The metadata can be used by custom cell renderers and cell editors
    * to customize handling of specific cell data types.
    *
    * This method is called often, and so should be efficient.
    *
    * The default implementation returns `{}`.
    */
  def metadata(region: CellRegion, column: Double): Metadata = js.native
  /**
    * Get the row count for a region in the data model.
    *
    * @param region - The row region of interest.
    *
    * @returns - The row count for the region.
    *
    * #### Notes
    * This method is called often, and so should be efficient.
    */
  def rowCount(region: RowRegion): Double = js.native
}

