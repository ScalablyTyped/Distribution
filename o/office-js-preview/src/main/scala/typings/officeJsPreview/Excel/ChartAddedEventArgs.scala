package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.ChartAdded
import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the chart that raised the added event.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait ChartAddedEventArgs extends StObject {
  
  /**
    * Gets the ID of the chart that is added to the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var chartId: String
  
  /**
    * Gets the source of the event. See `Excel.EventSource` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var `type`: ChartAdded
  
  /**
    * Gets the ID of the worksheet in which the chart is added.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String
}
object ChartAddedEventArgs {
  
  inline def apply(chartId: String, source: EventSource | Local | Remote, worksheetId: String): ChartAddedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ChartAdded")
    __obj.asInstanceOf[ChartAddedEventArgs]
  }
  
  extension [Self <: ChartAddedEventArgs](x: Self) {
    
    inline def setChartId(value: String): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: ChartAdded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
