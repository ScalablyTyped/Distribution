package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.ChartDeactivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the chart that raised the Deactivated event.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartDeactivatedEventArgs extends StObject {
  
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
  def apply(chartId: String, worksheetId: String): ChartDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ChartDeactivated")
    __obj.asInstanceOf[ChartDeactivatedEventArgs]
  }
  
  @scala.inline
  implicit class ChartDeactivatedEventArgsMutableBuilder[Self <: ChartDeactivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartId(value: String): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChartDeactivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
