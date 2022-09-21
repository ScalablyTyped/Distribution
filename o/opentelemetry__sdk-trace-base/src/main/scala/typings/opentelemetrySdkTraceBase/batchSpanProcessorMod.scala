package typings.opentelemetrySdkTraceBase

import typings.opentelemetrySdkTraceBase.batchSpanProcessorBaseMod.BatchSpanProcessorBase
import typings.opentelemetrySdkTraceBase.spanExporterMod.SpanExporter
import typings.opentelemetrySdkTraceBase.typesMod.BatchSpanProcessorBrowserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchSpanProcessorMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/browser/export/BatchSpanProcessor", "BatchSpanProcessor")
  @js.native
  open class BatchSpanProcessor protected () extends BatchSpanProcessorBase[BatchSpanProcessorBrowserConfig] {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BatchSpanProcessorBrowserConfig) = this()
    
    /* private */ var _pageHideListener: Any = js.native
    
    /* private */ var _visibilityChangeListener: Any = js.native
    
    /* private */ var onInit: Any = js.native
  }
}
