package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElementDimension extends js.Object {
  var rootMaxH: js.UndefOr[scala.Double] = js.undefined
  var rootMaxW: js.UndefOr[scala.Double] = js.undefined
  var rowIndexCellW: js.UndefOr[scala.Double] = js.undefined
  var rowSelectedCellW: js.UndefOr[scala.Double] = js.undefined
  var scrollH: js.UndefOr[scala.Double] = js.undefined
  var scrollW: js.UndefOr[scala.Double] = js.undefined
}

object IElementDimension {
  @scala.inline
  def apply(
    rootMaxH: scala.Int | scala.Double = null,
    rootMaxW: scala.Int | scala.Double = null,
    rowIndexCellW: scala.Int | scala.Double = null,
    rowSelectedCellW: scala.Int | scala.Double = null,
    scrollH: scala.Int | scala.Double = null,
    scrollW: scala.Int | scala.Double = null
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

