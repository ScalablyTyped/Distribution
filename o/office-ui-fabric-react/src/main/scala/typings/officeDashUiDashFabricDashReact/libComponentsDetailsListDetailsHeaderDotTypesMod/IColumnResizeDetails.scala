package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnResizeDetails extends js.Object {
  var columnIndex: Double
  var columnMinWidth: Double
  var originX: js.UndefOr[Double] = js.undefined
}

object IColumnResizeDetails {
  @scala.inline
  def apply(columnIndex: Double, columnMinWidth: Double, originX: Int | Double = null): IColumnResizeDetails = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex, columnMinWidth = columnMinWidth)
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnResizeDetails]
  }
}

