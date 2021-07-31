package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2BigQueryKey extends StObject {
  
  /**
    * Row number inferred at the time the table was scanned. This value is nondeterministic, cannot be queried, and may be null for inspection jobs. To locate findings within a table,
    * specify `inspect_job.storage_config.big_query_options.identifying_fields` in `CreateDlpJobRequest`.
    */
  var rowNumber: js.UndefOr[String] = js.undefined
  
  /** Complete BigQuery table reference. */
  var tableReference: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object GooglePrivacyDlpV2BigQueryKey {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2BigQueryKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2BigQueryKey]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2BigQueryKeyMutableBuilder[Self <: GooglePrivacyDlpV2BigQueryKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowNumber(value: String): Self = StObject.set(x, "rowNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowNumberUndefined: Self = StObject.set(x, "rowNumber", js.undefined)
    
    @scala.inline
    def setTableReference(value: GooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
  }
}
