package typings.officeUiFabricReact.detailsRowTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsRowStyles extends js.Object {
  var cell: IStyle
  var cellAnimation: IStyle
  var cellMeasurer: IStyle
  var cellPadded: IStyle
  var cellUnpadded: IStyle
  var check: IStyle
  var checkCell: IStyle
  var checkCover: IStyle
  var fields: IStyle
  var isMultiline: IStyle
  var isRowHeader: IStyle
  var root: IStyle
}

object IDetailsRowStyles {
  @scala.inline
  def apply(
    cell: js.UndefOr[Null | IStyle] = js.undefined,
    cellAnimation: js.UndefOr[Null | IStyle] = js.undefined,
    cellMeasurer: js.UndefOr[Null | IStyle] = js.undefined,
    cellPadded: js.UndefOr[Null | IStyle] = js.undefined,
    cellUnpadded: js.UndefOr[Null | IStyle] = js.undefined,
    check: js.UndefOr[Null | IStyle] = js.undefined,
    checkCell: js.UndefOr[Null | IStyle] = js.undefined,
    checkCover: js.UndefOr[Null | IStyle] = js.undefined,
    fields: js.UndefOr[Null | IStyle] = js.undefined,
    isMultiline: js.UndefOr[Null | IStyle] = js.undefined,
    isRowHeader: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IDetailsRowStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cell)) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (!js.isUndefined(cellAnimation)) __obj.updateDynamic("cellAnimation")(cellAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(cellMeasurer)) __obj.updateDynamic("cellMeasurer")(cellMeasurer.asInstanceOf[js.Any])
    if (!js.isUndefined(cellPadded)) __obj.updateDynamic("cellPadded")(cellPadded.asInstanceOf[js.Any])
    if (!js.isUndefined(cellUnpadded)) __obj.updateDynamic("cellUnpadded")(cellUnpadded.asInstanceOf[js.Any])
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (!js.isUndefined(checkCell)) __obj.updateDynamic("checkCell")(checkCell.asInstanceOf[js.Any])
    if (!js.isUndefined(checkCover)) __obj.updateDynamic("checkCover")(checkCover.asInstanceOf[js.Any])
    if (!js.isUndefined(fields)) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(isMultiline)) __obj.updateDynamic("isMultiline")(isMultiline.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowHeader)) __obj.updateDynamic("isRowHeader")(isRowHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowStyles]
  }
}

