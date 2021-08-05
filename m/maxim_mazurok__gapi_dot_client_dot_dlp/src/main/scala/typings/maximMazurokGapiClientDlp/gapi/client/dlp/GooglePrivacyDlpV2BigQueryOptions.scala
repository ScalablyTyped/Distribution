package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2BigQueryOptions extends StObject {
  
  /** References to fields excluded from scanning. This allows you to skip inspection of entire columns which you know have no findings. */
  var excludedFields: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.undefined
  
  /**
    * Table fields that may uniquely identify a row within the table. When `actions.saveFindings.outputConfig.table` is specified, the values of columns specified here are available in
    * the output table under `location.content_locations.record_location.record_key.id_values`. Nested fields such as `person.birthdate.year` are allowed.
    */
  var identifyingFields: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.undefined
  
  /**
    * Max number of rows to scan. If the table has more rows than this value, the rest of the rows are omitted. If not set, or if set to 0, all rows will be scanned. Only one of
    * rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimit: js.UndefOr[String] = js.undefined
  
  /**
    * Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to
    * 0. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimitPercent: js.UndefOr[Double] = js.undefined
  
  var sampleMethod: js.UndefOr[String] = js.undefined
  
  /** Complete BigQuery table reference. */
  var tableReference: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object GooglePrivacyDlpV2BigQueryOptions {
  
  inline def apply(): GooglePrivacyDlpV2BigQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2BigQueryOptions]
  }
  
  extension [Self <: GooglePrivacyDlpV2BigQueryOptions](x: Self) {
    
    inline def setExcludedFields(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "excludedFields", value.asInstanceOf[js.Any])
    
    inline def setExcludedFieldsUndefined: Self = StObject.set(x, "excludedFields", js.undefined)
    
    inline def setExcludedFieldsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "excludedFields", js.Array(value :_*))
    
    inline def setIdentifyingFields(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "identifyingFields", value.asInstanceOf[js.Any])
    
    inline def setIdentifyingFieldsUndefined: Self = StObject.set(x, "identifyingFields", js.undefined)
    
    inline def setIdentifyingFieldsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "identifyingFields", js.Array(value :_*))
    
    inline def setRowsLimit(value: String): Self = StObject.set(x, "rowsLimit", value.asInstanceOf[js.Any])
    
    inline def setRowsLimitPercent(value: Double): Self = StObject.set(x, "rowsLimitPercent", value.asInstanceOf[js.Any])
    
    inline def setRowsLimitPercentUndefined: Self = StObject.set(x, "rowsLimitPercent", js.undefined)
    
    inline def setRowsLimitUndefined: Self = StObject.set(x, "rowsLimit", js.undefined)
    
    inline def setSampleMethod(value: String): Self = StObject.set(x, "sampleMethod", value.asInstanceOf[js.Any])
    
    inline def setSampleMethodUndefined: Self = StObject.set(x, "sampleMethod", js.undefined)
    
    inline def setTableReference(value: GooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    inline def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
  }
}
