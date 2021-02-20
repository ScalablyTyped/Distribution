package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceChartProperties extends StObject {
  
  /** Output only. The data execution status. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.native
  
  /** ID of the data source that the chart is associated with. */
  var dataSourceId: js.UndefOr[String] = js.native
}
object DataSourceChartProperties {
  
  @scala.inline
  def apply(): DataSourceChartProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceChartProperties]
  }
  
  @scala.inline
  implicit class DataSourceChartPropertiesMutableBuilder[Self <: DataSourceChartProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataExecutionStatus(value: DataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
  }
}
