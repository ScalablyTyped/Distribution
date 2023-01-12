package typings.maximMazurokGapiClientLogging.gapi.client.logging

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
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * Optional. A map of key, value pairs that provides additional information about the log entry. The labels can be user-defined or system-defined.User-defined labels are arbitrary key,
    * value pairs that you can use to classify logs.System-defined labels are defined by GCP services for platform logs. They have two components - a service namespace component and the
    * attribute name. For example: compute.googleapis.com/resource_name.Cloud Logging truncates label keys that exceed 512 B and label values that exceed 64 KB upon their associated log
    * entry being written. The truncation is indicated by an ellipsis at the end of the character string.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Required. The resource name of the log to which this log entry belongs: "projects/[PROJECT_ID]/logs/[LOG_ID]" "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]" A project number may be used in place of PROJECT_ID. The project number is translated to its
    * corresponding PROJECT_ID internally and the log_name field will contain PROJECT_ID in queries and exports.[LOG_ID] must be URL-encoded within log_name. Example:
    * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity".[LOG_ID] must be less than 512 characters long and can only include the following characters: upper
    * and lower case alphanumeric characters, forward-slash, underscore, hyphen, and period.For backward compatibility, if log_name begins with a forward-slash, such as /projects/...,
    * then the log entry is ingested as usual, but the forward-slash is removed. Listing the log entry will not show the leading slash and filtering for a log name with a leading slash
    * will never return any results.
    */
  var logName: js.UndefOr[String] = js.undefined
  
  /** Output only. Deprecated. This field is not used by Logging. Any value written to it is cleared. */
  var metadata: js.UndefOr[MonitoredResourceMetadata] = js.undefined
  
  /** Optional. Information about an operation associated with the log entry, if applicable. */
  var operation: js.UndefOr[LogEntryOperation] = js.undefined
  
  /**
    * The log entry payload, represented as a protocol buffer. Some Google Cloud Platform services use this field for their log entry payloads.The following protocol buffer types are
    * supported; user-defined types are not supported:"type.googleapis.com/google.cloud.audit.AuditLog" "type.googleapis.com/google.appengine.logging.v1.RequestLog"
    */
  var protoPayload: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
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
    * Optional. The ID of the Cloud Trace (https://cloud.google.com/trace) span associated with the current operation in which the log is being written. For example, if a span has the
    * REST resource name of "projects/some-project/traces/some-trace/spans/some-span-id", then the span_id field is "some-span-id".A Span
    * (https://cloud.google.com/trace/docs/reference/v2/rest/v2/projects.traces/batchWrite#Span) represents a single operation within a trace. Whereas a trace may involve multiple
    * different microservices running on multiple different machines, a span generally corresponds to a single logical operation being performed in a single instance of a microservice on
    * one specific machine. Spans are the nodes within the tree that is a trace.Applications that are instrumented for tracing (https://cloud.google.com/trace/docs/setup) will generally
    * assign a new, unique span ID on each incoming request. It is also common to create and record additional spans corresponding to internal processing elements as well as issuing
    * requests to dependencies.The span ID is expected to be a 16-character, hexadecimal encoding of an 8-byte array and should not be zero. It should be unique within the trace and
    * should, ideally, be generated in a manner that is uniformly random.Example values: 000000000000004a 7a2190356c3fc94b 0000f00300090021 d39223e101960076
    */
  var spanId: js.UndefOr[String] = js.undefined
  
  /** Optional. Information indicating this LogEntry is part of a sequence of multiple log entries split from a single LogEntry. */
  var split: js.UndefOr[LogSplit] = js.undefined
  
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
    * Optional. The REST resource name of the trace being written to Cloud Trace (https://cloud.google.com/trace) in association with this log entry. For example, if your trace data is
    * stored in the Cloud project "my-trace-project" and if the service that is creating the log entry receives a trace header that includes the trace ID "12345", then the service should
    * use "projects/my-tracing-project/traces/12345".The trace field provides the link between logs and traces. By using this field, you can navigate from a log entry to a trace.
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
  
  inline def apply(): LogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogEntry] (val x: Self) extends AnyVal {
    
    inline def setHttpRequest(value: HttpRequest): Self = StObject.set(x, "httpRequest", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestUndefined: Self = StObject.set(x, "httpRequest", js.undefined)
    
    inline def setInsertId(value: String): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
    
    inline def setJsonPayload(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "jsonPayload", value.asInstanceOf[js.Any])
    
    inline def setJsonPayloadUndefined: Self = StObject.set(x, "jsonPayload", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    inline def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
    
    inline def setMetadata(value: MonitoredResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOperation(value: LogEntryOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setProtoPayload(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "protoPayload", value.asInstanceOf[js.Any])
    
    inline def setProtoPayloadUndefined: Self = StObject.set(x, "protoPayload", js.undefined)
    
    inline def setReceiveTimestamp(value: String): Self = StObject.set(x, "receiveTimestamp", value.asInstanceOf[js.Any])
    
    inline def setReceiveTimestampUndefined: Self = StObject.set(x, "receiveTimestamp", js.undefined)
    
    inline def setResource(value: MonitoredResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSourceLocation(value: LogEntrySourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
    
    inline def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
    
    inline def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
    
    inline def setSplit(value: LogSplit): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    
    inline def setTextPayload(value: String): Self = StObject.set(x, "textPayload", value.asInstanceOf[js.Any])
    
    inline def setTextPayloadUndefined: Self = StObject.set(x, "textPayload", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceSampled(value: Boolean): Self = StObject.set(x, "traceSampled", value.asInstanceOf[js.Any])
    
    inline def setTraceSampledUndefined: Self = StObject.set(x, "traceSampled", js.undefined)
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
  }
}
