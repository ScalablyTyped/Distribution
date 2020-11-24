package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigQueryTableSpec extends js.Object {
  
  /** The BigQuery dataset id. */
  var datasetId: js.UndefOr[String] = js.native
  
  /** The BigQuery table id. */
  var tableId: js.UndefOr[String] = js.native
  
  /** The ID of a BigQuery project the table belongs to. If not specified, the project_id is assumed. */
  var tableProjectId: js.UndefOr[String] = js.native
}
object BigQueryTableSpec {
  
  @scala.inline
  def apply(): BigQueryTableSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryTableSpec]
  }
  
  @scala.inline
  implicit class BigQueryTableSpecOps[Self <: BigQueryTableSpec] (val x: Self) extends AnyVal {
    
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
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
    
    @scala.inline
    def setTableProjectId(value: String): Self = this.set("tableProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableProjectId: Self = this.set("tableProjectId", js.undefined)
  }
}
