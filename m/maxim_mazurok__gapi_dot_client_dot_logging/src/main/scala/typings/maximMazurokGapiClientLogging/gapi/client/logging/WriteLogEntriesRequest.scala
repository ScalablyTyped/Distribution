package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteLogEntriesRequest extends js.Object {
  
  /**
    * Optional. If true, the request should expect normal response, but the entries won't be persisted nor exported. Useful for checking whether the logging API endpoints are working
    * properly before sending valuable data.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. The log entries to send to Logging. The order of log entries in this list does not matter. Values supplied in this method's log_name, resource, and labels fields are
    * copied into those log entries in this list that do not include values for their corresponding fields. For more information, see the LogEntry type.If the timestamp or insert_id
    * fields are missing in log entries, then this method supplies the current time or a unique identifier, respectively. The supplied values are chosen so that, among the log entries
    * that did not supply their own values, the entries earlier in the list will sort before the entries later in the list. See the entries.list method.Log entries with timestamps that
    * are more than the logs retention period (https://cloud.google.com/logging/quota-policy) in the past or more than 24 hours in the future will not be available when calling
    * entries.list. However, those log entries can still be exported with LogSinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).To improve throughput and to avoid
    * exceeding the quota limit (https://cloud.google.com/logging/quota-policy) for calls to entries.write, you should try to include several log entries in this list, rather than calling
    * this method for each individual log entry.
    */
  var entries: js.UndefOr[js.Array[LogEntry]] = js.native
  
  /**
    * Optional. Default labels that are added to the labels field of all log entries in entries. If a log entry already has a label with the same key as a label in this parameter, then
    * the log entry's label is not changed. See LogEntry.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.WriteLogEntriesRequest with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Optional. A default log resource name that is assigned to all log entries in entries that do not specify a value for log_name: "projects/[PROJECT_ID]/logs/[LOG_ID]"
    * "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]" [LOG_ID] must be URL-encoded. For example:
    * "projects/my-project-id/logs/syslog" "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity" The permission logging.logEntries.create is needed on each
    * project, organization, billing account, or folder that is receiving new log entries, whether the resource is specified in logName or in an individual log entry.
    */
  var logName: js.UndefOr[String] = js.native
  
  /**
    * Optional. Whether valid entries should be written even if some other entries fail due to INVALID_ARGUMENT or PERMISSION_DENIED errors. If any entry is not written, then the response
    * status is the error associated with one of the failed entries and the response includes error details keyed by the entries' zero-based index in the entries.write method.
    */
  var partialSuccess: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. A default monitored resource object that is assigned to all log entries in entries that do not specify a value for resource. Example: { "type": "gce_instance", "labels": {
    * "zone": "us-central1-a", "instance_id": "00000000000000000000" }} See LogEntry.
    */
  var resource: js.UndefOr[MonitoredResource] = js.native
}
object WriteLogEntriesRequest {
  
  @scala.inline
  def apply(): WriteLogEntriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteLogEntriesRequest]
  }
  
  @scala.inline
  implicit class WriteLogEntriesRequestOps[Self <: WriteLogEntriesRequest] (val x: Self) extends AnyVal {
    
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
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: LogEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[LogEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.WriteLogEntriesRequest with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLogName(value: String): Self = this.set("logName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogName: Self = this.set("logName", js.undefined)
    
    @scala.inline
    def setPartialSuccess(value: Boolean): Self = this.set("partialSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialSuccess: Self = this.set("partialSuccess", js.undefined)
    
    @scala.inline
    def setResource(value: MonitoredResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
