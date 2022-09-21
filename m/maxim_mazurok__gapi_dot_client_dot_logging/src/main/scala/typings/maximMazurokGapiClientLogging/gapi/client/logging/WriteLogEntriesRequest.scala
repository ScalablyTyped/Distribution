package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteLogEntriesRequest extends StObject {
  
  /**
    * Optional. If true, the request should expect normal response, but the entries won't be persisted nor exported. Useful for checking whether the logging API endpoints are working
    * properly before sending valuable data.
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The log entries to send to Logging. The order of log entries in this list does not matter. Values supplied in this method's log_name, resource, and labels fields are
    * copied into those log entries in this list that do not include values for their corresponding fields. For more information, see the LogEntry type.If the timestamp or insert_id
    * fields are missing in log entries, then this method supplies the current time or a unique identifier, respectively. The supplied values are chosen so that, among the log entries
    * that did not supply their own values, the entries earlier in the list will sort before the entries later in the list. See the entries.list method.Log entries with timestamps that
    * are more than the logs retention period (https://cloud.google.com/logging/quotas) in the past or more than 24 hours in the future will not be available when calling entries.list.
    * However, those log entries can still be exported with LogSinks (https://cloud.google.com/logging/docs/api/tasks/exporting-logs).To improve throughput and to avoid exceeding the
    * quota limit (https://cloud.google.com/logging/quotas) for calls to entries.write, you should try to include several log entries in this list, rather than calling this method for
    * each individual log entry.
    */
  var entries: js.UndefOr[js.Array[LogEntry]] = js.undefined
  
  /**
    * Optional. Default labels that are added to the labels field of all log entries in entries. If a log entry already has a label with the same key as a label in this parameter, then
    * the log entry's label is not changed. See LogEntry.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.WriteLogEntriesRequest & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Optional. A default log resource name that is assigned to all log entries in entries that do not specify a value for log_name: projects/[PROJECT_ID]/logs/[LOG_ID]
    * organizations/[ORGANIZATION_ID]/logs/[LOG_ID] billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID] folders/[FOLDER_ID]/logs/[LOG_ID][LOG_ID] must be URL-encoded. For example:
    * "projects/my-project-id/logs/syslog" "organizations/123/logs/cloudaudit.googleapis.com%2Factivity" The permission logging.logEntries.create is needed on each project, organization,
    * billing account, or folder that is receiving new log entries, whether the resource is specified in logName or in an individual log entry.
    */
  var logName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Whether a batch's valid entries should be written even if some other entry failed due to a permanent error such as INVALID_ARGUMENT or PERMISSION_DENIED. If any entry
    * failed, then the response status is the response status of one of the failed entries. The response will include error details in WriteLogEntriesPartialErrors.log_entry_errors keyed
    * by the entries' zero-based index in the entries. Failed requests for which no entries are written will not include per-entry errors.
    */
  var partialSuccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. A default monitored resource object that is assigned to all log entries in entries that do not specify a value for resource. Example: { "type": "gce_instance", "labels": {
    * "zone": "us-central1-a", "instance_id": "00000000000000000000" }} See LogEntry.
    */
  var resource: js.UndefOr[MonitoredResource] = js.undefined
}
object WriteLogEntriesRequest {
  
  inline def apply(): WriteLogEntriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteLogEntriesRequest]
  }
  
  extension [Self <: WriteLogEntriesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setEntries(value: js.Array[LogEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: LogEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.WriteLogEntriesRequest & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    inline def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
    
    inline def setPartialSuccess(value: Boolean): Self = StObject.set(x, "partialSuccess", value.asInstanceOf[js.Any])
    
    inline def setPartialSuccessUndefined: Self = StObject.set(x, "partialSuccess", js.undefined)
    
    inline def setResource(value: MonitoredResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
