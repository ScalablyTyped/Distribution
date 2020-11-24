package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.ChartDeleted
import typings.officeJs.officeJsStrings.Local
import typings.officeJs.officeJsStrings.Remote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the chart that raised the Deleted event.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ChartDeletedEventArgs extends js.Object {
  
  /**
    *
    * Gets the id of the chart that is deleted from the worksheet.
    *
    * [Api set: ExcelApi 1.8]
    */
  var chartId: String = js.native
  
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var source: EventSource | Local | Remote = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: ChartDeleted = js.native
  
  /**
    *
    * Gets the id of the worksheet in which the chart is deleted.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String = js.native
}
object ChartDeletedEventArgs {
  
  @scala.inline
  def apply(chartId: String, source: EventSource | Local | Remote, `type`: ChartDeleted, worksheetId: String): ChartDeletedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDeletedEventArgs]
  }
  
  @scala.inline
  implicit class ChartDeletedEventArgsOps[Self <: ChartDeletedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setSource(value: EventSource | Local | Remote): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChartDeleted): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = this.set("worksheetId", value.asInstanceOf[js.Any])
  }
}
