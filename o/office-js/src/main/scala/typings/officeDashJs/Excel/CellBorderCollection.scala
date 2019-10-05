package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.borders` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.borders` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellBorderCollection extends js.Object {
  /**
    *
    * Represents the `format.borders.bottom` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottom: js.UndefOr[CellBorder] = js.undefined
  /**
    *
    * Represents the `format.borders.diagonalDown` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var diagonalDown: js.UndefOr[CellBorder] = js.undefined
  /**
    *
    * Represents the `format.borders.diagonalUp` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var diagonalUp: js.UndefOr[CellBorder] = js.undefined
  /**
    *
    * Represents the `format.borders.horizontal` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontal: js.UndefOr[CellBorder] = js.undefined
  /**
    *
    * Represents the `format.borders.left` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[CellBorder] = js.undefined
  /**
    *
    * Represents the `format.borders.right` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var right: js.UndefOr[CellBorder] = js.undefined
  /**
    *
    * Represents the `format.borders.top` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[CellBorder] = js.undefined
  /**
    *
    * Represents the `format.borders.vertical` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var vertical: js.UndefOr[CellBorder] = js.undefined
}

object CellBorderCollection {
  @scala.inline
  def apply(
    bottom: CellBorder = null,
    diagonalDown: CellBorder = null,
    diagonalUp: CellBorder = null,
    horizontal: CellBorder = null,
    left: CellBorder = null,
    right: CellBorder = null,
    top: CellBorder = null,
    vertical: CellBorder = null
  ): CellBorderCollection = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (diagonalDown != null) __obj.updateDynamic("diagonalDown")(diagonalDown)
    if (diagonalUp != null) __obj.updateDynamic("diagonalUp")(diagonalUp)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[CellBorderCollection]
  }
}

