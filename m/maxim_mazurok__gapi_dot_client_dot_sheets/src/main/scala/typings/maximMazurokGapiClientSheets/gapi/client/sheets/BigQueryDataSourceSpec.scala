package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigQueryDataSourceSpec extends StObject {
  
  /** The ID of a BigQuery enabled GCP project with a billing account attached. For any queries executed against the data source, the project is charged. */
  var projectId: js.UndefOr[String] = js.native
  
  /** A BigQueryQuerySpec. */
  var querySpec: js.UndefOr[BigQueryQuerySpec] = js.native
  
  /** A BigQueryTableSpec. */
  var tableSpec: js.UndefOr[BigQueryTableSpec] = js.native
}
object BigQueryDataSourceSpec {
  
  @scala.inline
  def apply(): BigQueryDataSourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryDataSourceSpec]
  }
  
  @scala.inline
  implicit class BigQueryDataSourceSpecMutableBuilder[Self <: BigQueryDataSourceSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setQuerySpec(value: BigQueryQuerySpec): Self = StObject.set(x, "querySpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuerySpecUndefined: Self = StObject.set(x, "querySpec", js.undefined)
    
    @scala.inline
    def setTableSpec(value: BigQueryTableSpec): Self = StObject.set(x, "tableSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableSpecUndefined: Self = StObject.set(x, "tableSpec", js.undefined)
  }
}
