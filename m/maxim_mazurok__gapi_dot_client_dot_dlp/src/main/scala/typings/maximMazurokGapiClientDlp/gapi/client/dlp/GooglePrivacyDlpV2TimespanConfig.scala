package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2TimespanConfig extends js.Object {
  
  /**
    * When the job is started by a JobTrigger we will automatically figure out a valid start_time to avoid scanning files that have not been modified since the last time the JobTrigger
    * executed. This will be based on the time of the execution of the last run of the JobTrigger.
    */
  var enableAutoPopulationOfTimespanConfig: js.UndefOr[Boolean] = js.native
  
  /** Exclude files, tables, or rows newer than this value. If not set, no upper time limit is applied. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Exclude files, tables, or rows older than this value. If not set, no lower time limit is applied. */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Specification of the field containing the timestamp of scanned items. Used for data sources like Datastore and BigQuery. For BigQuery: If this value is not specified and the table
    * was modified between the given start and end times, the entire table will be scanned. If this value is specified, then rows are filtered based on the given start and end times. Rows
    * with a `NULL` value in the provided BigQuery column are skipped. Valid data types of the provided BigQuery column are: `INTEGER`, `DATE`, `TIMESTAMP`, and `DATETIME`. For Datastore:
    * If this value is specified, then entities are filtered based on the given start and end times. If an entity does not contain the provided timestamp property or contains empty or
    * invalid values, then it is included. Valid data types of the provided timestamp property are: `TIMESTAMP`.
    */
  var timestampField: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
}
object GooglePrivacyDlpV2TimespanConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2TimespanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TimespanConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TimespanConfigOps[Self <: GooglePrivacyDlpV2TimespanConfig] (val x: Self) extends AnyVal {
    
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
    def setEnableAutoPopulationOfTimespanConfig(value: Boolean): Self = this.set("enableAutoPopulationOfTimespanConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoPopulationOfTimespanConfig: Self = this.set("enableAutoPopulationOfTimespanConfig", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTimestampField(value: GooglePrivacyDlpV2FieldId): Self = this.set("timestampField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampField: Self = this.set("timestampField", js.undefined)
  }
}
