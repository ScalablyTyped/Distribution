package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigQueryDataSourceSpec extends js.Object {
  
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
  implicit class BigQueryDataSourceSpecOps[Self <: BigQueryDataSourceSpec] (val x: Self) extends AnyVal {
    
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setQuerySpec(value: BigQueryQuerySpec): Self = this.set("querySpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuerySpec: Self = this.set("querySpec", js.undefined)
    
    @scala.inline
    def setTableSpec(value: BigQueryTableSpec): Self = this.set("tableSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableSpec: Self = this.set("tableSpec", js.undefined)
  }
}
