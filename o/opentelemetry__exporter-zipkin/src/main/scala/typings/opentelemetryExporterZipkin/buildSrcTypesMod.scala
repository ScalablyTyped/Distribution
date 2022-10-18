package typings.opentelemetryExporterZipkin

import org.scalablytyped.runtime.StringDictionary
import typings.opentelemetryCore.buildSrcExportResultMod.ExportResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  @js.native
  sealed trait SpanKind extends StObject
  @JSImport("@opentelemetry/exporter-zipkin/build/src/types", "SpanKind")
  @js.native
  object SpanKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SpanKind & String] = js.native
    
    @js.native
    sealed trait CLIENT
      extends StObject
         with SpanKind
    /* "CLIENT" */ val CLIENT: typings.opentelemetryExporterZipkin.buildSrcTypesMod.SpanKind.CLIENT & String = js.native
    
    @js.native
    sealed trait CONSUMER
      extends StObject
         with SpanKind
    /* "CONSUMER" */ val CONSUMER: typings.opentelemetryExporterZipkin.buildSrcTypesMod.SpanKind.CONSUMER & String = js.native
    
    @js.native
    sealed trait PRODUCER
      extends StObject
         with SpanKind
    /* "PRODUCER" */ val PRODUCER: typings.opentelemetryExporterZipkin.buildSrcTypesMod.SpanKind.PRODUCER & String = js.native
    
    @js.native
    sealed trait SERVER
      extends StObject
         with SpanKind
    /* "SERVER" */ val SERVER: typings.opentelemetryExporterZipkin.buildSrcTypesMod.SpanKind.SERVER & String = js.native
  }
  
  trait Annotation extends StObject {
    
    /**
      * Epoch microseconds of this event.
      * For example, 1502787600000000 corresponds to 2017-08-15 09:00 UTC
      */
    var timestamp: Double
    
    /**
      * Usually a short tag indicating an event, like "error"
      * While possible to add larger data, such as garbage collection details, low
      * cardinality event names both keep the size of spans down and also are easy
      * to search against.
      */
    var value: String
  }
  object Annotation {
    
    inline def apply(timestamp: Double, value: String): Annotation = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Annotation]
    }
    
    extension [Self <: Annotation](x: Self) {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Endpoint extends StObject {
    
    /**
      * The text representation of the primary IPv4 address associated with this
      * connection. Ex. 192.168.99.100 Absent if unknown.
      */
    var ipv4: js.UndefOr[String] = js.undefined
    
    /**
      * The text representation of the primary IPv6 address associated with a
      * connection. Ex. 2001:db8::c001 Absent if unknown.
      * Prefer using the ipv4 field for mapped addresses.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * Lower-case label of this node in the service graph, such as "favstar".
      * Leave absent if unknown.
      * This is a primary label for trace lookup and aggregation, so it should be
      * intuitive and consistent. Many use a name from service discovery.
      */
    var serviceName: js.UndefOr[String] = js.undefined
  }
  object Endpoint {
    
    inline def apply(): Endpoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setIpv4(value: String): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
      
      inline def setIpv4Undefined: Self = StObject.set(x, "ipv4", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    }
  }
  
  trait ExporterConfig extends StObject {
    
    var getExportRequestHeaders: js.UndefOr[js.Function0[js.UndefOr[Record[String, String]]]] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var serviceName: js.UndefOr[String] = js.undefined
    
    var statusCodeTagName: js.UndefOr[String] = js.undefined
    
    var statusDescriptionTagName: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ExporterConfig {
    
    inline def apply(): ExporterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExporterConfig]
    }
    
    extension [Self <: ExporterConfig](x: Self) {
      
      inline def setGetExportRequestHeaders(value: () => js.UndefOr[Record[String, String]]): Self = StObject.set(x, "getExportRequestHeaders", js.Any.fromFunction0(value))
      
      inline def setGetExportRequestHeadersUndefined: Self = StObject.set(x, "getExportRequestHeaders", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      inline def setStatusCodeTagName(value: String): Self = StObject.set(x, "statusCodeTagName", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeTagNameUndefined: Self = StObject.set(x, "statusCodeTagName", js.undefined)
      
      inline def setStatusDescriptionTagName(value: String): Self = StObject.set(x, "statusDescriptionTagName", value.asInstanceOf[js.Any])
      
      inline def setStatusDescriptionTagNameUndefined: Self = StObject.set(x, "statusDescriptionTagName", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type GetHeaders = js.Function0[js.UndefOr[Record[String, String]]]
  
  type SendFn = js.Function2[
    /* zipkinSpans */ js.Array[Span], 
    /* done */ js.Function1[/* result */ ExportResult, Unit], 
    Unit
  ]
  
  type SendFunction = js.Function2[
    /* zipkinSpans */ js.Array[Span], 
    /* done */ js.Function1[/* result */ ExportResult, Unit], 
    Unit
  ]
  
  trait Span extends StObject {
    
    /**
      * Associates events that explain latency with the time they happened.
      */
    var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
    
    /**
      * True is a request to store this span even if it overrides sampling policy.
      * This is true when the `X-B3-Flags` header has a value of 1.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Duration in microseconds of the critical path, if known.
      */
    var duration: Double
    
    /**
      * Unique 64bit identifier for this operation within the trace.
      */
    var id: String
    
    /**
      * When present, kind clarifies timestamp, duration and remoteEndpoint.
      * When absent, the span is local or incomplete.
      */
    var kind: js.UndefOr[SpanKind] = js.undefined
    
    /**
      * The host that recorded this span, primarily for query by service name.
      */
    var localEndpoint: Endpoint
    
    /**
      * The logical operation this span represents in lowercase (e.g. rpc method).
      * Leave absent if unknown.
      */
    var name: String
    
    /**
      * The parent span ID or absent if this the root span in a trace.
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /**
      * True if we are contributing to a span started by another tracer (ex on a
      * different host).
      */
    var shared: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tags give your span context for search, viewing and analysis.
      */
    var tags: Tags
    
    /**
      * Epoch microseconds of the start of this span, possibly absent if
      * incomplete.
      */
    var timestamp: Double
    
    /**
      * Trace identifier, set on all spans within it.
      */
    var traceId: String
  }
  object Span {
    
    inline def apply(
      duration: Double,
      id: String,
      localEndpoint: Endpoint,
      name: String,
      tags: Tags,
      timestamp: Double,
      traceId: String
    ): Span = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localEndpoint = localEndpoint.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Span]
    }
    
    extension [Self <: Span](x: Self) {
      
      inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKind(value: SpanKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLocalEndpoint(value: Endpoint): Self = StObject.set(x, "localEndpoint", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
    }
  }
  
  type Tags = StringDictionary[Any]
}
