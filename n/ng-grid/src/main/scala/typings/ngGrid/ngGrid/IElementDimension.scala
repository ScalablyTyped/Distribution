package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElementDimension extends js.Object {
  var rootMaxH: js.UndefOr[Double] = js.undefined
  var rootMaxW: js.UndefOr[Double] = js.undefined
  var rowIndexCellW: js.UndefOr[Double] = js.undefined
  var rowSelectedCellW: js.UndefOr[Double] = js.undefined
  var scrollH: js.UndefOr[Double] = js.undefined
  var scrollW: js.UndefOr[Double] = js.undefined
}

object IElementDimension {
  @scala.inline
  def apply(
    rootMaxH: Int | Double = null,
    rootMaxW: Int | Double = null,
    rowIndexCellW: Int | Double = null,
    rowSelectedCellW: Int | Double = null,
    scrollH: Int | Double = null,
    scrollW: Int | Double = null
  ): IElementDimension = {
    val __obj = js.Dynamic.literal()
    if (rootMaxH != null) __obj.updateDynamic("rootMaxH")(rootMaxH.asInstanceOf[js.Any])
    if (rootMaxW != null) __obj.updateDynamic("rootMaxW")(rootMaxW.asInstanceOf[js.Any])
    if (rowIndexCellW != null) __obj.updateDynamic("rowIndexCellW")(rowIndexCellW.asInstanceOf[js.Any])
    if (rowSelectedCellW != null) __obj.updateDynamic("rowSelectedCellW")(rowSelectedCellW.asInstanceOf[js.Any])
    if (scrollH != null) __obj.updateDynamic("scrollH")(scrollH.asInstanceOf[js.Any])
    if (scrollW != null) __obj.updateDynamic("scrollW")(scrollW.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElementDimension]
  }
}

