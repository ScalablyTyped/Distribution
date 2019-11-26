package typings.officeDashJs.Excel

import typings.officeDashJs.officeDashJsStrings.ChartAdded
import typings.officeDashJs.officeDashJsStrings.Local
import typings.officeDashJs.officeDashJsStrings.Remote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the chart that raised the Added event.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartAddedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the chart that is added to the worksheet.
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
  var `type`: ChartAdded
  /**
    *
    * Gets the id of the worksheet in which the chart is added.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String
}

object ChartAddedEventArgs {
  @scala.inline
  def apply(chartId: String, source: EventSource | Local | Remote, `type`: ChartAdded, worksheetId: String): ChartAddedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAddedEventArgs]
  }
}

