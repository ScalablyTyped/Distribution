package typings.atPhosphorDatagrid.libDatagridMod.DataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object IStyle {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    columnBackgroundColor: /* index */ Double => String = null,
    gridLineColor: String = null,
    headerBackgroundColor: String = null,
    headerGridLineColor: String = null,
    headerHorizontalGridLineColor: String = null,
    headerVerticalGridLineColor: String = null,
    horizontalGridLineColor: String = null,
    rowBackgroundColor: /* index */ Double => String = null,
    verticalGridLineColor: String = null,
    voidColor: String = null
  ): IStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (columnBackgroundColor != null) __obj.updateDynamic("columnBackgroundColor")(js.Any.fromFunction1(columnBackgroundColor))
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor)
    if (headerBackgroundColor != null) __obj.updateDynamic("headerBackgroundColor")(headerBackgroundColor)
    if (headerGridLineColor != null) __obj.updateDynamic("headerGridLineColor")(headerGridLineColor)
    if (headerHorizontalGridLineColor != null) __obj.updateDynamic("headerHorizontalGridLineColor")(headerHorizontalGridLineColor)
    if (headerVerticalGridLineColor != null) __obj.updateDynamic("headerVerticalGridLineColor")(headerVerticalGridLineColor)
    if (horizontalGridLineColor != null) __obj.updateDynamic("horizontalGridLineColor")(horizontalGridLineColor)
    if (rowBackgroundColor != null) __obj.updateDynamic("rowBackgroundColor")(js.Any.fromFunction1(rowBackgroundColor))
    if (verticalGridLineColor != null) __obj.updateDynamic("verticalGridLineColor")(verticalGridLineColor)
    if (voidColor != null) __obj.updateDynamic("voidColor")(voidColor)
    __obj.asInstanceOf[IStyle]
  }
}

