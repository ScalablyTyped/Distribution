package typings.maximMazurokGapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogSink extends js.Object {
  
  /** Optional. Options that affect sinks exporting data to BigQuery. */
  var bigqueryOptions: js.UndefOr[BigQueryOptions] = js.native
  
  /** Output only. The creation timestamp of the sink.This field may not be present for older sinks. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. A description of this sink. The maximum length of the description is 8000 characters. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. The export destination: "storage.googleapis.com/[GCS_BUCKET]" "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
    * "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]" The sink's writer_identity, set when the sink is created, must have permission to write to the destination or else
    * the log entries are not exported. For more information, see Exporting Logs with Sinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).
    */
  var destination: js.UndefOr[String] = js.native
  
  /** Optional. If set to True, then this sink is disabled and it does not export any log entries. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** Optional. Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported. */
  var exclusions: js.UndefOr[js.Array[LogExclusion]] = js.native
  
  /**
    * Optional. An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries). The only exported log entries are those that are in the resource owning the sink and
    * that match the filter. For example: logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity>=ERROR
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Optional. This field applies only to sinks owned by organizations and folders. If the field is false, the default, only the logs owned by the sink's parent resource are available
    * for export. If the field is true, then logs from all the projects, folders, and billing accounts contained in the sink's parent resource are also available for export. Whether a
    * particular log entry from the children is exported depends on the sink's filter expression. For example, if this field is true, then the filter resource.type=gce_instance would
    * export all Compute Engine VM instance log entries from all projects in the sink's parent. To only export entries from certain child projects, filter on the project part of the log
    * name: logName:("projects/test-project1/" OR "projects/test-project2/") AND resource.type=gce_instance
    */
  var includeChildren: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. The client-assigned sink identifier, unique within the project. Example: "my-syslog-errors-to-pubsub". Sink identifiers are limited to 100 characters and can include only
    * the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods. First character has to be alphanumeric.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Deprecated. This field is unused. */
  var outputVersionFormat: js.UndefOr[String] = js.native
  
  /** Output only. The last update timestamp of the sink.This field may not be present for older sinks. */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. An IAM identity—a service account or group—under which Logging writes the exported log entries to the sink's destination. This field is set by sinks.create and
    * sinks.update based on the value of unique_writer_identity in those methods.Until you grant this identity write-access to the destination, log entry exports from this sink will fail.
    * For more information, see Granting Access for a Resource (https://cloud.google.com/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource).
    * Consult the destination service's documentation to determine the appropriate IAM roles to assign to the identity.
    */
  var writerIdentity: js.UndefOr[String] = js.native
}
object LogSink {
  
  @scala.inline
  def apply(): LogSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSink]
  }
  
  @scala.inline
  implicit class LogSinkOps[Self <: LogSink] (val x: Self) extends AnyVal {
    
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
    def setBigqueryOptions(value: BigQueryOptions): Self = this.set("bigqueryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryOptions: Self = this.set("bigqueryOptions", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: LogExclusion*): Self = this.set("exclusions", js.Array(value :_*))
    
    @scala.inline
    def setExclusions(value: js.Array[LogExclusion]): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusions: Self = this.set("exclusions", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIncludeChildren(value: Boolean): Self = this.set("includeChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeChildren: Self = this.set("includeChildren", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutputVersionFormat(value: String): Self = this.set("outputVersionFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputVersionFormat: Self = this.set("outputVersionFormat", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setWriterIdentity(value: String): Self = this.set("writerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriterIdentity: Self = this.set("writerIdentity", js.undefined)
  }
}
