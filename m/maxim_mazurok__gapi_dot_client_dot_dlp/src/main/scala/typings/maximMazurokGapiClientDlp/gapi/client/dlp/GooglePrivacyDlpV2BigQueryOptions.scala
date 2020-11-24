package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2BigQueryOptions extends js.Object {
  
  /** References to fields excluded from scanning. This allows you to skip inspection of entire columns which you know have no findings. */
  var excludedFields: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.native
  
  /**
    * Table fields that may uniquely identify a row within the table. When `actions.saveFindings.outputConfig.table` is specified, the values of columns specified here are available in
    * the output table under `location.content_locations.record_location.record_key.id_values`. Nested fields such as `person.birthdate.year` are allowed.
    */
  var identifyingFields: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.native
  
  /**
    * Max number of rows to scan. If the table has more rows than this value, the rest of the rows are omitted. If not set, or if set to 0, all rows will be scanned. Only one of
    * rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimit: js.UndefOr[String] = js.native
  
  /**
    * Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to
    * 0. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimitPercent: js.UndefOr[Double] = js.native
  
  var sampleMethod: js.UndefOr[String] = js.native
  
  /** Complete BigQuery table reference. */
  var tableReference: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.native
}
object GooglePrivacyDlpV2BigQueryOptions {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2BigQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2BigQueryOptions]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2BigQueryOptionsOps[Self <: GooglePrivacyDlpV2BigQueryOptions] (val x: Self) extends AnyVal {
    
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
    def setExcludedFieldsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = this.set("excludedFields", js.Array(value :_*))
    
    @scala.inline
    def setExcludedFields(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = this.set("excludedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedFields: Self = this.set("excludedFields", js.undefined)
    
    @scala.inline
    def setIdentifyingFieldsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = this.set("identifyingFields", js.Array(value :_*))
    
    @scala.inline
    def setIdentifyingFields(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = this.set("identifyingFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifyingFields: Self = this.set("identifyingFields", js.undefined)
    
    @scala.inline
    def setRowsLimit(value: String): Self = this.set("rowsLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsLimit: Self = this.set("rowsLimit", js.undefined)
    
    @scala.inline
    def setRowsLimitPercent(value: Double): Self = this.set("rowsLimitPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsLimitPercent: Self = this.set("rowsLimitPercent", js.undefined)
    
    @scala.inline
    def setSampleMethod(value: String): Self = this.set("sampleMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleMethod: Self = this.set("sampleMethod", js.undefined)
    
    @scala.inline
    def setTableReference(value: GooglePrivacyDlpV2BigQueryTable): Self = this.set("tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableReference: Self = this.set("tableReference", js.undefined)
  }
}
