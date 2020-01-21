package typings.phosphorDatagrid.cellrendererMod.CellRenderer

import typings.phosphorDatagrid.datamodelMod.DataModel.CellRegion
import typings.phosphorDatagrid.datamodelMod.DataModel.Metadata
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
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColumnConfig]
  }
}

