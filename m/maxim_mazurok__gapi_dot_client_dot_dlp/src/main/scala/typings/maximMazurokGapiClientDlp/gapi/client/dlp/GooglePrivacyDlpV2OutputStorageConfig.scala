package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2OutputStorageConfig extends StObject {
  
  /**
    * Schema used for writing the findings for Inspect jobs. This field is only used for Inspect and must be unspecified for Risk jobs. Columns are derived from the `Finding` object. If
    * appending to an existing table, any columns from the predefined schema that are missing will be added. No columns in the existing table will be deleted. If unspecified, then all
    * available columns will be used for a new table or an (existing) table with no schema, and no changes will be made to an existing table that has a schema. Only for use with external
    * storage.
    */
  var outputSchema: js.UndefOr[String] = js.undefined
  
  /**
    * Store findings in an existing table or a new table in an existing dataset. If table_id is not set a new one will be generated for you with the following format:
    * dlp_googleapis_yyyy_mm_dd_[dlp_job_id]. Pacific time zone will be used for generating the date details. For Inspect, each column in an existing output table must have the same name,
    * type, and mode of a field in the `Finding` object. For Risk, an existing output table should be the output of a previous Risk analysis job run on the same source table, with the
    * same privacy metric and quasi-identifiers. Risk jobs that analyze the same table but compute a different privacy metric, or use different sets of quasi-identifiers, cannot store
    * their results in the same table.
    */
  var table: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object GooglePrivacyDlpV2OutputStorageConfig {
  
  inline def apply(): GooglePrivacyDlpV2OutputStorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2OutputStorageConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2OutputStorageConfig] (val x: Self) extends AnyVal {
    
    inline def setOutputSchema(value: String): Self = StObject.set(x, "outputSchema", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemaUndefined: Self = StObject.set(x, "outputSchema", js.undefined)
    
    inline def setTable(value: GooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
