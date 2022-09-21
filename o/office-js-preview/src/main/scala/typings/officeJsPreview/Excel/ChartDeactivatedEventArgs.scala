package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.ChartDeactivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the chart that raised the deactivated event.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait ChartDeactivatedEventArgs extends StObject {
  
  /**
    * Gets the ID of the chart that is deactivated.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var chartId: String
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var `type`: ChartDeactivated
  
  /**
    * Gets the ID of the worksheet in which the chart is deactivated.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String
}
object ChartDeactivatedEventArgs {
  
  inline def apply(chartId: String, worksheetId: String): ChartDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ChartDeactivated")
    __obj.asInstanceOf[ChartDeactivatedEventArgs]
  }
  
  extension [Self <: ChartDeactivatedEventArgs](x: Self) {
    
    inline def setChartId(value: String): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    inline def setType(value: ChartDeactivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
