package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSpec extends StObject {
  
  /** A BigQueryDataSourceSpec. */
  var bigQuery: js.UndefOr[BigQueryDataSourceSpec] = js.undefined
  
  /** The parameters of the data source, used when querying the data source. */
  var parameters: js.UndefOr[js.Array[DataSourceParameter]] = js.undefined
}
object DataSourceSpec {
  
  @scala.inline
  def apply(): DataSourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSpec]
  }
  
  @scala.inline
  implicit class DataSourceSpecMutableBuilder[Self <: DataSourceSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigQuery(value: BigQueryDataSourceSpec): Self = StObject.set(x, "bigQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigQueryUndefined: Self = StObject.set(x, "bigQuery", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[DataSourceParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: DataSourceParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
