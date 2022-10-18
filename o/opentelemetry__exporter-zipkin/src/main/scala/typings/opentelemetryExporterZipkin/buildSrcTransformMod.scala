package typings.opentelemetryExporterZipkin

import typings.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import typings.opentelemetryApi.buildSrcTraceStatusMod.SpanStatus
import typings.opentelemetryExporterZipkin.buildSrcTypesMod.Annotation
import typings.opentelemetryExporterZipkin.buildSrcTypesMod.Span
import typings.opentelemetryExporterZipkin.buildSrcTypesMod.Tags
import typings.opentelemetryResources.mod.Resource
import typings.opentelemetrySdkTraceBase.buildSrcExportReadableSpanMod.ReadableSpan
import typings.opentelemetrySdkTraceBase.buildSrcTimedEventMod.TimedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTransformMod {
  
  @JSImport("@opentelemetry/exporter-zipkin/build/src/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/exporter-zipkin/build/src/transform", "defaultStatusCodeTagName")
  @js.native
  val defaultStatusCodeTagName: /* "otel.status_code" */ String = js.native
  
  @JSImport("@opentelemetry/exporter-zipkin/build/src/transform", "defaultStatusErrorTagName")
  @js.native
  val defaultStatusErrorTagName: /* "error" */ String = js.native
  
  inline def toZipkinAnnotations(events: js.Array[TimedEvent]): js.Array[Annotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("_toZipkinAnnotations")(events.asInstanceOf[js.Any]).asInstanceOf[js.Array[Annotation]]
  
  inline def toZipkinSpan(span: ReadableSpan, serviceName: String, statusCodeTagName: String, statusErrorTagName: String): Span = (^.asInstanceOf[js.Dynamic].applyDynamic("toZipkinSpan")(span.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], statusCodeTagName.asInstanceOf[js.Any], statusErrorTagName.asInstanceOf[js.Any])).asInstanceOf[Span]
  
  inline def toZipkinTags(
    attributes: SpanAttributes,
    status: SpanStatus,
    statusCodeTagName: String,
    statusErrorTagName: String,
    resource: Resource
  ): Tags = (^.asInstanceOf[js.Dynamic].applyDynamic("_toZipkinTags")(attributes.asInstanceOf[js.Any], status.asInstanceOf[js.Any], statusCodeTagName.asInstanceOf[js.Any], statusErrorTagName.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[Tags]
}
