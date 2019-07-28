package typings.atPhosphorDatagrid.libDatagridMod

import typings.atPhosphorDatagrid.libCellrendererMod.CellRenderer
import typings.atPhosphorDatagrid.libDatagridMod.DataGridNs.HeaderVisibility
import typings.atPhosphorDatagrid.libDatagridMod.DataGridNs.IStyle
import typings.atPhosphorDatagrid.libRenderermapMod.RendererMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/datagrid", "DataGrid")
@js.native
object DataGridNs extends js.Object {
  /**
    * A type alias for the supported header visibility modes.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.all
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.row
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.column
    - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.none
  */
  trait HeaderVisibility extends js.Object
  
  /**
    * An options object for initializing a data grid.
    */
  trait IOptions extends js.Object {
    /**
      * The base size for column headers in the data grid.
      *
      * The default is `20`.
      */
    var baseColumnHeaderSize: js.UndefOr[Double] = js.undefined
    /**
      * The base size for columns in the data grid.
      *
      * The default is `64`.
      */
    var baseColumnSize: js.UndefOr[Double] = js.undefined
    /**
      * The base size for row headers in the data grid.
      *
      * The default is `64`.
      */
    var baseRowHeaderSize: js.UndefOr[Double] = js.undefined
    /**
      * The base size for rows in the data grid.
      *
      * The default is `20`.
      */
    var baseRowSize: js.UndefOr[Double] = js.undefined
    /**
      * The cell renderer map for the data grid.
      *
      * The default is an empty renderer map.
      */
    var cellRenderers: js.UndefOr[RendererMap] = js.undefined
    /**
      * The default cell renderer for the data grid.
      *
      * The default is a new `TextRenderer`.
      */
    var defaultRenderer: js.UndefOr[CellRenderer] = js.undefined
    /**
      * The header visibility for the data grid.
      *
      * The default is `'all'`.
      */
    var headerVisibility: js.UndefOr[HeaderVisibility] = js.undefined
    /**
      * The style for the data grid.
      *
      * The default is `DataGrid.defaultStyle`.
      */
    var style: js.UndefOr[IStyle] = js.undefined
  }
  
  /**
    * An object which defines the style for a data grid.
    *
    * #### Notes
    * All style colors support the full CSS color syntax.
    */
  trait IStyle extends js.Object {
    /**
      * The background color for the body cells.
      *
      * This color is layered on top of the `voidColor`.
      */
    val backgroundColor: js.UndefOr[String] = js.undefined
    /**
      * A function which returns the background color for a column.
      *
      * This color is layered on top of the `backgroundColor` and can
      * be used to implement "zebra striping" of the grid columns.
      */
    val columnBackgroundColor: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
    /**
      * The color for the grid lines of the body cells.
      *
      * The grid lines are draw on top of the cell contents.
      */
    val gridLineColor: js.UndefOr[String] = js.undefined
    /**
      * The background color for the header cells.
      *
      * This color is layered on top of the `voidColor`.
      */
    val headerBackgroundColor: js.UndefOr[String] = js.undefined
    /**
      * The color for the grid lines of the header cells.
      *
      * The grid lines are draw on top of the cell contents.
      */
    val headerGridLineColor: js.UndefOr[String] = js.undefined
    /**
      * The color for the horizontal grid lines of the header cells.
      *
      * This overrides the `headerGridLineColor` option.
      */
    val headerHorizontalGridLineColor: js.UndefOr[String] = js.undefined
    /**
      * The color for the vertical grid lines of the header cells.
      *
      * This overrides the `headerGridLineColor` option.
      */
    val headerVerticalGridLineColor: js.UndefOr[String] = js.undefined
    /**
      * The color for the horizontal grid lines of the body cells.
      *
      * This overrides the `gridLineColor` option.
      */
    val horizontalGridLineColor: js.UndefOr[String] = js.undefined
    /**
      * A function which returns the background color for a row.
      *
      * This color is layered on top of the `backgroundColor` and can
      * be used to implement "zebra striping" of the grid rows.
      */
    val rowBackgroundColor: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
    /**
      * The color for the vertical grid lines of the body cells.
      *
      * This overrides the `gridLineColor` option.
      */
    val verticalGridLineColor: js.UndefOr[String] = js.undefined
    /**
      * The void color for the data grid.
      *
      * This is the base fill color for the entire data grid.
      */
    val voidColor: js.UndefOr[String] = js.undefined
  }
  
  /**
    * The default theme for a data grid.
    */
  val defaultStyle: IStyle = js.native
}

