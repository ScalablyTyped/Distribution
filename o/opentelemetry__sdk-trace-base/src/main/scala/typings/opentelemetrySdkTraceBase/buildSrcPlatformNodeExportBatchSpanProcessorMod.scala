package typings.opentelemetrySdkTraceBase

import typings.opentelemetrySdkTraceBase.buildSrcExportBatchSpanProcessorBaseMod.BatchSpanProcessorBase
import typings.opentelemetrySdkTraceBase.buildSrcExportSpanExporterMod.SpanExporter
import typings.opentelemetrySdkTraceBase.buildSrcTypesMod.BufferConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeExportBatchSpanProcessorMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/node/export/BatchSpanProcessor", "BatchSpanProcessor")
  @js.native
  open class BatchSpanProcessor protected () extends BatchSpanProcessorBase[BufferConfig] {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
}
