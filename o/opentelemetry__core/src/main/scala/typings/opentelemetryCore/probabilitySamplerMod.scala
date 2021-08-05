package typings.opentelemetryCore

import typings.opentelemetryApi.samplerMod.Sampler
import typings.opentelemetryApi.samplingResultMod.SamplingResult
import typings.opentelemetryApi.spanContextMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object probabilitySamplerMod {
  
  @JSImport("@opentelemetry/core/build/src/trace/sampler/ProbabilitySampler", "ProbabilitySampler")
  @js.native
  class ProbabilitySampler ()
    extends StObject
       with Sampler {
    def this(_probability: Double) = this()
    
    /* private */ var _normalize: js.Any = js.native
    
    /* private */ val _probability: js.Any = js.native
    
    def shouldSample(): SamplingResult = js.native
    def shouldSample(parentContext: SpanContext): SamplingResult = js.native
  }
}
