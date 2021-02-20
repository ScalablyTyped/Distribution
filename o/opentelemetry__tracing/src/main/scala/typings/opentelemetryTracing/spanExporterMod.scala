package typings.opentelemetryTracing

import typings.opentelemetryCore.exportResultMod.ExportResult
import typings.opentelemetryTracing.readableSpanMod.ReadableSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanExporterMod {
  
  @js.native
  trait SpanExporter extends StObject {
    
    /**
      * Called to export sampled {@link ReadableSpan}s.
      * @param spans the list of sampled Spans to be exported.
      */
    def export(spans: js.Array[ReadableSpan], resultCallback: js.Function1[/* result */ ExportResult, Unit]): Unit = js.native
    
    /** Stops the exporter. */
    def shutdown(): Unit = js.native
  }
  object SpanExporter {
    
    @scala.inline
    def apply(
      export: (js.Array[ReadableSpan], js.Function1[/* result */ ExportResult, Unit]) => Unit,
      shutdown: () => Unit
    ): SpanExporter = {
      val __obj = js.Dynamic.literal(export = js.Any.fromFunction2(export), shutdown = js.Any.fromFunction0(shutdown))
      __obj.asInstanceOf[SpanExporter]
    }
    
    @scala.inline
    implicit class SpanExporterMutableBuilder[Self <: SpanExporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExport(value: (js.Array[ReadableSpan], js.Function1[/* result */ ExportResult, Unit]) => Unit): Self = StObject.set(x, "export", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShutdown(value: () => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    }
  }
}
