package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ChartDeactivated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the chart that raised the Deactivated event.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartDeactivatedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the chart that is deactivated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var chartId: String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: ChartDeactivated
  /**
    *
    * Gets the id of the worksheet in which the chart is deactivated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String
}

object ChartDeactivatedEventArgs {
  @scala.inline
  def apply(chartId: String, `type`: ChartDeactivated, worksheetId: String): ChartDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChartDeactivatedEventArgs]
  }
}

