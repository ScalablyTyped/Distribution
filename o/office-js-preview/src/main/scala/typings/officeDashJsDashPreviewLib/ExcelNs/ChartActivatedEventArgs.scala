package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the chart that raised the Activated event.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartActivatedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the chart that is activated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var chartId: java.lang.String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ChartActivated
  /**
    *
    * Gets the id of the worksheet in which the chart is activated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: java.lang.String
}

object ChartActivatedEventArgs {
  @scala.inline
  def apply(
    chartId: java.lang.String,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ChartActivated,
    worksheetId: java.lang.String
  ): ChartActivatedEventArgs = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("chartId")(chartId)
    __obj.updateDynamic("worksheetId")(worksheetId)
    __obj.asInstanceOf[ChartActivatedEventArgs]
  }
}

