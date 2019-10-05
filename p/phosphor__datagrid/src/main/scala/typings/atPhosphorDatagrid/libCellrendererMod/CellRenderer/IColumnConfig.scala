package typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer

import typings.atPhosphorDatagrid.libDatamodelMod.DataModel.CellRegion
import typings.atPhosphorDatagrid.libDatamodelMod.DataModel.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the configuration data for a column.
  */
trait IColumnConfig extends js.Object {
  /**
    * The column index.
    */
  val column: Double
  /**
    * The metadata for the column.
    */
  val metadata: Metadata
  /**
    * The region for the column.
    */
  val region: CellRegion
  /**
    * The width of the column, in viewport pixels.
    */
  val width: Double
  /**
    * The X position of the column, in viewport coordinates.
    */
  val x: Double
}

object IColumnConfig {
  @scala.inline
  def apply(column: Double, metadata: Metadata, region: CellRegion, width: Double, x: Double): IColumnConfig = {
    val __obj = js.Dynamic.literal(column = column, metadata = metadata, region = region, width = width, x = x)
  
    __obj.asInstanceOf[IColumnConfig]
  }
}

