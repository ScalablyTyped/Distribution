package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TimespanConfig extends StObject {
  
  /**
    * When the job is started by a JobTrigger we will automatically figure out a valid start_time to avoid scanning files that have not been modified since the last time the JobTrigger
    * executed. This will be based on the time of the execution of the last run of the JobTrigger.
    */
  var enableAutoPopulationOfTimespanConfig: js.UndefOr[Boolean] = js.undefined
  
  /** Exclude files, tables, or rows newer than this value. If not set, no upper time limit is applied. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Exclude files, tables, or rows older than this value. If not set, no lower time limit is applied. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Specification of the field containing the timestamp of scanned items. Used for data sources like Datastore and BigQuery. *For BigQuery* If this value is not specified and the table
    * was modified between the given start and end times, the entire table will be scanned. If this value is specified, then rows are filtered based on the given start and end times. Rows
    * with a `NULL` value in the provided BigQuery column are skipped. Valid data types of the provided BigQuery column are: `INTEGER`, `DATE`, `TIMESTAMP`, and `DATETIME`. If your
    * BigQuery table is [partitioned at ingestion time](https://cloud.google.com/bigquery/docs/partitioned-tables#ingestion_time), you can use any of the following pseudo-columns as your
    * timestamp field. When used with Cloud DLP, these pseudo-column names are case sensitive. - _PARTITIONTIME - _PARTITIONDATE - _PARTITION_LOAD_TIME *For Datastore* If this value is
    * specified, then entities are filtered based on the given start and end times. If an entity does not contain the provided timestamp property or contains empty or invalid values, then
    * it is included. Valid data types of the provided timestamp property are: `TIMESTAMP`. See the [known issue](https://cloud.google.com/dlp/docs/known-issues#bq-timespan) related to
    * this operation.
    */
  var timestampField: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.undefined
}
object GooglePrivacyDlpV2TimespanConfig {
  
  inline def apply(): GooglePrivacyDlpV2TimespanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TimespanConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2TimespanConfig] (val x: Self) extends AnyVal {
    
    inline def setEnableAutoPopulationOfTimespanConfig(value: Boolean): Self = StObject.set(x, "enableAutoPopulationOfTimespanConfig", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoPopulationOfTimespanConfigUndefined: Self = StObject.set(x, "enableAutoPopulationOfTimespanConfig", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTimestampField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "timestampField", value.asInstanceOf[js.Any])
    
    inline def setTimestampFieldUndefined: Self = StObject.set(x, "timestampField", js.undefined)
  }
}
