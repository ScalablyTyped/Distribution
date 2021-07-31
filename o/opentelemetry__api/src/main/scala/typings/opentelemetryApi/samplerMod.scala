package typings.opentelemetryApi

import typings.opentelemetryApi.attributesMod.Attributes
import typings.opentelemetryApi.linkMod.Link
import typings.opentelemetryApi.samplingResultMod.SamplingResult
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanKindMod.SpanKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object samplerMod {
  
  @js.native
  trait Sampler extends StObject {
    
    def shouldSample(
      parentContext: Unit,
      traceId: String,
      spanName: String,
      spanKind: SpanKind,
      attributes: Attributes,
      links: js.Array[Link]
    ): SamplingResult = js.native
    /**
      * Checks whether span needs to be created and tracked.
      *
      * @param parentContext Parent span context. Typically taken from the wire.
      *     Can be null.
      * @param traceId of the span to be created. It can be different from the
      *     traceId in the {@link SpanContext}. Typically in situations when the
      *     span to be created starts a new trace.
      * @param spanName of the span to be created.
      * @param spanKind of the span to be created.
      * @param attributes Initial set of Attributes for the Span being constructed.
      * @param links Collection of links that will be associated with the Span to
      *     be created. Typically useful for batch operations.
      * @returns a {@link SamplingResult}.
      */
    def shouldSample(
      parentContext: SpanContext,
      traceId: String,
      spanName: String,
      spanKind: SpanKind,
      attributes: Attributes,
      links: js.Array[Link]
    ): SamplingResult = js.native
  }
}
