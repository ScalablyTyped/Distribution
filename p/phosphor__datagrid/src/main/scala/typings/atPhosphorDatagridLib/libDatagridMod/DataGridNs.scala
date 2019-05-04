package typings
package atPhosphorDatagridLib.libDatagridMod

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
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.all
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.row
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.column
    - atPhosphorDatagridLib.atPhosphorDatagridLibStrings.none
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
    var baseColumnHeaderSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * The base size for columns in the data grid.
      *
      * The default is `64`.
      */
    var baseColumnSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * The base size for row headers in the data grid.
      *
      * The default is `64`.
      */
    var baseRowHeaderSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * The base size for rows in the data grid.
      *
      * The default is `20`.
      */
    var baseRowSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * The cell renderer map for the data grid.
      *
      * The default is an empty renderer map.
      */
    var cellRenderers: js.UndefOr[atPhosphorDatagridLib.libRenderermapMod.RendererMap] = js.undefined
    /**
      * The default cell renderer for the data grid.
      *
      * The default is a new `TextRenderer`.
      */
    var defaultRenderer: js.UndefOr[atPhosphorDatagridLib.libCellrendererMod.CellRenderer] = js.undefined
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
    val backgroundColor: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A function which returns the background color for a column.
      *
      * This color is layered on top of the `backgroundColor` and can
      * be used to implement "zebra striping" of the grid columns.
      */
    val columnBackgroundColor: js.UndefOr[js.Function1[/* index */ scala.Double, java.lang.String]] = js.undefined
    /**
      * The color for the grid lines of the body cells.
      *
      * The grid lines are draw on top of the cell contents.
      */
    val gridLineColor: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The background color for the header cells.
      *
      * This color is layered on top of the `voidColor`.
      */
    val headerBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The color for the grid lines of the header cells.
      *
      * The grid lines are draw on top of the cell contents.
      */
    val headerGridLineColor: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The color for the horizontal grid lines of the header cells.
      *
      * This overrides the `headerGridLineColor` option.
      */
    val headerHorizontalGridLineColor: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The color for the vertical grid lines of the header cells.
      *
      * This overrides the `headerGridLineColor` option.
      */
    val headerVerticalGridLineColor: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The color for the horizontal grid lines of the body cells.
      *
      * This overrides the `gridLineColor` option.
      */
    val horizontalGridLineColor: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A function which returns the background color for a row.
      *
      * This color is layered on top of the `backgroundColor` and can
      * be used to implement "zebra striping" of the grid rows.
      */
    val rowBackgroundColor: js.UndefOr[js.Function1[/* index */ scala.Double, java.lang.String]] = js.undefined
    /**
      * The color for the vertical grid lines of the body cells.
      *
      * This overrides the `gridLineColor` option.
      */
    val verticalGridLineColor: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The void color for the data grid.
      *
      * This is the base fill color for the entire data grid.
      */
    val voidColor: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * The default theme for a data grid.
    */
  val defaultStyle: IStyle = js.native
}

