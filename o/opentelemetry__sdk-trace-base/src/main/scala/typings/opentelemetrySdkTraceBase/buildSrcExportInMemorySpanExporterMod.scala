package typings.opentelemetrySdkTraceBase

import typings.opentelemetryCore.buildSrcExportResultMod.ExportResult
import typings.opentelemetrySdkTraceBase.buildSrcExportReadableSpanMod.ReadableSpan
import typings.opentelemetrySdkTraceBase.buildSrcExportSpanExporterMod.SpanExporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcExportInMemorySpanExporterMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/export/InMemorySpanExporter", "InMemorySpanExporter")
  @js.native
  open class InMemorySpanExporter ()
    extends StObject
       with SpanExporter {
    
    /* private */ var _finishedSpans: Any = js.native
    
    /**
      * Indicates if the exporter has been "shutdown."
      * When false, exported spans will not be stored in-memory.
      */
    /* protected */ var _stopped: Boolean = js.native
    
    /**
      * Called to export sampled {@link ReadableSpan}s.
      * @param spans the list of sampled Spans to be exported.
      */
    /* CompleteClass */
    override def `export`(spans: js.Array[ReadableSpan], resultCallback: js.Function1[/* result */ ExportResult, Unit]): Unit = js.native
    
    def getFinishedSpans(): js.Array[ReadableSpan] = js.native
    
    def reset(): Unit = js.native
    
    /** Stops the exporter. */
    /* CompleteClass */
    override def shutdown(): js.Promise[Unit] = js.native
  }
}
