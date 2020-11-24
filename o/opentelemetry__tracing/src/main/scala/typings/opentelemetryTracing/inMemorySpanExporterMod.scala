package typings.opentelemetryTracing

import typings.opentelemetryTracing.readableSpanMod.ReadableSpan
import typings.opentelemetryTracing.spanExporterMod.SpanExporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/tracing/build/src/export/InMemorySpanExporter", JSImport.Namespace)
@js.native
object inMemorySpanExporterMod extends js.Object {
  
  @js.native
  class InMemorySpanExporter () extends SpanExporter {
    
    var _finishedSpans: js.Any = js.native
    
    /**
      * Indicates if the exporter has been "shutdown."
      * When false, exported spans will not be stored in-memory.
      */
    var _stopped: Boolean = js.native
    
    def getFinishedSpans(): js.Array[ReadableSpan] = js.native
    
    def reset(): Unit = js.native
  }
}
