package typings.atPhosphorDatagrid.libCellrendererMod

import typings.atPhosphorDatagrid.libCellrendererMod.CellRendererNs.ConfigFunc
import typings.atPhosphorDatagrid.libCellrendererMod.CellRendererNs.ConfigOption
import typings.atPhosphorDatagrid.libCellrendererMod.CellRendererNs.ICellConfig
import typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.CellRegion
import typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/cellrenderer", "CellRenderer")
@js.native
object CellRendererNs extends js.Object {
  /**
    * An object which holds the configuration data for a cell.
    */
  trait ICellConfig extends js.Object {
    /**
      * The column index of the cell.
      */
    val column: Double
    /**
      * The height of the cell rectangle, in viewport pixels.
      */
    val height: Double
    /**
      * The metadata for the column.
      */
    val metadata: Metadata
    /**
      * The region for the cell.
      */
    val region: CellRegion
    /**
      * The row index of the cell.
      */
    val row: Double
    /**
      * The data value for the cell.
      */
    val value: js.Any
    /**
      * The width of the cell rectangle, in viewport pixels.
      */
    val width: Double
    /**
      * The X position of the cell rectangle, in viewport coordinates.
      */
    val x: Double
    /**
      * The Y position of the cell rectangle, in viewport coordinates.
      */
    val y: Double
  }
  
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
  
  /**
    * Resolve a config option for a cell renderer.
    *
    * @param option - The config option to resolve.
    *
    * @param config - The cell config object.
    *
    * @returns The resolved value for the option.
    */
  def resolveOption[T](option: ConfigOption[T], config: ICellConfig): T = js.native
  /**
    * A type alias for a cell renderer config function.
    *
    * This type is used to compute a value from a cell config object.
    */
  type ConfigFunc[T] = js.Function1[/* config */ ICellConfig, T]
  /**
    * A type alias for a cell renderer config option.
    *
    * A config option can be a static value or a config function.
    */
  type ConfigOption[T] = T | ConfigFunc[T]
}

