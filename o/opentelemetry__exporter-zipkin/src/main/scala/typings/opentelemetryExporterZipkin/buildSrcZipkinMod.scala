package typings.opentelemetryExporterZipkin

import typings.opentelemetryCore.buildSrcExportResultMod.ExportResult
import typings.opentelemetryExporterZipkin.buildSrcTypesMod.ExporterConfig
import typings.opentelemetrySdkTraceBase.buildSrcExportReadableSpanMod.ReadableSpan
import typings.opentelemetrySdkTraceBase.buildSrcExportSpanExporterMod.SpanExporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcZipkinMod {
  
  @JSImport("@opentelemetry/exporter-zipkin/build/src/zipkin", "ZipkinExporter")
  @js.native
  open class ZipkinExporter ()
    extends StObject
       with SpanExporter {
    def this(config: ExporterConfig) = this()
    
    /* private */ val DEFAULT_SERVICE_NAME: Any = js.native
    
    /**
      * if user defines getExportRequestHeaders in config then this will be called
      * everytime before send, otherwise it will be replaced with noop in
      * constructor
      * @default noop
      */
    /* private */ var _beforeSend: Any = js.native
    
    /* private */ var _getHeaders: Any = js.native
    
    /* private */ var _isShutdown: Any = js.native
    
    /* private */ var _send: Any = js.native
    
    /**
      * Transform spans and sends to Zipkin service.
      */
    /* private */ var _sendSpans: Any = js.native
    
    /* private */ var _sendingPromises: Any = js.native
    
    /* private */ var _serviceName: Any = js.native
    
    /* private */ val _statusCodeTagName: Any = js.native
    
    /* private */ val _statusDescriptionTagName: Any = js.native
    
    /* private */ var _urlStr: Any = js.native
    
    /**
      * Called to export sampled {@link ReadableSpan}s.
      * @param spans the list of sampled Spans to be exported.
      */
    /* CompleteClass */
    override def `export`(spans: js.Array[ReadableSpan], resultCallback: js.Function1[/* result */ ExportResult, Unit]): Unit = js.native
    
    /** Stops the exporter. */
    /* CompleteClass */
    override def shutdown(): js.Promise[Unit] = js.native
  }
}
