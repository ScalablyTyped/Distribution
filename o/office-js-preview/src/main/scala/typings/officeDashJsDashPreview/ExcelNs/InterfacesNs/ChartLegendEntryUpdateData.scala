package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartLegendEntry object, for use in `chartLegendEntry.set({ ... })`. */
trait ChartLegendEntryUpdateData extends js.Object {
  /**
    *
    * Represents the visible of a chart legend entry.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartLegendEntryUpdateData {
  @scala.inline
  def apply(visible: js.UndefOr[Boolean] = js.undefined): ChartLegendEntryUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartLegendEntryUpdateData]
  }
}

