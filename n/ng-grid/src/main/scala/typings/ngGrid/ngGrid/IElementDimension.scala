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
    rootMaxH: js.UndefOr[Double] = js.undefined,
    rootMaxW: js.UndefOr[Double] = js.undefined,
    rowIndexCellW: js.UndefOr[Double] = js.undefined,
    rowSelectedCellW: js.UndefOr[Double] = js.undefined,
    scrollH: js.UndefOr[Double] = js.undefined,
    scrollW: js.UndefOr[Double] = js.undefined
  ): IElementDimension = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rootMaxH)) __obj.updateDynamic("rootMaxH")(rootMaxH.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rootMaxW)) __obj.updateDynamic("rootMaxW")(rootMaxW.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndexCellW)) __obj.updateDynamic("rowIndexCellW")(rowIndexCellW.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSelectedCellW)) __obj.updateDynamic("rowSelectedCellW")(rowSelectedCellW.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollH)) __obj.updateDynamic("scrollH")(scrollH.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollW)) __obj.updateDynamic("scrollW")(scrollW.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElementDimension]
  }
}

