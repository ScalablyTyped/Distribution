package typings.officeUiFabricReact.detailsHeaderTypesMod

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
  def apply(columnIndex: Double, columnMinWidth: Double, originX: js.UndefOr[Double] = js.undefined): IColumnResizeDetails = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], columnMinWidth = columnMinWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(originX)) __obj.updateDynamic("originX")(originX.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnResizeDetails]
  }
}

