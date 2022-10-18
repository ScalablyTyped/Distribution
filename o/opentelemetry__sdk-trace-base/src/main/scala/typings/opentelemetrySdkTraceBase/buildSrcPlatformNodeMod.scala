package typings.opentelemetrySdkTraceBase

import typings.opentelemetrySdkTraceBase.buildSrcExportSpanExporterMod.SpanExporter
import typings.opentelemetrySdkTraceBase.buildSrcTypesMod.BufferConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/node", "BatchSpanProcessor")
  @js.native
  open class BatchSpanProcessor protected ()
    extends typings.opentelemetrySdkTraceBase.buildSrcPlatformNodeExportBatchSpanProcessorMod.BatchSpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/node", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typings.opentelemetrySdkTraceBase.buildSrcPlatformNodeRandomIdGeneratorMod.RandomIdGenerator
}
