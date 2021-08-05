package typings.opentelemetryTracing

import typings.opentelemetryCore.exportResultMod.ExportResult
import typings.opentelemetryTracing.readableSpanMod.ReadableSpan
import typings.opentelemetryTracing.spanExporterMod.SpanExporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inMemorySpanExporterMod {
  
  @JSImport("@opentelemetry/tracing/build/src/export/InMemorySpanExporter", "InMemorySpanExporter")
  @js.native
  class InMemorySpanExporter ()
    extends StObject
       with SpanExporter {
    
    /* private */ var _finishedSpans: js.Any = js.native
    
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
    override def shutdown(): Unit = js.native
  }
}
