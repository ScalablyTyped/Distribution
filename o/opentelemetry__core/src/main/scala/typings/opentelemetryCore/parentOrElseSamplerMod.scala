package typings.opentelemetryCore

import typings.opentelemetryApi.samplerMod.Sampler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/trace/sampler/ParentOrElseSampler", JSImport.Namespace)
@js.native
object parentOrElseSamplerMod extends js.Object {
  
  @js.native
  class ParentOrElseSampler protected () extends Sampler {
    def this(_delegateSampler: Sampler) = this()
    
    var _delegateSampler: js.Any = js.native
  }
}
