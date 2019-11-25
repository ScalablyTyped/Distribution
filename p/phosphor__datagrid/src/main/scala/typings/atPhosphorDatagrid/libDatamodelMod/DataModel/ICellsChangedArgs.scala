package typings.atPhosphorDatagrid.libDatamodelMod.DataModel

import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`cells-changed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when cells are changed in-place.
  */
trait ICellsChangedArgs extends ChangedArgs {
  /**
    * The column index of the first modified cell.
    */
  val columnIndex: Double
  /**
    * The number of columns in the modified cell range.
    */
  val columnSpan: Double
  /**
    * The region which contains the modified cells.
    */
  val region: CellRegion
  /**
    * The row index of the first modified cell.
    */
  val rowIndex: Double
  /**
    * The number of rows in the modified cell range.
    */
  val rowSpan: Double
  /**
    * The discriminated type of the args object.
    */
  val `type`: `cells-changed`
}

object ICellsChangedArgs {
  @scala.inline
  def apply(
    columnIndex: Double,
    columnSpan: Double,
    region: CellRegion,
    rowIndex: Double,
    rowSpan: Double,
    `type`: `cells-changed`
  ): ICellsChangedArgs = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellsChangedArgs]
  }
}

