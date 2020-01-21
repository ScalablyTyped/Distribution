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
    cell: IStyle = null,
    cellAnimation: IStyle = null,
    cellMeasurer: IStyle = null,
    cellPadded: IStyle = null,
    cellUnpadded: IStyle = null,
    check: IStyle = null,
    checkCell: IStyle = null,
    checkCover: IStyle = null,
    fields: IStyle = null,
    isMultiline: IStyle = null,
    isRowHeader: IStyle = null,
    root: IStyle = null
  ): IDetailsRowStyles = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (cellAnimation != null) __obj.updateDynamic("cellAnimation")(cellAnimation.asInstanceOf[js.Any])
    if (cellMeasurer != null) __obj.updateDynamic("cellMeasurer")(cellMeasurer.asInstanceOf[js.Any])
    if (cellPadded != null) __obj.updateDynamic("cellPadded")(cellPadded.asInstanceOf[js.Any])
    if (cellUnpadded != null) __obj.updateDynamic("cellUnpadded")(cellUnpadded.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (checkCell != null) __obj.updateDynamic("checkCell")(checkCell.asInstanceOf[js.Any])
    if (checkCover != null) __obj.updateDynamic("checkCover")(checkCover.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (isMultiline != null) __obj.updateDynamic("isMultiline")(isMultiline.asInstanceOf[js.Any])
    if (isRowHeader != null) __obj.updateDynamic("isRowHeader")(isRowHeader.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowStyles]
  }
}

