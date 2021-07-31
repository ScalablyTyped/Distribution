package typings.opentelemetryCore

import typings.opentelemetryApi.samplerMod.Sampler
import typings.opentelemetryApi.samplingResultMod.SamplingResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alwaysOnSamplerMod {
  
  @JSImport("@opentelemetry/core/build/src/trace/sampler/AlwaysOnSampler", "AlwaysOnSampler")
  @js.native
  class AlwaysOnSampler ()
    extends StObject
       with Sampler {
    
    def shouldSample(): SamplingResult = js.native
  }
}
