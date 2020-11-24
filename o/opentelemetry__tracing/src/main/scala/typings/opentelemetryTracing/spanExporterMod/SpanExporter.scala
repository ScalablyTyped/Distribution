package typings.opentelemetryTracing.spanExporterMod

import typings.opentelemetryCore.exportResultMod.ExportResult
import typings.opentelemetryTracing.readableSpanMod.ReadableSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpanExporter extends js.Object {
  
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
  implicit class SpanExporterOps[Self <: SpanExporter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExport(value: (js.Array[ReadableSpan], js.Function1[/* result */ ExportResult, Unit]) => Unit): Self = this.set("export", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShutdown(value: () => Unit): Self = this.set("shutdown", js.Any.fromFunction0(value))
  }
}
