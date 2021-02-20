package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestLog extends StObject {
  
  /** App Engine release version. */
  var appEngineRelease: js.UndefOr[String] = js.native
  
  /** Application that handled this request. */
  var appId: js.UndefOr[String] = js.native
  
  /** An indication of the relative cost of serving this request. */
  var cost: js.UndefOr[Double] = js.native
  
  /** Time when the request finished. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Whether this request is finished or active. */
  var finished: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this is the first RequestLog entry for this request. If an active request has several RequestLog entries written to Stackdriver Logging, then this field will be set for one
    * of them.
    */
  var first: js.UndefOr[Boolean] = js.native
  
  /** Internet host and port number of the resource being requested. */
  var host: js.UndefOr[String] = js.native
  
  /** HTTP version of request. Example: "HTTP/1.1". */
  var httpVersion: js.UndefOr[String] = js.native
  
  /** An identifier for the instance that handled the request. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** If the instance processing this request belongs to a manually scaled module, then this is the 0-based index of the instance. Otherwise, this value is -1. */
  var instanceIndex: js.UndefOr[Double] = js.native
  
  /** Origin IP address. */
  var ip: js.UndefOr[String] = js.native
  
  /** Latency of the request. */
  var latency: js.UndefOr[String] = js.native
  
  /** A list of log lines emitted by the application while serving this request. */
  var line: js.UndefOr[js.Array[LogLine]] = js.native
  
  /** Number of CPU megacycles used to process request. */
  var megaCycles: js.UndefOr[String] = js.native
  
  /** Request method. Example: "GET", "HEAD", "PUT", "POST", "DELETE". */
  var method: js.UndefOr[String] = js.native
  
  /** Module of the application that handled this request. */
  var moduleId: js.UndefOr[String] = js.native
  
  /**
    * The logged-in user who made the request.Most likely, this is the part of the user's email before the @ sign. The field value is the same for different requests from the same user,
    * but different users can have similar names. This information is also available to the application via the App Engine Users API.This field will be populated starting with App Engine
    * 1.9.21.
    */
  var nickname: js.UndefOr[String] = js.native
  
  /** Time this request spent in the pending request queue. */
  var pendingTime: js.UndefOr[String] = js.native
  
  /** Referrer URL of request. */
  var referrer: js.UndefOr[String] = js.native
  
  /**
    * Globally unique identifier for a request, which is based on the request start time. Request IDs for requests which started later will compare greater as strings than those for
    * requests which started earlier.
    */
  var requestId: js.UndefOr[String] = js.native
  
  /**
    * Contains the path and query portion of the URL that was requested. For example, if the URL was "http://example.com/app?name=val", the resource would be "/app?name=val". The fragment
    * identifier, which is identified by the # character, is not included.
    */
  var resource: js.UndefOr[String] = js.native
  
  /** Size in bytes sent back to client by request. */
  var responseSize: js.UndefOr[String] = js.native
  
  /**
    * Source code for the application that handled this request. There can be more than one source reference per deployed application if source code is distributed among multiple
    * repositories.
    */
  var sourceReference: js.UndefOr[js.Array[SourceReference]] = js.native
  
  /** Time when the request started. */
  var startTime: js.UndefOr[String] = js.native
  
  /** HTTP response status code. Example: 200, 404. */
  var status: js.UndefOr[Double] = js.native
  
  /** Task name of the request, in the case of an offline request. */
  var taskName: js.UndefOr[String] = js.native
  
  /** Queue name of the request, in the case of an offline request. */
  var taskQueueName: js.UndefOr[String] = js.native
  
  /** Stackdriver Trace identifier for this request. */
  var traceId: js.UndefOr[String] = js.native
  
  /** If true, the value in the 'trace_id' field was sampled for storage in a trace backend. */
  var traceSampled: js.UndefOr[Boolean] = js.native
  
  /** File or class that handled the request. */
  var urlMapEntry: js.UndefOr[String] = js.native
  
  /** User agent that made the request. */
  var userAgent: js.UndefOr[String] = js.native
  
  /** Version of the application that handled this request. */
  var versionId: js.UndefOr[String] = js.native
  
  /** Whether this was a loading request for the instance. */
  var wasLoadingRequest: js.UndefOr[Boolean] = js.native
}
object RequestLog {
  
  @scala.inline
  def apply(): RequestLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLog]
  }
  
  @scala.inline
  implicit class RequestLogMutableBuilder[Self <: RequestLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppEngineRelease(value: String): Self = StObject.set(x, "appEngineRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppEngineReleaseUndefined: Self = StObject.set(x, "appEngineRelease", js.undefined)
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
    
    @scala.inline
    def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpVersionUndefined: Self = StObject.set(x, "httpVersion", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setInstanceIndex(value: Double): Self = StObject.set(x, "instanceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIndexUndefined: Self = StObject.set(x, "instanceIndex", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    @scala.inline
    def setLatency(value: String): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setLine(value: js.Array[LogLine]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setLineVarargs(value: LogLine*): Self = StObject.set(x, "line", js.Array(value :_*))
    
    @scala.inline
    def setMegaCycles(value: String): Self = StObject.set(x, "megaCycles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMegaCyclesUndefined: Self = StObject.set(x, "megaCycles", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    @scala.inline
    def setPendingTime(value: String): Self = StObject.set(x, "pendingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingTimeUndefined: Self = StObject.set(x, "pendingTime", js.undefined)
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResponseSize(value: String): Self = StObject.set(x, "responseSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseSizeUndefined: Self = StObject.set(x, "responseSize", js.undefined)
    
    @scala.inline
    def setSourceReference(value: js.Array[SourceReference]): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    @scala.inline
    def setSourceReferenceVarargs(value: SourceReference*): Self = StObject.set(x, "sourceReference", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTaskName(value: String): Self = StObject.set(x, "taskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskNameUndefined: Self = StObject.set(x, "taskName", js.undefined)
    
    @scala.inline
    def setTaskQueueName(value: String): Self = StObject.set(x, "taskQueueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskQueueNameUndefined: Self = StObject.set(x, "taskQueueName", js.undefined)
    
    @scala.inline
    def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
    
    @scala.inline
    def setTraceSampled(value: Boolean): Self = StObject.set(x, "traceSampled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceSampledUndefined: Self = StObject.set(x, "traceSampled", js.undefined)
    
    @scala.inline
    def setUrlMapEntry(value: String): Self = StObject.set(x, "urlMapEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlMapEntryUndefined: Self = StObject.set(x, "urlMapEntry", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    
    @scala.inline
    def setWasLoadingRequest(value: Boolean): Self = StObject.set(x, "wasLoadingRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasLoadingRequestUndefined: Self = StObject.set(x, "wasLoadingRequest", js.undefined)
  }
}
