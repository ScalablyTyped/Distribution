package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceChartProperties extends StObject {
  
  /** Output only. The data execution status. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.undefined
  
  /** ID of the data source that the chart is associated with. */
  var dataSourceId: js.UndefOr[String] = js.undefined
}
object DataSourceChartProperties {
  
  inline def apply(): DataSourceChartProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceChartProperties]
  }
  
  extension [Self <: DataSourceChartProperties](x: Self) {
    
    inline def setDataExecutionStatus(value: DataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
  }
}
