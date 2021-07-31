package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.ChartActivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the chart that raised the Activated event.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartActivatedEventArgs extends StObject {
  
  /**
    *
    * Gets the id of the chart that is activated.
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
  var `type`: ChartActivated
  
  /**
    *
    * Gets the id of the worksheet in which the chart is activated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String
}
object ChartActivatedEventArgs {
  
  @scala.inline
  def apply(chartId: String, worksheetId: String): ChartActivatedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ChartActivated")
    __obj.asInstanceOf[ChartActivatedEventArgs]
  }
  
  @scala.inline
  implicit class ChartActivatedEventArgsMutableBuilder[Self <: ChartActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartId(value: String): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChartActivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
