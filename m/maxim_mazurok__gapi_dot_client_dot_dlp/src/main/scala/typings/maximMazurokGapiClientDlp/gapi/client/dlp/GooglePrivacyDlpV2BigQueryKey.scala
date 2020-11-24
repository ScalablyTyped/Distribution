package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2BigQueryKey extends js.Object {
  
  /**
    * Row number inferred at the time the table was scanned. This value is nondeterministic, cannot be queried, and may be null for inspection jobs. To locate findings within a table,
    * specify `inspect_job.storage_config.big_query_options.identifying_fields` in `CreateDlpJobRequest`.
    */
  var rowNumber: js.UndefOr[String] = js.native
  
  /** Complete BigQuery table reference. */
  var tableReference: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.native
}
object GooglePrivacyDlpV2BigQueryKey {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2BigQueryKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2BigQueryKey]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2BigQueryKeyOps[Self <: GooglePrivacyDlpV2BigQueryKey] (val x: Self) extends AnyVal {
    
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
    def setRowNumber(value: String): Self = this.set("rowNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowNumber: Self = this.set("rowNumber", js.undefined)
    
    @scala.inline
    def setTableReference(value: GooglePrivacyDlpV2BigQueryTable): Self = this.set("tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableReference: Self = this.set("tableReference", js.undefined)
  }
}
