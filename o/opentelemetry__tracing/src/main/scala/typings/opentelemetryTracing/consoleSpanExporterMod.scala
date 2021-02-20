package typings.opentelemetryTracing

import typings.opentelemetryTracing.spanExporterMod.SpanExporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleSpanExporterMod {
  
  @JSImport("@opentelemetry/tracing/build/src/export/ConsoleSpanExporter", "ConsoleSpanExporter")
  @js.native
  class ConsoleSpanExporter () extends SpanExporter {
    
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
  }
}
