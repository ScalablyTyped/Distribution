package typings.opentelemetryCore

import typings.opentelemetryApi.samplerMod.Sampler
import typings.opentelemetryApi.samplingResultMod.SamplingResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/trace/sampler/AlwaysOffSampler", JSImport.Namespace)
@js.native
object alwaysOffSamplerMod extends js.Object {
  
  @js.native
  class AlwaysOffSampler () extends Sampler {
    
    def shouldSample(): SamplingResult = js.native
  }
}
