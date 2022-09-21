package typings.opentelemetrySdkTraceBase

import typings.opentelemetrySdkTraceBase.spanExporterMod.SpanExporter
import typings.opentelemetrySdkTraceBase.typesMod.BufferConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/node", "BatchSpanProcessor")
  @js.native
  open class BatchSpanProcessor protected ()
    extends typings.opentelemetrySdkTraceBase.exportBatchSpanProcessorMod.BatchSpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/node", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typings.opentelemetrySdkTraceBase.nodeRandomIdGeneratorMod.RandomIdGenerator
}
