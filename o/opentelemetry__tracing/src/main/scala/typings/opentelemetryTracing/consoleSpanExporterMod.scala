package typings.opentelemetryTracing

import typings.opentelemetryCore.exportResultMod.ExportResult
import typings.opentelemetryTracing.readableSpanMod.ReadableSpan
import typings.opentelemetryTracing.spanExporterMod.SpanExporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleSpanExporterMod {
  
  @JSImport("@opentelemetry/tracing/build/src/export/ConsoleSpanExporter", "ConsoleSpanExporter")
  @js.native
  class ConsoleSpanExporter ()
    extends StObject
       with SpanExporter {
    
    /**
      * converts span info into more readable format
      * @param span
      */
    var _exportInfo: js.Any = js.native
    
    /**
      * Showing spans in console
      * @param spans
      * @param done
      */
    var _sendSpans: js.Any = js.native
    
    /**
      * Called to export sampled {@link ReadableSpan}s.
      * @param spans the list of sampled Spans to be exported.
      */
    /* CompleteClass */
    override def `export`(spans: js.Array[ReadableSpan], resultCallback: js.Function1[/* result */ ExportResult, Unit]): Unit = js.native
    
    /** Stops the exporter. */
    /* CompleteClass */
    override def shutdown(): Unit = js.native
  }
}
