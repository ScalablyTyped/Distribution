package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V2LogEntry extends StObject {
  
  /** Optional. Information about the HTTP request associated with this log entry, if applicable. */
  var httpRequest: js.UndefOr[V2HttpRequest] = js.undefined
  
  /** A unique ID for the log entry used for deduplication. If omitted, the implementation will generate one based on operation_id. */
  var insertId: js.UndefOr[String] = js.undefined
  
  /** A set of user-defined (key, value) data that provides additional information about the log entry. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** A set of user-defined (key, value) data that provides additional information about the moniotored resource that the log entry belongs to. */
  var monitoredResourceLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Required. The log to which this log entry belongs. Examples: `"syslog"`, `"book_log"`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Optional. Information about an operation associated with the log entry, if applicable. */
  var operation: js.UndefOr[V2LogEntryOperation] = js.undefined
  
  /** The log entry payload, represented as a protocol buffer that is expressed as a JSON object. The only accepted type currently is AuditLog. */
  var protoPayload: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** The severity of the log entry. The default value is `LogSeverity.DEFAULT`. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** Optional. Source code location information associated with the log entry, if any. */
  var sourceLocation: js.UndefOr[V2LogEntrySourceLocation] = js.undefined
  
  /** The log entry payload, represented as a structure that is expressed as a JSON object. */
  var structPayload: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** The log entry payload, represented as a Unicode string (UTF-8). */
  var textPayload: js.UndefOr[String] = js.undefined
  
  /** The time the event described by the log entry occurred. If omitted, defaults to operation start time. */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Resource name of the trace associated with the log entry, if any. If this field contains a relative resource name, you can assume the name is relative to
    * `//tracing.googleapis.com`. Example: `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
    */
  var trace: js.UndefOr[String] = js.undefined
}
object V2LogEntry {
  
  inline def apply(): V2LogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V2LogEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: V2LogEntry] (val x: Self) extends AnyVal {
    
    inline def setHttpRequest(value: V2HttpRequest): Self = StObject.set(x, "httpRequest", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestUndefined: Self = StObject.set(x, "httpRequest", js.undefined)
    
    inline def setInsertId(value: String): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMonitoredResourceLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "monitoredResourceLabels", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceLabelsUndefined: Self = StObject.set(x, "monitoredResourceLabels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperation(value: V2LogEntryOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setProtoPayload(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "protoPayload", value.asInstanceOf[js.Any])
    
    inline def setProtoPayloadUndefined: Self = StObject.set(x, "protoPayload", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSourceLocation(value: V2LogEntrySourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
    
    inline def setStructPayload(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "structPayload", value.asInstanceOf[js.Any])
    
    inline def setStructPayloadUndefined: Self = StObject.set(x, "structPayload", js.undefined)
    
    inline def setTextPayload(value: String): Self = StObject.set(x, "textPayload", value.asInstanceOf[js.Any])
    
    inline def setTextPayloadUndefined: Self = StObject.set(x, "textPayload", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
  }
}
