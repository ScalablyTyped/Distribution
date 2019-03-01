package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the returned format.borders properties of getCell/Row/ColumnProperties or format.borders input parameter of setCell/Row/ColumnProperties.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CellBorderCollection extends js.Object {
  var bottom: js.UndefOr[CellBorder] = js.undefined
  var diagonalDown: js.UndefOr[CellBorder] = js.undefined
  var diagonalUp: js.UndefOr[CellBorder] = js.undefined
  var horizontal: js.UndefOr[CellBorder] = js.undefined
  var left: js.UndefOr[CellBorder] = js.undefined
  var right: js.UndefOr[CellBorder] = js.undefined
  var top: js.UndefOr[CellBorder] = js.undefined
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

