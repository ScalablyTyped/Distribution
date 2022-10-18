package typings.opentelemetrySdkTraceBase

import typings.opentelemetryCore.buildSrcExportResultMod.ExportResult
import typings.opentelemetrySdkTraceBase.buildSrcExportReadableSpanMod.ReadableSpan
import typings.opentelemetrySdkTraceBase.buildSrcExportSpanExporterMod.SpanExporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcExportConsoleSpanExporterMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/export/ConsoleSpanExporter", "ConsoleSpanExporter")
  @js.native
  open class ConsoleSpanExporter ()
    extends StObject
       with SpanExporter {
    
    /**
      * converts span info into more readable format
      * @param span
      */
    /* private */ var _exportInfo: Any = js.native
    
    /**
      * Showing spans in console
      * @param spans
      * @param done
      */
    /* private */ var _sendSpans: Any = js.native
    
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
