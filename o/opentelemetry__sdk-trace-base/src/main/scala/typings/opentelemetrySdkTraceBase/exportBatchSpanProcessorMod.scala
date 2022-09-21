package typings.opentelemetrySdkTraceBase

import typings.opentelemetrySdkTraceBase.batchSpanProcessorBaseMod.BatchSpanProcessorBase
import typings.opentelemetrySdkTraceBase.spanExporterMod.SpanExporter
import typings.opentelemetrySdkTraceBase.typesMod.BufferConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportBatchSpanProcessorMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/node/export/BatchSpanProcessor", "BatchSpanProcessor")
  @js.native
  open class BatchSpanProcessor protected () extends BatchSpanProcessorBase[BufferConfig] {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
}
