package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ChartDeleted
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Local
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Remote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the chart that raised the Deleted event.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartDeletedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the chart that is deleted from the worksheet.
    *
    * [Api set: ExcelApi 1.8]
    */
  var chartId: String
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: ChartDeleted
  /**
    *
    * Gets the id of the worksheet in which the chart is deleted.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String
}

object ChartDeletedEventArgs {
  @scala.inline
  def apply(chartId: String, source: EventSource | Local | Remote, `type`: ChartDeleted, worksheetId: String): ChartDeletedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId, source = source.asInstanceOf[js.Any], worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChartDeletedEventArgs]
  }
}

