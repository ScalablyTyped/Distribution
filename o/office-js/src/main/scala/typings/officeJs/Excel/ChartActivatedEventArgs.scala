package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.ChartActivated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the chart that raised the Activated event.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ChartActivatedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the chart that is activated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var chartId: String = js.native
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: ChartActivated = js.native
  /**
    *
    * Gets the id of the worksheet in which the chart is activated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String = js.native
}

object ChartActivatedEventArgs {
  @scala.inline
  def apply(chartId: String, `type`: ChartActivated, worksheetId: String): ChartActivatedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartActivatedEventArgs]
  }
  @scala.inline
  implicit class ChartActivatedEventArgsOps[Self <: ChartActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChartId(value: String): Self = this.set("chartId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ChartActivated): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorksheetId(value: String): Self = this.set("worksheetId", value.asInstanceOf[js.Any])
  }
  
}

