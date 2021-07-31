package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogEntry extends StObject {
  
  /** Optional. Information about the HTTP request associated with this log entry, if applicable. */
  var httpRequest: js.UndefOr[HttpRequest] = js.undefined
  
  /**
    * Optional. A unique identifier for the log entry. If you provide a value, then Logging considers other log entries in the same project, with the same timestamp, and with the same
    * insert_id to be duplicates which are removed in a single query result. However, there are no guarantees of de-duplication in the export of logs.If the insert_id is omitted when
    * writing a log entry, the Logging API assigns its own unique identifier in this field.In queries, the insert_id is also used to order log entries that have the same log_name and
    * timestamp values.
    */
  var insertId: js.UndefOr[String] = js.undefined
  
  /** The log entry payload, represented as a structure that is expressed as a JSON object. */
  var jsonPayload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.LogEntry & TopLevel[js.Any]
  ] = js.undefined
  
  /** Optional. A set of user-defined (key, value) data that provides additional information about the log entry. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.LogEntry & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Required. The resource name of the log to which this log entry belongs: "projects/[PROJECT_ID]/logs/[LOG_ID]" "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]" A project number may be used in place of PROJECT_ID. The project number is translated to its
    * corresponding PROJECT_ID internally and the log_name field will contain PROJECT_ID in queries and exports.[LOG_ID] must be URL-encoded within log_name. Example:
    * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity". [LOG_ID] must be less than 512 characters long and can only include the following characters: upper
    * and lower case alphanumeric characters, forward-slash, underscore, hyphen, and period.For backward compatibility, if log_name begins with a forward-slash, such as /projects/...,
    * then the log entry is ingested as usual but the forward-slash is removed. Listing the log entry will not show the leading slash and filtering for a log name with a leading slash
    * will never return any results.
    */
  var logName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Deprecated. Additional metadata about the monitored resource.Only k8s_container, k8s_pod, and k8s_node MonitoredResources have this field populated for GKE versions
    * older than 1.12.6. For GKE versions 1.12.6 and above, the metadata field has been deprecated. The Kubernetes pod labels that used to be in metadata.userLabels will now be present in
    * the labels field with a key prefix of k8s-pod/. The system labels that were present in the metadata.systemLabels field will no longer be available in the LogEntry.
    */
  var metadata: js.UndefOr[MonitoredResourceMetadata] = js.undefined
  
  /** Optional. Information about an operation associated with the log entry, if applicable. */
  var operation: js.UndefOr[LogEntryOperation] = js.undefined
  
  /**
    * The log entry payload, represented as a protocol buffer. Some Google Cloud Platform services use this field for their log entry payloads.The following protocol buffer types are
    * supported; user-defined types are not supported:"type.googleapis.com/google.cloud.audit.AuditLog" "type.googleapis.com/google.appengine.logging.v1.RequestLog"
    */
  var protoPayload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.LogEntry & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The time the log entry was received by Logging. */
  var receiveTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The monitored resource that produced this log entry.Example: a log entry that reports a database error would be associated with the monitored resource designating the
    * particular database that reported the error.
    */
  var resource: js.UndefOr[MonitoredResource] = js.undefined
  
  /** Optional. The severity of the log entry. The default value is LogSeverity.DEFAULT. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** Optional. Source code location information associated with the log entry, if any. */
  var sourceLocation: js.UndefOr[LogEntrySourceLocation] = js.undefined
  
  /**
    * Optional. The span ID within the trace associated with the log entry.For Trace spans, this is the same format that the Trace API v2 uses: a 16-character hexadecimal encoding of an
    * 8-byte array, such as 000000000000004a.
    */
  var spanId: js.UndefOr[String] = js.undefined
  
  /** The log entry payload, represented as a Unicode string (UTF-8). */
  var textPayload: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The time the event described by the log entry occurred. This time is used to compute the log entry's age and to enforce the logs retention period. If this field is omitted
    * in a new log entry, then Logging assigns it the current time. Timestamps have nanosecond accuracy, but trailing zeros in the fractional seconds might be omitted when the timestamp
    * is displayed.Incoming log entries must have timestamps that don't exceed the logs retention period (https://cloud.google.com/logging/quotas#logs_retention_periods) in the past, and
    * that don't exceed 24 hours in the future. Log entries outside those time boundaries aren't ingested by Logging.
    */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Resource name of the trace associated with the log entry, if any. If it contains a relative resource name, the name is assumed to be relative to //tracing.googleapis.com.
    * Example: projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824
    */
  var trace: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The sampling decision of the trace associated with the log entry.True means that the trace resource name in the trace field was sampled for storage in a trace backend.
    * False means that the trace was not sampled for storage when this log entry was written, or the sampling decision was unknown at the time. A non-sampled trace value is still useful
    * as a request correlation identifier. The default is False.
    */
  var traceSampled: js.UndefOr[Boolean] = js.undefined
}
object LogEntry {
  
  @scala.inline
  def apply(): LogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntry]
  }
  
  @scala.inline
  implicit class LogEntryMutableBuilder[Self <: LogEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpRequest(value: HttpRequest): Self = StObject.set(x, "httpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRequestUndefined: Self = StObject.set(x, "httpRequest", js.undefined)
    
    @scala.inline
    def setInsertId(value: String): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
    
    @scala.inline
    def setJsonPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.LogEntry & TopLevel[js.Any]
    ): Self = StObject.set(x, "jsonPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonPayloadUndefined: Self = StObject.set(x, "jsonPayload", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.LogEntry & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
    
    @scala.inline
    def setMetadata(value: MonitoredResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setOperation(value: LogEntryOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setProtoPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.LogEntry & TopLevel[js.Any]
    ): Self = StObject.set(x, "protoPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtoPayloadUndefined: Self = StObject.set(x, "protoPayload", js.undefined)
    
    @scala.inline
    def setReceiveTimestamp(value: String): Self = StObject.set(x, "receiveTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveTimestampUndefined: Self = StObject.set(x, "receiveTimestamp", js.undefined)
    
    @scala.inline
    def setResource(value: MonitoredResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setSourceLocation(value: LogEntrySourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
    
    @scala.inline
    def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
    
    @scala.inline
    def setTextPayload(value: String): Self = StObject.set(x, "textPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPayloadUndefined: Self = StObject.set(x, "textPayload", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceSampled(value: Boolean): Self = StObject.set(x, "traceSampled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceSampledUndefined: Self = StObject.set(x, "traceSampled", js.undefined)
    
    @scala.inline
    def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
  }
}
