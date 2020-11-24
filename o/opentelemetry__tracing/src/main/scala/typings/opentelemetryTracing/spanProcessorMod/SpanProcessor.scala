package typings.opentelemetryTracing.spanProcessorMod

import typings.opentelemetryTracing.readableSpanMod.ReadableSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpanProcessor extends js.Object {
  
  /**
    * Forces to export all finished spans
    */
  def forceFlush(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Called when a {@link ReadableSpan} is ended, if the `span.isRecording()`
    * returns true.
    * @param span the Span that just ended.
    */
  def onEnd(span: ReadableSpan): Unit = js.native
  
  /**
    * Called when a {@link ReadableSpan} is started, if the `span.isRecording()`
    * returns true.
    * @param span the Span that just started.
    */
  def onStart(span: ReadableSpan): Unit = js.native
  
  /**
    * Shuts down the processor. Called when SDK is shut down. This is an
    * opportunity for processor to do any cleanup required.
    */
  def shutdown(callback: js.Function0[Unit]): Unit = js.native
}
object SpanProcessor {
  
  @scala.inline
  def apply(
    forceFlush: js.Function0[Unit] => Unit,
    onEnd: ReadableSpan => Unit,
    onStart: ReadableSpan => Unit,
    shutdown: js.Function0[Unit] => Unit
  ): SpanProcessor = {
    val __obj = js.Dynamic.literal(forceFlush = js.Any.fromFunction1(forceFlush), onEnd = js.Any.fromFunction1(onEnd), onStart = js.Any.fromFunction1(onStart), shutdown = js.Any.fromFunction1(shutdown))
    __obj.asInstanceOf[SpanProcessor]
  }
  
  @scala.inline
  implicit class SpanProcessorOps[Self <: SpanProcessor] (val x: Self) extends AnyVal {
    
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
    def setForceFlush(value: js.Function0[Unit] => Unit): Self = this.set("forceFlush", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEnd(value: ReadableSpan => Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStart(value: ReadableSpan => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShutdown(value: js.Function0[Unit] => Unit): Self = this.set("shutdown", js.Any.fromFunction1(value))
  }
}
