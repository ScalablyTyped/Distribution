package typings.opentelemetryCore

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetryApi.linkMod.Link
import typings.opentelemetryApi.samplerMod.Sampler
import typings.opentelemetryApi.samplingResultMod.SamplingResult
import typings.opentelemetryApi.spanKindMod.SpanKind
import typings.opentelemetryApi.traceAttributesMod.SpanAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceIdRatioBasedSamplerMod {
  
  @JSImport("@opentelemetry/core/build/src/trace/sampler/TraceIdRatioBasedSampler", "TraceIdRatioBasedSampler")
  @js.native
  open class TraceIdRatioBasedSampler ()
    extends StObject
       with Sampler {
    def this(_ratio: Double) = this()
    
    /* private */ var _accumulate: Any = js.native
    
    /* private */ var _normalize: Any = js.native
    
    /* private */ val _ratio: Any = js.native
    
    /* private */ var _upperBound: Any = js.native
    
    def shouldSample(context: Any, traceId: String): SamplingResult = js.native
    /**
      * Checks whether span needs to be created and tracked.
      *
      * @param context Parent Context which may contain a span.
      * @param traceId of the span to be created. It can be different from the
      *     traceId in the {@link SpanContext}. Typically in situations when the
      *     span to be created starts a new trace.
      * @param spanName of the span to be created.
      * @param spanKind of the span to be created.
      * @param attributes Initial set of SpanAttributes for the Span being constructed.
      * @param links Collection of links that will be associated with the Span to
      *     be created. Typically useful for batch operations.
      * @returns a {@link SamplingResult}.
      */
    /* CompleteClass */
    override def shouldSample(
      context: Context,
      traceId: String,
      spanName: String,
      spanKind: SpanKind,
      attributes: SpanAttributes,
      links: js.Array[Link]
    ): SamplingResult = js.native
  }
}
